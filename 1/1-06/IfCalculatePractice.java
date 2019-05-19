import java.util.Scanner;

// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    if文と演算に関する問題

    double型の２つの変数（身長heightと体重weight）があります。
    その２つの値はキーボードから受け付けます。

    ※注意
    Double.parseDouble(System.console().readLine())の記述は、キーボードから
    文字列の入力を受け付け、それをdouble型に変換するプログラムです。
    これはそのまま利用してください。ただし、キーボードから「ABC」のような
    入力を行うと、double型に変換できずに例外をスローします。

    次の手順に従って、肥満度（BMI）測定を行ってください。

    １．double型の変数bmiを宣言します。

    ２．変数bmiにBMI値を格納します。BMI値の算出方法は以下の通りです。

        BMI = (体重kg) ÷（身長mの二乗）

    ３．変数bmiの値を次の形式で出力します。

        「あなたのBMI値は○○です」

    ４．最後に、変数bmiの値に応じて次のようなメッセージを出力します。

        26.5以上        …「肥満です」
        26.5未満24以上  …「太り気味です」
        24未満20以上    …「普通です」
        20未満0以上     …「スリムです」
        それ以外        …「エラーです」

    【実行結果】
    身長（cm）を入力してください
    170
    体重（kg）を入力してください
    88
    あなたのBMI値は30.449826989619382です
    肥満です

    【実行結果】
    身長（cm）を入力してください
    170
    体重（kg）を入力してください
    55
    あなたのBMI値は19.031141868512112です
    スリムです

 */
public class IfCalculatePractice{

	public static void main(String[] args){

		System.out.println("身長（cm）を入力してください");
		Scanner scanner = new Scanner(System.in);
		double height = scanner.nextDouble();
		// 身長(cm)を(m)に変換
		height = height * 0.01;

		System.out.println("体重（kg）を入力してください");
		double weight = scanner.nextDouble();
		scanner.close();

		// BMI値の算出と表示
		double bmi = weight / (height*height);
		System.out.println("あなたのBMI値は"+ bmi + "です");

		if(bmi >= 26.5) {
			System.out.println("肥満です");
		}else if(bmi < 26.5 && bmi >=24) {
			System.out.println("太り気味です");
		}else if(bmi < 24 && bmi >=20) {
			System.out.println("普通です");
		}else if(bmi < 20 && bmi >=0) {
			System.out.println("スリムです");
		}else {
			System.out.println("エラーです");
		}
	}
}
