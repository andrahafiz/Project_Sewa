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
%>
<!DOCTYPE html>
<!DOCTYPE html>
<%--<%@include file="header.jso" %>--%>

<!-- MAIN CONTENT-->
<div class="main-content">
    <div class="section__content section__content--p30">
        <div class="container-fluid">

            <div class="overview-wrap">
                <h2 class="title-1">Data Barang</h2>
                <a href="index.jsp?hlm=InputBarang">
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
                                    <td>RP. <% out.print(dataBarang[i].getBarang_harga() + " / " +dataBarang[i].getBarang_satuan()); %></td>
                       <%
//                                        boolean status = dataBarang[i].isBarang_status();
//                                        String keterangan = "";
//                                        String warna = "";
//                                        if (status == true) {
//                                            keterangan = "Ada";
//                                            warna = "process";
//                                        } else {
//                                            keterangan = "Di Pinjam";
//                                            warna = "denied";
//                                        }
//
//                                        out.print("<td class='" + warna + "'>");
//                                        out.print(keterangan);
//                                        out.print("</td>");
//                                    %>
                                    <td><span class="role user"><% out.print(dataBarang[i].getBarang_keadaan()); %></span></td>
                                    <td><center><img class="" src="../Img/<%= dataBarang[i].getBarang_gambar()%>" alt="Card image cap" style="width: 100px; height: 75px;"></center></td>
                                    <td colspan="">
                                        <div class="table-data-feature">
                                            <button class="item" data-toggle="tooltip" data-placement="top" title="Detail">
                                                <i class="zmdi zmdi-format-list-bulleted"></i>
                                            </button>
                                            <button class="item" data-toggle="tooltip" data-placement="top" title="Edit">
                                                <i class="zmdi zmdi-edit"></i>
                                            </button>
                                             <a href='../DeleteBarang?kode=<%= dataBarang[i].getBarang_id()%>'>
                                            
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



