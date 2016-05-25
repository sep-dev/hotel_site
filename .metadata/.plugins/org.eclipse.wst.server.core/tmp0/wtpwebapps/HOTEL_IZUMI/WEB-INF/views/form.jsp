<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page import="java.sql.*"%>
<%
boolean cnt=false;
int id=0;
String Wdate=null;
String Wroom=null;
String year=null;
String month=null;
String dateA=null;
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=Shift_JIS">
        <!-- <link rel="stylesheet" type="text/css" href="css/style.css"> -->
        <title>お客様情報の入力</title>
    </head>
    <body>
    <style type="text/css"><%@include file="../css/style.css" %></style>

  <!--   <form:form modelAttribute="formModel"> -->
    <div id="header">
      <div id="header h1"><h1><a HREF="http://localhost:8080/Izumi/top" STYLE="text-decoration:none"><font color="#FFFFFF">HOTEL&nbsp;&nbsp;&nbsp;IZUMI</font></a></h1></div>
    </div>
<form:form modelAttribute="formModel" name="form" id="form" >
    <input type="hidden" name="mcode" value="UTF-8">

<%
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    try {
      con = DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","e78jOn6L");
      stmt = con.createStatement();
      rs =stmt.executeQuery("select * from hotel.tbroom");
      while(rs.next()) {
        id=rs.getInt(1);
        Integer ida =new Integer(id);
        String idb =ida.toString();
        String date =rs.getString(2);
        String room =rs.getString(3);
        Wdate=date;
        Wroom=room;
      }
    }
    catch (Exception e) {
      System.out.println("データベース接続エラー"+ e);
    }

    year=Wdate.substring(0,2);
    year="20"+year+"年";
    month=Wdate.substring(2,4);
    month=month+"月";
    dateA=Wdate.substring(4,6);
    dateA=dateA+"日";

%>

<p ID=reservation><% out.println(year+month+dateA);%></p>

<p>以下のフォームにご入力の上、「入力内容の確認画面へ」ボタンをクリックしてください。</p>
<p><font color="#ff0000">${error}</font></p>

<table>

<tr>
<th><label>ご利用人数</label></th>
<td></td>
<td><form:input path="input1" id="count" size="5" autocomplete="off" onblur="error(1)"/> <span class="supplement" >名様</span><br>

</td>
</tr>

<tr>
<th><label for="name1">ご依頼者名</label></th>
<td></td>
<td><form:input path="input2"  id="name1" size="50" autocomplete="off" onblur="error(2)" /><br>
<span class="supplement">例） 田具 太郎</span></td>
</tr>

<tr>
<th><label for="name2">ご依頼者名 <span class="supplement">（フリガナ）</span></label></th>
<td></td>
<td><form:input path="input3" id="name2" size="50" autocomplete="off" onblur="error(3)"/><br>
<span class="supplement">例） タグ タロウ</span></td>
</tr>

<tr>
<th><label for="email">メールアドレス</label></th>
<td></td>
<td><form:input path="input4" id="email" size="50" autocomplete="off" onblur="error(4)"/> <span class="supplement">（半角英数字）</span><br>
<span class="supplement">ご入力間違いのないようにご注意ください</span>
<button class="button2" type="submit" style="position: absolute; right: 10px;">入力内容の確認画面へ</button>
</td>
</tr>

<!--
<tr>
<th><label for="tel1">電話番号</label></th>
<td class="arbitrary"></td>
<td><input type="text" name="tel1" id="tel1" size="12"> - <input type="text" name="tel2" id="tel2" size="12"> - <input type="text" name="tel3" id="tel3" size="12"> <span class="supplement">（半角数字）</span></td>
</tr>
-->
<tr>
<th rowspan="3"><label>ご住所</label></th>
<td class="arbitrary"></td>
</tr>
<tr>
<td></td>

<!--都道府県の選択-->

<!-- <td><select name="prefecture" id="prefecture">  -->

<td>
<form:select path="input5"  id="prefecture" onblur="error(5)">

<option value="">都道府県の選択</option>
<option value="北海道">北海道</option>
<option value="青森県">青森県</option>
<option value="岩手県">岩手県</option>
<option value="宮城県">宮城県</option>
<option value="秋田県">秋田県</option>
<option value="山形県">山形県</option>
<option value="福島県">福島県</option>
<option value="東京都">東京都</option>
<option value="神奈川県">神奈川県</option>
<option value="埼玉県">埼玉県</option>
<option value="千葉県">千葉県</option>
<option value="茨城県">茨城県</option>
<option value="栃木県">栃木県</option>
<option value="群馬県">群馬県</option>
<option value="山梨県">山梨県</option>
<option value="新潟県">新潟県</option>
<option value="長野県">長野県</option>
<option value="富山県">富山県</option>
<option value="石川県">石川県</option>
<option value="福井県">福井県</option>
<option value="愛知県">愛知県</option>
<option value="岐阜県">岐阜県</option>
<option value="静岡県">静岡県</option>
<option value="三重県">三重県</option>
<option value="大阪府">大阪府</option>
<option value="兵庫県">兵庫県</option>
<option value="京都府">京都府</option>
<option value="滋賀県">滋賀県</option>
<option value="奈良県">奈良県</option>
<option value="和歌山県">和歌山県</option>
<option value="鳥取県">鳥取県</option>
<option value="島根県">島根県</option>
<option value="岡山県">岡山県</option>
<option value="広島県">広島県</option>
<option value="山口県">山口県</option>
<option value="徳島県">徳島県</option>
<option value="香川県">香川県</option>
<option value="愛媛県">愛媛県</option>
<option value="高知県">高知県</option>
<option value="福岡県">福岡県</option>
<option value="佐賀県">佐賀県</option>
<option value="長崎県">長崎県</option>
<option value="熊本県">熊本県</option>
<option value="大分県">大分県</option>
<option value="宮崎県">宮崎県</option>
<option value="鹿児島県">鹿児島県</option>
<option value="沖縄県">沖縄県</option>
<option value="その他">その他</option>
<!-- </select> -->

