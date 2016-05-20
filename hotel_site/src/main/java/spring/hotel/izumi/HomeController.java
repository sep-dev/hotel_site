package spring.hotel.izumi;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller //このクラスがコントローラーであることを示す

@RequestMapping("/")// このURLにアクセスがあった場合、以下の処理を実行する

@SessionAttributes(value = {"","NAME","ADDRESS","TEL"} ) //セッション変数の宣言


public class HomeController {
	//データベース関連
	@Autowired
	private JdbcTemplate jdbcTemplate;

	//会員一覧画面
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(HttpSession session){
		ModelAndView modelAndView = new ModelAndView("home");
		List<Map<String, Object>>  list = jdbcTemplate.queryForList("select * from tbaddress;");

		//データベースのデータをすべて取得
		modelAndView.addObject("id",list.get(0).get("id"));
		modelAndView.addObject("name", list.get(0).get("name") );
		modelAndView.addObject("address", list.get(0).get("address") );
		modelAndView.addObject("tel", list.get(0).get("tel") );
		FormModel form = new FormModel();
		modelAndView.addObject("form1",form);
		modelAndView.addObject("list",list);
		return modelAndView;
	}
	//更新or削除画面
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ModelAndView home(@ModelAttribute FormModel form1, Model model, HttpServletRequest request,HttpSession session){

		//ラジオボタンが未チェックだった場合の処理
		if(form1.getRadio1() == null){
			ModelAndView modelAndView = new ModelAndView("message");
			modelAndView.addObject("title","チェック不足");
			modelAndView.addObject("message","選択してください！！");
			return modelAndView;
		}

		//チェックされたデータベースのデータを取得
		ModelAndView modelAndView = new ModelAndView("kosin");
		List<Map<String, Object>>  list = jdbcTemplate.queryForList("select * from tbaddress where id = "+form1.getRadio1()+";");
		modelAndView.addObject("ID",list.get(0).get("id"));
		modelAndView.addObject("NAME",list.get(0).get("name"));
		modelAndView.addObject("ADDRESS",list.get(0).get("address"));
		modelAndView.addObject("TEL",list.get(0).get("tel"));

		fmModel fmModel = new fmModel();
		modelAndView.addObject("fmModel",fmModel);

		return modelAndView;
	}
	//更新画面
	@RequestMapping(value = "/kosin",method = RequestMethod.POST)
	public String kosin1(@Valid @ModelAttribute fmModel fmModel,BindingResult result, Model model,HttpSession session,SessionStatus sessionStatus){

		//セッションで、選択データのIDをゲット
		int getId =(Integer)session.getAttribute("ID");

		//formに入力されたデータを取得
		String fmName = fmModel.getName2();
		String fmAddress = fmModel.getAddress2();
		String fmTel = fmModel.getTel2();

		//更新フォームより入力された値が3箇所とも空かどうかの判断
		if(fmName.equals("") && fmAddress.equals("") &&fmTel.equals("")){
			model.addAttribute("title","更新失敗画面");
			model.addAttribute("message","空欄です！入力してください！！！！！！！");
			return "message";
		}
		else{
			if(fmName == ""){
				fmName = (String)session.getAttribute("NAME");
			}
			if(fmAddress ==""){
				fmAddress = (String)session.getAttribute("ADDRESS");
			}
			if(fmTel ==""){
				fmTel = (String)session.getAttribute("TEL");
			}
			if(result.hasErrors()){
				model.addAttribute("title","入力エラー");
				model.addAttribute("message","入力内容が間違っています。<br>正しく訂正してください。");
				return "kosin";
			}
		}
		jdbcTemplate.update("UPDATE tbaddress SET name='"+fmName+"', address='"+fmAddress+"', tel='"+fmTel+"' WHERE id = "+getId+";");
		model.addAttribute("title","更新成功画面");
		model.addAttribute("message","更新成功！！！！！！！");
		//セッションデータのクリア
		return "message";
	}

	//登録画面
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView hello(HttpServletRequest request){
		ModelAndView modelAndView = new ModelAndView("HelloWorld");

		modelAndView.addObject("message","<h1>会員情報の登録</h1>");

		FormModel  form = new FormModel();
		modelAndView.addObject("form",form);
		return modelAndView;
	}

	//登録の判定
	@RequestMapping(value = "/hello",params ="toroku1", method = RequestMethod.POST)
	public String form(@Valid @ModelAttribute FormModel form,BindingResult result, Model model){

		if (result.hasErrors()) { //FormModelに記述した条件に反していたらエラー処理

			model.addAttribute("title","入力エラー");
			model.addAttribute("message","入力内容が間違っています。<br>正しく訂正してください。");
			return "no";
		}
		else{
			model.addAttribute("title","登録成功画面");
			model.addAttribute("message","登録成功！！！！！！！");

			jdbcTemplate.update("INSERT INTO tbaddress(id,name,address,tel) VALUES(?,?,?,?)",
					null,form.getInput1(), form.getInput2(), form.getInput3());
			return "message";
		}
	}

	//削除確認画面
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(HttpSession session){

		return "delete";
	}

	//削除実行
	@RequestMapping(value = "/deleteOK", method = RequestMethod.POST)
	public String deleteOK(Model model,HttpServletRequest request,HttpSession session){

		model.addAttribute("title","削除完了");
		model.addAttribute("message","削除しました！！");

		int getId = (Integer)session.getAttribute("ID");

		jdbcTemplate.update("DELETE FROM tbaddress WHERE id = "+getId+";");

		return "message";
	}

	//全削除
	@RequestMapping(value = "/DELETE", params ="AllDelete", method = RequestMethod.GET)
	public String allDelete(HttpSession session)
	{
		jdbcTemplate.update("DELETE FROM tbaddress;");
		return "home";
	}

}