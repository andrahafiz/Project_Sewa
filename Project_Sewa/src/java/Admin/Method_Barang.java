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

    public boolean create(J_Barang dataBarang) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc("jdbc:mysql://localhost:3306/db_projek", "root", "");
        try {
            String insert = "INSERT INTO `tb_barang` (`barang_id`, `barang_nama`, `barang_harga`, `barang_satuan`, "
                    + "`barang_deskripsi`, `barang_foto`, `barang_kondisi`,`barang_kategori`, `barang_status`) "
                    + "VALUES ('" + dataBarang.getBarang_id() + "', "
                    + "'" + dataBarang.getBarang_nama()+ "', "
                    + "'" + dataBarang.getBarang_harga() + "', "
                    + "'" + dataBarang.getBarang_satuan() + "', "
                    + "'" + dataBarang.getBarang_deskripsi() + "', "
                    + "'non-image.png', "
                    + "'" + dataBarang.getBarang_keadaan() + "', "
                    + "'" + dataBarang.getKategori_nama() + "', "
                    + "'" + dataBarang.getBarang_status() + "')";
            akses.connect();
            akses.executeUpdate(insert);
            akses.disconnect();
            return true;
        } catch (ClassNotFoundException x) {
            x.printStackTrace();
            return false;
        } catch (SQLException x) {
            x.printStackTrace();
            return false;
        }
    }

    public boolean edit(J_Barang dataBarang) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc("jdbc:mysql://localhost:3306/db_projek", "root", "");
        boolean sukses = false;
        try {
            String update = "UPDATE `tb_barang` SET "
                    + "`barang_nama` = '" + dataBarang.getBarang_nama()+ "', "
                    + "`barang_harga` = '" + dataBarang.getBarang_harga() + "', "
                    + "`barang_satuan` = '" + dataBarang.getBarang_satuan() + "', "
                    + "`barang_deskripsi` = '" + dataBarang.getBarang_deskripsi() + "', "
                    + "`barang_foto` = 'non-image.png', "
                    + "`barang_kondisi` = '" + dataBarang.getBarang_keadaan() + "',"
                    + "`barang_kategori` ='" + dataBarang.getKategori_nama() + "', "
                    + "`barang_status` = '" + dataBarang.getBarang_status() + "' "
                    + "WHERE `tb_barang`.`barang_id` = '" + dataBarang.getBarang_id() + "'";
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
        String sql = "SELECT * FROM tb_barang";

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
                tempBarang.setBarang_gambar(rs.getString("Barang_foto"));
                tempBarang.setBarang_keadaan(rs.getString("Barang_kondisi"));
                tempBarang.setKategori_nama(rs.getString("barang_kategori"));
                tempBarang.setBarang_status(Boolean.parseBoolean(rs.getString("Barang_status")));

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

    public J_Barang getDataBarangByKode(String kodebarang) {
        J_Barang daftarbarang = null;
        String pwd = "";
        String login = "root";
        Connection con = null;
        ResultSet rs = null;

        AksesJdbcOdbc akses = new AksesJdbcOdbc("jdbc:mysql://localhost:3306/db_andra", login, pwd);
        String sql = "SELECT * FROM `tb_barang` where barang_id='"+kodebarang+"'";

        try {
            con = akses.connect();

            rs = akses.executeQuery(sql);

            String kode_supplier = null;
            if (rs.next()) {

                daftarbarang = new J_Barang();
                daftarbarang.setBarang_id(rs.getString("Barang_id"));
                daftarbarang.setBarang_nama(rs.getString("Barang_nama"));
                daftarbarang.setBarang_harga(Integer.parseInt(rs.getString("Barang_harga")));
                daftarbarang.setBarang_satuan(rs.getString("Barang_satuan"));
                daftarbarang.setBarang_deskripsi(rs.getString("Barang_deskripsi"));
                daftarbarang.setBarang_gambar(rs.getString("Barang_foto"));
                daftarbarang.setBarang_keadaan(rs.getString("Barang_kondisi"));
                daftarbarang.setKategori_nama(rs.getString("barang_kategori"));
                daftarbarang.setBarang_status(Boolean.parseBoolean(rs.getString("Barang_status")));

            }

        } catch (ClassNotFoundException x) {
            x.printStackTrace();

        } catch (SQLException n) {
            n.printStackTrace();

        } finally {
            try {
                akses.disconnect();
                return daftarbarang;
            } catch (SQLException y) {
                y.printStackTrace();
                return null;
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
