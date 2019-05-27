import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*

    文字列と配列の問題

    あるアパートに住む住人を表すapartmentというString[][]型の変数があります。
    配列の１次元目はアパートの階数、２次元目は号室を表現しています。
    （つまりapartment[0][1]は１階２号室の住人の名前になります）

    キーボードから検索したい人の名前を入力し、アパートにその人が住んでいるかを
    調査してください。

    System.console().readLine()の記述は、キーボードから文字列の入力を
    受け付けるもので、その値でString型変数nameを初期化しています。

    見つかった場合は、「○人目の○○さんは、○階の○号室に住んでいます」と表示
    してください。ポイントは同名の方が住んでいる場合を考慮することです。
    また、見つからなかった場合は「○○さんはこのアパートには住んでいません」と
    表示してください。

    【実行結果】
    検索する名前を入力してください
    後藤
    1人目の後藤さんは、1階の1号室に住んでいます
    2人目の後藤さんは、3階の4号室に住んでいます
    3人目の後藤さんは、4階の3号室に住んでいます

    【実行結果】
    検索する人を入力してください
    上戸
    上戸さんはこのアパートには住んでいません

 */
public class StringArrayPractice {

	public static void main(String[] args) throws IOException {

		// アパートに住む住人２次元配列変数
		String[][] apartment = {
				{ "後藤", "矢口", "石川", "吉澤", "藤本" },
				{ "亀井", "小川", "紺野" },
				{ "石川", "安倍", "保田", "後藤" },
				{ "石黒", "福田", "後藤" }
		};

		System.out.println("検索する名前を入力してください");

		// 検索する名前変数の宣言とキーボード入力値による初期化
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();

		// ここからコーディングしてください
		// 階のループ
		int count = 0;
		for (int i = 0; i < apartment.length; i++) {
			// 号室のループ
			for (int j = 0; j < apartment[i].length; j++) {
				if (apartment[i][j].equals(name)) {
					System.out.println(++count + "人目の" + name + "さんは、" + (i + 1) + "階の" + (j + 1) + "号室に住んでいます");
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println(name + "さんはこのアパートには住んでいません");
		}

	}

}
