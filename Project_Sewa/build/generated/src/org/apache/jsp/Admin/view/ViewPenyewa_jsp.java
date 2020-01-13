package org.apache.jsp.Admin.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import Admin.Method_Barang;
import Admin.J_Barang;
import Test.Kategori;

public final class ViewPenyewa_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    private String getCurrentDate() {
        Date current = new Date();
        SimpleDateFormat frmt = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = frmt.format(current);
        return dateString;
    }
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/Admin/view/../controller/Menu_SideBar.jsp");
    _jspx_dependants.add("/Admin/view/../header/header.jsp");
    _jspx_dependants.add("/Admin/view/../controller/FormEditBarang.jsp");
    _jspx_dependants.add("/Admin/view/../footer/footer.jsp");
  }

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

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags-->\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"au theme template\">\n");
      out.write("        <meta name=\"author\" content=\"Hau Nguyen\">\n");
      out.write("        <meta name=\"keywords\" content=\"au theme template\">\n");
      out.write("\n");
      out.write("        <!-- Title Page-->\n");
      out.write("        <title>Dashboard</title>\n");
      out.write("\n");
      out.write("        <!-- Fontfaces CSS-->\n");
      out.write("        <link href=\"css/font-face.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("        <link href=\"vendor/font-awesome-4.7/css/font-awesome.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("        <link href=\"vendor/font-awesome-5/css/fontawesome-all.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("        <link href=\"vendor/mdi-font/css/material-design-iconic-font.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS-->\n");
      out.write("        <link href=\"vendor/bootstrap-4.1/bootstrap.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("\n");
      out.write("        <!-- Vendor CSS-->\n");
      out.write("        <link href=\"vendor/animsition/animsition.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("        <link href=\"vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("        <link href=\"vendor/wow/animate.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("        <link href=\"vendor/css-hamburgers/hamburgers.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("        <link href=\"vendor/slick/slick.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("        <link href=\"vendor/select2/select2.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("        <link href=\"vendor/perfect-scrollbar/perfect-scrollbar.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("\n");
      out.write("        <!-- Main CSS-->\n");
      out.write("        <link href=\"css/theme.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"animsition\">\n");
      out.write("        <div class=\"page-wrapper\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- MENU SIDEBAR-->\n");
      out.write("            ");
      out.write('\n');

//    String kategori = request.getParameter("hlm");
//    out.print(kategori);

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write(" <!-- MENU SIDEBAR-->\n");
      out.write("        <aside class=\"menu-sidebar d-none d-lg-block\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <img src=\"images/icon/logo.png\" alt=\"Cool Admin\" />\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"menu-sidebar__content js-scrollbar1\">\n");
      out.write("                <nav class=\"navbar-sidebar\">\n");
      out.write("                    <ul class=\"list-unstyled navbar__list\">\n");
      out.write("                       \n");
      out.write("                        <li>\n");
      out.write("                            <a class=\"js-arrow\" href=\"index.jsp\">\n");
      out.write("                                <i class=\"fas fa-tachometer-alt\"></i>Dashboard</a>\n");
      out.write("                           \n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"../view/ViewPenyewa.jsp\">\n");
      out.write("                                <i class=\"fas fa-chart-bar\"></i>Data Penyewa</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"../view/ViewBarang.jsp\">\n");
      out.write("                                <i class=\"fas fa-chart-bar\"></i>Data Barang</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li >\n");
      out.write("                            <a href=\"../view/TambahBarang.jsp\">\n");
      out.write("                                <i class=\"far fa-check-square\"></i>Input Data Barang</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"table.html\">\n");
      out.write("                                <i class=\"fas fa-table\"></i>Tables</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"form.html\">\n");
      out.write("                                <i class=\"far fa-check-square\"></i>Forms</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"calender.html\">\n");
      out.write("                                <i class=\"fas fa-calendar-alt\"></i>Calendar</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"map.html\">\n");
      out.write("                                <i class=\"fas fa-map-marker-alt\"></i>Maps</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"has-sub\">\n");
      out.write("                            <a class=\"js-arrow\" href=\"#\">\n");
      out.write("                                <i class=\"fas fa-copy\"></i>Pages</a>\n");
      out.write("                            <ul class=\"list-unstyled navbar__sub-list js-sub-list\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"login.html\">Login</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"register.html\">Register</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"forget-pass.html\">Forget Password</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"has-sub\">\n");
      out.write("                            <a class=\"js-arrow\" href=\"#\">\n");
      out.write("                                <i class=\"fas fa-desktop\"></i>UI Elements</a>\n");
      out.write("                            <ul class=\"list-unstyled navbar__sub-list js-sub-list\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"button.html\">Button</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"badge.html\">Badges</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"tab.html\">Tabs</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"card.html\">Cards</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"alert.html\">Alerts</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"progress-bar.html\">Progress Bars</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"modal.html\">Modals</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"switch.html\">Switchs</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"grid.html\">Grids</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"fontawesome.html\">Fontawesome Icon</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"typo.html\">Typography</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </aside>\n");
      out.write("        <!-- END MENU SIDEBAR-->");
      out.write("\n");
      out.write("           \n");
      out.write("            <!-- END MENU SIDEBAR-->\n");
      out.write("\n");
      out.write("            <!-- PAGE CONTAINER-->\n");
      out.write("            <div class=\"page-container\">\n");
      out.write("                <!-- HEADER DESKTOP-->\n");
      out.write("                ");
      out.write(" <!-- HEADER DESKTOP-->\n");
      out.write("            <header class=\"header-desktop\">\n");
      out.write("                <div class=\"section__content section__content--p30\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"header-wrap\">\n");
      out.write("                            <form class=\"form-header\" action=\"\" method=\"POST\">\n");
      out.write("                                <input class=\"au-input au-input--xl\" type=\"text\" name=\"search\" placeholder=\"Search for datas &amp; reports...\" />\n");
      out.write("                                <button class=\"au-btn--submit\" type=\"submit\">\n");
      out.write("                                    <i class=\"zmdi zmdi-search\"></i>\n");
      out.write("                                </button>\n");
      out.write("                            </form>\n");
      out.write("                            <div class=\"header-button\">\n");
      out.write("                                \n");
      out.write("                                <div class=\"account-wrap\">\n");
      out.write("                                    <div class=\"account-item clearfix js-item-menu\">\n");
      out.write("                                        <div class=\"image\">\n");
      out.write("                                            <img src=\"images/icon/avatar-01.jpg\" alt=\"John Doe\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"content\">\n");
      out.write("                                            <a class=\"js-acc-btn\" href=\"#\">john doe</a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"account-dropdown js-dropdown\">\n");
      out.write("                                            <div class=\"info clearfix\">\n");
      out.write("                                                <div class=\"image\">\n");
      out.write("                                                    <a href=\"#\">\n");
      out.write("                                                        <img src=\"images/icon/avatar-01.jpg\" alt=\"John Doe\" />\n");
      out.write("                                                    </a>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"content\">\n");
      out.write("                                                    <h5 class=\"name\">\n");
      out.write("                                                        <a href=\"#\">john doe</a>\n");
      out.write("                                                    </h5>\n");
      out.write("                                                    <span class=\"email\">johndoe@example.com</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"account-dropdown__body\">\n");
      out.write("                                                <div class=\"account-dropdown__item\">\n");
      out.write("                                                    <a href=\"#\">\n");
      out.write("                                                        <i class=\"zmdi zmdi-account\"></i>Account</a>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"account-dropdown__item\">\n");
      out.write("                                                    <a href=\"#\">\n");
      out.write("                                                        <i class=\"zmdi zmdi-settings\"></i>Setting</a>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"account-dropdown__item\">\n");
      out.write("                                                    <a href=\"#\">\n");
      out.write("                                                        <i class=\"zmdi zmdi-money-box\"></i>Billing</a>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"account-dropdown__footer\">\n");
      out.write("                                                <a href=\"#\">\n");
      out.write("                                                    <i class=\"zmdi zmdi-power\"></i>Logout</a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <!-- HEADER DESKTOP-->");
      out.write("\n");
      out.write("                <!-- HEADER DESKTOP-->\n");
      out.write("                ");
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
                                                        + "<option value='Jam'  >Jam</option>"
                                                        + "<option value='Hari' selected >Hari</option>"
                                                        + "<option value='Minggu' >Minggu</option>"
                                                        + "<option value='Bulan'>Bulan</option>"
                                                        + "<option value='Tahun'>Tahun </option>");
                                            } else if (status.equalsIgnoreCase("jam")) {
                                                out.print("  <option value='0'>Silahkan Pilih</option>"
                                                        + "<option value='Jam' selected >Jam</option>"
                                                        + "<option value='Hari'  >Hari</option>"
                                                        + "<option value='Minggu' >Minggu</option>"
                                                        + "<option value='Bulan'>Bulan</option>"
                                                        + "<option value='Tahun'>Tahun </option>");
                                            } else if (status.equalsIgnoreCase("minggu")) {
                                                out.print("  <option value='0'>Silahkan Pilih</option>"
                                                        + "<option value='Jam'  >Jam</option>"
                                                        + "<option value='Hari'  >Hari</option>"
                                                        + "<option value='Minggu' selected>Minggu</option>"
                                                        + "<option value='Bulan'>Bulan</option>"
                                                        + "<option value='Tahun'>Tahun </option>");
                                            } else if (status.equalsIgnoreCase("bulan")) {
                                                out.print("  <option value='0'>Silahkan Pilih</option>"
                                                        + "<option value='Jam'  >Jam</option>"
                                                        + "<option value='Hari'  >Hari</option>"
                                                        + "<option value='Minggu' >Minggu</option>"
                                                        + "<option value='Bulan' selected>Bulan</option>"
                                                        + "<option value='Tahun'>Tahun </option>");
                                            } else if (status.equalsIgnoreCase("tahun")) {
                                                out.print("  <option value='0'>Silahkan Pilih</option>"
                                                        + "<option value='Jam'  >Jam</option>"
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
      out.write("                                            <img id=\"preview\" class=\"img-thumbnail\" style=\"border: 2px solid #ddd\" width=\"320px\" src=\"../../Img/non-image.png\"/>\r\n");
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
      out.write("\n");
      out.write("                <!-- MAIN CONTENT-->\n");
      out.write("               \n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-md-12\">\n");
      out.write("        <div class=\"copyright\">\n");
      out.write("            <p>Copyright © 2018 Colorlib. All rights reserved. Template by <a href=\"https://colorlib.com\">Colorlib</a>.</p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("                <!-- END MAIN CONTENT-->\n");
      out.write("                <!-- END PAGE CONTAINER-->\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Jquery JS-->\n");
      out.write("        <script src=\"vendor/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <!-- Bootstrap JS-->\n");
      out.write("        <script src=\"vendor/bootstrap-4.1/popper.min.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap-4.1/bootstrap.min.js\"></script>\n");
      out.write("        <!-- Vendor JS       -->\n");
      out.write("        <script src=\"vendor/slick/slick.min.js\">\n");
      out.write("        </script>\n");
      out.write("        <script src=\"vendor/wow/wow.min.js\"></script>\n");
      out.write("        <script src=\"vendor/animsition/animsition.min.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap-progressbar/bootstrap-progressbar.min.js\">\n");
      out.write("        </script>\n");
      out.write("        <script src=\"vendor/counter-up/jquery.waypoints.min.js\"></script>\n");
      out.write("        <script src=\"vendor/counter-up/jquery.counterup.min.js\">\n");
      out.write("        </script>\n");
      out.write("        <script src=\"vendor/circle-progress/circle-progress.min.js\"></script>\n");
      out.write("        <script src=\"vendor/perfect-scrollbar/perfect-scrollbar.js\"></script>\n");
      out.write("        <script src=\"vendor/chartjs/Chart.bundle.min.js\"></script>\n");
      out.write("        <script src=\"vendor/select2/select2.min.js\">\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <!-- Main JS-->\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("<!-- end document-->\n");
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
