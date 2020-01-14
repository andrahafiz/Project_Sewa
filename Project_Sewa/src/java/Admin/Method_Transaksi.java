/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import DB.AksesJdbcOdbc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Method_Transaksi {

    public Transaksi[] getDataTransaksi() {
        Transaksi[] daftartransaksi = null;
        Transaksi tempTransaksi = null;
        ArrayList listSupplier = new ArrayList();
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        String pwd = "";
        String login = "root";

        AksesJdbcOdbc akses = new AksesJdbcOdbc("jdbc:mysql://localhost:3306/db_andra", login, pwd);
        String sql = "SELECT * FROM `tb_transaksi`,tb_barang,tb_penyewa WHERE tb_transaksi.barang_id = tb_barang.barang_id and tb_transaksi.penyewa_noidentitas =tb_penyewa.penyewa_noidentitas";

        try {
            con = akses.connect();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

            String kode_supplier = null;
            while (rs.next()) {

                tempTransaksi = new Transaksi();
                tempTransaksi.setTransaksi_id(rs.getString("transaksi_id"));
                tempTransaksi.setBarang_id(rs.getString("barang_id"));
                tempTransaksi.setBarang_nama(rs.getString("barang_nama"));
                tempTransaksi.setPenyewa_noidentitas(rs.getString("penyewa_noidentitas"));
                tempTransaksi.setPenyewa_nama(rs.getString("penyewa_namadepan") + " " + rs.getString("penyewa_namabelakang"));
                tempTransaksi.setTransaksi_tgltransaksi(rs.getString("transaksi_tgltransaksi"));
                tempTransaksi.setTransaksi_tglsewa(rs.getString("transaksi_tglsewa"));
                tempTransaksi.setTransaksi_tglkembali(rs.getString("transaksi_tglkembali"));
                tempTransaksi.setTransaksi_status(rs.getString("transaksi_status"));
                tempTransaksi.setTransaksi_total(Integer.parseInt(rs.getString("transaksi_total")));

                listSupplier.add(tempTransaksi);
            }
            daftartransaksi = new Transaksi[listSupplier.size()];
            listSupplier.toArray(daftartransaksi);

        } catch (ClassNotFoundException a) {
            a.printStackTrace();
        } catch (SQLException a) {
            a.printStackTrace();
        } finally {
            try {
                rs.close();
                stmt.close();
                con.clearWarnings();
                return daftartransaksi;
            } catch (SQLException b) {
                b.printStackTrace();
                return daftartransaksi;
            }
        }
    }

}