</form:select></td>
</tr>

<!--都道府県以下の住所入力-->
<tr>
<td class="arbitrary"></td>
<td><form:input path="input6"  id="address" size="50" autocomplete="off" onblur="error(6)"/><br>
<span class="supplement">例） 千代田区大手町1-2-3 ○○ビル10F</span></td>
</tr>
</tbody>
</table>
<!--<button class="button2" type="submit" style="position: absolute; right: 10px; top: 360px">入力内容の確認画面へ</button>
 <div id="button2">
  <input type="submit" class="button2" name="button" value="入力内容の確認" >
</div> -->
</form:form>

<script type="text/javascript">
function error(num){
  var str1=document.forms.form.count.value;
  var str2=document.forms.form.name1.value;
  var str3=document.forms.form.name2.value;
  var str4=document.forms.form.email.value;
  var str5=document.forms.form.prefecture.value;
  var str6=document.forms.form.address.value;
  switch(num){
    case 1:
      if((str1.match(/[^0-9]/g))||(str1>10)||(str1<1)){
        alert ('1～10の数字を入力してください');
        //document.forms.form.count.value="";
        return false;
      }
      break;
    case 2:
      if(str2==""){
        alert ('空白です。名前を入力してください');
        //document.forms.form.name1.value="";
        return false;
      }
      else if(str2.match(/[^一-龠々ぁ-んァ-ヶ 　]/g)){
        alert ('ひらがな、カタカナ、漢字のみ入力してください');
        //document.forms.form.name1.value="";
        return false;
      }
      break;
    case 3:
      if(str3==""){
        alert ('空白です。フリガナを入力してください');
        //document.forms.form.name1.value="";
        return false;
      }
      else if(str3.match(/[^ァ-ヶ 　]/g)){
        alert ('カタカナのみ入力してください');
        //document.forms.form.name2.value="";
        return false;
      }
      break;
    case 4:
      if(str4==""){
        alert ('空白です。メールアドレスを入力してください');
        //document.forms.form.name1.value="";
        return false;
      }
      else if(str4.match(/[^a-zA-Z0-9@._-]/g)){
        alert ('半角英数字 @ , - _のみ入力してください');
        //document.forms.form.email.value="";
        return false;
      }
      break;
    case 5:
      if(str5==""){
        alert ('都道府県を選択してください');
        //document.forms.form.address.value="";
        return false;
      }
      break;
    case 6:
      if(str5==""){
        alert ('都道府県を選択してください');
        if(str6==""){
          alert ('空白です。住所を入力してください');
          //document.forms.form.name1.value="";
          return false;
        }
        else if(str6.match(/[^一-龠々ぁ-んァ-ヶa-zA-Z0-9-]/g)){
          alert ('-以外の記号は入力できません');
          //document.forms.form.address.value="";
          return false;
        }
      }
      else if(str5=="その他"){
        return false;
      }
      else if(str6==""){
        alert ('空白です。住所を入力してください');
        //document.forms.form.name1.value="";
        return false;
      }
      else if(str6.match(/[^一-龠々ぁ-んァ-ヶa-zA-Z0-9０-９-]/g)){
        alert ('-以外の記号は入力できません');
        //document.forms.form.address.value="";
        return false;
      }
  }
}

</script>



<!--
	  /*メールアドレス正規表現
	  /^([a-zA-Z0-9_¥.¥-])+¥@(([a-zA-Z0-9¥-])+¥.)+([a-zA-Z0-9]{2,4})+$/
      /^([a-zA-Z0-9])+([a-zA-Z0-9¥._-])*@([a-zA-Z0-9_-])+([a-zA-Z0-9¥._-]+)+$/
      /^[A-Za-z0-9]+[¥w-]+@[¥w¥.-]+¥.¥w{2,}$/
      /^[¥w_-]+@[¥w¥.-]+¥.¥w{2,}$/
	  */
 -->


<div id="footer">
          <p id="copyright">Copyright &copy;<a href="http://hotelizumi.com">hotelizumi</a> All Rights Reserved.</p>
        </div>
    </form:form>
  </body>
</html>
