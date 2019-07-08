import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
    HashMapに関する基本問題

    人口の多い都道府県ベスト10を当てるクイズを作成しましょう。
    (2017年10月現在のデータです)

    HashMap<String,Integer>型のマップには、キーに都道府県名、値に
    順位を格納します。次のランキング情報を登録してください。

        １位：東京都
        ２位：神奈川県
        ３位：大阪府
        ４位：愛知県
        ５位：埼玉県
        ６位：千葉県
        ７位：兵庫県
        ８位：北海道
        ９位：福岡県
      １０位：静岡県

    ※注意
    System.console().readLine()の記述は、キーボードから文字列の
    入力を受け付け、それをString型の値として返すプログラムです。
    これはそのまま利用してください。

    都道府県名の入力受付を行い、その都道府県がランキングに入っていた
    場合は「正解♪」「○○は△位です」と表示して、その都道府県をランキング
    Mapオブジェクトから削除してください。その都道府県がランキングに入って
    いなかった場合は「残念…」「○○はランキングに入っていません…」
    「ゲームオーバー」と表示してゲームを終了します。

    ベスト10のすべての都道府県を答えられた場合は、「おめでとうございます♪」
    「ベスト10をすべて答えました♪」と表示してゲームを終了します。

    【実行結果】
    人口の多い都道府県ベスト10を当ててください！
    東京都
    正解♪
    東京都は1位です
    北海道
    正解♪
    北海道は8位です
    沖縄県
    残念…
    沖縄県はランキングに入っていません…
    ゲームオーバー

 */

public class HashMapBasicPractice {

	public static void main(String[] args) throws IOException {

		System.out.println("人口の多い都道府県ベスト10を当ててください！");

		// マップの設定
		HashMap<String, Integer> rankMap = new HashMap<>();
		rankMap.put("東京都", 1);
		rankMap.put("神奈川県", 2);
		rankMap.put("大阪府", 3);
		rankMap.put("愛知県", 4);
		rankMap.put("埼玉県", 5);
		rankMap.put("千葉県", 6);
		rankMap.put("兵庫県", 7);
		rankMap.put("北海道", 8);
		rankMap.put("福岡県", 9);
		rankMap.put("静岡県", 10);

		// 入力値変数の宣言
		String input;

		// 入力の受付
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (rankMap.size() != 0) {
			input = br.readLine();

			// ランキングマップオブジェクトから順位を取得
			Integer rank = rankMap.get(input);

			// ランキングに含まれていた場合
			if (rank != null) {
				System.out.println("正解♪");
				System.out.println(input + "は" + rank.intValue() + "位です");
				rankMap.remove(input);
			} else {
				// ランキングに含まれてなかった場合
				System.out.println("残念…");
				System.out.println("はランキングに入っていません…");
				System.out.println("ゲームオーバー");
				break;
			}
		}

		// 全問正解した場合
		if (rankMap.size() == 0) {
			System.out.println("おめでとうございます♪");
			System.out.println("ベスト10をすべて答えました♪");
		}
	}
}
