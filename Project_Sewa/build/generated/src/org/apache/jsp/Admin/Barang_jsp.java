package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Admin.Method_Barang;
import Admin.J_Barang;

public final class Barang_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- MAIN CONTENT-->\r\n");
      out.write("    <div class=\"main-content\">\r\n");
      out.write("        <div class=\"section__content section__content--p30\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"overview-wrap\">\r\n");
      out.write("                    <h2 class=\"title-1\">Data Barang</h2>\r\n");
      out.write("                    <a href=\"index.jsp?hlm=InputBarang\">\r\n");
      out.write("                        <button class=\"au-btn au-btn-icon au-btn--green\">\r\n");
      out.write("                            <i class=\"zmdi zmdi-plus\"></i>Tambah Baru</button>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row m-t-20\">\r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                        <!-- DATA TABLE-->\r\n");
      out.write("                        <div class=\"table-responsive m-b-40\">\r\n");
      out.write("                            <table class=\"table table-borderless table-data3\">\r\n");
      out.write("                                <thead>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th>No</th>\r\n");
      out.write("                                        <th>ID Barang</th>\r\n");
      out.write("                                        <th>Nama</th>\r\n");
      out.write("                                        <th>Kategori</th>\r\n");
      out.write("                                        <th>Harga / Satuan</th>\r\n");
      out.write("                                        <!--<th>Status</th>-->\r\n");
      out.write("                                        <th>Kondisi</th>\r\n");
      out.write("                                        <th><center>Gambar</center></th>\r\n");
      out.write("                                <th><center>Aksi</center></th>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                </thead>\r\n");
      out.write("                                <tbody>\r\n");
      out.write("                                    ");

                                    for (int i = 0; i < dataBarang.length; i++) {
      out.write("\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <td> ");
 out.print((i + 1)); 
      out.write("</td>\r\n");
      out.write("                                        <td> ");
 out.print(dataBarang[i].getBarang_id()); 
      out.write("</td>\r\n");
      out.write("                                        <td> ");
 out.print(dataBarang[i].getBarang_nama()); 
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("                                        <td>");
 out.print(dataBarang[i].getKategori_nama()); 
      out.write("</td>\r\n");
      out.write("                                        <td>RP. ");
 out.print(dataBarang[i].getBarang_harga() + " / " + dataBarang[i].getBarang_satuan()); 
      out.write("</td>\r\n");
      out.write("                                        ");

                 //                                        boolean status = dataBarang[i].isBarang_status();
                 //                                        String keterangan = "";
                 //                                        String warna = "";
                 //                                        if (status == true) {
                 //                                            keterangan = "Ada";
                 //                                            warna = "process";
                 //                                        } else {
                 //                                            keterangan = "Di Pinjam";
                 //                                            warna = "denied";
                 //                                        }
                 //
                 //                                        out.print("<td class='" + warna + "'>");
                 //                                        out.print(keterangan);
                 //                                        out.print("</td>");
                 //                                    
      out.write("\r\n");
      out.write("                                        <td><span class=\"role user\">");
 out.print(dataBarang[i].getBarang_keadaan()); 
      out.write("</span></td>\r\n");
      out.write("                                        <td><center><img class=\"\" src=\"../Img/");
      out.print( dataBarang[i].getBarang_gambar());
      out.write("\" alt=\"Card image cap\" style=\"width: 100px; height: 75px;\"></center></td>\r\n");
      out.write("                                <td colspan=\"\">\r\n");
      out.write("                                    <div class=\"table-data-feature\">\r\n");
      out.write("                                        <button class=\"item\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Detail\">\r\n");
      out.write("                                            <i class=\"zmdi zmdi-format-list-bulleted\"></i>\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                        <a href='index.jsp?hlm=FormEditBarang.jsp?kode=");
      out.print( dataBarang[i].getBarang_id());
      out.write("'>\r\n");
      out.write("                                            <button class=\"item\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Edit\">\r\n");
      out.write("                                                <i class=\"zmdi zmdi-edit\"></i>\r\n");
      out.write("                                            </button>\r\n");
      out.write("                                            <a href='../DeleteBarang?kode=");
      out.print( dataBarang[i].getBarang_id());
      out.write("'>\r\n");
      out.write("\r\n");
      out.write("                                                <button class=\"item\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Delete\">\r\n");
      out.write("\r\n");
      out.write("                                                    <i class=\"zmdi zmdi-delete\"></i>\r\n");
      out.write("\r\n");
      out.write("                                                </button>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                ");
 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                </tbody>\r\n");
      out.write("                            </table>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- END DATA TABLE-->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
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
