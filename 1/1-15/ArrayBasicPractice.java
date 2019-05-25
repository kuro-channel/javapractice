/*

    配列の基本問題

    次の指示に従ってArrayBasicPracticeクラスの
    mainメソッドを完成させてください。

    １．int配列型変数arrを宣言してください
    ２．要素数が３つのint配列型オブジェクトを生成してください
    ３．各要素にそれぞれ25、39、43を代入してください
    ４．forループを使用して、各要素を出力してください
       （出力形式は実行結果を参考）

    【実行結果】
    1番目の値は25です
    2番目の値は39です
    3番目の値は43です

*/
public class ArrayBasicPractice {

	public static void main(String[] args) {

		// １．int配列型変数の宣言
		int[] arr;

		// ２．配列オブジェクトの生成
		arr = new int[3];

		// ３．各要素の値を代入
		arr[0] = 25;
		arr[1] = 39;
		arr[2] = 43;

		// ４．各要素の値を表示
		for (int i = 1; i <= arr.length; i++) {
			System.out.println(i + "番目の値は" + arr[i - 1] + "です");
		}
	}

}
