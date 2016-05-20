package spring.hotel.izumi;

import javax.validation.constraints.Pattern;

public class fmModel {
	//登録フォーム関係
	@Pattern(regexp = "^[ぁ-ん一-龠々ァ-ヴ]+[\\s]*$|^$", message = "※氏名は、漢字、平仮名、カタカナ、で") //日本語or何も打っていない
	private String name2;
	@Pattern(regexp = "^[ぁ-ん一-龠々ァ-ヴ]+[\\s]*$|^$", message = "※住所")
	private String address2;
	@Pattern(regexp = "[0-9]+|^$", message = "※電話番号は、 数値、10桁~12桁")
	private String tel2;
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getTel2() {
		return tel2;
	}
	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}

}
