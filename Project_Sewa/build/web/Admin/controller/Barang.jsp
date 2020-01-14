<%-- 
    Document   : Penyewa
    Created on : Nov 28, 2019, 11:50:38 PM
    Author     : User
--%>
<%@page import="Admin.Method_Barang" %>
<%@page import="Admin.J_Barang" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%Method_Barang kategorifcd = new Method_Barang();
    J_Barang[] dataBarang = kategorifcd.getDataBarang();
    String pesan = request.getParameter("pesan");

%>

<%--<%@include file="header.jso" %>--%>

<!-- MAIN CONTENT-->
<div class="main-content">
    <div class="section__content section__content--p30">

        <div class="container-fluid">

            <%if (pesan != null) {
                    if (pesan.equalsIgnoreCase("failed")) {%>
            <div class="sufee-alert alert with-close alert-danger alert-dismissible fade show">
                <span class="badge badge-pill badge-danger">Gagal</span>
                Anda gagal menambahkan data barang.
                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <%} else if (pesan.equalsIgnoreCase("succes")) {
            %>

            <div class="sufee-alert alert with-close alert-success alert-dismissible fade show">
                <span class="badge badge-pill badge-success">Success</span>
                Anda berhasil menambahkan data barang.
                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <%} else if (pesan.equalsIgnoreCase("succesdelete")) {%>
            <div class="sufee-alert alert with-close alert-success alert-dismissible fade show">
                <span class="badge badge-pill badge-success">Success</span>
                Anda berhasil menghapus data barang.
                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <%} else if (pesan.equalsIgnoreCase("faileddelete")) {%>
            <div class="sufee-alert alert with-close alert-danger alert-dismissible fade show">
                <span class="badge badge-pill badge-danger">Success</span>
                Anda gagal menghapus data barang.
                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <%} else if (pesan.equalsIgnoreCase("failededit")) {%>
            <div class="sufee-alert alert with-close alert-danger alert-dismissible fade show">
                <span class="badge badge-pill badge-danger">Success</span>
                Anda gagal mengubah data barang.
                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <%} else if (pesan.equalsIgnoreCase("succesedit")) {%>
            <div class="sufee-alert alert with-close alert-success alert-dismissible fade show">
                <span class="badge badge-pill badge-success">Success</span>
                Anda gagal mengubah data barang.
                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <%}
                }%>
            <div class="overview-wrap">
                <h2 class="title-1">Data Barang</h2>
                <a href="../view/TambahBarang.jsp">
                    <button class="au-btn au-btn-icon au-btn--green">
                        <i class="zmdi zmdi-plus"></i>Tambah Baru</button>
                </a>
            </div>

            <div class="row m-t-20">
                <div class="col-md-12">
                    <!-- DATA TABLE-->
                    <div class="table-responsive m-b-40">
                        <table class="table table-borderless table-data3">
                            <thead>
                                <tr>
                                    <th>No</th>
                                    <th>ID Barang</th>
                                    <th>Nama</th>
                                    <th>Kategori</th>
                                    <th>Harga / Satuan</th>
                                    <!--<th>Status</th>-->
                                    <th>Kondisi</th>
                                    <th><center>Gambar</center></th>
                            <th><center>Aksi</center></th>
                            </tr>
                            </thead>
                            <tbody>
                                <%
                                    for (int i = 0; i < dataBarang.length; i++) {%>
                                <tr>
                                    <td> <% out.print((i + 1)); %></td>
                                    <td> <% out.print(dataBarang[i].getBarang_id()); %></td>
                                    <td> <% out.print(dataBarang[i].getBarang_nama()); %></td>

                                    <td><% out.print(dataBarang[i].getKategori_nama()); %></td>
                                    <td>RP. <% out.print(dataBarang[i].getBarang_harga() + " / " + dataBarang[i].getBarang_satuan()); %></td>
                                    <td><span class="role user"><% out.print(dataBarang[i].getBarang_keadaan());%></span></td>
                                    <td><center>
                                <img class="" src='../../Img/<%= dataBarang[i].getBarang_gambar()%>' alt="Card image cap" style="width: 100px; height: 75px;">
                            </center></td>
                            <td colspan="">
                                <div class="table-data-feature">
                                    <a href='../view/ViewDetailBarang.jsp?kode=<%= dataBarang[i].getBarang_id()%>'>
                                        <button class="item" data-toggle="tooltip" data-placement="top" title="Detail">
                                            <i class="zmdi zmdi-format-list-bulleted"></i>
                                        </button>
                                    </a>
                                    <a href='../view/ViewEditBarang.jsp?kode=<%= dataBarang[i].getBarang_id()%>'>
                                        <button class="item" data-toggle="tooltip" data-placement="top" title="Edit">
                                            <i class="zmdi zmdi-edit"></i>
                                        </button>
                                        <a href='../../DeleteBarang?kode=<%= dataBarang[i].getBarang_id()%>'>
                                            <button class="item" data-toggle="tooltip" data-placement="top" title="Delete">
                                                <i class="zmdi zmdi-delete"></i>
                                            </button>
                                        </a>
                                </div>
                            </td>
                            </tr>
                            <% }%>
                            </tbody>
                        </table>
                    </div>
                    <!-- END DATA TABLE-->
                </div>
            </div>
        </div>
    </div>
</div>



