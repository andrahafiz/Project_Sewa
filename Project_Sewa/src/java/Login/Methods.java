/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Methods {
    public J_Penyewa[] getDataPenyewa() {
        J_Penyewa[] daftarPenyewa = null;
        J_Penyewa tempKategori = null;
        ArrayList listSupplier = new ArrayList();
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        String dbUrl = "jdbc:derby://localhost:1527/DB_Projek";
        String pwd = "root";
        String login = "root";
        String sql = "Select * from tb_penyewa";

        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            con = DriverManager.getConnection(dbUrl, login, pwd);
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

            String kode_supplier = null;
            while (rs.next()) {

                tempKategori = new J_Penyewa();
                tempKategori.setPenyewa_noidentitas(rs.getString("penyewa_noidentitas"));
                tempKategori.setPenyewa_namadepan(rs.getString("penyewa_namadepan"));
                tempKategori.setPenyewa_namabelakang(rs.getString("penyewa_namabelakang"));
                tempKategori.setPenyewa_tgllahir(rs.getString("penyewa_tgllahir"));
                tempKategori.setPenyewa_alamat(rs.getString("penyewa_alamat"));
                tempKategori.setPenyewa_jk(rs.getString("penyewa_jk"));
                tempKategori.setPenyewa_notlp(rs.getString("penyewa_notlp"));
                tempKategori.setPenyewa_email(rs.getString("penyewa_email"));
                tempKategori.setPenyewa_username(rs.getString("penyewa_username"));
                tempKategori.setPenyewa_password(rs.getString("penyewa_password"));

                listSupplier.add(tempKategori);
            }
            daftarPenyewa = new J_Penyewa[listSupplier.size()];
            listSupplier.toArray(daftarPenyewa);

        } catch (ClassNotFoundException a) {
            a.printStackTrace();
        } catch (SQLException a) {
            a.printStackTrace();
        } finally {
            try {
                rs.close();
                stmt.close();
                con.clearWarnings();
                return daftarPenyewa;
            } catch (SQLException b) {
                b.printStackTrace();
                return daftarPenyewa;
            }
        }
    }
}
