package org.apache.jsp.Admin.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Admin.Methods;
import Admin.J_Penyewa;

public final class Penyewa_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
Methods penyewafcd = new Methods();
    J_Penyewa[] dataPenyewa = penyewafcd.getDataPenyewa();
//    String a = request.getParameter("status");



      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- MAIN CONTENT-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"main-content\">\n");
      out.write("    <div class=\"section__content section__content--p30\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <!-- DATA TABLE -->\n");
      out.write("                    <h3 class=\"title-5 m-b-35\">data penyewa</h3>\n");
      out.write("                    <hr/>\n");
      out.write("\n");
      out.write("                    <div class=\"table-responsive table-responsive-data2\">\n");
      out.write("                        <table class=\"table table-data2\">\n");
      out.write("                            <thead style=\"background-color: #666565; color:white;\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>NO</th>\n");
      out.write("                                    <th>Nama</th>\n");
      out.write("                                    <th>Tanggal Lahir</th>\n");
      out.write("                                    <th>Jenis Kelamin</th>\n");
      out.write("                                    <th>Nomor Telp/Hp</th>\n");
      out.write("                                    <th>Email</th>\n");
      out.write("                                    <th>Alamat</th>\n");
      out.write("                                    <th>Aksi\n");
      out.write("                                    </th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                ");
                                    for (int i = 0; i < dataPenyewa.length; i++) {
      out.write("\n");
      out.write("\n");
      out.write("                                <tr class=\"spacer\"></tr>\n");
      out.write("                                <!--<tr class=\"tr-shadow\">-->\n");
      out.write("                            <td>\n");
      out.write("                                <label class=\"au-checkbox\">\n");
      out.write("                                    ");
 out.print((i + 1)); 
      out.write("\n");
      out.write("                                </label>\n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                            <td> \n");
      out.write("                                ");
 out.print(dataPenyewa[i].getPenyewa_namadepan() + " " + dataPenyewa[i].getPenyewa_namabelakang()); 
      out.write("\n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                            <td >\n");
      out.write("                                ");
out.print(dataPenyewa[i].getPenyewa_tgllahir());
      out.write("\n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                            <td> \n");
      out.write("                                ");
 out.print(dataPenyewa[i].getPenyewa_jk()); 
      out.write("\n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                            <td>\n");
      out.write("                                <span class=\"status--process\">");
 out.print(dataPenyewa[i].getPenyewa_notlp()); 
      out.write("</span>\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <span class=\"block-email\">\n");
      out.write("                                    ");

                                        out.print(dataPenyewa[i].getPenyewa_email());
                                    
      out.write("\n");
      out.write("\n");
      out.write("                                </span>\n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                            <td>\n");
      out.write("                                ");
out.print(dataPenyewa[i].getPenyewa_alamat());
      out.write("\n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                            <td colspan=\"2\">\n");
      out.write("                                <div class=\"table-data-feature\">\n");
      out.write("                                    <button class=\"item\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Detail\">\n");
      out.write("                                        <i class=\"zmdi zmdi-format-list-bulleted\"></i>\n");
      out.write("                                    </button>\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- END DATA TABLE -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
