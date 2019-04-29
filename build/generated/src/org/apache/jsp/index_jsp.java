package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DB.PostDOA;
import model.post;
import java.util.ArrayList;
import DB.UserDOA;
import model.User;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("This is a starter template page. Use this page to start your new project from\n");
      out.write("scratch. This page gets rid of all links and provides the needed markup only.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>OJS</title>\n");
      out.write("        <!-- Tell the browser to be responsive to screen width -->\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bower_components/bootstrap/dist/css/bootstrap.min.css\">\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"bower_components/font-awesome/css/font-awesome.min.css\">\n");
      out.write("        <!-- Ionicons -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"bower_components/Ionicons/css/ionicons.min.css\">\n");
      out.write("        <!-- Theme style -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/css/AdminLTE.min.css\">\n");
      out.write("        <!-- AdminLTE Skins. We have chosen the skin-blue for this starter\n");
      out.write("              page. However, you can choose any other skin. Make sure you\n");
      out.write("              apply the skin class to the body tag so the changes take effect. -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/css/skins/skin-blue.min.css\">\n");
      out.write("\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("        <!-- Google Font -->\n");
      out.write("        <link rel=\"stylesheet\"\n");
      out.write("              href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");

    //filter

        if (request.getSession().getAttribute("user") == null) {
            User i = new UserDOA().searchUser("UNKNOWN", "1");
            request.getSession().setAttribute("user", i);
        }
        ArrayList<post> all=new PostDOA().VIEWPOST();
        request.setAttribute("posts", all);
        
    
      out.write("\n");
      out.write("\n");
      out.write("    <body class=\"hold-transition skin-blue sidebar-mini\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("\n");
      out.write("            <!-- Main Header -->\n");
      out.write("            <header class=\"main-header\">\n");
      out.write("\n");
      out.write("                <!-- Logo -->\n");
      out.write("                <a href=\"index.jsp\" class=\"logo\">\n");
      out.write("                    <!-- mini logo for sidebar mini 50x50 pixels -->\n");
      out.write("                    <span class=\"logo-mini\"><b>O</b>JS</span>\n");
      out.write("                    <!-- logo for regular state and mobile devices -->\n");
      out.write("                    <span class=\"logo-lg\"><b>EQRA </b> OJS</span>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <!-- Header Navbar -->\n");
      out.write("                <nav class=\"navbar navbar-static-top\" role=\"navigation\">\n");
      out.write("                    <!-- Sidebar toggle button-->\n");
      out.write("                    <a href=\"#\" class=\"sidebar-toggle\" data-toggle=\"push-menu\" role=\"button\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    </a>\n");
      out.write("                    <!-- Navbar Right Menu -->\n");
      out.write("                    <div class=\"navbar-custom-menu\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                            <!-- User Account Menu -->\n");
      out.write("                            <li class=\"dropdown user user-menu\">\n");
      out.write("                                <!-- Menu Toggle Button -->\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                    <!-- The user image in the navbar-->\n");
      out.write("                                    <img src=\"data:image/jpg;base64,");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.base64Image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"user-image\" alt=\"User Image\">\n");
      out.write("                                    <!-- hidden-xs hides the username on small devices so only the image appears. -->\n");
      out.write("                                    <span class=\"hidden-xs\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                                </a>\n");
      out.write("                                <ul class=\"dropdown-menu\">\n");
      out.write("                                    <!-- The user image in the menu -->\n");
      out.write("                                    <li class=\"user-header\">\n");
      out.write("                                        <img src=\"data:image/jpg;base64,");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.base64Image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("\n");
      out.write("                                        <p>\n");
      out.write("                                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" -     ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.type}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                            <small>    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</small>\n");
      out.write("                                        </p>\n");
      out.write("                                    </li>\n");
      out.write("                                    <!-- Menu Body -->\n");
      out.write("                                    <li class=\"user-body\">\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-xs-4 text-center\"></div>\n");
      out.write("                                            <div class=\"col-xs-4 text-center\">\n");
      out.write("                                                <a href=\"register.jsp\">Sign up</a>\n");
      out.write("                                                <a href=\"login.jsp\">Login</a>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-xs-4 text-center\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <!-- /.row -->\n");
      out.write("                                    </li>\n");
      out.write("                                    <!-- Menu Footer-->\n");
      out.write("                                    <li class=\"user-footer\">\n");
      out.write("                                        <div class=\"pull-left\">\n");
      out.write("                                            <a href=\"profile.jsp\" class=\"btn btn-default btn-flat\">Profile</a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"pull-right\">\n");
      out.write("                                            <a href=\"login.jsp\" class=\"btn btn-default btn-flat\">Sign out</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </header>\n");
      out.write("            <!-- Left side column. contains the logo and sidebar -->\n");
      out.write("            <aside class=\"main-sidebar\">\n");
      out.write("\n");
      out.write("                <!-- sidebar: style can be found in sidebar.less -->\n");
      out.write("                <section class=\"sidebar\">\n");
      out.write("\n");
      out.write("                    <!-- Sidebar user panel (optional) -->\n");
      out.write("                    <div class=\"user-panel\">\n");
      out.write("                        <div class=\"pull-left image\">\n");
      out.write("                            <img src=\"data:image/jpg;base64,");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.base64Image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"pull-left info\">\n");
      out.write("                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </p>\n");
      out.write("                            <!-- Status -->\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-circle text-success\"></i> Online</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- search form (Optional) -->\n");
      out.write("                    <form action=\"#\" method=\"get\" class=\"sidebar-form\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input type=\"text\" name=\"q\" class=\"form-control\" placeholder=\"Search...\">\n");
      out.write("                            <span class=\"input-group-btn\">\n");
      out.write("                                <button type=\"submit\" name=\"search\" id=\"search-btn\" class=\"btn btn-flat\"><i class=\"fa fa-search\"></i>\n");
      out.write("                                </button>\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <!-- /.search form -->\n");
      out.write("\n");
      out.write("                    <!-- Sidebar Menu -->\n");
      out.write("                    <ul class=\"sidebar-menu\" data-widget=\"tree\">\n");
      out.write("                        <li class=\"header\">HEADER</li>\n");
      out.write("                        <!-- Optionally, you can add icons to the links -->\n");
      out.write("                        <li class=\"active\"><a href=\"index.jsp\"><i class=\"fa fa-home\"></i> <span>Home Page</span></a></li>\n");
      out.write("                        <li class=\"treeview\">\n");
      out.write("                            <a href=\"#\"><i class=\"fa  fa-edit\"></i> <span>Categories</span>\n");
      out.write("                                <span class=\"pull-right-container\">\n");
      out.write("                                    <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"treeview-menu\">\n");
      out.write("                                <li><a href=\"#\">Scientific</a></li>\n");
      out.write("                                <li><a href=\"#\">Computer Science</a></li>\n");
      out.write("                                <li><a href=\"#\">Sport</a></li>\n");
      out.write("                                <li><a href=\"#\">Art</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"treeview\">\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-dashboard\"></i> <span>Dashboard</span>\n");
      out.write("                                <span class=\"pull-right-container\">\n");
      out.write("                                    <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"treeview-menu\">\n");
      out.write("                                <li><a href=\"#\">Review submession</a></li>\n");
      out.write("                                <li><a href=\"#\">Manage Users</a></li>\n");
      out.write("                                <li><a href=\"#\">Appending Posts</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"about.jsp\"><i class=\"fa fa-send\"></i> <span>about us</span></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <!-- /.sidebar-menu -->\n");
      out.write("                </section>\n");
      out.write("                <!-- /.sidebar -->\n");
      out.write("            </aside>\n");
      out.write("\n");
      out.write("            <!-- Content Wrapper. Contains page content -->\n");
      out.write("            <div class=\"content-wrapper\">\n");
      out.write("                <!-- Content Header (Page header) -->\n");
      out.write("                <section class=\"content-header\">\n");
      out.write("                    <h1>\n");
      out.write("                        Home Page\n");
      out.write("                        <small>All submissions</small>\n");
      out.write("                    </h1>\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> Home page</a></li>\n");
      out.write("                        <li class=\"active\">all</li>\n");
      out.write("                    </ol>\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("                <!-- Main content -->\n");
      out.write("                <section class=\"content container-fluid\">\n");
      out.write("                    <!--------------------------\n");
      out.write("                    | Your Page Content Here |\n");
      out.write("                    -------------------------->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                </section>\n");
      out.write("                <!-- /.content -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.content-wrapper -->\n");
      out.write("\n");
      out.write("            <!-- Main Footer -->\n");
      out.write("            <footer class=\"main-footer\">\n");
      out.write("                <!-- To the right -->\n");
      out.write("                <div class=\"pull-right hidden-xs\">\n");
      out.write("                    Version 1.0\n");
      out.write("                </div>\n");
      out.write("                <!-- Default to the left -->\n");
      out.write("                <strong>Copyright &copy; 2019 <a href=\"#\">Company</a>.</strong> All rights reserved.\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("            <!-- Add the sidebar's background. This div must be placed\n");
      out.write("            immediately after the control sidebar -->\n");
      out.write("        </div>\n");
      out.write("        <!-- ./wrapper -->\n");
      out.write("\n");
      out.write("        <!-- REQUIRED JS SCRIPTS -->\n");
      out.write("\n");
      out.write("        <!-- jQuery 3 -->\n");
      out.write("        <script src=\"bower_components/jquery/dist/jquery.min.js\"></script>\n");
      out.write("        <!-- Bootstrap 3.3.7 -->\n");
      out.write("        <script src=\"bower_components/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- AdminLTE App -->\n");
      out.write("        <script src=\"dist/js/adminlte.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Optionally, you can add Slimscroll and FastClick plugins.\n");
      out.write("             Both of these plugins are recommended to enhance the\n");
      out.write("             user experience. -->\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${posts}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("post");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <!-- post -->\n");
          out.write("                        \n");
          out.write("                    <div class=\"box box-widget\">\n");
          out.write("                        <div class=\"box-header with-border\">\n");
          out.write("                            <div class=\"user-block\">\n");
          out.write("                                \n");
          out.write("                                <img class=\"img-circle\" src=\"data:image/jpg;base64,");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.getBase64Image()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"User Image\">\n");
          out.write("                                <span class=\"username\"><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></span>\n");
          out.write("                                <span class=\"description\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.getUname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" - ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.getTime_stamp()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                            </div>\n");
          out.write("                            <!-- /.user-block -->\n");
          out.write("                            <div class=\"box-tools\">\n");
          out.write("                                <button type=\"button\" class=\"btn btn-box-tool\" data-toggle=\"tooltip\" title=\"Mark as read\">\n");
          out.write("                                    <i class=\"fa fa-circle-o\"></i></button>\n");
          out.write("                                <button type=\"button\" class=\"btn btn-box-tool\" data-widget=\"collapse\"><i class=\"fa fa-minus\"></i>\n");
          out.write("                                </button>\n");
          out.write("                                <button type=\"button\" class=\"btn btn-box-tool\" data-widget=\"remove\"><i class=\"fa fa-times\"></i></button>\n");
          out.write("                            </div>\n");
          out.write("                            <!-- /.box-tools -->\n");
          out.write("                        </div>\n");
          out.write("                        <!-- /.box-header -->\n");
          out.write("                        <div class=\"box-body\">\n");
          out.write("\n");
          out.write("                            <h3 >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.getTitle()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3>\n");
          out.write("                            <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.getDescription()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                            <!-- Box Materail -->\n");
          out.write("                            <form class=\"form-horizontal\">\n");
          out.write("                                <div class=\"form-group\">\n");
          out.write("                                    <div class=\"row\">\n");
          out.write("                                        <div class=\"col-xs-3\">\n");
          out.write("                                            <button class=\"btn pull-right btn-primary\">PDF</button>\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"col-xs-3\">\n");
          out.write("                                            <button class=\"btn pull-right btn-primary\">Word</button>\n");
          out.write("                                            <!--<button type=\"submit\" class=\"btn btn-danger pull-right btn-primary btn-block btn-sm\">Send</button>-->\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"col-xs-3\">\n");
          out.write("                                            <button class=\"btn pull-right btn-primary\">xml</button>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </form>\n");
          out.write("                            <!-- /.box-materail -->\n");
          out.write("\n");
          out.write("                            <button type=\"button\" class=\"btn btn-default btn-xs\"><i class=\"fa fa-share\"></i> Share</button>\n");
          out.write("                            <button type=\"button\" class=\"btn btn-default btn-xs\"><i class=\"fa fa-thumbs-o-up\"></i> Like</button>\n");
          out.write("                            <span class=\"pull-right text-muted\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.getCateg()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                        </div>\n");
          out.write("                        <!-- /.box-body -->\n");
          out.write("\n");
          out.write("                    </div>\n");
          out.write("                    <!-- /.post -->\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
