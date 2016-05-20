package spring.hotel.izumi;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class FormModel {
	//登録フォーム関係
	private Integer id;
	@NotEmpty(message = "●[　　氏名　]　 空欄") //値が空でないかチェック。
	@Pattern(regexp = "[一-龠々 ぁ-ん ァ-ン]{2,10}+", message = "●[　　氏名　] 　漢字、平仮名、カタカナ、で2～10桁以内")
	private String name;
	@NotEmpty(message = "●[　　住所　]　 空欄")//住所入力フォームに漢字、かな、カナ、数字以外で50桁まで
	@Pattern(regexp = "[一-龠々|ぁ-ん|ァ-ン|0-9]{1,20}+" , message = "●[　　住所　]　 漢字、平仮名、カタカナ、数字、で20桁まで")
	private String address;
	@NotEmpty(message = "●[電話番号]　 空欄")
	@Pattern(regexp = "[0-9]{10,12}", message = "●[電話番号]　 数値、10桁~12桁") //0~9の数字が使われているか、10~12桁か
	private String tel;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getInput1() {
		return name;
	}
	public void setInput1(String name) {
		this.name = name;
	}

	public String getInput2() {
		return address;
	}
	public void setInput2(String address) {
		this.address = address;
	}

	public String getInput3() {
		return tel;
	}
	public void setInput3(String tel) {
		this.tel = tel;
	}

		//ラジオボタン関係
		private String radio1;

		public String getRadio1(){
			return radio1;
		}
			public void setRadio1(String radio1){
				this.radio1 =radio1;
		}

}
