package Spring.Hotel.Izumi;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
      logger.info("Welcome home! The client locale is {}.", locale);

      Date date = new Date();
      DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

      String formattedDate = dateFormat.format(date);

      model.addAttribute("serverTime", formattedDate );

      return "home";
    }

    @RequestMapping(value = "/general", method = RequestMethod.GET)
    public String gemeral(Model model) {
      return "general";
    }

    @RequestMapping(value = "/vip", method = RequestMethod.GET)
    public String vip(Model model) {
      return "vip";
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
       public String form(Model model) {
         FormModel fm = new FormModel();
         fm.setInput1("");
         fm.setInput2("");
         fm.setInput3("");
         fm.setInput4("");
         fm.setInput5("");
         fm.setInput6("");
         model.addAttribute("formModel",fm);
         return  "form";
       }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
       public String form1(@ModelAttribute FormModel fm, Model model) {
         String str1=fm.getInput1();
         String str2=fm.getInput2();
         String str3=fm.getInput3();
         String str4=fm.getInput4();
         String str5=fm.getInput5();
         String str6=fm.getInput6();
         int cnt=0;

         str1=str1.replaceAll("[^1-9]","");
         str2=str2.replaceAll("[^一-龠々ぁ-んァ-ヶ 　]","");
         str3=str3.replaceAll("[^ァ-ヶ 　]","");
         str4=str4.replaceAll("[^a-zA-Z0-9@._-]+","");
         str6=str6.replaceAll("[^一-龠々ぁ-んァ-ヶa-zA-Z0-9０-９-]+","");

         str2=str2.replaceAll("　　*"," ");
         str2=str2.replaceAll("  *"," ");
         str3=str3.replaceAll("　　*"," ");
         str3=str3.replaceAll("  *"," ");
         str4=str4.replaceAll("@@*","@");
         str4=str4.replaceAll("--*","-");
         str4=str4.replaceAll("\\..*",".");
         str4=str4.replaceAll("\\__*","_");
         str6=str6.replaceAll("--*","-");

         if(str1.matches("[0-9]")) cnt++;
         if(str2.matches("[一-龠々ぁ-んァ-ヶ 　]+")) cnt++;
         if(str3.matches("[ァ-ヶ 　]+")) cnt++;
         if(str4.matches("[a-zA-Z0-9@._-]+")) cnt++;
         if(str5.equals("その他")) cnt++;
         if(str6.matches("[一-龠々ぁ-んァ-ヶa-zA-Z0-9０-９-]+")) cnt++;
         cnt=prefecture(str6,cnt);

         if((str1!="")&&(str2!="")&&(str3!="")&&(str4!="")&&(str5!="")){
           if((str5.equals("その他")||(str6!=""))&&(cnt>=5)){
             return  con(fm,model);
           }
           model.addAttribute("error","入力エラーがありました");
           return  "form";
         }
         else{
             model.addAttribute("error","入力エラーがありました");
             return  "form";
         }
       }

       private int prefecture(String str6, int cnt) {
         // TODO 自動生成されたメソッド・スタブ
         if(str6.matches(".*"+"北海道"+".*")) cnt=-10;
         else if((str6.matches(".*"+"青森"+".*"))||(str6.matches(".*"+"岩手"+".*"))||(str6.matches(".*"+"宮城"+".*"))||(str6.matches(".*"+"秋田"+".*"))||(str6.matches(".*"+"山形"+".*"))||(str6.matches(".*"+"福島"+".*"))) cnt=-10;
         else if((str6.matches(".*"+"茨城"+".*"))||(str6.matches(".*"+"栃木"+".*"))||(str6.matches(".*"+"群馬"+".*"))||(str6.matches(".*"+"埼玉"+".*"))||(str6.matches(".*"+"千葉"+".*"))||(str6.matches(".*"+"東京"+".*"))||(str6.matches(".*"+"神奈川"+".*"))) cnt=-10;
         else if((str6.matches(".*"+"新潟"+".*"))||(str6.matches(".*"+"富山"+".*"))||(str6.matches(".*"+"石川"+".*"))||(str6.matches(".*"+"福井"+".*"))||(str6.matches(".*"+"山梨"+".*"))) cnt=-10;
         else if((str6.matches(".*"+"長野"+".*"))||(str6.matches(".*"+"岐阜"+".*"))||(str6.matches(".*"+"静岡"+".*"))||(str6.matches(".*"+"愛知"+".*"))) cnt=-10;
         else if((str6.matches(".*"+"三重"+".*"))||(str6.matches(".*"+"滋賀"+".*"))||(str6.matches(".*"+"京都"+".*"))||(str6.matches(".*"+"大阪"+".*"))||(str6.matches(".*"+"兵庫"+".*"))||(str6.matches(".*"+"奈良"+".*"))||(str6.matches(".*"+"和歌山"+".*"))) cnt=-10;
         else if((str6.matches(".*"+"鳥取"+".*"))||(str6.matches(".*"+"島根"+".*"))||(str6.matches(".*"+"岡山"+".*"))||(str6.matches(".*"+"広島"+".*"))||(str6.matches(".*"+"山口"+".*"))) cnt=-10;
         else if((str6.matches(".*"+"徳島"+".*"))||(str6.matches(".*"+"香川"+".*"))||(str6.matches(".*"+"愛媛"+".*"))||(str6.matches(".*"+"高知"+".*"))) cnt=-10;
         else if((str6.matches(".*"+"福岡"+".*"))||(str6.matches(".*"+"佐賀"+".*"))||(str6.matches(".*"+"長崎"+".*"))||(str6.matches(".*"+"熊本"+".*"))||(str6.matches(".*"+"大分"+".*"))||(str6.matches(".*"+"宮崎"+".*"))||(str6.matches(".*"+"鹿児島"+".*"))||(str6.matches(".*"+"沖縄"+".*"))) cnt=-10;
         return cnt;
       }

    @RequestMapping(value = "/confirmation", method = RequestMethod.POST)
       public String con(@ModelAttribute FormModel fm, Model model) {
         String str1=fm.getInput1();
         String str2=fm.getInput2();
         String str3=fm.getInput3();
         String str4=fm.getInput4();
         String str5=fm.getInput5();
         String str6=fm.getInput6();
         String wk1=null;
         String wk2=null;
         String wk3=null;
         int i,j;
         int k=1;

         str2=str2.replaceAll("　　*"," ");
         str2=str2.replaceAll("  *"," ");
         str3=str3.replaceAll("　　*"," ");
         str3=str3.replaceAll("  *"," ");
         str4=str4.replaceAll("@@*","@");
         str4=str4.replaceAll("--*","-");
         str4=str4.replaceAll("\\..*",".");
         str4=str4.replaceAll("\\__*","_");
         str6=str6.replaceAll("--*","-");

         str1=str1.replaceAll("[^0-9]","");
         str2=str2.replaceAll("[^一-龠々ぁ-んァ-ヶ 　]","");
         str3=str3.replaceAll("[^ァ-ヶ 　]","");
         str4=str4.replaceAll("[^a-zA-Z0-9@._-]+","");
         str6=str6.replaceAll("[^一-龠々ぁ-んァ-ヶa-zA-Z0-9０-９-]+","");

         //文字数処理
         if(str2.length()>15) str2=str2.substring(0,15);
         if(str3.length()>15) str3=str3.substring(0,15);
         if(str6.length()>40) str6=str6.substring(0,40);

         //リピート処理
         for(i=0;i<str2.length();i++){
           wk1=str2.substring(i,i+1);
           if(wk1.equals(wk3)){   //nとn-1が等しいならば以下の処理をスキップする
             continue;
           }
           else{
             wk3=wk1;
           }
           for(j=i+1;j<str2.length();j++){
             wk2=str2.substring(j,j+1);
             if(wk1.equals(wk2)){ //nとn+1,n+1とn+2・・・が等しいならば等しい(連続する)文字数を数える
               k++;
             }
             else{
               k=1;
               break;
             }
             if(k>=5){            //連続する文字数が5文字以上ならば5文字以上から1文字に置換する
               str2=str2.replaceAll(""+wk1+"{5,}",wk1);
               k=1;
             }
           }
         }

         for(i=0;i<str3.length();i++){
           wk1=str3.substring(i,i+1);
           if(wk1.equals(wk3)){   //nとn-1が等しいならば以下の処理をスキップする
             continue;
           }
           else{
             wk3=wk1;            }
             for(j=i+1;j<str3.length();j++){
             wk2=str3.substring(j,j+1);
             if(wk1.equals(wk2)){ //nとn+1,n+1とn+2・・・が等しいならば等しい(連続する)文字数を数える
               k++;
             }
             else{
               k=1;
               break;
             }
             if(k>=5){            //連続する文字数が5文字以上ならば5文字以上から1文字に置換する
               str3=str3.replaceAll(""+wk1+"{5,}",wk1);
               k=1;
             }
           }
         }

         for(i=0;i<str4.length();i++){
           wk1=str4.substring(i,i+1);
           if(wk1.equals(wk3)){   //nとn-1が等しいならば以下の処理をスキップする
             continue;
           }
           else{
             wk3=wk1;
           }
           for(j=i+1;j<str4.length();j++){
             wk2=str4.substring(j,j+1);
             if(wk1.equals(wk2)){ //nとn+1,n+1とn+2・・・が等しいならば等しい(連続する)文字数を数える
               k++;
             }
             else{
               k=1;
               break;
             }
             if(k>=5){            //連続する文字数が5文字以上ならば5文字以上から1文字に置換する
               str4=str4.replaceAll(""+wk1+"{5,}",wk1);
               k=1;
             }
           }
         }

         for(i=0;i<str6.length();i++){
           wk1=str6.substring(i,i+1);
           if(wk1.equals(wk3)){   //nとn-1が等しいならば以下の処理をスキップする
             continue;
           }
           else{
             wk3=wk1;
           }
           for(j=i+1;j<str6.length();j++){
             wk2=str6.substring(j,j+1);
             if(wk1.equals(wk2)){ //nとn+1,n+1とn+2・・・が等しいならば等しい(連続する)文字数を数える
               k++;
             }
             else{
               k=1;
               break;
             }
             if(k>=5){            //連続する文字数が5文字以上ならば5文字以上から1文字に置換する
               str6=str6.replaceAll(""+wk1+"{5,}",wk1);
               k=1;
             }
           }
         }

         str6=str6.replaceAll("1{5,}","1");//1だけなぜか出来ない為

         model.addAttribute("number",str1);
         model.addAttribute("name1",str2);
         model.addAttribute("name2",str3);
         model.addAttribute("mail",str4);
         model.addAttribute("pre",str5);
         if(!str5.equals("その他"))
           model.addAttribute("address",str6);
         return "confirmation";
       }
}
