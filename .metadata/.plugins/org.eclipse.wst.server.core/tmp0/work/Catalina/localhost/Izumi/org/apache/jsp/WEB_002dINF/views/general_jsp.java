/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2016-05-24 09:17:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class general_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/pleiades/workspace/hotel-site/hotel_site/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/HOTEL_IZUMI/WEB-INF/lib/spring-webmvc-3.1.1.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1329370132000L));
    _jspx_dependants.put("/WEB-INF/views/../css/style.css", Long.valueOf(1464074940023L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-3.1.1.RELEASE.jar", Long.valueOf(1463816089900L));
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
      out.write("\r\n");
      out.write("<!--  http://www.aspen-hotel.co.jp/room/ を参考   -->\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=Shift_JIS\">\r\n");
      out.write("    <title>客室のご案内</title>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("      div.example img {\r\n");
      out.write("        margin: 0px 20px 0px 0px;\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("    <style type=\"text/css\">");
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
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("   <form>\r\n");
      out.write("    <div id=\"header\">\r\n");
      out.write("      <div id=\"header h1\"><h1><a HREF=\"http://localhost:8080/Izumi/top\" STYLE=\"text-decoration:none\"><font color=\"#FFFFFF\">HOTEL&nbsp;&nbsp;&nbsp;IZUMI</font></a></h1></div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <h1>一般ルーム</h1><br>\r\n");
      out.write("      <h3>シングルルーム　【201号室～】</h3>\r\n");
      out.write("      落ち着いた色調で統一され、仕事の疲れも癒してくれるリラックスできる空間です。<br><br>\r\n");
      out.write("      <div class=\"example\">\r\n");
      out.write("        <img src=\"picture\\ph01.jpg\" alt=\"サンプル図\" width=\"350\" height=\"270\"  align=\"left\" >\r\n");
      out.write("      </div>\r\n");
      out.write("      <table border=\"1\" >\r\n");
      out.write("        <tr>\r\n");
      out.write("          <th>広さ</th>\r\n");
      out.write("          <td>16㎡</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <th>定員</th>\r\n");
      out.write("          <td>1名様</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <th rowspan=\"2\">アメニティ</th>\r\n");
      out.write("          <td rowspan=\"2\">バスタオル・フェイスタオル・歯ブラシ<br>石鹸・シャンプー・リンス</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <th rowspan=\"2\">客室設備</th>\r\n");
      out.write("          <td rowspan=\"2\">高速LAN回線・冷蔵庫・バス・洗浄機付きトイレ<br>ドライヤー・テレビ・電話・エアコン・スリッパ</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("\r\n");
      out.write("      <img src=\"picture\\ph01_shw1.png\" alt=\"間取り図\" width=\"130\" height=\"146\" align=\"left\" ><br><br>\r\n");
      out.write("\r\n");
      out.write("      <input type=\"button\" value=\"空室状況・予約\" style=\"width:100px; height:50px\" onClick=location.href=\"\"><br><br><br><br><br><br><br>\r\n");
      out.write("\r\n");
      out.write("      <h3>ダブルルーム　　【301号室～】</h3>\r\n");
      out.write("      ゆったりとお寛ぎいただけるようにベッド幅はゆとりの180cm！<br>カップルでのご利用や小さなお子様連れのファミリーにもおすすめです。<br><br>\r\n");
      out.write("      <div class=\"example\">\r\n");
      out.write("        <img src=\"picture\\ph04.jpg\" alt=\"サンプル図\" width=\"350\" height=\"270\"  align=\"left\" >\r\n");
      out.write("      </div>\r\n");
      out.write("      <table border=\"1\" >\r\n");
      out.write("        <tr>\r\n");
      out.write("          <th>広さ</th>\r\n");
      out.write("          <td>25㎡</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <th>定員</th>\r\n");
      out.write("          <td>1～2名様</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <th rowspan=\"2\">アメニティ</th>\r\n");
      out.write("          <td rowspan=\"2\">バスタオル・フェイスタオル・歯ブラシ<br>石鹸・シャンプー・リンス</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <th rowspan=\"2\">客室設備</th>\r\n");
      out.write("          <td rowspan=\"2\">高速LAN回線・冷蔵庫・バス・洗浄機付きトイレ<br>ドライヤー・テレビ・電話・エアコン・スリッパ</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("         <tr>\r\n");
      out.write("         </tr>\r\n");
      out.write("       </table>\r\n");
      out.write("\r\n");
      out.write("       <img src=\"picture\\ph04_shw1.png\" alt=\"間取り図\" width=\"130\" height=\"146\" align=\"left\" ><br><br>\r\n");
      out.write("\r\n");
      out.write("       <input type=\"button\" value=\"空室状況・予約\" style=\"width:100px; height:50px\" onClick=location.href=\"file:///C:/Users/urawakikosuke/Desktop/hotel/calender.html\"><br><br><br><br><br><br><br>\r\n");
      out.write("\r\n");
      out.write("       <h3>ツインルーム　　【401号室～】</h3>\r\n");
      out.write("       アットホームな感覚でご滞在いただけます！<br>3名様でご利用の場合、台はエキストラベッドでのご利用となります。<br><br>\r\n");
      out.write("\r\n");
      out.write("       <div class=\"example\">\r\n");
      out.write("         <img src=\"picture\\ph06.jpg\" alt=\"サンプル図\" width=\"350\" height=\"270\"  align=\"left\" >\r\n");
      out.write("       </div>\r\n");
      out.write("       <table border=\"1\" >\r\n");
      out.write("         <tr>\r\n");
      out.write("           <th>広さ</th>\r\n");
      out.write("           <td>25～27㎡</td>\r\n");
      out.write("         </tr>\r\n");
      out.write("         <tr>\r\n");
      out.write("           <th>定員</th>\r\n");
      out.write("           <td>2～3名様</td>\r\n");
      out.write("         </tr>\r\n");
      out.write("         <tr>\r\n");
      out.write("            <th rowspan=\"2\">アメニティ</th>\r\n");
      out.write("            <td rowspan=\"2\">バスタオル・フェイスタオル・歯ブラシ<br>石鹸・シャンプー・リンス</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <th rowspan=\"2\">客室設備</th>\r\n");
      out.write("            <td rowspan=\"2\">高速LAN回線・冷蔵庫・バス・洗浄機付きトイレ<br>ドライヤー・テレビ・電話・エアコン・スリッパ</td>\r\n");
      out.write("           </tr>\r\n");
      out.write("           <tr>\r\n");
      out.write("         </tr>\r\n");
      out.write("       </table>\r\n");
      out.write("\r\n");
      out.write("        <img src=\"picture\\ph06_shw1.png\" alt=\"間取り図\" width=\"120\" height=\"146\" align=\"left\" >\r\n");
      out.write("        <br><br>\r\n");
      out.write("\r\n");
      out.write("        <input type=\"button\" value=\"空室状況・予約\" style=\"width:100px; height:50px\" onClick=location.href=\"file:///C:/Users/urawakikosuke/Desktop/hotel/calender.html\"><br><br><br><br><br><br><br>\r\n");
      out.write("\r\n");
      out.write("        <h3>トリプルルーム　【501号室～】</h3>\r\n");
      out.write("        レギュラーベッドを3台ご用意したお部屋です。グループやファミリーでも快適にご利用頂けます。<br><br>\r\n");
      out.write("        <div class=\"example\">\r\n");
      out.write("          <img src=\"picture\\ph07.jpg\" alt=\"サンプル図\" width=\"350\" height=\"270\"  align=\"left\" >\r\n");
      out.write("        </div>\r\n");
      out.write("        <table border=\"1\" >\r\n");
      out.write("          <tr>\r\n");
      out.write("            <th>広さ</th>\r\n");
      out.write("            <td>29㎡</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <th>定員</th>\r\n");
      out.write("            <td>3名様</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <th rowspan=\"2\">アメニティ</th>\r\n");
      out.write("            <td rowspan=\"2\">バスタオル・フェイスタオル・歯ブラシ<br>石鹸・シャンプー・リンス</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <th rowspan=\"2\">客室設備</th>\r\n");
      out.write("            <td rowspan=\"2\">高速LAN回線・冷蔵庫・バス・洗浄機付きトイレ<br>ドライヤー・テレビ・電話・エアコン・スリッパ</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("\r\n");
      out.write("        <img src=\"picture\\ph07_shw1.png\" alt=\"間取り図\" width=\"140\" height=\"146\" align=\"left\" ><br><br>\r\n");
      out.write("\r\n");
      out.write("        <input type=\"button\" value=\"空室状況・予約\" style=\"width:100px; height:50px\" onClick=location.href=\"file:///C:/Users/urawakikosuke/Desktop/hotel/calender.html\"><br><br><br><br><br><br><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div id=\"footer\">\r\n");
      out.write("          <p id=\"copyright\">Copyright &copy;<a href=\"http://hotelizumi.com\">hotelizumi</a> All Rights Reserved.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </form>\r\n");
      out.write("  </body>\r\n");
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
