package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Menu_005fSideBar_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

//    String kategori = request.getParameter("hlm");
//    out.print(kategori);

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!-- MENU SIDEBAR-->\n");
      out.write("<aside class=\"menu-sidebar d-none d-lg-block\">\n");
      out.write("    <div class=\"logo\">\n");
      out.write("        <a href=\"#\">\n");
      out.write("            <img src=\"images/icon/logo.png\" alt=\"Cool Admin\" />\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"menu-sidebar__content js-scrollbar1\">\n");
      out.write("        <nav class=\"navbar-sidebar\">\n");
      out.write("            <ul class=\"list-unstyled navbar__list\">\n");
      out.write("\n");
      out.write("                <li class=\"active has-sub\">\n");
      out.write("                    <a class=\"js-arrow\" href=\"index.jsp\">\n");
      out.write("                        <i class=\"fas fa-tachometer-alt\"></i>Dashboard</a>\n");
      out.write("\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"view/ViewBarang.jsp\">\n");
      out.write("                        <i class=\"fas fa-chart-bar\"></i>Data Penyewa</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"index.jsp?hlm=barang\">\n");
      out.write("                        <i class=\"fas fa-chart-bar\"></i>Data Barang</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"index.jsp?hlm=barang\">\n");
      out.write("                        <i class=\"fas fa-chart-bar\"></i>Data Barang</a>\n");
      out.write("                </li>\n");
      out.write("                <li >\n");
      out.write("                    <a href=\"view/TambahBarang.jsp\">\n");
      out.write("                        <i class=\"far fa-check-square\"></i>Input Data Barang</a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("</aside>\n");
      out.write("<!-- END MENU SIDEBAR-->");
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
