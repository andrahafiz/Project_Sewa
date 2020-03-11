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
<jsp:useBean id="brg" class="Admin.J_Barang"/>
<jsp:useBean id="method" class="Admin.Method_Barang"/>
<%
    String KodeSup = request.getParameter("kode");
    if (KodeSup != null) {
        brg = method.getDataBarangByKode(KodeSup);
%>

<%--<%@include file="header.jso" %>--%>
<style>
    .garis{
        margin-top: 10px;
    }
</style>
<!-- MAIN CONTENT-->
<div class="main-content">
    <div class="section__content section__content--p30">

        <div class="container-fluid">





            <div class="row">
                <div class="col-md-12">
                    <div class="card">
                        <div class="card-header">
                            <strong class="card-title">Detail Barang <%= brg.getBarang_nama()%>
                                <small>
                                    <span class="badge badge-success float-right mt-1"><%= brg.getBarang_id()%></span>
                                </small>
                            </strong>
                        </div>
                        <div class="card-body">
                            <div class="row">
                                <div class="col-md-8">
                                    <div class="row">
                                        <div class="col-md-4">Kode Barang</div>
                                        <div class="col-md-8">: <%= brg.getBarang_id()%>
                                            <hr class="garis"></div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-4">Nama Barang</div>
                                        <div class="col-md-8">: <%= brg.getBarang_nama()%>
                                            <hr class="garis"></div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-4">Kategori Barang</div>
                                        <div class="col-md-8">: <%= brg.getKategori_nama()%>
                                            <hr class="garis"></div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-4">Harga / Satuan</div>
                                        <div class="col-md-8">: Rp. <%= brg.getBarang_harga()%> / <%= brg.getBarang_satuan()%>
                                            <hr class="garis"></div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-4">Deskripsi Barang</div>
                                        <div class="col-md-8">: <%= brg.getBarang_deskripsi()%>
                                            <hr class="garis"></div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-4">Kondisi Barang</div>
                                        <div class="col-md-8">: <%= brg.getBarang_keadaan()%>
                                            <hr class="garis"></div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-4">Status Barang</div>
                                        <div class="col-md-8">: 
                                            <% if (brg.getBarang_status() == false) {
                                                    out.print("Kosong");
                                                } else {
                                                    out.print("Ada");
                                                }

                                            %>
                                            <hr class="garis"></div>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <img id="preview" class="img-thumbnail" style="border: 2px solid #ddd" width="320px" src="../../Img/<%=brg.getBarang_gambar()%>"/>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                    <center>
                                        <a href="../view/ViewEditBarang.jsp?kode=<%= brg.getBarang_id()%>">
                                            <button type="button" class="btn btn-success">
                                                <i class="fa fa-edit"></i>&nbsp; Edit</button></a>&nbsp;&nbsp;

                                        <a href='../../DeleteBarang?kode=<%= brg.getBarang_id()%>'>
                                            <button type="button" class="btn btn-danger">
                                                <i class="fa fa-trash"></i>&nbsp; Delete</button></a>&nbsp;&nbsp;
                                                <a href='../view/ViewBarang.jsp'>
                                            <button type="button" class="btn btn-link">Kembali</button></a>
                                    </center>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<%}%>



