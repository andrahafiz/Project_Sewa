package org.apache.jsp.Admin.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ViewTransaksi_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/Admin/view/../controller/Menu_SideBar.jsp");
    _jspx_dependants.add("/Admin/view/../header/header.jsp");
    _jspx_dependants.add("/Admin/view/../controller/Transaksi.jsp");
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
      out.write("<div class=\"table-responsive table--no-card m-b-30\">\n");
      out.write("    <table class=\"table table-borderless table-striped table-earning\">\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>date</th>\n");
      out.write("                <th>order ID</th>\n");
      out.write("                <th>name</th>\n");
      out.write("                <th class=\"text-right\">price</th>\n");
      out.write("                <th class=\"text-right\">quantity</th>\n");
      out.write("                <th class=\"text-right\">total</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("            <tr>\n");
      out.write("                <td>2018-09-29 05:57</td>\n");
      out.write("                <td>100398</td>\n");
      out.write("                <td>iPhone X 64Gb Grey</td>\n");
      out.write("                <td class=\"text-right\">$999.00</td>\n");
      out.write("                <td class=\"text-right\">1</td>\n");
      out.write("                <td class=\"text-right\">$999.00</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>2018-09-28 01:22</td>\n");
      out.write("                <td>100397</td>\n");
      out.write("                <td>Samsung S8 Black</td>\n");
      out.write("                <td class=\"text-right\">$756.00</td>\n");
      out.write("                <td class=\"text-right\">1</td>\n");
      out.write("                <td class=\"text-right\">$756.00</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>2018-09-27 02:12</td>\n");
      out.write("                <td>100396</td>\n");
      out.write("                <td>Game Console Controller</td>\n");
      out.write("                <td class=\"text-right\">$22.00</td>\n");
      out.write("                <td class=\"text-right\">2</td>\n");
      out.write("                <td class=\"text-right\">$44.00</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>2018-09-26 23:06</td>\n");
      out.write("                <td>100395</td>\n");
      out.write("                <td>iPhone X 256Gb Black</td>\n");
      out.write("                <td class=\"text-right\">$1199.00</td>\n");
      out.write("                <td class=\"text-right\">1</td>\n");
      out.write("                <td class=\"text-right\">$1199.00</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>2018-09-25 19:03</td>\n");
      out.write("                <td>100393</td>\n");
      out.write("                <td>USB 3.0 Cable</td>\n");
      out.write("                <td class=\"text-right\">$10.00</td>\n");
      out.write("                <td class=\"text-right\">3</td>\n");
      out.write("                <td class=\"text-right\">$30.00</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>2018-09-29 05:57</td>\n");
      out.write("                <td>100392</td>\n");
      out.write("                <td>Smartwatch 4.0 LTE Wifi</td>\n");
      out.write("                <td class=\"text-right\">$199.00</td>\n");
      out.write("                <td class=\"text-right\">6</td>\n");
      out.write("                <td class=\"text-right\">$1494.00</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>2018-09-24 19:10</td>\n");
      out.write("                <td>100391</td>\n");
      out.write("                <td>Camera C430W 4k</td>\n");
      out.write("                <td class=\"text-right\">$699.00</td>\n");
      out.write("                <td class=\"text-right\">1</td>\n");
      out.write("                <td class=\"text-right\">$699.00</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>2018-09-22 00:43</td>\n");
      out.write("                <td>100393</td>\n");
      out.write("                <td>USB 3.0 Cable</td>\n");
      out.write("                <td class=\"text-right\">$10.00</td>\n");
      out.write("                <td class=\"text-right\">3</td>\n");
      out.write("                <td class=\"text-right\">$30.00</td>\n");
      out.write("            </tr>\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("</div>");
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
