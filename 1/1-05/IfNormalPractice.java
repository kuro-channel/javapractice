/*
    if文の標準問題

    int型の変数ageが宣言してあります。変数ageは年齢を表しています。

    ※注意
    Integer.parseInt(System.console().readLine())の記述は、キーボードから
    文字列の入力を受け付け、それをint型に変換するプログラムです。
    これはそのまま利用してください。ただし、キーボードから「ABC」のような
    入力を行うと、int型に変換できずに例外をスローします。

    変数ageの値が20以上の場合は「成人です」と表示します。
    また、変数ageの値が20未満かつ0以上の場合は「未成年です」と表示します。
    それ以外の場合は「エラー」と表示します。

    さらに、未成年の場合に限り次のような表示も行います。
    変数ageの値が6未満または14より大きい場合は「今は義務教育を受けていません」
    と表示し、それ以外の場合は「今は義務教育を受けています」と表示します。

    【実行結果】
    年齢を入力してください
    25
    成人です

    【実行結果】
    年齢を入力してください
    18
    未成年です
    今は義務教育を受けていません

    【実行結果】
    年齢を入力してください
    12
    未成年です
    今は義務教育を受けています

    【実行結果】
    年齢を入力してください
    -2
    エラー

 */
public class IfNormalPractice{

	public static void main(String[] args){

		System.out.println("年齢を入力してください");

		// 年齢変数の宣言と初期化
		int age = 18;
		System.out.println(age);
		//        int age = 18;
		//        int age = 12;
		//        int age = -2;

		// if文の開始
		// 変数age:20未満かつ0以上の場合
		if(age < 0) {
			System.out.println("エラー");
		}else if(0<=age && age<20) {
			System.out.println("未成年です。");
			System.out.println("今は義務教育を受けています");
		}else if(age >= 20) {
			System.out.println("成年です。");
		}
	}
}
