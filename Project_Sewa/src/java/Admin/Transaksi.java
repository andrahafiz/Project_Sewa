/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

/**
 *
 * @author User
 */
public class Transaksi {
    String transaksi_id, barang_id, barang_nama, penyewa_noidentitas, penyewa_nama, transaksi_tgltransaksi,
            transaksi_tglsewa,transaksi_tglkembali, transaksi_status;
    int transaksi_total;

    public String getTransaksi_id() {
        return transaksi_id;
    }

    public void setTransaksi_id(String transaksi_id) {
        this.transaksi_id = transaksi_id;
    }

    public String getBarang_id() {
        return barang_id;
    }

    public void setBarang_id(String barang_id) {
        this.barang_id = barang_id;
    }

    public String getBarang_nama() {
        return barang_nama;
    }

    public void setBarang_nama(String barang_nama) {
        this.barang_nama = barang_nama;
    }

    public String getPenyewa_noidentitas() {
        return penyewa_noidentitas;
    }

    public void setPenyewa_noidentitas(String penyewa_noidentitas) {
        this.penyewa_noidentitas = penyewa_noidentitas;
    }

    public String getPenyewa_nama() {
        return penyewa_nama;
    }

    public void setPenyewa_nama(String penyewa_nama) {
        this.penyewa_nama = penyewa_nama;
    }

    public String getTransaksi_tgltransaksi() {
        return transaksi_tgltransaksi;
    }

    public void setTransaksi_tgltransaksi(String transaksi_tgltransaksi) {
        this.transaksi_tgltransaksi = transaksi_tgltransaksi;
    }

    public String getTransaksi_tglsewa() {
        return transaksi_tglsewa;
    }

    public void setTransaksi_tglsewa(String transaksi_tglsewa) {
        this.transaksi_tglsewa = transaksi_tglsewa;
    }

    public String getTransaksi_tglkembali() {
        return transaksi_tglkembali;
    }

    public void setTransaksi_tglkembali(String transaksi_tglkembali) {
        this.transaksi_tglkembali = transaksi_tglkembali;
    }

    public String getTransaksi_status() {
        return transaksi_status;
    }

    public void setTransaksi_status(String transaksi_status) {
        this.transaksi_status = transaksi_status;
    }

    public int getTransaksi_total() {
        return transaksi_total;
    }

    public void setTransaksi_total(int transaksi_total) {
        this.transaksi_total = transaksi_total;
    }
    
}
