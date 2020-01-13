<%-- 
    Document   : OlahAddSupplier
    Created on : Dec 6, 2019, 7:56:04 AM
    Author     : LAB-330-13
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Admin.J_Barang" %>
<%@page import="Admin.Method_Barang" %>
<%

    J_Barang sup = new J_Barang();
    String kode_barang = request.getParameter("kode-input");
    String nama_barang = request.getParameter("nama-input");
    int harga_barang = Integer.parseInt(request.getParameter("harga-input"));
    String satuan_barang = request.getParameter("satuan-input");
    String deskripsi_barang = request.getParameter("deskripsi-input");
    String foto_barang = "non-image.png";
    String kondisi_barang = request.getParameter("kondisi");
    String kategori_barang = request.getParameter("kategori");
    String status_barang = request.getParameter("status");
    if (status_barang == null) {
        status_barang = "True";
    }
    
    sup.setBarang_id(kode_barang);
    sup.setBarang_nama(nama_barang);
    sup.setBarang_harga(harga_barang);
    sup.setBarang_satuan(satuan_barang);
    sup.setBarang_deskripsi(deskripsi_barang);
    sup.setBarang_foto(foto_barang);
    sup.setBarang_keadaan(kondisi_barang);
    sup.setKategori_nama(kategori_barang);
    sup.setBarang_status(Boolean.parseBoolean(status_barang));
    

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

     request.setAttribute("datasub", sup);
//  String insert = "INSERT INTO `tb_barang` (`barang_id`, `barang_nama`, `barang_harga`, `barang_satuan`, "
//                    + "`barang_deskripsi`, `barang_foto`, `barang_kondisi`, `barang_kategori`, `barang_status`) "
//                    + "VALUES ('" + kode_barang + "', "
//                    + "'" + nama_barang + "', "
//                    + "'" + harga_barang + "', "
//                    + "'" + satuan_barang + "', "
//                    + "'" + deskripsi_barang + "', "
//                    + "'" + foto_barang + "', "
//                    + "'" + kondisi_barang + "', "
//                    + "'" + kategori_barang + "', "
//                    + "'" + status_barang + "')";
//  out.println(insert);
    Method_Barang supHome = new Method_Barang();
    if (supHome.create(sup) == true) {
        response.sendRedirect("index.jsp?hlm=barang");
    }else{
           response.sendRedirect("index.jsp?psn=gagal");
    }
%>


