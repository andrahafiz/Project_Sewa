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
    Kategori[] daftarkategori = kategorifcd.getDaftarKategori();
%>
<!DOCTYPE html>
<!DOCTYPE html>
<%--<%@include file="header.jso" %>--%>

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
                        <form action="" method="post" enctype="multipart/form-data" class="form-horizontal">
                            <div class="row form-group">
                                <div class="col col-md-3">
                                    <label class=" form-control-label">Kode Barang</label>
                                </div>
                                <div class="col-12 col-md-9">
                                    <Strong> <p class="form-control-static"><%= brg.getBarang_id()%></p></strong>
                                    <input type="hidden" id="text-input" name="nama-input" class="form-control" value=<%= brg.getBarang_id()%>>
                                </div>
                            </div>
                            <div class="row form-group">
                                <div class="col col-md-3">
                                    <label for="text-input" class=" form-control-label">Nama Barang</label>
                                </div>
                                <div class="col-12 col-md-9">
                                    <input type="text" id="text-input" name="nama-input" class="form-control">
                                </div>
                            </div>
                            <div class="row form-group">
                                <div class="col col-md-3">
                                    <label for="email-input" class=" form-control-label">Harga Barang / Satuan</label>
                                </div>
                                <div class="col-12 col-md-5">
                                    <input type="text" id="email-input" name="email-input" placeholder="Rp." class="form-control">

                                </div>
                                <div class="col-12 col-md">
                                    <input type="text" id="satuan-input" name="satuan" placeholder="" class="form-control">
                                    <small class="help-block form-text">Jam / Hari / Minggu / Bulan / Tahun</small>
                                </div>
                            </div>
                            <div class="row form-group">
                                <div class="col col-md-3">
                                    <label for="select" class=" form-control-label">Kategori Barang</label>
                                </div>
                                <div class="col-12 col-md-9">
                                    <select name="select" id="select" class="form-control">
                                        <option value="0">Silahkan Pilih</option>
                                        <%
                                            for (int i = 0; i < daftarkategori.length; i++) {%>

                                        <option value=<% out.print(daftarkategori[i].getKategori_id()); %>><% out.print(daftarkategori[i].getKategori_nama()); %></option>
                                        <%}%>
                                    </select>
                                </div>
                            </div>
                            <div class="row form-group">
                                <div class="col col-md-3">
                                    <label for="maintenance-input" class=" form-control-label">Tanggal Maintenance</label>
                                </div>
                                <div class="col-12 col-md-9">
                                    <input type="text" id="email-input" name="maintenance-input" placeholder='<%= getCurrentDate()%>' class="form-control">
                                    <small class="help-block form-text">Format : yyyy-MM-dd</small>

                                </div>

                            </div>

                            <div class="row form-group">
                                <div class="col col-md-3">
                                    <label for="textarea-input" class=" form-control-label">Deskripsi</label>
                                </div>
                                <div class="col-12 col-md-9">
                                    <textarea name="textarea-input" id="textarea-input" rows="9" placeholder="Berikan deskripsi pada barang..." class="form-control"></textarea>
                                </div>
                            </div>


                            <div class="row form-group">
                                <div class="col col-md-3">
                                    <label for="status-input" class=" form-control-label">Status Barang</label>
                                </div>
                                <div class="col-12 col-md-4">
                                    <select name="status" id="status-input" disabled class="form-control">
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
                                                <input type="radio" id="radio1" name="radios" value="Baik" class="form-check-input">Baik
                                            </label>
                                        </div>
                                        <div class="radio">
                                            <label for="radio2" class="form-check-label ">
                                                <input type="radio" id="radio2" name="radios" value="Sedang" class="form-check-input">Sedang
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
                                    <input type="file" id="file-input" name="file-input" class="form-control-file">
                                </div>
                            </div>

                        </form>
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

            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <div class="copyright">
                    <p>Copyright © 2018 Colorlib. All rights reserved. Template by <a href="https://colorlib.com">Colorlib</a>.</p>
                </div>
            </div>
        </div>

    </div>
</div>



