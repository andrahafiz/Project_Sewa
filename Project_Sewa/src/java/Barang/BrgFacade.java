/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barang;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BrgFacade {
    public Brg[] getDataBrg() {
        Brg[] DataBrg = null;
        Brg temprs = null;
        ArrayList listrs = new ArrayList();

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

            String kode = null;
            while (rs.next()) {
                temprs = new Brg();
                temprs.setId(rs.getString("barang_id"));
                temprs.setNamaBrg(rs.getString("barang_nama"));
                temprs.setDeskripsi(rs.getString("barang_deskripsi"));
                temprs.setHargaBrg(rs.getInt("barang_harga"));
                temprs.setFoto(rs.getString("barang_foto"));
                temprs.setStatus(Boolean.parseBoolean(rs.getString("barang_status")));
                temprs.setKondisi(rs.getString("barang_kondisi"));
                temprs.setKategori(rs.getString("kategori_id"));
                listrs.add(temprs);
            }
            DataBrg = new Brg[listrs.size()];
            listrs.toArray(DataBrg);

        } catch (ClassNotFoundException x) {
            x.printStackTrace();
        } catch (SQLException x) {
            x.printStackTrace();
        } finally {
            try {
                rs.close();
                stmt.close();
                con.clearWarnings();
                return DataBrg;

            } catch (SQLException x) {
                x.printStackTrace();
                return DataBrg;
            }
        }
    }

    public Brg[] getDataBrg(String id,String nama) {
        Brg[] DataBrg = null;
        Brg temprs = null;
        ArrayList listrs = new ArrayList();

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        String dbUrl = "jdbc:derby://localhost:1527/DB_Projek";
        String pwd = "root";
        String login = "root";
        String sql = "Select * from tb_barang where barang_id ='"+id+"' and barang_nama='"+nama+"'";

        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            con = DriverManager.getConnection(dbUrl, login, pwd);
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

            String kode = null;
            while (rs.next()) {
                temprs = new Brg();
                temprs.setId(rs.getString("barang_id"));
                temprs.setNamaBrg(rs.getString("barang_nama"));
                temprs.setDeskripsi(rs.getString("barang_deskripsi"));
                temprs.setHargaBrg(rs.getInt("barang_harga"));
                temprs.setFoto(rs.getString("barang_foto"));
                temprs.setStatus(Boolean.parseBoolean(rs.getString("barang_status")));
                temprs.setKondisi(rs.getString("barang_kondisi"));
                temprs.setKategori(rs.getString("kategori_id"));
                listrs.add(temprs);
            }
            DataBrg = new Brg[listrs.size()];
            listrs.toArray(DataBrg);

        } catch (ClassNotFoundException x) {
            x.printStackTrace();
        } catch (SQLException x) {
            x.printStackTrace();
        } finally {
            try {
                rs.close();
                stmt.close();
                con.clearWarnings();
                return DataBrg;

            } catch (SQLException x) {
                x.printStackTrace();
                return DataBrg;
            }
        }
    }
    public Brg[] getDataBrg(String kategori) {
        Brg[] DataBrg = null;
        Brg temprs = null;
        ArrayList listrs = new ArrayList();

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        String dbUrl = "jdbc:derby://localhost:1527/DB_Projek";
        String pwd = "root";
        String login = "root";
        String sql = "Select * from tb_barang where kategori_id='"+kategori+"'";

        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            con = DriverManager.getConnection(dbUrl, login, pwd);
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
//udah commit
            String kode = null;
            while (rs.next()) {
                temprs = new Brg();
                temprs.setId(rs.getString("barang_id"));
                temprs.setNamaBrg(rs.getString("barang_nama"));
                temprs.setDeskripsi(rs.getString("barang_deskripsi"));
                temprs.setHargaBrg(rs.getInt("barang_harga"));
                temprs.setFoto(rs.getString("barang_foto"));
                temprs.setStatus(Boolean.parseBoolean(rs.getString("barang_status")));
                temprs.setKondisi(rs.getString("barang_kondisi"));
                temprs.setKategori(rs.getString("kategori_id"));
                listrs.add(temprs);
            }
            DataBrg = new Brg[listrs.size()];
            listrs.toArray(DataBrg);

        } catch (ClassNotFoundException x) {
            x.printStackTrace();
        } catch (SQLException x) {
            x.printStackTrace();
        } finally {
            try {
                rs.close();
                stmt.close();
                con.clearWarnings();
                return DataBrg;

            } catch (SQLException x) {
                x.printStackTrace();
                return DataBrg;
            }
        }
    }
}
    