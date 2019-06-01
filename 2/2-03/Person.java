/*
   [Personクラス]
    Personクラスには次の２つのインスタンスフィールドがあります。

    １．氏名を表すname (String型)
    ２．年齢を表すage (int型)

    Personクラスには５つのインスタンスメソッドが必要です。

    １．氏名と年齢をオブジェクトにセットするためのsetDataメソッド
    ２．年齢の情報を取得するためのgetAgeメソッド
    ３．名前の情報を取得するためのgetNameメソッド
    ４．自己紹介をするintroduceメソッド
    ５．引数で渡ってきた他の人と年齢を比較するcompareメソッド
 */
public class Person {
	// 氏名
	private String name;
	// 年齢
	private int age;

	// 氏名と年齢をオブジェクトにセット
	public void setData(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 年齢の情報を取得
	public int getAge() {
		return this.age;
	}

	// 名前の情報を取得
	public String getName() {
		return this.name;
	}

	// 自己紹介をするintroduceメソッド
	public void introduce() {
		System.out.println("私の名前は" + this.name + "、年齢は" + this.age + "歳です。");
	}

	// 引数で渡ってきた他の人と年齢を比較するcompareメソッド
	public void compare(Person person) {
		// 年齢差の計算
		int ageDif = ((this.age > person.getAge()) ? this.age - person.getAge() : person.getAge() - this.age);
		// 同い年の場合
		if (this.age == person.getAge()) {
			System.out.println("わたくし" + this.name + "は、" + person.getName() + "さんと同じ年齢です。");
			return;
		}
		// 年上か年下の場合
		String olderYounger = null;
		if (this.age > person.getAge()) {
			olderYounger = "年上";
		} else if (this.age < person.getAge()) {
			olderYounger = "年下";
		}
		System.out.println("わたくし" + this.name + "は、" + person.getName() + "さんより" + ageDif + "歳" + olderYounger + "です。");
	}

}
