package org.apache.jsp.pages.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      String resourceInjectorClassName = config.getInitParameter("com.sun.appserv.jsp.resource.injector");
      if (resourceInjectorClassName != null) {
        _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) Class.forName(resourceInjectorClassName).newInstance();
        _jspx_resourceInjector.setContext(application);
      }

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<!--\r\n");
      out.write("\tVerti by HTML5 UP\r\n");
      out.write("\thtml5up.net | @n33co\r\n");
      out.write("\tFree for personal and commercial use under the CCA 3.0 license (html5up.net/license)\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>No Sidebar - Verti by HTML5 UP</title>\r\n");
      out.write("\t\t<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t\t<meta name=\"description\" content=\"\" />\r\n");
      out.write("\t\t<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("\t\t<!--[if lte IE 8]><script src=\"/Skeleton/css/ie/html5shiv.js\"></script><![endif]-->\r\n");
      out.write("\t\t<script src=\"/Skeleton/js/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"/Skeleton/js/jquery.dropotron.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"/Skeleton/js/skel.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"/Skeleton/js/skel-layers.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"/Skeleton/js/init.js\"></script>\r\n");
      out.write("\t\t<noscript>\r\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"/Skeleton/css/skel.css\" />\r\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"/Skeleton/css/style.css\" />\r\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"/Skeleton/css/style-desktop.css\" />\r\n");
      out.write("\t\t</noscript>\r\n");
      out.write("\t\t<!--[if lte IE 8]><link rel=\"stylesheet\" href=\"/Skeleton/css/ie/v8.css\" /><![endif]-->\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body class=\"no-sidebar\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Header -->\r\n");
      out.write("\t\t\t<div id=\"header-wrapper\">\r\n");
      out.write("\t\t\t\t<header id=\"header\" class=\"container\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<!-- Logo -->\r\n");
      out.write("\t\t\t\t\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1><a href=\"index.html\">Verti</a></h1>\r\n");
      out.write("\t\t\t\t\t\t\t<span>by HTML5 UP</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<!-- Nav -->\r\n");
      out.write("\t\t\t\t\t\t<nav id=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"/\">Index</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"\">Dropdown</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Lorem ipsum dolor</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Magna phasellus</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"\">Phasellus consequat</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Lorem ipsum dolor</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Phasellus consequat</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Magna phasellus</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Etiam dolore nisl</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Veroeros feugiat</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"left-sidebar.html\">Left Sidebar</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"right-sidebar.html\">Right Sidebar</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"current\"><a href=\"no-sidebar.html\">No Sidebar</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</header>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- Main -->\r\n");
      out.write("\t\t\t<div id=\"main-wrapper\">\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Content -->\r\n");
      out.write("\t\t\t\t\t\t\t<article>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
