/*

    抽象と参照型キャストに関する問題

    アスリートを表すAthlete抽象クラスは完成しています。
    (変更しないでください)

    具体的なアスリートを表す水泳選手Swimmerクラス
    およびマラソン選手MarathonRunnerクラスを作成してください。

    [SwimmerおよびMarathonRunnerクラス]
    １．Athlete抽象クラスを継承します。

    ２．種目名を表すString型の定数TYPE(public static finalな
        フィールドを一般的に定数と言います)を定義します。
        値はそれぞれ「水泳」および「マラソン」です。

    ３．コンストラクタは選手名（String型）のみを引数を持ちます。
        選手名インスタンスフィールドに値を設定してください。

    ４．抽象メソッドgetTypeを実装してください。戻り値は、種目名
        定数の値を返すだけでいいです。

    ５．それぞれの種目に応じたメソッドを作成します。Swimmerクラスは
        泳ぐことを表すswimメソッドを、MarathonRunnerクラスは走ること
        を表すrunメソッドを作成してください。どちらのメソッドも引数・戻り値
        なしです。出力内容は下記実行結果を参考にしてください。

    また、AbstractCastPracticeクラスのmainメソッドは一部未完成です。

    アスリート型配列をfor文でループし、その配列要素の実際の型がSwimmer
    クラスであれば泳ぐswimメソッドを、実際の型がMarathonRunnerクラスで
    あれば走るrunメソッドを実行してください。

    【実行結果】
    私の名前は北島光一、水泳の選手です。
    私の名前は高橋昭子、マラソンの選手です。
    私の名前は岩崎正子、水泳の選手です。
    私の名前は野口みきえ、マラソンの選手です。

    北島光一は泳ぎました。
    高橋昭子は走りました。
    岩崎正子は泳ぎました。
    野口みきえは走りました。

*/
public class AbstractCastPractice {

	public static void main(String[] args) {

		// アスリート配列オブジェクトの生成
		Athlete[] athletes = {
				new Swimmer("北島光一"),
				new MarathonRunner("高橋昭子"),
				new Swimmer("岩崎正子"),
				new MarathonRunner("野口みきえ")
		};

		// 自己紹介
		for (int i = 0; i < athletes.length; i++) {
			System.out.println(athletes[i]);
		}

		System.out.println();

		// ここから作業してください
		// アスリートの種目に応じたメソッドの実行
		for (Athlete athlete : athletes) {
			if (athlete instanceof Swimmer) {
				((Swimmer) athlete).swim();
			} else if (athlete instanceof MarathonRunner) {
				((MarathonRunner) athlete).run();
			}
		}

	}

}

// Athlete抽象クラス
abstract class Athlete {

	// 選手名
	protected String name;

	// 種目名取得メソッド(抽象メソッド)
	public abstract String getType();

	@Override
	public String toString() {
		return "私の名前は" + name + "、" +
				getType() + "の選手です。";
	}

}

// ここにSwimmerクラスを作成してください
class Swimmer extends Athlete {
	// 定数
	public static final String TYPE = "水泳";

	// コンストラクタ
	public Swimmer(String name) {
		super.name = name;
	}

	@Override
	public String getType() {
		return TYPE;
	}

	// 泳ぐ
	public void swim() {
		System.out.println(name + "は泳ぎました。");
	}
}

// ここにMarathonRunnerクラスを作成してください
class MarathonRunner extends Athlete {
	// 定数
	public static final String TYPE = "マラソン";

	// コンストラクタ
	public MarathonRunner(String name) {
		super.name = name;
	}

	@Override
	public String getType() {
		return TYPE;
	}

	// 走る
	public void run() {
		System.out.println(name + "は走りました。");
	}
}
