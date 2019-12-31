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
            
            <div class="row">
                <div class="col-md-10">
                    <h3 class="title-3 ">
                                        <i class="zmdi zmdi-account-calendar"></i>user data</h3>
                </div>
                <div class="col-md-2">
                       
                        <div class="table-data__tool-left">
                            <button class="au-btn au-btn-icon au-btn--green au-btn--small">
                                <i class="zmdi zmdi-plus"></i>add item</button>
                            
                    </div>
                </div>
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
                                    <th>Harga</th>
                                    <th>Status</th>
                                    <th>Kondisi</th>
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
                                    <td>RP. <% out.print(dataBarang[i].getBarang_harga()); %></td>
                                    <%
                                        boolean status = dataBarang[i].isBarang_status();
                                        String keterangan = "";
                                        String warna = "";
                                        if (status == true) {
                                            keterangan = "Ada";
                                            warna = "process";
                                        } else {
                                            keterangan = "Di Pinjam";
                                            warna = "denied";
                                        }

                                        out.print("<td class='" + warna + "'>");
                                        out.print(keterangan);
                                        out.print("</td>");
                                    %>
                                    <td><span class="role user"><% out.print(dataBarang[i].getBarang_keadaan()); %></span></td>
                                    <td colspan="">
                                        <div class="table-data-feature">
                                            <button class="item" data-toggle="tooltip" data-placement="top" title="Detail">
                                                <i class="zmdi zmdi-format-list-bulleted"></i>
                                            </button>
                                            <button class="item" data-toggle="tooltip" data-placement="top" title="Edit">
                                                <i class="zmdi zmdi-edit"></i>
                                            </button>
                                            <button class="item" data-toggle="tooltip" data-placement="top" title="Delete">
                                                <i class="zmdi zmdi-delete"></i>
                                            </button>
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
            <div class="row">
                <div class="col-md-12">
                    <div class="copyright">
                        <p>Copyright © 2018 Colorlib. All rights reserved. Template by <a href="https://colorlib.com">Colorlib</a>.</p>
                    </div>
                </div>
            </div>

        </div>
    </div>
</div>
</div>

</div>


