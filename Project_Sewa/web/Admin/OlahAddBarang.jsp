<%-- 
    Document   : OlahAddSupplier
    Created on : Dec 6, 2019, 7:56:04 AM
    Author     : LAB-330-13
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Admin.J_Barang" %>
<%@page import="Admin.Method_Barang" %>
<%
    String kode_barang = request.getParameter("kode-input");
    String nama_barang = request.getParameter("nama-input");
    int harga_barang = Integer.parseInt(request.getParameter("harga-input"));
    String satuan_barang = request.getParameter("satuan-input");
    String deskripsi_barang = request.getParameter("deskripsi-input");
    String foto_barang = "non-image.png";
    String kondisi_barang = request.getParameter("kondisi");
    String maintenance_barang = request.getParameter("maintenance-input");
    String kategori_barang = request.getParameter("kategori");
    String status_barang = request.getParameter("status");
    if (status_barang == null) {
        status_barang = "Ada";
    }
//
//    out.println(kode_barang);
//    out.println(harga_barang);
//    out.println(nama_barang);
//    out.println(satuan_barang);
//    out.println(deskripsi_barang);
//    out.println(foto_barang);
//    out.println(kondisi_barang);
//    out.println(maintenance_barang);
//    out.println(kategori_barang);
//    out.println(status_barang);
%>