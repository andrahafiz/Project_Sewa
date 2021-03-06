<%-- 
    Document   : Penyewa
    Created on : Nov 28, 2019, 11:50:38 PM
    Author     : User
--%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="Admin.Method_Barang" %>
<%@page import="Admin.J_Barang" %>
<%@page import="Test.Kategori" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!--Mengambil Tanggal sekarang-->
<%!
    private String getCurrentDate() {
        Date current = new Date();
        SimpleDateFormat frmt = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = frmt.format(current);
        return dateString;
    }%>
<%
    Method_Barang kategorifcd = new Method_Barang();
    J_Barang brg = null;
    brg = (new Method_Barang()).KodeBarang();
//    Kategori[] daftarkategori = kategorifcd.getDaftarKategori();
%>
<!DOCTYPE html>
<!DOCTYPE html>
<%--<%@include file="header.jso" %>--%>
<script>
    function tampilkanPreview(gambar, idpreview) {
        //                membuat objek gambar
        var gb = gambar.files;

        //                loop untuk merender gambar
        for (var i = 0; i < gb.length; i++) {
            //                    bikin variabel
            var gbPreview = gb[i];
            var imageType = /image.*/;
            var preview = document.getElementById(idpreview);
            var reader = new FileReader();

            if (gbPreview.type.match(imageType)) {
                //                        jika tipe data sesuai
                preview.file = gbPreview;
                reader.onload = (function (element) {
                    return function (e) {
                        element.src = e.target.result;
                    };
                })(preview);
                //                    membaca data URL gambar
                reader.readAsDataURL(gbPreview);
            } else {
                //                        jika tipe data tidak sesuai
                alert("Type file tidak sesuai. Khusus image.");
            }
        }
    }
    function hanyaAngka(evt) {
        var charCode = (evt.which) ? evt.which : event.keyCode
        if (charCode > 31 && (charCode < 48 || charCode > 57))
            return false;
        return true;
    }
</script>
<!-- MAIN CONTENT-->
<div class="main-content">
    <div class="section__content section__content--p30">
        <div class="row">
            <div class="col-lg-12">
                <div class="card">
                    <div class="card-header">
                        <strong>Form Data</strong> Barang
                    </div>
                    <div class="card-body card-block">
                        <form action="OlahAddBarang.jsp" method="POST" >
                            <div class="row form-group">
                                <div class="col col-md-3">
                                    <label class=" form-control-label">Kode Barang</label>
                                </div>
                                <div class="col-12 col-md-9">
                                    <Strong> <p class="form-control-static"><%= brg.getBarang_id()%></p></strong>
                                    <input type="hidden" id="text-input" name="kode-input" class="form-control" value=<%= brg.getBarang_id()%>>
                                </div>
                            </div>
                            <div class="row form-group">
                                <div class="col col-md-3">
                                    <label for="text-input" class=" form-control-label">Nama Barang</label>
                                </div>
                                <div class="col-12 col-md-9">
                                    <input type="text" id="text-input" name="nama-input" class="form-control" required="">
                                </div>
                            </div>
                            <div class="row form-group">
                                <div class="col col-md-3">
                                    <label for="harga-input" class=" form-control-label">Harga Barang / Satuan</label>
                                </div>
                                <div class="col-12 col-md-5">
                                    <input type="text" id="harga-input" name="harga-input" placeholder="Rp." class="form-control" required=""  onkeypress="return hanyaAngka(event)">

                                </div>
                                <div class="col-12 col-md">
                                    <select name="satuan-input" id="select" class="form-control" required="">
                                        <option value="0">Silahkan Pilih</option>
                                        <option value="Hari">Hari</option>
                                        <option value="Minggu">Minggu</option>
                                        <option value="Bulan">Bulan</option>
                                        <option value="Tahun">Tahun </option>

                                    </select>
                                </div>
                            </div>
                            <div class="row form-group">
                                <div class="col col-md-3">
                                    <label for="select" class=" form-control-label">Kategori Barang</label>
                                </div>
                                <div class="col-12 col-md-9">
                                    <select name="kategori" id="select" class="form-control" required="">
                                        <option value="0">Silahkan Pilih</option>
                                        <option value="Tenda">Tenda</option>
                                        <option value="Tas">Tas</option>
                                        <option value="Alat Masak">Alat Masak</option>
                                        <option value="Alat Komunikasi">Alat Komunikasi</option>
                                        <option value="Perlengkapan Tidur">Perlengkapan Tidur</option>
                                        <option value="Lain">Lain-lain</option>

                                    </select>
                                </div>
                            </div>

                            <div class="row form-group">
                                <div class="col col-md-3">
                                    <label for="textarea-input" class=" form-control-label">Deskripsi</label>
                                </div>
                                <div class="col-12 col-md-9">
                                    <textarea name="deskripsi-input" id="textarea-input" rows="9" placeholder="Berikan deskripsi pada barang..." class="form-control" ></textarea>
                                </div>
                            </div>


                            <div class="row form-group">
                                <div class="col col-md-3">
                                    <label for="status-input" class=" form-control-label">Status Barang</label>
                                </div>
                                <div class="col-12 col-md-4">
                                    <select name="status" id="status-input" disabled class="form-control" required="">
                                        <option value="0">Silahkan Pilih</option>
                                        <option value="True" selected>Ada</option>
                                        <option value="False">Kosong</option>
                                    </select>
                                </div>
                                <div class="col col-md-1">
                                    <label class=" form-control-label">Kondisi</label>
                                </div>
                                <div class="col col-m-4">
                                    <div class="form-check">
                                        <div class="radio">
                                            <label for="radio1" class="form-check-label ">
                                                <input type="radio" id="radio1" name="kondisi" value="Baik" class="form-check-input">Baik
                                            </label>
                                        </div>
                                        <div class="radio">
                                            <label for="radio2" class="form-check-label ">
                                                <input type="radio" id="radio2" name="kondisi" value="Sedang" class="form-check-input">Sedang
                                            </label>
                                        </div>
                                        <div class="radio">
                                            <label for="radio3" class="form-check-label ">
                                                <input type="radio" id="radio3" name="radios" value="Rusak" class="form-check-input">Rusak
                                            </label>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="row form-group">
                                <div class="col col-md-3">
                                    <label for="file-input" class=" form-control-label">Gambar</label>
                                </div>
                                <div class="col-12 col-md-9">

                                    <div class="row">
                                        <div class="col-sm-12 m-b-10">
                                            <input type="file" id="file" name="file" class="form-control-file" type="file"  id="file" onchange="tampilkanPreview(this, 'preview')">
                                        </div>
                                    </div>

                                    <div class="row">
                                        <div class="col-sm-12">
                                            <img id="preview" class="img-thumbnail" style="border: 2px solid #ddd" width="320px" src="../Img/non-image.png"/>
                                            <p class="help-block">File harus PNG.</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                    </div>
                    <div class="card-footer">
                        <button type="submit" class="btn btn-primary btn-sm">
                            <i class="fa fa-dot-circle-o"></i> Submit
                        </button>
                        <button type="reset" class="btn btn-danger btn-sm">
                            <i class="fa fa-ban"></i> Reset
                        </button>
                    </div>
                </div>
                </form>

            </div>
        </div>
    </div>
</div>



