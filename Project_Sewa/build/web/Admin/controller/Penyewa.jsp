<%-- 
    Document   : Penyewa
    Created on : Nov 28, 2019, 11:50:38 PM
    Author     : User
--%>
<%@page import="Admin.Methods" %>
<%@page import="Admin.J_Penyewa" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%Methods penyewafcd = new Methods();
    J_Penyewa[] dataPenyewa = penyewafcd.getDataPenyewa();
//    String a = request.getParameter("status");


%>
<!DOCTYPE html>
<%--<%@include file="header.jso" %>--%>

<!-- MAIN CONTENT-->


<div class="main-content">
    <div class="section__content section__content--p30">
        <div class="container-fluid">


            <div class="row">

                <div class="col-md-12">
                    <!-- DATA TABLE -->
                    <h3 class="title-5 m-b-35">data penyewa</h3>
                    <hr/>

                    <div class="table-responsive table-responsive-data2">
                        <table class="table table-data2">
                            <thead style="background-color: #666565; color:white;">
                                <tr>
                                    <th>NO</th>
                                    <th>Nama</th>
                                    <th>Tanggal Lahir</th>
                                    <th>Jenis Kelamin</th>
                                    <th>Nomor Telp/Hp</th>
                                    <th>Email</th>
                                    <th>Alamat</th>
                                    <th>Aksi
                                    </th>
                                </tr>
                            </thead>
                            <tbody>
                                <%                                    for (int i = 0; i < dataPenyewa.length; i++) {%>

                                <tr class="spacer"></tr>
                                <!--<tr class="tr-shadow">-->
                            <td>
                                <label class="au-checkbox">
                                    <% out.print((i + 1)); %>
                                </label>
                            </td>

                            <td> 
                                <% out.print(dataPenyewa[i].getPenyewa_namadepan() + " " + dataPenyewa[i].getPenyewa_namabelakang()); %>
                            </td>

                            <td >
                                <%out.print(dataPenyewa[i].getPenyewa_tgllahir());%>
                            </td>

                            <td> 
                                <% out.print(dataPenyewa[i].getPenyewa_jk()); %>
                            </td>

                            <td>
                                <span class="status--process"><% out.print(dataPenyewa[i].getPenyewa_notlp()); %></span>
                            </td>
                            <td>
                                <span class="block-email">
                                    <%
                                        out.print(dataPenyewa[i].getPenyewa_email());
                                    %>

                                </span>
                            </td>

                            <td>
                                <%out.print(dataPenyewa[i].getPenyewa_alamat());%>
                            </td>

                            <td colspan="2">
                                 <div class="table-data-feature">
                                        <button class="item" data-toggle="tooltip" data-placement="top" title="Detail">
                                            <i class="zmdi zmdi-format-list-bulleted"></i>
                                        </button>
                                    
                                </div>
                            </td>

                            </tr>
                            <%}%>
                            </tbody>
                        </table>
                    </div>
                    <!-- END DATA TABLE -->
                </div>
            </div>

           
        </div>
    </div>
</div>



