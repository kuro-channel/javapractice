/*

    while文の基本問題

    int型変数xが1で初期化されています。
    xの値をwhile文を用いて2倍していき、その都度
    値を出力します。xの値が1000を超えた段階でループ
    を終了してください。

    【実行結果】
    1
    2
    4
    8
    16
    32
    64
    128
    256
    512

 */
public class WhileBasicPractice {

	public static void main(String[] args) {

		int x = 1;
		int y = 1;

		// while文の開始
		while (x < 1000) {
			System.out.println("x:" + x);
			x = x * 2;
		}

		// do ~ while
		do {
			System.out.println("y:" + y);
			y = y * 2;
		} while (y < 1000);
	}
}
