/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Method_Barang {
      public J_Barang[] getDataBarang() {
        J_Barang[] daftarbarang = null;
        J_Barang tempKategori = null;
        ArrayList listSupplier = new ArrayList();
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        String dbUrl = "jdbc:derby://localhost:1527/DB_Projek";
        String pwd = "root";
        String login = "root";
        String sql = "Select * from tb_barang";

        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            con = DriverManager.getConnection(dbUrl, login, pwd);
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

            String kode_supplier = null;
            while (rs.next()) {

                tempKategori = new J_Barang();
                tempKategori.setBarang_id(rs.getString("Barang_id"));
                tempKategori.setBarang_nama(rs.getString("Barang_nama"));
                tempKategori.setBarang_harga(Integer.parseInt(rs.getString("Barang_harga")));
                tempKategori.setBarang_deskripsi(rs.getString("Barang_deskripsi"));
                tempKategori.setKategori_id("Kategori_id");
                tempKategori.setBarang_gambar(rs.getString("Barang_foto"));
                tempKategori.setBarang_status(Boolean.parseBoolean(rs.getString("Barang_status")));
                tempKategori.setBarang_keadaan(rs.getString("Barang_kondisi"));


                listSupplier.add(tempKategori);
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
       public J_Barang[] getDataBarangTerurut() {
        J_Barang[] daftarbarang = null;
        J_Barang tempKategori = null;
        ArrayList listSupplier = new ArrayList();
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        String dbUrl = "jdbc:derby://localhost:1527/DB_Projek";
        String pwd = "root";
        String login = "root";
        String sql = "Select * from tb_barang";

        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            con = DriverManager.getConnection(dbUrl, login, pwd);
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

            String kode_supplier = null;
            while (rs.next()) {

                tempKategori = new J_Barang();
                tempKategori.setBarang_id(rs.getString("Barang_id"));
                tempKategori.setBarang_nama(rs.getString("Barang_nama"));
                tempKategori.setBarang_harga(Integer.parseInt(rs.getString("Barang_harga")));
                tempKategori.setBarang_deskripsi("Barang_deskripsi");
                tempKategori.setBarang_gambar(rs.getString("Barang_foto"));
                tempKategori.setBarang_status(Boolean.parseBoolean(rs.getString("Barang_status")));
                tempKategori.setBarang_keadaan(rs.getString("Barang_kondisi"));


                listSupplier.add(tempKategori);
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
}
