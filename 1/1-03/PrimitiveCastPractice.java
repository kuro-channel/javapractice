/*
    基本データ型変数とキャストの問題

    コメントに従ってプログラムを記述してください。
    (コンパイルが通ればOKです)
 */
public class PrimitiveCastPractice{

	public static void main(String[] args){

		// short型の変数 s1 を宣言し、10 を代入してください
		short s1 = 10;

		// byte型の変数 b を宣言し、変数 s1 の値を代入してください
		byte b = (byte)s1;

		// char型の変数 c を宣言し、変数 b の値を代入してください
		char c = (char)b;

		// short型の変数 s2 を宣言し、変数 s1 と b を足した値を代入してください
		short s2 = (short)(s1 + b);
	}
}
