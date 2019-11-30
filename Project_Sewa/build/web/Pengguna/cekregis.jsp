<%-- 
    Document   : cekregis
    Created on : Nov 29, 2019, 12:25:32 AM
    Author     : Abdul
--%>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.SQLException" %>
<%@page import="java.util.ArrayList" %>
<%
    String tanggal = "2000/10/04";
    String username = request.getParameter("username");    
    String password = request.getParameter("password");
    String nama_depan = request.getParameter("nama_depan");
    String nama_belakang = request.getParameter("nama_belakang");
    String jk = request.getParameter("jenis");
    String tgllahir = request.getParameter(tanggal);
    String alamat = request.getParameter("alamat");
    String email = request.getParameter("email");
    String nohp = request.getParameter("nohp");
    Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DB_Projek",
            "root", "root");
    Statement st = con.createStatement();
    //ResultSet rs;
    int i = st.executeUpdate("insert into tb_penyewa(penyewa_namadepan, penyewa_namabelakang, penyewa_tgllahir, penyewa_alamat, penyewa_jk, penyewa_notlp, penyewa_email, penyewa_username, penyewa_password) values ('" + nama_depan + "','" + nama_belakang + "','" + tgllahir+ "','" + alamat + "','" + jk + "','" + nohp+ "','" + email + "','" + username + "','" + password + "')");
    if (i > 0) {
        //session.setAttribute("userid", user);
        response.sendRedirect("login.jsp");
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else {
        response.sendRedirect("index.jsp");
    }
%>