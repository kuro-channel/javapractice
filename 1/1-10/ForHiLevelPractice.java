/*

    for文の上級問題

    変数levelは山の段数を表しています。
    for文をネストして、次の図形を作成してください。
    尚、山の左側には全角空白を使用してください。
    (本テキストの解答例では、見やすさのため四角を使用します)

    【実行結果】
    □□□□■
    □□□■■■
    □□■■■■■
    □■■■■■■■
    ■■■■■■■■■

	□：4,3,2,1,0 -1ずつ
	■：1,3,5,7,9 +2ずつ
 */
public class ForHiLevelPractice {

	public static void main(String[] args) {

		// 山の段数を表す変数
		int level = 5;

		// for文の開始
		for (int i = 0; i < level; i++) {
			for (int j = 0; j < level + i; j++) {

				if (j < level - i - 1) {
					System.out.print("□");
				} else {
					System.out.print("■");
				}
			}
			System.out.println();
		}
	}
}
