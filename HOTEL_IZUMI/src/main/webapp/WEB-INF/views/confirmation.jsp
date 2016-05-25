<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
  <head>

    <title>入力確認</title>

  </head>
  <body>
  <style type="text/css"><%@include file="../css/style.css" %></style>
  <div id="header">
      <div id="header h1"><h1><a HREF="http://localhost:8080/Izumi/top" STYLE="text-decoration:none"><font color="#FFFFFF">HOTEL&nbsp;&nbsp;&nbsp;IZUMI</font></a></h1></div>
    </div>
　　<h3>入力確認</h3><br>
<!--
　　　ご利用人数　　　　　1名様<br>
    　　　ご依頼者名　　　　　恵寿井伊 太郎<br>
    ご依頼者名（フリガナ）　 エスイイ タロウ　<br>
  　  　メールアドレス　　　　setaro@se-project.co.jp<br>
    　　　　ご住所　　　　　　　東京都千代田区神田小川町三丁目8番地10<br><br>
 -->

　　　ご利用人数　　　　　${number}名様<br>
    　　　ご依頼者名　　　　　${name1}<br>
    ご依頼者名（フリガナ）　 ${name2}　<br>
  　  　メールアドレス　　　　${mail}<br>
    　　　　ご住所　　　　　　　${pre}${address}<br><br>

    以上の内容でよろしいですか？
　　<form>
       <input type="button" value="はい" onClick='http://localhost:8080/springMVC/finish' >　
       <input type="button" value="変更する" onClick=location.href="http://localhost:8080/Izumi/form">
     </form>
<div id="footer">
    <p id="copyright">Copyright &copy;<a href="http://hotelizumi.com">hotelizumi</a> All Rights Reserved.</p>
</div>
  </body>
</html>