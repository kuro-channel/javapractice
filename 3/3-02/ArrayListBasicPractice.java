/*
    ArrayListに関する基本問題

    数字英単語を格納するArrayList<String>型の変数numberがあり、
    zeroからtenまでの数字英単語が格納されています。

    次に、「0から10までの英単語を入力してください」と出力し、
    ユーザに英単語を入力してもらいます。

    ※注意
    System.console().readLine()の記述は、キーボードから文字列の
    入力を受け付け、それをString型の値として返すプログラムです。
    これはそのまま利用してください。

    ArrayList<String>型の変数numberをfor文を用いて走査し、
    入力英単語と文字列の一致を確認します。もし一致した
    場合は「○○は数値の△です」と表示します。もしすべて一致
    しなければ「○○は英単語として存在しません」と表示
    します。（下記実行結果を参考にしてください）

    【実行結果】
    0から10までの英単語を入力してください
    five
    fiveは数値の5です

    【実行結果】
    0から10までの英単語を入力してください
    eit
    eitは英単語として存在しません

*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListBasicPractice {

	public static void main(String[] args) throws IOException {

		// 数字英単語格納用変数の宣言とArrayListオブジェクトの生成
		ArrayList<String> numbers = new ArrayList<String>();

		// 数字英単語の格納
		numbers.add("zero");
		numbers.add("one");
		numbers.add("two");
		numbers.add("three");
		numbers.add("four");
		numbers.add("five");
		numbers.add("six");
		numbers.add("seven");
		numbers.add("eight");
		numbers.add("nine");
		numbers.add("ten");

		// 英単語の入力
		System.out.println("0から10までの英単語を入力してください");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // 見つかったことを判定するフラグ
		Boolean flg = false;

		// ここからコーディングしてください
		for (int i = 0; i < numbers.size(); i++) {
			// 文字列の等値チェック
			if (input.equals(numbers.get(i))) {
				System.out.println(input + "は数値の" + i + "です");
				flg = true;
				break; // そのまま return;でもOK
			}
		}

		// 入力文字列不正の場合
		if (!flg) {
			System.out.println(input + "は英単語として存在しません");
		}
	}
}
