<%-- 
    Document   : addSukses
    Created on : Dec 6, 2019, 8:11:02 AM
    Author     : LAB-330-13
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <jsp:useBean id="sup" class="Pertemuan11.Supplier"/>
    <%
        sup = (Pertemuan11.Supplier) request.getAttribute("datasub");
    %>
    <body>
        <h1>Penambahan data Supplier</h1>
        <hr>
        <table>
            <tr>
                <td> Kode Supplier </td>
                <td> : </td>
                <td><%=sup.getKode()%></td>
            </tr>
             <tr>
                <td> Nama Supplier </td>
                <td> : </td>
                <td><%=sup.getNama()%></td>
            </tr>
             <tr>
                <td> Alamat </td>
                <td> : </td>
                <td><%=sup.getAlamat()%></td>
            </tr>
            <tr>
                <td> Jenis Perusahaan </td>
                <td> : </td>
                <td><%=sup.getJenis()%></td>
            </tr>
        </table>
            <br/>
            <b>Berhasil</b> ditambahkan, <a href="DaftarSupplier.jsp">Lihat</a>
    </body>
</html>
