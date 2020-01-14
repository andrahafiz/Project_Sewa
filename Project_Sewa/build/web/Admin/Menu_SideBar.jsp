<%-- 
    Document   : Menu_SideBar
    Created on : Nov 29, 2019, 12:08:35 AM
    Author     : User
--%>
<%
//    String kategori = request.getParameter("hlm");
//    out.print(kategori);
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- MENU SIDEBAR-->
<aside class="menu-sidebar d-none d-lg-block">
    <div class="logo">
        <a href="#">
            <img src="images/icon/logo.png" alt="Cool Admin" />
        </a>
    </div>
    <div class="menu-sidebar__content js-scrollbar1">
        <nav class="navbar-sidebar">
            <ul class="list-unstyled navbar__list">

                <li class="active has-sub">
                    <a class="js-arrow" href="index.jsp">
                        <i class="fas fa-tachometer-alt"></i>Dashboard</a>

                </li>
                <li>
                    <a href="view/ViewBarang.jsp">
                        <i class="fas fa-chart-bar"></i>Data Penyewa</a>
                </li>
                <li>
                    <a href="index.jsp?hlm=barang">
                        <i class="fas fa-chart-bar"></i>Data Barang</a>
                </li>
                <li>
                    <a href="index.jsp?hlm=barang">
                        <i class="fas fa-chart-bar"></i>Data Barang</a>
                </li>
                <li >
                    <a href="view/TambahBarang.jsp">
                        <i class="far fa-check-square"></i>Input Data Barang</a>
                </li>

            </ul>
        </nav>
    </div>
</aside>
<!-- END MENU SIDEBAR-->