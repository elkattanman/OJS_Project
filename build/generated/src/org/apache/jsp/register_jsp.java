package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>AdminLTE 2 | Registration Page</title>\n");
      out.write("        <!-- Tell the browser to be responsive to screen width -->\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\n");
      out.write("        <!-- Bootstrap 3.3.7 -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"bower_components/bootstrap/dist/css/bootstrap.min.css\">\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"bower_components/font-awesome/css/font-awesome.min.css\">\n");
      out.write("        <!-- Ionicons -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"bower_components/Ionicons/css/ionicons.min.css\">\n");
      out.write("        <!-- daterange picker -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"bower_components/bootstrap-daterangepicker/daterangepicker.css\">\n");
      out.write("        <!-- bootstrap datepicker -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"bower_components/bootstrap-datepicker/dist/css/bootstrap-datepicker.min.css\">\n");
      out.write("        <!-- iCheck for checkboxes and radio inputs -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/iCheck/all.css\">\n");
      out.write("        <!-- Bootstrap Color Picker -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"bower_components/bootstrap-colorpicker/dist/css/bootstrap-colorpicker.min.css\">\n");
      out.write("        <!-- Bootstrap time Picker -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/timepicker/bootstrap-timepicker.min.css\">\n");
      out.write("        <!-- Select2 -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"bower_components/select2/dist/css/select2.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Theme style -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/css/AdminLTE.min.css\">\n");
      out.write("        <!-- iCheck -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/iCheck/square/blue.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("        <!-- Google Font -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"hold-transition register-page\">\n");
      out.write("        <div class=\"register-box\">\n");
      out.write("            <div class=\"register-logo\">\n");
      out.write("                <a href=\"index.jsp\"><b>EQRA</b> OJS</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"register-box-body\">\n");
      out.write("                <p class=\"login-box-msg\">Register a new membership</p>\n");
      out.write("\n");
      out.write("                <form action=\"register\" method=\"post\"enctype=\"multipart/form-data\">\n");
      out.write("                    <div class=\"form-group has-feedback\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Your name\" name=\"name\" required>\n");
      out.write("                        <span class=\"glyphicon glyphicon-user form-control-feedback\"></span>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"input-group date\">\n");
      out.write("                            <input type=\"date\"   class=\"form-control\" name=\"DOB\" id=\"datepicker\"  required>\n");
      out.write("                            <div class=\"input-group-addon\">\n");
      out.write("                                <i class=\"fa fa-calendar\"></i>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.input group -->\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!--radio -->\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"col-xs-4\"><input type=\"radio\" name=\"gender\" value=\"male\" checked>Male</label>\n");
      out.write("                        <label><input type=\"radio\" name=\"gender\" value=\"female\" >Female</label>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!--image -->\n");
      out.write("                    <div class=\"form-group has-feedback\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <label for=\"img\" class=\"col-xs-2\">Image</label>\n");
      out.write("                            <div class=\"col-xs-10\"><input type=\"file\" class=\"form-control\" id=\"img\" name=\"image\"></div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group has-feedback\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"phone\" placeholder=\"phone\" required >\n");
      out.write("                        <span class=\"glyphicon glyphicon-earphone form-control-feedback\"></span>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group has-feedback\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"uname\" placeholder=\"UserName\" required>\n");
      out.write("                        <span class=\"glyphicon glyphicon-user form-control-feedback\"></span>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group has-feedback\">\n");
      out.write("                        <input type=\"email\" class=\"form-control\" name=\"email\" placeholder=\"Email\">\n");
      out.write("                        <span class=\"glyphicon glyphicon-envelope form-control-feedback\"></span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group has-feedback\">\n");
      out.write("                        <input type=\"password\" class=\"form-control\" name=\"pass\" placeholder=\"Password\">\n");
      out.write("                        <span class=\"glyphicon glyphicon-lock form-control-feedback\"></span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group has-feedback\">\n");
      out.write("                        <input type=\"password\" class=\"form-control\" name=\"rpass\" placeholder=\"Retype password\">\n");
      out.write("                        <span class=\"glyphicon glyphicon-log-in form-control-feedback\"></span>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group has-feedback\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <label for=\"img\" class=\"col-xs-2\">CV</label>\n");
      out.write("                            <div class=\"col-xs-10\"><input type=\"file\" class=\"form-control\" id=\"cv\" name=\"cv\"></div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Categories</label>\n");
      out.write("                        <select class=\"form-control select2\" name=\"cat\" style=\"width: 100%;\" >\n");
      out.write("                            <option>Computer Science</option>\n");
      out.write("                            <option>is</option>\n");
      out.write("                            <option >it</option>\n");
      out.write("                            <option>Art</option>\n");
      out.write("                            <option>Web Develop</option>\n");
      out.write("                            <option>ART</option>\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label class=\"col-sm-10\">Request the following roles :</label>\n");
      out.write("                            <label><input type=\"checkbox\" value=\"0\" class=\"minimal\" checked disabled>Reader</label>\n");
      out.write("                            <label><input type=\"checkbox\" name=\"author\" value=\"1\"  class=\"minimal\">Author</label>\n");
      out.write("                            <label><input type=\"checkbox\" name=\"reviwer\" value=\"2\" class=\"minimal\">Reviwer</label>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.form-group -->\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xs-8\">\n");
      out.write("                                <div class=\"checkbox icheck\">\n");
      out.write("                                    <label>\n");
      out.write("                                        <input type=\"checkbox\"> I agree to the <a href=\"#\">terms</a>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.col -->\n");
      out.write("                            <div class=\"col-xs-4\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary btn-block btn-flat\">Register</button>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.col -->\n");
      out.write("                        </div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <a href=\"login.html\" class=\"text-center\">I already have a membership</a>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.form-box -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.register-box -->\n");
      out.write("\n");
      out.write("        <!-- jQuery 3 -->\n");
      out.write("        <script src=\"bower_components/jquery/dist/jquery.min.js\"></script>\n");
      out.write("        <!-- Bootstrap 3.3.7 -->\n");
      out.write("        <script src=\"bower_components/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- Select2 -->\n");
      out.write("        <script src=\"bower_components/select2/dist/js/select2.full.min.js\"></script>\n");
      out.write("        <!-- InputMask -->\n");
      out.write("        <script src=\"plugins/input-mask/jquery.inputmask.js\"></script>\n");
      out.write("        <script src=\"plugins/input-mask/jquery.inputmask.date.extensions.js\"></script>\n");
      out.write("        <script src=\"plugins/input-mask/jquery.inputmask.extensions.js\"></script>\n");
      out.write("        <!-- date-range-picker -->\n");
      out.write("        <script src=\"bower_components/moment/min/moment.min.js\"></script>\n");
      out.write("        <script src=\"bower_components/bootstrap-daterangepicker/daterangepicker.js\"></script>\n");
      out.write("        <!-- bootstrap datepicker -->\n");
      out.write("        <script src=\"bower_components/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js\"></script>\n");
      out.write("        <!-- SlimScroll -->\n");
      out.write("        <script src=\"bower_components/jquery-slimscroll/jquery.slimscroll.min.js\"></script>\n");
      out.write("        <!-- iCheck 1.0.1 -->\n");
      out.write("        <script src=\"plugins/iCheck/icheck.min.js\"></script>\n");
      out.write("        <!-- FastClick -->\n");
      out.write("        <script src=\"bower_components/fastclick/lib/fastclick.js\"></script>\n");
      out.write("        <!-- AdminLTE App -->\n");
      out.write("        <script src=\"dist/js/adminlte.min.js\"></script>\n");
      out.write("        <!-- AdminLTE for demo purposes -->\n");
      out.write("        <script src=\"dist/js/demo.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Page script -->\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                //Initialize Select2 Elements\n");
      out.write("                $('.select2').select2()\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("                $('input').iCheck({\n");
      out.write("                    checkboxClass: 'icheckbox_square-blue',\n");
      out.write("                    radioClass: 'iradio_flat-green',\n");
      out.write("                    increaseArea: '20%' /* optional */\n");
      out.write("                });\n");
      out.write("                $('input[type=\"checkbox\"].minimal').iCheck({\n");
      out.write("                    checkboxClass: 'icheckbox_minimal-blue'\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
