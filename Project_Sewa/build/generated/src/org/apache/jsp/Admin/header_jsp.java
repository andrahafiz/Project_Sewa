package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!-- HEADER MOBILE-->\n");
      out.write("        <header class=\"header-mobile d-block d-lg-none\">\n");
      out.write("            <div class=\"header-mobile__bar\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"header-mobile-inner\">\n");
      out.write("                        <a class=\"logo\" href=\"index.html\">\n");
      out.write("                            <img src=\"images/icon/logo.png\" alt=\"CoolAdmin\" />\n");
      out.write("                        </a>\n");
      out.write("                        <button class=\"hamburger hamburger--slider\" type=\"button\">\n");
      out.write("                            <span class=\"hamburger-box\">\n");
      out.write("                                <span class=\"hamburger-inner\"></span>\n");
      out.write("                            </span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <nav class=\"navbar-mobile\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <ul class=\"navbar-mobile__list list-unstyled\">\n");
      out.write("                        <li class=\"has-sub\">\n");
      out.write("                            <a class=\"js-arrow\" href=\"#\">\n");
      out.write("                                <i class=\"fas fa-tachometer-alt\"></i>Dashboard</a>\n");
      out.write("                            <ul class=\"navbar-mobile-sub__list list-unstyled js-sub-list\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"index.html\">Dashboard 1</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"index2.html\">Dashboard 2</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"index3.html\">Dashboard 3</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"index4.html\">Dashboard 4</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"chart.html\">\n");
      out.write("                                <i class=\"fas fa-chart-bar\"></i>Charts</a>\n");
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
      out.write("                            <a href=\"#\">\n");
      out.write("                                <i class=\"fas fa-calendar-alt\"></i>Calendar</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"map.html\">\n");
      out.write("                                <i class=\"fas fa-map-marker-alt\"></i>Maps</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"has-sub\">\n");
      out.write("                            <a class=\"js-arrow\" href=\"#\">\n");
      out.write("                                <i class=\"fas fa-copy\"></i>Pages</a>\n");
      out.write("                            <ul class=\"navbar-mobile-sub__list list-unstyled js-sub-list\">\n");
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
      out.write("                            <ul class=\"navbar-mobile-sub__list list-unstyled js-sub-list\">\n");
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
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <!-- END HEADER MOBILE-->");
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
