/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2016-05-24 08:17:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class vip_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/../css/style.css", Long.valueOf(1464074940023L));
  }

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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-type\" content=\"text/html; charset=Shift_JIS\">\r\n");
      out.write("<link href=\"<c:url value='/resources/css/style.css' />\" rel=\"stylesheet\">\r\n");
      out.write("<!-- <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/style.css\"> -->\r\n");
      out.write("<title>VIPルーム</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<style type=\"text/css\">");
      out.write("html{\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    margin-top:-20px;        \r\n");
      out.write("    padding: 0;       \r\n");
      out.write("    width:100%;\r\n");
      out.write("    height:100%;\r\n");
      out.write("}\r\n");
      out.write(".top{\r\n");
      out.write("\tdisplay:block;\r\n");
      out.write("\tmargin-left:auto;\r\n");
      out.write("\tmargin-right:auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#contents {\r\n");
      out.write("    top : 0px;\r\n");
      out.write("    padding : 10px;\r\n");
      out.write("    margin : 10px;\r\n");
      out.write("    text-align : center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#contents img{\r\n");
      out.write("    padding-bottom:10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#contents button {\r\n");
      out.write("    font-size: 1.4em;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    padding: 10px 30px;\r\n");
      out.write("    background-color: #200;\r\n");
      out.write("    color: #ffffff;\r\n");
      out.write("    border-style: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#table{\r\n");
      out.write("    border:0;\r\n");
      out.write("    background-color:#CCCCCC;\r\n");
      out.write("    font-size:24px;\r\n");
      out.write("    color:#666666;\r\n");
      out.write("    width:200px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#table3{\r\n");
      out.write("    border:0;\r\n");
      out.write("    background-color:#CCCCCC;\r\n");
      out.write("    font-size:24px;\r\n");
      out.write("    color:#666666;\r\n");
      out.write("    width:200px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*--------calender----------*/\r\n");
      out.write("#Sunday{\r\n");
      out.write("    text-align:center;\r\n");
      out.write("    width:200;\r\n");
      out.write("    height:40;\r\n");
      out.write("    background-color:#C7D8ED;\r\n");
      out.write("    color:#FF3300;\r\n");
      out.write("    padding:15px;\r\n");
      out.write("}\r\n");
      out.write("#MonFri{\r\n");
      out.write("    text-align:center;\r\n");
      out.write("    width:200;\r\n");
      out.write("    background-color:#C7D8ED;\r\n");
      out.write("    color:#666666;\r\n");
      out.write("    padding:15px;\r\n");
      out.write("}\r\n");
      out.write("#Saturday{\r\n");
      out.write("    text-align:center;\r\n");
      out.write("    width:200;\r\n");
      out.write("    background-color:#C7D8ED;\r\n");
      out.write("    color:#666666;\r\n");
      out.write("    padding:15px;\r\n");
      out.write("}\r\n");
      out.write("#Saturday2{\r\n");
      out.write("    text-align:center;\r\n");
      out.write("    width:200;\r\n");
      out.write("    background-color:#A6C0E1;\r\n");
      out.write("    color:#666666;\r\n");
      out.write("}\r\n");
      out.write("#Sunday2{\r\n");
      out.write("    text-align:center;\r\n");
      out.write("    height:40;\r\n");
      out.write("    background-color:#FFCC99;\r\n");
      out.write("    color:#666666;\r\n");
      out.write("}\r\n");
      out.write("#Weekday{\r\n");
      out.write("    text-align:center;\r\n");
      out.write("    background-color:#FFFFFF;\r\n");
      out.write("    color:#666666;\r\n");
      out.write("    width:200;\r\n");
      out.write("}\r\n");
      out.write("#publicholiday{\r\n");
      out.write("    text-align:center;\r\n");
      out.write("    background-color:#FF3300;\r\n");
      out.write("    color:#FFFFFF;\r\n");
      out.write("}\r\n");
      out.write("#table2 tr td{\r\n");
      out.write("    border:0;\r\n");
      out.write("    font-size:24px;\r\n");
      out.write("    color:#666666;\r\n");
      out.write("    width:400px;\r\n");
      out.write("}\r\n");
      out.write("#float{\r\n");
      out.write("    float:left;\r\n");
      out.write("}\r\n");
      out.write("/* --------------------------------------*/\r\n");
      out.write("\r\n");
      out.write("#header {\r\n");
      out.write("    top: 0px;\r\n");
      out.write("    left: 0px;\r\n");
      out.write("    height: 75px;\r\n");
      out.write("    margin-right: auto;\r\n");
      out.write("    margin-left: auto;\r\n");
      out.write("    text-align : center;\r\n");
      out.write("    background-color : #3A0101;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("#header h1{\r\n");
      out.write("    padding-top: 20px;\r\n");
      out.write("    font-family: 'Times New Roman', Times, serif;\r\n");
      out.write(" \tcolor:#ffffff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("#top{\r\n");
      out.write("    font-size: 200%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#oneset{\r\n");
      out.write("\tpadding-top: 10px;\r\n");
      out.write("\tpadding-bottom: 10px;\r\n");
      out.write("\t\r\n");
      out.write("\tborder-width: thick;\r\n");
      out.write("\tborder-color: #999AAA;\r\n");
      out.write("\tborder-style: ridge;\r\n");
      out.write("}\r\n");
      out.write("#name\r\n");
      out.write("{\r\n");
      out.write("    text-align: center; \r\n");
      out.write("\tfont-size: 150%;\r\n");
      out.write("    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    background-color: #999AAA;\r\n");
      out.write("    font-family: 'Times New Roman', Times, serif;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("#message{\r\n");
      out.write("\tcolor: #000000;\r\n");
      out.write("    padding-left: 300px;\r\n");
      out.write("\tfont-size: 150%;\r\n");
      out.write("\t\r\n");
      out.write("\ttext-align: left; margin-left: 100px; margin-right: 0px; width: 1000px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/*---------入力フォーム----------*/\r\n");
      out.write("\r\n");
      out.write("#reservation{\r\n");
      out.write("    \r\n");
      out.write("    padding-top: 20px;\r\n");
      out.write("    margin-bottom:50px;\r\n");
      out.write("    font-family: 'Times New Roman', Times, serif;\r\n");
      out.write(" \tcolor:#000000;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#form{\r\n");
      out.write("    margin-top:30px\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("button.button2 {\r\n");
      out.write("    float:right;\r\n");
      out.write("    font-size: 1.4em;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    padding: 30px 20px;\r\n");
      out.write("    background-color: #3A0101;\r\n");
      out.write("    color: #ffffff;\r\n");
      out.write("    border-style: none;\r\n");
      out.write("    font-family: 'Times New Roman', Times, serif;\r\n");
      out.write("    box-shadow:4px 4px #555;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*\r\n");
      out.write("footer ------------------------------------------------------*/\r\n");
      out.write("\r\n");
      out.write("#footer {\r\n");
      out.write("    margin-top:30px;\r\n");
      out.write("    border-top:2px solid #3A1010;\r\n");
      out.write("    padding-top:20px;\r\n");
      out.write("    padding-bottom:20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#footer p{\r\n");
      out.write("    text-align:center;\r\n");
      out.write("}\r\n");
      out.write("#footer p a{\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("#footborder hr{\r\n");
      out.write("    border-color:#3A1010;\r\n");
      out.write("    border-width:1px;\r\n");
      out.write("}");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("      <div id=\"header h1\"><h1><a HREF=\"http://localhost:8080/Izumi/top\" STYLE=\"text-decoration:none\"><font color=\"#FFFFFF\">HOTEL&nbsp;&nbsp;&nbsp;IZUMI</font></a><img id=\"img\" src=\"image/vip.jpg\" widht=\"50%\" height=\"70%\" align=\"right\"></h1></div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"oneset\">\r\n");
      out.write("<img src=\"image/vip1.jpg\" widht=\"50%\" height=\"50%\" align=\"left\">\r\n");
      out.write("    <p id=\"name\">---ここに部屋名を入力---</p>\r\n");
      out.write("        <p id=\"RoomNB\">【101号室】</p>\r\n");
      out.write("        <p id=\"message\">---ここにメッセージを入力---</p>\r\n");
      out.write("<table border>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td>広さ</td>\r\n");
      out.write("    <td>53㎡～56㎡</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td>定員</td>\r\n");
      out.write("    <td>4～5人</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td>アメニティ</td>\r\n");
      out.write("    <td>石鹸、シャンプー、リンス、歯ブラシ、クシ、手ぬぐい</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td>設備</td>\r\n");
      out.write("    <td>テレビ、電話、冷蔵庫、アイロン、シャワー</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<img id=\"img\" src=\"image/vip1_1.jpg\" widht=\"100px\" height=\"100px\" align=\"left\">\r\n");
      out.write("<br>\r\n");
      out.write("<button class=\"button1\" type=\"submit\">空室状況・予約</button>\r\n");
      out.write("<br clear=\"all\">\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"oneset\">\r\n");
      out.write("<img src=\"image/vip2.jpg\" widht=\"50%\" height=\"50%\" align=\"left\">\r\n");
      out.write("    <p id=\"name\">---ここに部屋名を入力---</p>\r\n");
      out.write("        <p id=\"RoomNB\">【102号室】</p>\r\n");
      out.write("        <p id=\"message\">---ここにメッセージを入力---</p>\r\n");
      out.write("<table border>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td>広さ</td>\r\n");
      out.write("    <td>53㎡～56㎡</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td>定員</td>\r\n");
      out.write("    <td>4～5人</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td>アメニティ</td>\r\n");
      out.write("    <td>石鹸、シャンプー、リンス、歯ブラシ、クシ、手ぬぐい</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td>設備</td>\r\n");
      out.write("    <td>テレビ、電話、冷蔵庫、アイロン、シャワー</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<img id=\"img\" src=\"image/vip2_2.jpg\" widht=\"100px\" height=\"100px\" align=\"left\">\r\n");
      out.write("<br>\r\n");
      out.write("<button class=\"button1\" type=\"submit\">空室状況・予約</button>\r\n");
      out.write("<br clear=\"all\">\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"oneset\">\r\n");
      out.write("<img src=\"image/vip3.jpg\" widht=\"50%\" height=\"50%\" align=\"left\">\r\n");
      out.write("    <p id=\"name\">---ここに部屋名を入力---</p>\r\n");
      out.write("        <p id=\"RoomNB\">【103号室】</p>\r\n");
      out.write("        <p id=\"message\">---ここにメッセージを入力---</p>\r\n");
      out.write("<table border>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td>広さ</td>\r\n");
      out.write("    <td>53㎡～56㎡</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td>定員</td>\r\n");
      out.write("    <td>4～5人</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td>アメニティ</td>\r\n");
      out.write("    <td>石鹸、シャンプー、リンス、歯ブラシ、クシ、手ぬぐい</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td>設備</td>\r\n");
      out.write("    <td>テレビ、電話、冷蔵庫、アイロン、シャワー</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<img id=\"img\" src=\"image/vip3_3.jpg\" widht=\"100px\" height=\"100px\" align=\"left\">\r\n");
      out.write("<br>\r\n");
      out.write("<button class=\"button1\" type=\"submit\">空室状況・予約</button>\r\n");
      out.write("<br clear=\"all\">\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"oneset\">\r\n");
      out.write("<img src=\"image/vip4.jpg\" widht=\"50%\" height=\"55%\" align=\"left\">\r\n");
      out.write("    <p id=\"name\">---ここに部屋名を入力---</p>\r\n");
      out.write("        <p id=\"RoomNB\">【104号室】</p>\r\n");
      out.write("        <p id=\"message\">---ここにメッセージを入力---</p>\r\n");
      out.write("<table border>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td>広さ</td>\r\n");
      out.write("    <td>53㎡～56㎡</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td>定員</td>\r\n");
      out.write("    <td>4～5人</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td>アメニティ</td>\r\n");
      out.write("    <td>石鹸、シャンプー、リンス、歯ブラシ、クシ、手ぬぐい</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td>設備</td>\r\n");
      out.write("    <td>テレビ、電話、冷蔵庫、アイロン、シャワー</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<img id=\"img\" src=\"image/vip4_4.jpg\" widht=\"100px\" height=\"100px\" align=\"left\">\r\n");
      out.write("<br>\r\n");
      out.write("<button class=\"button1\" type=\"submit\">空室状況・予約</button>\r\n");
      out.write("<br clear=\"all\">\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"oneset\">\r\n");
      out.write("<img src=\"image/vip5.jpg\" widht=\"50%\" height=\"55%\" align=\"left\">\r\n");
      out.write("    <p id=\"name\">---ここに部屋名を入力---</p>\r\n");
      out.write("        <p id=\"RoomNB\">【105号室】</p>\r\n");
      out.write("        <p id=\"message\">---ここにメッセージを入力---</p>\r\n");
      out.write("<table border>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td>広さ</td>\r\n");
      out.write("    <td>53㎡～56㎡</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td>定員</td>\r\n");
      out.write("    <td>4～5人</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td>アメニティ</td>\r\n");
      out.write("    <td>石鹸、シャンプー、リンス、歯ブラシ、クシ、手ぬぐい</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("    <td>設備</td>\r\n");
      out.write("    <td>テレビ、電話、冷蔵庫、アイロン、シャワー</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<img id=\"img\" src=\"image/vip5_5.jpg\" widht=\"100px\" height=\"100px\" align=\"left\">\r\n");
      out.write("<br>\r\n");
      out.write("<button class=\"button1\" type=\"submit\">空室状況・予約</button>\r\n");
      out.write("<br clear=\"all\">\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("    <p id=\"copyright\">Copyright &copy;<a href=\"http://hotelizumi.com\">hotelizumi</a> All Rights Reserved.</p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
