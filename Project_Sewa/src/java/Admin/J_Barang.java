package Admin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class J_Barang {

    private String barang_id, barang_nama, kategori_nama,barang_satuan, kategori_id, barang_deskripsi, barang_foto,barang_keadaan,barang_maintenance;
    private boolean barang_status;
    private int barang_harga;

    public String getBarang_satuan() {
        return barang_satuan;
    }

    public void setBarang_satuan(String barang_satuan) {
        this.barang_satuan = barang_satuan;
    }

    public String getKategori_nama() {
        return kategori_nama;
    }

    public void setKategori_nama(String kategori_nama) {
        this.kategori_nama = kategori_nama;
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

    public String getBarang_maintenance() {
        return barang_maintenance;
    }

    public void setBarang_maintenance(String barang_maintenance) {
        this.barang_maintenance = barang_maintenance;
    }
 

    public String getKategori_id() {
        return kategori_id;
    }

    public void setKategori_id(String kategori_id) {
        this.kategori_id = kategori_id;
    }

    public String getBarang_deskripsi() {
        return barang_deskripsi;
    }

    public void setBarang_deskripsi(String barang_deskripsi) {
        this.barang_deskripsi = barang_deskripsi;
    }

    public String getBarang_gambar() {
        return barang_foto;
    }

    public void setBarang_gambar(String barang_gambar) {
        this.barang_foto = barang_gambar;
    }

    public String getBarang_keadaan() {
        return barang_keadaan;
    }

    public void setBarang_keadaan(String barang_keadaan) {
        this.barang_keadaan = barang_keadaan;
    }

    public String getBarang_foto() {
        return barang_foto;
    }

    public void setBarang_foto(String barang_foto) {
        this.barang_foto = barang_foto;
    }

    public boolean getBarang_status() {
        return barang_status;
    }

    public void setBarang_status(boolean barang_status) {
        this.barang_status = barang_status;
    }

    public int getBarang_harga() {
        return barang_harga;
    }

    public void setBarang_harga(int barang_harga) {
        this.barang_harga = barang_harga;
    }


}
