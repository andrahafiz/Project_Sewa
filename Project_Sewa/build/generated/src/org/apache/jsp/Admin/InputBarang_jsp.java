package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Admin.Method_Barang;
import Admin.J_Barang;

public final class InputBarang_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
Method_Barang kategorifcd = new Method_Barang();
    J_Barang[] dataBarang = kategorifcd.getDataBarang();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- MAIN CONTENT-->\r\n");
      out.write("<div class=\"main-content\">\r\n");
      out.write("    <div class=\"section__content section__content--p30\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-lg-12\">\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                    <div class=\"card-header\">\r\n");
      out.write("                        <strong>Form Data</strong> Barang\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"card-body card-block\">\r\n");
      out.write("                        <form action=\"\" method=\"post\" enctype=\"multipart/form-data\" class=\"form-horizontal\">\r\n");
      out.write("                            <div class=\"row form-group\">\r\n");
      out.write("                                <div class=\"col col-md-3\">\r\n");
      out.write("                                    <label class=\" form-control-label\">Kode Barang</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-12 col-md-9\">\r\n");
      out.write("                                    <Strong> <p class=\"form-control-static\">####</p></strong>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row form-group\">\r\n");
      out.write("                                <div class=\"col col-md-3\">\r\n");
      out.write("                                    <label for=\"text-input\" class=\" form-control-label\">Nama Barang</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-12 col-md-9\">\r\n");
      out.write("                                    <input type=\"text\" id=\"text-input\" name=\"nama-input\" class=\"form-control\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row form-group\">\r\n");
      out.write("                                <div class=\"col col-md-3\">\r\n");
      out.write("                                    <label for=\"email-input\" class=\" form-control-label\">Harga Barang / Satuan</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-12 col-md-5\">\r\n");
      out.write("                                    <input type=\"email\" id=\"email-input\" name=\"email-input\" placeholder=\"Rp.\" class=\"form-control\">\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-12 col-md\">\r\n");
      out.write("                                    <input type=\"email\" id=\"email-input\" name=\"email-input\" placeholder=\"\" class=\"form-control\">\r\n");
      out.write("                                    <small class=\"help-block form-text\">Jam / Hari / Minggu / Bulan / Tahun</small>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                             <div class=\"row form-group\">\r\n");
      out.write("                                <div class=\"col col-md-3\">\r\n");
      out.write("                                    <label for=\"select\" class=\" form-control-label\">Kategori Barang</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-12 col-md-9\">\r\n");
      out.write("                                    <select name=\"select\" id=\"select\" class=\"form-control\">\r\n");
      out.write("                                        <option value=\"0\">Pilih</option>\r\n");
      out.write("                                        <option value=\"1\">Option #1</option>\r\n");
      out.write("                                        <option value=\"2\">Option #2</option>\r\n");
      out.write("                                        <option value=\"3\">Option #3</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"row form-group\">\r\n");
      out.write("                                <div class=\"col col-md-3\">\r\n");
      out.write("                                    <label for=\"textarea-input\" class=\" form-control-label\">Deskripsi</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-12 col-md-9\">\r\n");
      out.write("                                    <textarea name=\"textarea-input\" id=\"textarea-input\" rows=\"9\" placeholder=\"Berikan deskripsi pada barang...\" class=\"form-control\"></textarea>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                           \r\n");
      out.write("\r\n");
      out.write("                            <div class=\"row form-group\">\r\n");
      out.write("                                <div class=\"col col-md-3\">\r\n");
      out.write("                                    <label for=\"disabledSelect\" class=\" form-control-label\">Disabled Select</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-12 col-md-9\">\r\n");
      out.write("                                    <select name=\"disabledSelect\" id=\"disabledSelect\" disabled=\"\" class=\"form-control\">\r\n");
      out.write("                                        <option value=\"0\">Please select</option>\r\n");
      out.write("                                        <option value=\"1\">Option #1</option>\r\n");
      out.write("                                        <option value=\"2\">Option #2</option>\r\n");
      out.write("                                        <option value=\"3\">Option #3</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row form-group\">\r\n");
      out.write("                                <div class=\"col col-md-3\">\r\n");
      out.write("                                    <label class=\" form-control-label\">Radios</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col col-md-9\">\r\n");
      out.write("                                    <div class=\"form-check\">\r\n");
      out.write("                                        <div class=\"radio\">\r\n");
      out.write("                                            <label for=\"radio1\" class=\"form-check-label \">\r\n");
      out.write("                                                <input type=\"radio\" id=\"radio1\" name=\"radios\" value=\"option1\" class=\"form-check-input\">Option 1\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"radio\">\r\n");
      out.write("                                            <label for=\"radio2\" class=\"form-check-label \">\r\n");
      out.write("                                                <input type=\"radio\" id=\"radio2\" name=\"radios\" value=\"option2\" class=\"form-check-input\">Option 2\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"radio\">\r\n");
      out.write("                                            <label for=\"radio3\" class=\"form-check-label \">\r\n");
      out.write("                                                <input type=\"radio\" id=\"radio3\" name=\"radios\" value=\"option3\" class=\"form-check-input\">Option 3\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"row form-group\">\r\n");
      out.write("                                <div class=\"col col-md-3\">\r\n");
      out.write("                                    <label class=\" form-control-label\">Checkboxes</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col col-md-9\">\r\n");
      out.write("                                    <div class=\"form-check\">\r\n");
      out.write("                                        <div class=\"checkbox\">\r\n");
      out.write("                                            <label for=\"checkbox1\" class=\"form-check-label \">\r\n");
      out.write("                                                <input type=\"checkbox\" id=\"checkbox1\" name=\"checkbox1\" value=\"option1\" class=\"form-check-input\">Option 1\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"checkbox\">\r\n");
      out.write("                                            <label for=\"checkbox2\" class=\"form-check-label \">\r\n");
      out.write("                                                <input type=\"checkbox\" id=\"checkbox2\" name=\"checkbox2\" value=\"option2\" class=\"form-check-input\"> Option 2\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"checkbox\">\r\n");
      out.write("                                            <label for=\"checkbox3\" class=\"form-check-label \">\r\n");
      out.write("                                                <input type=\"checkbox\" id=\"checkbox3\" name=\"checkbox3\" value=\"option3\" class=\"form-check-input\"> Option 3\r\n");
      out.write("                                            </label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"row form-group\">\r\n");
      out.write("                                <div class=\"col col-md-3\">\r\n");
      out.write("                                    <label for=\"file-input\" class=\" form-control-label\">File input</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-12 col-md-9\">\r\n");
      out.write("                                    <input type=\"file\" id=\"file-input\" name=\"file-input\" class=\"form-control-file\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"card-footer\">\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary btn-sm\">\r\n");
      out.write("                            <i class=\"fa fa-dot-circle-o\"></i> Submit\r\n");
      out.write("                        </button>\r\n");
      out.write("                        <button type=\"reset\" class=\"btn btn-danger btn-sm\">\r\n");
      out.write("                            <i class=\"fa fa-ban\"></i> Reset\r\n");
      out.write("                        </button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-12\">\r\n");
      out.write("                <div class=\"copyright\">\r\n");
      out.write("                    <p>Copyright © 2018 Colorlib. All rights reserved. Template by <a href=\"https://colorlib.com\">Colorlib</a>.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
