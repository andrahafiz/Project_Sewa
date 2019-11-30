<%-- 
    Document   : ceklogin
    Created on : Nov 28, 2019, 11:03:37 PM
    Author     : Abdul
--%>
<%@page import ="java.sql.DriverManager" %>
<%@page import ="java.sql.Connection" %>
<%@page import ="java.sql.Statement" %>
<%@page import ="java.sql.ResultSet" %>
<%@page import ="java.sql.SQLException" %>
<%@page import ="java.util.ArrayList" %>
<%
    String userid = request.getParameter("username");    
    String pwd = request.getParameter("password");
    Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/DB_Projek",
            "root", "root");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from tb_penyewa where penyewa_username='" + userid + "' and penyewa_password='" + pwd + "'");
    if (rs.next()) {
        session.setAttribute("userid", userid);
        session.setAttribute("id",  rs.getString("penyewa_noidentitas"));
        ;
//        out.println("welcome " + userid);
//        out.println("password " + pwd);
//        out.println("<a href='logout.jsp'>Log out</a>");
        response.sendRedirect("../Pengguna/index.jsp");
    } else {
//        out.println("welcome " + userid);
//        out.println("password " + pwd);
        out.println("Invalid password <a href='index.html'>try again</a>");
    }
%>
