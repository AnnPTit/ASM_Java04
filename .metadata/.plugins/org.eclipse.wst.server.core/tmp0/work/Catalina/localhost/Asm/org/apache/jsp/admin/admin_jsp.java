/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-03-19 09:08:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("This is a starter template page. Use this page to start your new project from\r\n");
      out.write("scratch. This page gets rid of all links and provides the needed markup only.\r\n");
      out.write("-->\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>AdminLTE 3 | Starter</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Google Font: Source Sans Pro -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback\">\r\n");
      out.write("<!-- Font Awesome Icons -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css\"\r\n");
      out.write("	integrity=\"sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==\"\r\n");
      out.write("	crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<!-- Theme style -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../assets/css/admin.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"hold-transition sidebar-mini\">\r\n");
      out.write("	<div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("		<!-- Navbar -->\r\n");
      out.write("		<nav\r\n");
      out.write("			class=\"main-header navbar navbar-expand navbar-white navbar-light\">\r\n");
      out.write("			<!-- Left navbar links -->\r\n");
      out.write("			<ul class=\"navbar-nav\">\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" data-widget=\"pushmenu\"\r\n");
      out.write("					href=\"#\" role=\"button\"><i class=\"fas fa-bars\"></i></a></li>\r\n");
      out.write("				<li class=\"nav-item d-none d-sm-inline-block\"><a\r\n");
      out.write("					href=\"index3.html\" class=\"nav-link\">Home</a></li>\r\n");
      out.write("				<li class=\"nav-item d-none d-sm-inline-block\"><a href=\"#\"\r\n");
      out.write("					class=\"nav-link\">Contact</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("\r\n");
      out.write("			<!-- Right navbar links -->\r\n");
      out.write("			<ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("				<!-- Navbar Search -->\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("					data-widget=\"navbar-search\" href=\"#\" role=\"button\"> <i\r\n");
      out.write("						class=\"fas fa-search\"></i>\r\n");
      out.write("				</a>\r\n");
      out.write("					<div class=\"navbar-search-block\">\r\n");
      out.write("						<form class=\"form-inline\">\r\n");
      out.write("							<div class=\"input-group input-group-sm\">\r\n");
      out.write("								<input class=\"form-control form-control-navbar\" type=\"search\"\r\n");
      out.write("									placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("								<div class=\"input-group-append\">\r\n");
      out.write("									<button class=\"btn btn-navbar\" type=\"submit\">\r\n");
      out.write("										<i class=\"fas fa-search\"></i>\r\n");
      out.write("									</button>\r\n");
      out.write("									<button class=\"btn btn-navbar\" type=\"button\"\r\n");
      out.write("										data-widget=\"navbar-search\">\r\n");
      out.write("										<i class=\"fas fa-times\"></i>\r\n");
      out.write("									</button>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</form>\r\n");
      out.write("					</div></li>\r\n");
      out.write("\r\n");
      out.write("				<!-- Messages Dropdown Menu -->\r\n");
      out.write("				<li class=\"nav-item dropdown\"><a class=\"nav-link\"\r\n");
      out.write("					data-toggle=\"dropdown\" href=\"#\"> <i class=\"far fa-comments\"></i>\r\n");
      out.write("						<span class=\"badge badge-danger navbar-badge\">3</span>\r\n");
      out.write("				</a>\r\n");
      out.write("					<div class=\"dropdown-menu dropdown-menu-lg dropdown-menu-right\">\r\n");
      out.write("						<a href=\"#\" class=\"dropdown-item\"> <!-- Message Start -->\r\n");
      out.write("							<div class=\"media\">\r\n");
      out.write("								<img src=\"dist/img/user1-128x128.jpg\" alt=\"User Avatar\"\r\n");
      out.write("									class=\"img-size-50 mr-3 img-circle\">\r\n");
      out.write("								<div class=\"media-body\">\r\n");
      out.write("									<h3 class=\"dropdown-item-title\">\r\n");
      out.write("										Brad Diesel <span class=\"float-right text-sm text-danger\"><i\r\n");
      out.write("											class=\"fas fa-star\"></i></span>\r\n");
      out.write("									</h3>\r\n");
      out.write("									<p class=\"text-sm\">Call me whenever you can...</p>\r\n");
      out.write("									<p class=\"text-sm text-muted\">\r\n");
      out.write("										<i class=\"far fa-clock mr-1\"></i> 4 Hours Ago\r\n");
      out.write("									</p>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div> <!-- Message End -->\r\n");
      out.write("						</a>\r\n");
      out.write("						<div class=\"dropdown-divider\"></div>\r\n");
      out.write("						<a href=\"#\" class=\"dropdown-item\"> <!-- Message Start -->\r\n");
      out.write("							<div class=\"media\">\r\n");
      out.write("								<img src=\"dist/img/user8-128x128.jpg\" alt=\"User Avatar\"\r\n");
      out.write("									class=\"img-size-50 img-circle mr-3\">\r\n");
      out.write("								<div class=\"media-body\">\r\n");
      out.write("									<h3 class=\"dropdown-item-title\">\r\n");
      out.write("										John Pierce <span class=\"float-right text-sm text-muted\"><i\r\n");
      out.write("											class=\"fas fa-star\"></i></span>\r\n");
      out.write("									</h3>\r\n");
      out.write("									<p class=\"text-sm\">I got your message bro</p>\r\n");
      out.write("									<p class=\"text-sm text-muted\">\r\n");
      out.write("										<i class=\"far fa-clock mr-1\"></i> 4 Hours Ago\r\n");
      out.write("									</p>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div> <!-- Message End -->\r\n");
      out.write("						</a>\r\n");
      out.write("						<div class=\"dropdown-divider\"></div>\r\n");
      out.write("						<a href=\"#\" class=\"dropdown-item\"> <!-- Message Start -->\r\n");
      out.write("							<div class=\"media\">\r\n");
      out.write("								<img src=\"dist/img/user3-128x128.jpg\" alt=\"User Avatar\"\r\n");
      out.write("									class=\"img-size-50 img-circle mr-3\">\r\n");
      out.write("								<div class=\"media-body\">\r\n");
      out.write("									<h3 class=\"dropdown-item-title\">\r\n");
      out.write("										Nora Silvester <span class=\"float-right text-sm text-warning\"><i\r\n");
      out.write("											class=\"fas fa-star\"></i></span>\r\n");
      out.write("									</h3>\r\n");
      out.write("									<p class=\"text-sm\">The subject goes here</p>\r\n");
      out.write("									<p class=\"text-sm text-muted\">\r\n");
      out.write("										<i class=\"far fa-clock mr-1\"></i> 4 Hours Ago\r\n");
      out.write("									</p>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div> <!-- Message End -->\r\n");
      out.write("						</a>\r\n");
      out.write("						<div class=\"dropdown-divider\"></div>\r\n");
      out.write("						<a href=\"#\" class=\"dropdown-item dropdown-footer\">See All\r\n");
      out.write("							Messages</a>\r\n");
      out.write("					</div></li>\r\n");
      out.write("				<!-- Notifications Dropdown Menu -->\r\n");
      out.write("				<li class=\"nav-item dropdown\"><a class=\"nav-link\"\r\n");
      out.write("					data-toggle=\"dropdown\" href=\"#\"> <i class=\"far fa-bell\"></i> <span\r\n");
      out.write("						class=\"badge badge-warning navbar-badge\">15</span>\r\n");
      out.write("				</a>\r\n");
      out.write("					<div class=\"dropdown-menu dropdown-menu-lg dropdown-menu-right\">\r\n");
      out.write("						<span class=\"dropdown-header\">15 Notifications</span>\r\n");
      out.write("						<div class=\"dropdown-divider\"></div>\r\n");
      out.write("						<a href=\"#\" class=\"dropdown-item\"> <i\r\n");
      out.write("							class=\"fas fa-envelope mr-2\"></i> 4 new messages <span\r\n");
      out.write("							class=\"float-right text-muted text-sm\">3 mins</span>\r\n");
      out.write("						</a>\r\n");
      out.write("						<div class=\"dropdown-divider\"></div>\r\n");
      out.write("						<a href=\"#\" class=\"dropdown-item\"> <i\r\n");
      out.write("							class=\"fas fa-users mr-2\"></i> 8 friend requests <span\r\n");
      out.write("							class=\"float-right text-muted text-sm\">12 hours</span>\r\n");
      out.write("						</a>\r\n");
      out.write("						<div class=\"dropdown-divider\"></div>\r\n");
      out.write("						<a href=\"#\" class=\"dropdown-item\"> <i class=\"fas fa-file mr-2\"></i>\r\n");
      out.write("							3 new reports <span class=\"float-right text-muted text-sm\">2\r\n");
      out.write("								days</span>\r\n");
      out.write("						</a>\r\n");
      out.write("						<div class=\"dropdown-divider\"></div>\r\n");
      out.write("						<a href=\"#\" class=\"dropdown-item dropdown-footer\">See All\r\n");
      out.write("							Notifications</a>\r\n");
      out.write("					</div></li>\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("					data-widget=\"fullscreen\" href=\"#\" role=\"button\"> <i\r\n");
      out.write("						class=\"fas fa-expand-arrows-alt\"></i>\r\n");
      out.write("				</a></li>\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("					data-widget=\"control-sidebar\" data-slide=\"true\" href=\"#\"\r\n");
      out.write("					role=\"button\"> <i class=\"fas fa-th-large\"></i>\r\n");
      out.write("				</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</nav>\r\n");
      out.write("		<!-- /.navbar -->\r\n");
      out.write("\r\n");
      out.write("		<!-- Main Sidebar Container -->\r\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "adside.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<!-- Content Wrapper. Contains page content -->\r\n");
      out.write("		<div class=\"content-wrapper\">\r\n");
      out.write("			<!-- Content Header (Page header) -->\r\n");
      out.write("			<div class=\"content-header\">\r\n");
      out.write("				<div class=\"container-fluid\">\r\n");
      out.write("					<div class=\"row mb-2\">\r\n");
      out.write("						<div class=\"col-sm-6\">\r\n");
      out.write("							<h1 class=\"m-0\">Starter Page</h1>\r\n");
      out.write("						</div>\r\n");
      out.write("						<!-- /.col -->\r\n");
      out.write("						<div class=\"col-sm-6\">\r\n");
      out.write("							<ol class=\"breadcrumb float-sm-right\">\r\n");
      out.write("								<li class=\"breadcrumb-item\"><a\r\n");
      out.write("									href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/admin\">Home</a></li>\r\n");
      out.write("								<li class=\"breadcrumb-item active\">Starter Page</li>\r\n");
      out.write("							</ol>\r\n");
      out.write("						</div>\r\n");
      out.write("						<!-- /.col -->\r\n");
      out.write("					</div>\r\n");
      out.write("					<!-- /.row -->\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- /.container-fluid -->\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- /.content-header -->\r\n");
      out.write("\r\n");
      out.write("			<!-- Main content -->\r\n");
      out.write("			");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "content.jsp", out, false);
      out.write("\r\n");
      out.write("			<!-- /.content -->\r\n");
      out.write("			ss\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- /.content-wrapper -->\r\n");
      out.write("\r\n");
      out.write("		<!-- Control Sidebar -->\r\n");
      out.write("		<aside class=\"control-sidebar control-sidebar-dark\">\r\n");
      out.write("			<!-- Control sidebar content goes here -->\r\n");
      out.write("			<div class=\"p-3\">\r\n");
      out.write("				<h5>Title</h5>\r\n");
      out.write("				<p>Sidebar content</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</aside>\r\n");
      out.write("		<!-- /.control-sidebar -->\r\n");
      out.write("\r\n");
      out.write("		<!-- Main Footer -->\r\n");
      out.write("		<footer class=\"main-footer\">\r\n");
      out.write("			<!-- To the right -->\r\n");
      out.write("			<div class=\"float-right d-none d-sm-inline\">Anything you want</div>\r\n");
      out.write("			<!-- Default to the left -->\r\n");
      out.write("			<strong>Copyright &copy; 2014-2021 <a\r\n");
      out.write("				href=\"https://adminlte.io\">AdminLTE.io</a>.\r\n");
      out.write("			</strong> All rights reserved.\r\n");
      out.write("		</footer>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- ./wrapper -->\r\n");
      out.write("\r\n");
      out.write("	<!-- REQUIRED SCRIPTS -->\r\n");
      out.write("\r\n");
      out.write("	<!-- jQuery -->\r\n");
      out.write("	<script src=\"plugins/jquery/jquery.min.js\"></script>\r\n");
      out.write("	<!-- Bootstrap 4 -->\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js\"\r\n");
      out.write("		integrity=\"sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js\"\r\n");
      out.write("		integrity=\"sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("	<!-- AdminLTE App -->\r\n");
      out.write("	<script src=\"../assets/js/admin.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
