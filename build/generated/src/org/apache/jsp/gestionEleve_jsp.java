package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gestionEleve_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/valide.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>acceuil / G-eleve</title>\n");
      out.write("        <!-- plugins:css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"vendors/ti-icons/css/themify-icons.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"vendors/base/vendor.bundle.base.css\">\n");
      out.write("        <!-- endinject -->\n");
      out.write("        <!-- plugin css for this page -->\n");
      out.write("        <!-- End plugin css for this page -->\n");
      out.write("        <!-- inject:css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <!-- endinject -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/favicon.png\" />\n");
      out.write("      </head>\n");
      out.write("      \n");
      out.write("      <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");

            Object n=session.getAttribute("user");
            
               if(n!=null){
      out.write("\n");
      out.write("    \n");
      out.write("     \n");
      out.write("         ");
}else{
                request.getRequestDispatcher("auth/login/login.jsp").forward(request, response);
            }
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div class=\"container-scroller\">\n");
      out.write("          <!-- partial:partials/_navbar.html -->\n");
      out.write("          <nav class=\"navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row\">\n");
      out.write("            <div class=\"text-center navbar-brand-wrapper d-flex align-items-center justify-content-center\">\n");
      out.write("                <!--<img src=\"images/logo.svg\" class=\"mr-2\" alt=\"logo\"/>-->\n");
      out.write("                <p class=\"h3 text-warning\">2SBPLUS+</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"navbar-menu-wrapper d-flex align-items-center justify-content-end\">\n");
      out.write("              <ul class=\"navbar-nav navbar-nav-right\">\n");
      out.write("                <li class=\"nav-item nav-profile dropdown\">\n");
      out.write("                  <a class=\"nav-link dropdown-toggle\" href=\"#\" data-toggle=\"dropdown\" id=\"profileDropdown\">\n");
      out.write("                    <img src=\"images/faces/user.png\" alt=\"profile\"/>\n");
      out.write("                  </a>\n");
      out.write("                  <div class=\"dropdown-menu dropdown-menu-right navbar-dropdown\" aria-labelledby=\"profileDropdown\">\n");
      out.write("                      <a href=\"deconnection\" class=\"dropdown-item\">\n");
      out.write("                      <i class=\"ti-power-off text-primary\"></i>\n");
      out.write("                      se deconnecter\n");
      out.write("                    </a>\n");
      out.write("                  </div>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("              <button class=\"navbar-toggler navbar-toggler-right d-lg-none align-self-center\" type=\"button\" data-toggle=\"offcanvas\">\n");
      out.write("                <span class=\"ti-view-list\"></span>\n");
      out.write("              </button>\n");
      out.write("            </div>\n");
      out.write("          </nav>\n");
      out.write("          <!-- partial -->\n");
      out.write("          <div class=\"container-fluid page-body-wrapper\">\n");
      out.write("            <!-- partial:partials/_sidebar.html -->\n");
      out.write("            <!-- partial -->\n");
      out.write("            <div class=\"main-panel\">\n");
      out.write("              <div class=\"content-wrapper\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                  <div class=\"col-md-12 grid-margin\">\n");
      out.write("                    <div class=\"d-flex justify-content-between align-items-center\">\n");
      out.write("                      <div>\n");
      out.write("                         <p class=\" mb-0\"><a href=\"menu.jsp\" type=\"button\" class=\"btn btn-sm btn-inverse-warning  btn-rounded btn-fw\">acceuil</a> / Gestion Eleve</p>                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                 \n");
      out.write("                  <form class=\"form-inline\">\n");
      out.write("                    <label class=\"col-sm-3 col-form-label\">Nom</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control mb-2 mr-sm-2\" id=\"inlineFormInputName2\" placeholder=\"Nom\"> \n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"form-group row\">\n");
      out.write("                          <label class=\"col-sm-3 col-form-label\">Niveau de scolarité</label>\n");
      out.write("                          <div class=\"col-sm-9\">\n");
      out.write("                            <select class=\"form-control\">\n");
      out.write("                              \t<option value=\"\">---</option>\n");
      out.write("                                <option value=\"1erC\">7ème année (1ème année du collège)</option>\n");
      out.write("                                <option value=\"2emC\">8ème année (2ème année du collège)</option>\n");
      out.write("                                <option value=\"3emC\">9ème année (3ème année du collège)</option>\n");
      out.write("                                <option value=\"1erBSE\">1ère année Bac sciences économiques</option>\n");
      out.write("                                <option value=\"2emBSE\">2ème année sciences économiques</option>\n");
      out.write("                                <option value=\"1erBPCSVT\">1ère année sciences physiques et svt</option>\n");
      out.write("                                <option value=\"2emBPCSVT\">2ème année sciences physiques et svt</option>\n");
      out.write("                                <option value=\"1erBSM\">1ère année Bac sciences maths</option>\n");
      out.write("                                <option value=\"2emBSM\">2ème année Bac sciences physiques et svt</option>\n");
      out.write("                                <option value=\"BL\">Bac libre</option>\n");
      out.write("                            </select>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary mb-2\">chercher</button>\n");
      out.write("                  </form>\n");
      out.write("                  <!-- table -->\n");
      out.write("                  <div class=\"col-lg-12 grid-margin stretch-card\">\n");
      out.write("              <div class=\"card\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <h4 class=\"card-title\">Liste des élèves</h4>\n");
      out.write("                  <div class=\"table-responsive pt-3\">\n");
      out.write("                    <table class=\"table table-striped\">\n");
      out.write("                      <thead>\n");
      out.write("                        <tr>\n");
      out.write("                          <th>\n");
      out.write("                            IDeleve\n");
      out.write("                          </th>\n");
      out.write("                          <th>\n");
      out.write("                            Nom\n");
      out.write("                          </th>\n");
      out.write("                          <th>\n");
      out.write("                            Prénom\n");
      out.write("                          </th>\n");
      out.write("                          <th>\n");
      out.write("                            Niveau de scolarité\n");
      out.write("                          </th>\n");
      out.write("                          <th>\n");
      out.write("                            Modifier\n");
      out.write("                          </th>\n");
      out.write("                          <th>\n");
      out.write("                            Supprimer\n");
      out.write("                          </th>\n");
      out.write("                          <th> \n");
      out.write("                            Detail\n");
      out.write("                          </th>\n");
      out.write("                        </tr>\n");
      out.write("                      </thead>\n");
      out.write("                      <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                          <td>\n");
      out.write("                            el100\n");
      out.write("                          </td>\n");
      out.write("                          <td>\n");
      out.write("                            lahsini\n");
      out.write("                          </td>\n");
      out.write("                          <td>\n");
      out.write("                            abdallah \n");
      out.write("                          </td>\n");
      out.write("                          <td>\n");
      out.write("                            2ème année Bac sciences économiques\n");
      out.write("                          </td>\n");
      out.write("                          <td>\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-success btn-sm btn-icon\">\n");
      out.write("                        <i class=\"ti-pencil\"></i>\n");
      out.write("                        </button>\n");
      out.write("                        </a>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-danger btn-sm btn-icon\">\n");
      out.write("                        <i class=\"ti-close\"></i>\n");
      out.write("                        </button>\n");
      out.write("                        </a>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                         <button type=\"button\" class=\"btn btn-info btn-sm btn-icon\">\n");
      out.write("                        <i class=\"ti-more-alt\"></i>\n");
      out.write("                        </button>\n");
      out.write("                        </a>\n");
      out.write("                        </td>\n");
      out.write("                        </tr>\n");
      out.write("                      </tbody>\n");
      out.write("                    </table>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("              <!-- content-wrapper ends -->\n");
      out.write("              <!-- partial:partials/_footer.html -->\n");
      out.write("              \n");
      out.write("              <!-- partial -->\n");
      out.write("            </div>\n");
      out.write("            <!-- main-panel ends -->\n");
      out.write("          </div>\n");
      out.write("          <!-- page-body-wrapper ends -->\n");
      out.write("        </div>\n");
      out.write("        <!-- container-scroller -->\n");
      out.write("        <!-- plugins:js -->\n");
      out.write("  <script src=\"vendors/base/vendor.bundle.base.js\"></script>\n");
      out.write("  <!-- endinject -->\n");
      out.write("  <!-- Plugin js for this page-->\n");
      out.write("  <script src=\"vendors/chart.js/Chart.min.js\"></script>\n");
      out.write("  <!-- End plugin js for this page-->\n");
      out.write("  <!-- inject:js -->\n");
      out.write("  <script src=\"js/off-canvas.js\"></script>\n");
      out.write("  <script src=\"js/hoverable-collapse.js\"></script>\n");
      out.write("  <script src=\"js/template.js\"></script>\n");
      out.write("  <script src=\"js/todolist.js\"></script>\n");
      out.write("  <!-- endinject -->\n");
      out.write("  <!-- Custom js for this page-->\n");
      out.write("  <script src=\"js/dashboard.js\"></script>\n");
      out.write("  <!-- End custom js for this page-->\n");
      out.write("        <!-- End custom js for this page-->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
