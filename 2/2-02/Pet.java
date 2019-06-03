/*
 	[Petクラス]
    Petクラスは次の４つのprivateインスタンスフィールドを持ちます。

    １．動物の種類を保持するためのtypeフィールド（String型）
    ２．名前を保持するためのnameフィールド（String型）
    ３．年齢を保持するためのageフィールド（byte型）
    ４．性別を保持するためのgenderフィールド（boolean型 true:メス false:オス）

    また、Petクラスは次の５つのpublicメソッドを持ちます。

    １．動物の種類を設定するためのsetTypeメソッド
    ２．名前を設定するためのsetNameメソッド
    ３．年齢を設定するためのsetAgeメソッド
    ４．性別を設定するためのsetGenderメソッド
    ５．紹介文を取得するためのgetIntroductionメソッド
      (紹介文の内容は下記の実行結果を参考にしてください)
 */
public class Pet {
	// 動物の種類
	private String type;
	// 名前
	private String name;
	// 年齢
	private byte age;
	// 性別 true:メス false:オス
	private boolean gender;

	public void setType(String type) {
		this.type = type;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getIntroduction() {
		return type + "の" + name + "は" + ((gender) ? "メス" : "オス") + "で" + age + "歳です。";
	}
}
