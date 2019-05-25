/*
	二次元配列とメソッド定義
*/
public class DoubleArrayMethodPractice {

	public static void main(String[] args) {

		int[][] arr = { { 1, 5, 8 }, { 2, 4, 7 }, { 1, 9, 3, 5 }, { 4, 2 },
				{ 6, 1, 9, 4 }, { 7, 3, 8, 1 }, { 8, 4, 3, 9, 7 } };
		int target = 1;
		System.out.println(target + "の個数:" + count(arr, target));

		target = 7;
		System.out.println(target + "の個数:" + count(arr, target));

	}

	private static int count(int[][] arr, int target) {
		int count = 0;
		for (int[] item : arr) {
			for (int value : item) {
				if (target == value) {
					count++;
				}
			}
		}
		return count;
	}

}
