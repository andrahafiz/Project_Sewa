/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barang;

/**
 *
 * @author Abdul
 */
public class Brg {
    private String barang_id, barang_nama,  barang_deskripsi, barang_foto, barang_kondisi, kategori_id;
    private boolean barang_status;
    private int barang_harga;
    
    public String getId() {
        return barang_id;
    }

    public void setId(String Id) {
        this.barang_id = Id;
    }
    
    public String getNamaBrg() {
        return barang_nama;
    }

    public void setNamaBrg(String barang_nama) {
        this.barang_nama = barang_nama;
    }
    
    public int getHargaBrg() {
        return barang_harga;
    }

    public void setHargaBrg(int barang_harga) {
        this.barang_harga = barang_harga;
    }
    
    public String getDeskripsi() {
        return barang_deskripsi;
    }

    public void setDeskripsi(String barang_deskripsi) {
        this.barang_deskripsi = barang_deskripsi;
    }

    public String getFoto() {
        return barang_foto;
    }

    public void setFoto(String barang_foto) {
        this.barang_foto = barang_foto;
    }

    public boolean getStatus() {
        return barang_status;
    }

    public void setStatus(boolean barang_status) {
        this.barang_status = barang_status;
    }

    public String getKondisi() {
        return barang_kondisi;
    }

    public void setKondisi(String barang_kondisi) {
        this.barang_kondisi = barang_kondisi;
    }
    public String getKategori() {
        return kategori_id;
    }

    public void setKategori(String kategori_id) {
        this.kategori_id = kategori_id;
    }
}
