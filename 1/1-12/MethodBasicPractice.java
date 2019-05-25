/*

    メソッド定義の基本問題

    mainメソッドはすでに完成しています。（変更しないでください）
    mainメソッド内で呼び出している、第一引数の文字列を第二引数の回数分
    表示するdisplayメソッドを定義してください。

    【実行結果】
    テスト
    テスト
    テスト
    テスト
    テスト

*/
public class MethodBasicPractice {

	public static void main(String[] args) {

		// displayメソッドの呼び出し
		display("テスト", 5);
	}

	// ここにdisplayメソッドを定義してください
	private static void display(String txt, int count) {

		for (int i = 0; i < count; i++) {
			System.out.println(txt);
		}
	}

}
