/*
    for文の標準問題

    for文を利用して、10から100までの自然数の中から
    素数であるものを表示してください。

    素数とは、1とその数以外のどんな自然数によっても割り切れない
    1より大きな自然数のことです。
    例えば、11 1と11のみ。
    8だったら…1,2,8で割り切れる
*/
public class ForNormalPractice {

	public static void main(String[] args) {

		// for文の開始：label 特定のループに名前をつけること
		outer:for (int i = 11; i <= 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					continue outer;
				}
			}
			System.out.println(i);
		}
	}
}
