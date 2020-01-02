/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import DB.AksesJdbcOdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Test.Kategori;

/**
 *
 * @author User
 */
public class Method_Barang {

    public J_Barang KodeBarang() {
        J_Barang supp = null;

        String pwd = "";
        String login = "root";
        Connection con = null;
        ResultSet rs = null;

        AksesJdbcOdbc akses = new AksesJdbcOdbc("jdbc:mysql://localhost:3306/db_projek", login, pwd);
        String sql = "select max(barang_id) as kode,count(barang_id) as jumlah from tb_barang";
        String kode = null;
        int jumlah = 0;
        String text = null;

        try {
            con = akses.connect();
            rs = akses.executeQuery(sql);
            supp = new J_Barang();
            if (rs.next()) {
                jumlah = Integer.parseInt(rs.getString("jumlah"));
                kode = rs.getString("kode");
            }

            if (jumlah == 0) {
                supp.setBarang_id("BRG001");
            } else {
                int no_urut = Integer.valueOf(kode.substring(3, 6));                 //mengambil 3 digit terakhir dari KMR001
                no_urut++;
                String Alpha = "BRG";

                if (no_urut < 10) {
                    text = Alpha + String.format("00%s", no_urut);                     //menambahkan 00 di dpn angka jika satuan KMR001
                } else if (no_urut < 100) {
                    text = Alpha + String.format("0%s", no_urut);                      //menambahkan 0 di ddepan angka jika puluhan KMR010
                } else if (no_urut > 99) {
                    text = Alpha + String.format("%s", no_urut);                       //tidak ada 0 jika ratusan KMR100
                }
                supp.setBarang_id(text);
            }

        } catch (ClassNotFoundException x) {
            x.printStackTrace();

        } catch (SQLException n) {
            n.printStackTrace();

        } finally {
            try {
                akses.disconnect();
                return supp;
            } catch (SQLException y) {
                System.out.println("bacot");
                return null;
            }
        }
    }

    public J_Barang[] getDataBarang() {
        J_Barang[] daftarbarang = null;
        J_Barang tempBarang = null;
        ArrayList listSupplier = new ArrayList();
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        String pwd = "";
        String login = "root";

        AksesJdbcOdbc akses = new AksesJdbcOdbc("jdbc:mysql://localhost:3306/db_andra", login, pwd);
        String sql = "SELECT * FROM tb_kategori right JOIN tb_barang ON tb_barang.kategori_id = tb_kategori.kategori_id";

        try {
            con = akses.connect();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

            String kode_supplier = null;
            while (rs.next()) {

                tempBarang = new J_Barang();
                tempBarang.setBarang_id(rs.getString("Barang_id"));
                tempBarang.setBarang_nama(rs.getString("Barang_nama"));
                tempBarang.setBarang_harga(Integer.parseInt(rs.getString("Barang_harga")));
                tempBarang.setBarang_satuan(rs.getString("Barang_satuan"));
                tempBarang.setBarang_deskripsi(rs.getString("Barang_deskripsi"));
                tempBarang.setKategori_id(rs.getString("Kategori_id"));
                tempBarang.setKategori_nama(rs.getString("kategori_nama"));
                tempBarang.setBarang_gambar(rs.getString("Barang_foto"));
                tempBarang.setBarang_status(Boolean.parseBoolean(rs.getString("Barang_status")));
                tempBarang.setBarang_keadaan(rs.getString("Barang_kondisi"));

                listSupplier.add(tempBarang);
            }
            daftarbarang = new J_Barang[listSupplier.size()];
            listSupplier.toArray(daftarbarang);

        } catch (ClassNotFoundException a) {
            a.printStackTrace();
        } catch (SQLException a) {
            a.printStackTrace();
        } finally {
            try {
                rs.close();
                stmt.close();
                con.clearWarnings();
                return daftarbarang;
            } catch (SQLException b) {
                b.printStackTrace();
                return daftarbarang;
            }
        }
    }

    public Kategori[] getDaftarKategori() {
        Kategori[] dftrkategori = null;
        Kategori tempkategori = null;
        ArrayList listkategori = new ArrayList();
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        String pwd = "";
        String login = "root";

        AksesJdbcOdbc akses = new AksesJdbcOdbc("jdbc:mysql://localhost:3306/db)projek", login, pwd);
        String sql = "SELECT kategori_id,kategori_nama FROM tb_kategori";

        try {
            con = akses.connect();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

            String kode_supplier = null;
            while (rs.next()) {

                tempkategori = new Kategori();
                tempkategori.setKategori_id(rs.getString("kategori_id"));
                tempkategori.setKategori_nama(rs.getString("kategori_nama"));

                listkategori.add(tempkategori);
            }
            dftrkategori = new Kategori[listkategori.size()];
            listkategori.toArray(dftrkategori);

        } catch (ClassNotFoundException a) {
            a.printStackTrace();
        } catch (SQLException a) {
            a.printStackTrace();
        } finally {
            try {
                rs.close();
                stmt.close();
                con.clearWarnings();
                return dftrkategori;
            } catch (SQLException b) {
                b.printStackTrace();
                return dftrkategori;
            }
        }
    }

    public boolean delete(String kode) {
        String pwd = "";
        String login = "root";
        AksesJdbcOdbc akses = new AksesJdbcOdbc("jdbc:mysql://localhost:3306/db)projek", login, pwd);
        boolean sukses = false;
        try {
            String update = "DELETE FROM tb_barang WHERE barang_id = '" + kode + "'";
            akses.connect();

            int baris = akses.executeUpdate(update);
            if (baris > 0) {
                sukses = true;
            }

        } catch (ClassNotFoundException x) {
            x.printStackTrace();
        } catch (SQLException x) {
            x.printStackTrace();
        } finally {
            try {
                akses.disconnect();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return sukses;
    }

}
