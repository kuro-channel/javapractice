/*
    メソッド定義の基本問題３

    mainメソッドはすでに完成しています。（変更しないでください）
    mainメソッド内で呼び出している、int型の３つの引数の中で、一番
    小さいものの値を戻り値として返すminメソッドを作成してください。

    【実行結果】
    整数88,79,96の中で最小の値は79です

 */
public class MethodBasicPractice3{

	public static void main(String[] args){

		int x = 8;
		int y = 79;
		int z = 1;

		// minメソッドの呼び出し
		System.out.print("整数" + x + "," + y + "," + z + "の中で最小の値は");
		System.out.println(min(x, y, z) + "です");

	}

	// ここにminメソッドを定義してください
	private static int min(int x, int y, int z) {

		// 最小値にxを代入
		int minValue = x;
		// minValueとyを比較
		if(minValue > y) {
			minValue = y;
		}
		// minValueとyを比較
		if(minValue > z) {
			minValue = z;
		}
		return minValue;
//		if(x < y && x < z) {
//			return x;
//		}else if(y < z) {
//			return y;
//		}else {
//			return z;
//		}

	}
}
