package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import Admin.Method_Barang;
import Admin.J_Barang;
import Test.Kategori;

public final class FormEditBarang_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    private String getCurrentDate() {
        Date current = new Date();
        SimpleDateFormat frmt = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = frmt.format(current);
        return dateString;
    }
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
      out.write("\r\n");
      out.write("\r\n");
      Admin.J_Barang brg = null;
      synchronized (_jspx_page_context) {
        brg = (Admin.J_Barang) _jspx_page_context.getAttribute("brg", PageContext.PAGE_SCOPE);
        if (brg == null){
          brg = new Admin.J_Barang();
          _jspx_page_context.setAttribute("brg", brg, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      Admin.Method_Barang method = null;
      synchronized (_jspx_page_context) {
        method = (Admin.Method_Barang) _jspx_page_context.getAttribute("method", PageContext.PAGE_SCOPE);
        if (method == null){
          method = new Admin.Method_Barang();
          _jspx_page_context.setAttribute("method", method, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--Mengambil Tanggal sekarang-->\r\n");
      out.write('\r');
      out.write('\n');

    String KodeSup = request.getParameter("kode");
    if (KodeSup != null) {
        brg = method.getDataBarangByKode(KodeSup);

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    function tampilkanPreview(gambar, idpreview) {\r\n");
      out.write("        //                membuat objek gambar\r\n");
      out.write("        var gb = gambar.files;\r\n");
      out.write("\r\n");
      out.write("        //                loop untuk merender gambar\r\n");
      out.write("        for (var i = 0; i < gb.length; i++) {\r\n");
      out.write("            //                    bikin variabel\r\n");
      out.write("            var gbPreview = gb[i];\r\n");
      out.write("            var imageType = /image.*/;\r\n");
      out.write("            var preview = document.getElementById(idpreview);\r\n");
      out.write("            var reader = new FileReader();\r\n");
      out.write("\r\n");
      out.write("            if (gbPreview.type.match(imageType)) {\r\n");
      out.write("                //                        jika tipe data sesuai\r\n");
      out.write("                preview.file = gbPreview;\r\n");
      out.write("                reader.onload = (function (element) {\r\n");
      out.write("                    return function (e) {\r\n");
      out.write("                        element.src = e.target.result;\r\n");
      out.write("                    };\r\n");
      out.write("                })(preview);\r\n");
      out.write("                //                    membaca data URL gambar\r\n");
      out.write("                reader.readAsDataURL(gbPreview);\r\n");
      out.write("            } else {\r\n");
      out.write("                //                        jika tipe data tidak sesuai\r\n");
      out.write("                alert(\"Type file tidak sesuai. Khusus image.\");\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    function hanyaAngka(evt) {\r\n");
      out.write("        var charCode = (evt.which) ? evt.which : event.keyCode\r\n");
      out.write("        if (charCode > 31 && (charCode < 48 || charCode > 57))\r\n");
      out.write("            return false;\r\n");
      out.write("        return true;\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
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
      out.write("                        <form action=\"OlahAddBarang.jsp\" method=\"POST\" >\r\n");
      out.write("                            <div class=\"row form-group\">\r\n");
      out.write("                                <div class=\"col col-md-3\">\r\n");
      out.write("                                    <label class=\" form-control-label\">Kode Barang</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-12 col-md-9\">\r\n");
      out.write("                                    <Strong> <p class=\"form-control-static\">");
      out.print( brg.getBarang_id());
      out.write("</p></strong>\r\n");
      out.write("                                    <input type=\"hidden\" id=\"text-input\" name=\"kode-input\" class=\"form-control\" value=");
      out.print( brg.getBarang_id());
      out.write(">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row form-group\">\r\n");
      out.write("                                <div class=\"col col-md-3\">\r\n");
      out.write("                                    <label for=\"text-input\" class=\" form-control-label\">Nama Barang</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-12 col-md-9\">\r\n");
      out.write("                                    <input type=\"text\" id=\"text-input\" name=\"nama-input\" class=\"form-control\" required=\"\" value=\"");
      out.print( brg.getBarang_nama());
      out.write("\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row form-group\">\r\n");
      out.write("                                <div class=\"col col-md-3\">\r\n");
      out.write("                                    <label for=\"harga-input\" class=\" form-control-label\">Harga Barang / Satuan</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-12 col-md-5\">\r\n");
      out.write("                                    <input type=\"text\" id=\"harga-input\" name=\"harga-input\" placeholder=\"Rp.\" class=\"form-control\" required=\"\"  onkeypress=\"return hanyaAngka(event)\" value=\"");
      out.print( brg.getBarang_harga());
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-12 col-md\">\r\n");
      out.write("                                    <select name=\"satuan-input\" id=\"select\" class=\"form-control\" required=\"\">\r\n");
      out.write("                                        ");
 String sel = null;
                                            String status = brg.getBarang_satuan();
                                            if (status.equalsIgnoreCase("hari")) {
                                                out.print("  <option value='0'>Silahkan Pilih</option>"
                                                        + "<option value='Hari' selected >Hari</option>"
                                                        + "<option value='Minggu' >Minggu</option>"
                                                        + "<option value='Bulan'>Bulan</option>"
                                                        + "<option value='Tahun'>Tahun </option>");
                                           
                                            } else if (status.equalsIgnoreCase("minggu")) {
                                                out.print("  <option value='0'>Silahkan Pilih</option>"
                                                        + "<option value='Hari'  >Hari</option>"
                                                        + "<option value='Minggu' selected>Minggu</option>"
                                                        + "<option value='Bulan'>Bulan</option>"
                                                        + "<option value='Tahun'>Tahun </option>");
                                            } else if (status.equalsIgnoreCase("bulan")) {
                                                out.print("  <option value='0'>Silahkan Pilih</option>"
                                                        + "<option value='Hari'  >Hari</option>"
                                                        + "<option value='Minggu' >Minggu</option>"
                                                        + "<option value='Bulan' selected>Bulan</option>"
                                                        + "<option value='Tahun'>Tahun </option>");
                                            } else if (status.equalsIgnoreCase("tahun")) {
                                                out.print("  <option value='0'>Silahkan Pilih</option>"
                                                        + "<option value='Hari'  >Hari</option>"
                                                        + "<option value='Minggu' >Minggu</option>"
                                                        + "<option value='Bulan' >Bulan</option>"
                                                        + "<option value='Tahun'selected>Tahun </option>");
                                            }
                                            //                                            out.print(sel);
                                        
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row form-group\">\r\n");
      out.write("                                <div class=\"col col-md-3\">\r\n");
      out.write("                                    <label for=\"select\" class=\" form-control-label\">Kategori Barang</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-12 col-md-9\">\r\n");
      out.write("                                    <select name=\"kategori\" id=\"select\" class=\"form-control\" required=\"\">\r\n");
      out.write("                                        ");

                                            String kategori = brg.getKategori_nama();
                                            if (kategori.equalsIgnoreCase("Tenda")) {
                                                out.print("  <option  value = '0' > Silahkan Pilih</option> "
                                                        + "<option value = 'Tenda' selected> Tenda </option>"
                                                        + "<option value = 'Tas'> Tas</option> "
                                                        + "<option value =  'Alat Masak' > Alat Masak</option>"
                                                        + "<option value =  'Alat Komunikasi' > Alat Komunikasi</option>"
                                                        + "<option value =  'Perlengkapan Tidur' > Perlengkapan Tidur</option >"
                                                        + "<option value =  'Lain' > Lain-lain</option >");
                                            } else if (kategori.equalsIgnoreCase("Alat Masak")) {
                                                out.print("  <option  value = '0' > Silahkan Pilih</option> "
                                                        + "<option value = 'Tenda' > Tenda </option>"
                                                        + "<option value = 'Tas' > Tas</option> "
                                                        + "<option value =  'Alat Masak' selected> Alat Masak</option>"
                                                        + "<option value =  'Alat Komunikasi' > Alat Komunikasi</option>"
                                                        + "<option value =  'Perlengkapan Tidur' > Perlengkapan Tidur</option >"
                                                        + "<option value =  'Lain' > Lain-lain</option >");
                                            } else if (kategori.equalsIgnoreCase("Alat Komunikasi")) {
                                                out.print("  <option  value = '0' > Silahkan Pilih</option> "
                                                        + "<option value = 'Tenda' > Tenda </option>"
                                                        + "<option value = 'Tas' > Tas</option> "
                                                        + "<option value =  'Alat Masak' > Alat Masak</option>"
                                                        + "<option value =  'Alat Komunikasi' selected> Alat Komunikasi</option>"
                                                        + "<option value =  'Perlengkapan Tidur' > Perlengkapan Tidur</option >"
                                                        + "<option value =  'Lain' > Lain-lain</option >");
                                            }
                                        
      out.write("\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"row form-group\">\r\n");
      out.write("                                <div class=\"col col-md-3\">\r\n");
      out.write("                                    <label for=\"textarea-input\" class=\" form-control-label\">Deskripsi</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-12 col-md-9\">\r\n");
      out.write("                                    <textarea name=\"deskripsi-input\" id=\"textarea-input\" rows=\"9\" placeholder=\"Berikan deskripsi pada barang...\" class=\"form-control\" >");
      out.print( brg.getBarang_deskripsi());
      out.write("</textarea>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"row form-group\">\r\n");
      out.write("                                <div class=\"col col-md-3\">\r\n");
      out.write("                                    <label for=\"status-input\" class=\" form-control-label\">Status Barang</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-12 col-md-4\">\r\n");
      out.write("                                    <select name=\"status\" id=\"status-input\" class=\"form-control\" required=\"\">\r\n");
      out.write("                                        <option value=\"0\">Silahkan Pilih</option>\r\n");
      out.write("                                        ");

                                            boolean radio = brg.getBarang_status();
                                            if (radio == true) {
                                                out.print("<option value='True' selected>Ada</option>"
                                                        + "<option value='False'>Kosong</option>");
                                            } else {
                                                out.print("<option value='True' >Ada</option>"
                                                        + "<option value='False' selected>Kosong</option>");
                                            }
                                        
      out.write("\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col col-md-1\">\r\n");
      out.write("                                    <label class=\" form-control-label\">Kondisi</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col col-m-4\">\r\n");
      out.write("                                    <div class=\"form-check\">\r\n");
      out.write("                                        ");

                                            String kondisi = brg.getBarang_keadaan();
                                            if (kondisi.equalsIgnoreCase("baik")) {
                                                out.print("<div class='radio'>"
                                                        + "<label for='radio1' class='form-check-label '>"
                                                        + "<input type='radio' id='radio1' name='kondisi' value='Baik' class='form-check-input' checked>Baik"
                                                        + "</label>"
                                                        + "</div>"
                                                        + "<div class='radio'>"
                                                        + "<label for='radio2' class='form-check-label '>"
                                                        + "<input  type = 'radio' id = 'radio2' name = 'kondisi' value = 'Sedang' class='form-check-input' >Sedang"
                                                        + "</label>"
                                                        + "</div>"
                                                        + "<div class='radio'>"
                                                        + "<label for='radio3' class='form-check-label '>"
                                                        + "<input type='radio' id='radio3' name='radios' value='Rusak' class='form-check-input'>Rusak"
                                                        + "</label>"
                                                        + "</div>");
                                            } else if (kondisi.equalsIgnoreCase("sedang")) {
                                                out.print("<div class='radio'>"
                                                        + "<label for='radio1' class='form-check-label '>"
                                                        + "<input type='radio' id='radio1' name='kondisi' value='Baik' class='form-check-input' >Baik"
                                                        + "</label>"
                                                        + "</div>"
                                                        + "<div class='radio'>"
                                                        + "<label for='radio2' class='form-check-label '>"
                                                        + "<input  type = 'radio' id = 'radio2' name = 'kondisi' value = 'Sedang' class='form-check-input' checked>Sedang"
                                                        + "</label>"
                                                        + "</div>"
                                                        + "<div class='radio'>"
                                                        + "<label for='radio3' class='form-check-label '>"
                                                        + "<input type='radio' id='radio3' name='radios' value='Rusak' class='form-check-input'>Rusak"
                                                        + "</label>"
                                                        + "</div>");
                                            } else if (kondisi.equalsIgnoreCase("rusak")) {
                                                out.print("<div class='radio'>"
                                                        + "<label for='radio1' class='form-check-label '>"
                                                        + "<input type='radio' id='radio1' name='kondisi' value='Baik' class='form-check-input' >Baik"
                                                        + "</label>"
                                                        + "</div>"
                                                        + "<div class='radio'>"
                                                        + "<label for='radio2' class='form-check-label '>"
                                                        + "<input  type = 'radio' id = 'radio2' name = 'kondisi' value = 'Sedang' class='form-check-input' >Sedang"
                                                        + "</label>"
                                                        + "</div>"
                                                        + "<div class='radio'>"
                                                        + "<label for='radio3' class='form-check-label '>"
                                                        + "<input type='radio' id='radio3' name='radios' value='Rusak' class='form-check-input' checked>Rusak"
                                                        + "</label>"
                                                        + "</div>");
                                            }
                                        
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row form-group\">\r\n");
      out.write("                                <div class=\"col col-md-3\">\r\n");
      out.write("                                    <label for=\"file-input\" class=\" form-control-label\">Gambar</label>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-12 col-md-9\">\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"row\">\r\n");
      out.write("                                        <div class=\"col-sm-12 m-b-10\">\r\n");
      out.write("                                            <input type=\"file\" id=\"file\" name=\"file\" class=\"form-control-file\" type=\"file\"  id=\"file\" onchange=\"tampilkanPreview(this, 'preview')\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"row\">\r\n");
      out.write("                                        <div class=\"col-sm-12\">\r\n");
      out.write("                                            <img id=\"preview\" class=\"img-thumbnail\" style=\"border: 2px solid #ddd\" width=\"320px\" src=\"../Img/non-image.png\"/>\r\n");
      out.write("                                            <p class=\"help-block\">File harus PNG.</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
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
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
}
      out.write("\r\n");
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
