import java.util.Random;

/*

    例外と継承に関する問題

    仕事のトラブルを表現するトラブル例外クラスTroubleException
    はすでに完成しています。また、社員を表現する社員抽象クラス
    Employeeはすでに完成しています。（変更しないでください）

    さらに、ExceptionInheritancePracticeクラスのmainメソッドは
    すでに完成しています。（変更しないでください）

    次の指示に従って、上司を表現するBossクラスと、部下を表現する
    Subordinateクラスを作成してください。

    [Bossクラス]
    １．Employeeクラスを継承します。

    ２．直属の部下を表すSubordinate型のフィールドsubを定義します。

    ３．社員名（String型）と部下オブジェクト（Subordinate型）を引数
      として受け取るコンストラクタを定義します。
      スーパークラスEmployeeのnameフィールドに社員名を設定してください。
      また、Bossクラスのインスタンスフィールドsubに引数の部下オブジェクト
      を設定してください。

    ４．働くworkメソッドを実装してください。
        ただし、「throws TroubleException」の記述は要りません。
        (上司はトラブルの責任を自分で取ることができるからです)

        実行内容は
       「さて、今回の○○は部下の△△に任せよう！」と出力し、部下オブジェクト
        のworkメソッドを実行します。ただし、例外処理が必須なので注意しましょう。

        部下がトラブルを起こした場合はcatchブロックで謝罪します。内容は
       「申し訳ございません…」
       「△△が大変失礼致しました…」
       「上司のわたくし□□の監督不行き届きでございます…」
       と出力します。

       部下がトラブルを起こさなかった場合は、
      「△△君、よくやった！」
      「さすが私の右腕だ！」
       と出力します。

    [Subordinateクラス]
    １．Employeeクラスを継承します。

    ２．社員名（String型）を引数として受け取るコンストラクタを定義します。
      スーパークラスEmployeeのnameフィールドに値を設定してください。

    ３．名前を取得するgetNameメソッド（引数なし、戻り値String型）を
        定義してください。

    ４．働くworkメソッドを実装します。
      「throws TroubleException」の記述も忘れないようにしてください。
       （部下はトラブルの責任を自分で取れないからです）

        実行内容は
       「今回の○○はわたくし△△が担当致します」
       「○○中…」と表示します。

       ここからは２回に１回、キレてしまいます。
       java.utilパッケージのRandomクラスをインスタンス化し、
       nextBooleanインスタンスメソッド（引数なし、戻り値boolean型）を
       呼び出します。このメソッドはtrueとfalseを半々で返します。
       trueの場合は、キレます。

       キレた場合は「ふざけるな、ばか野郎！」とお客様に暴言を吐いて
       トラブル例外オブジェクトをスローします。

       キレなかった場合は「今回の○○はわたくし△△が無事任務を果たしました」
       と表示してそのまま終了します。


    【実行結果(キレた場合)】
    さて、今回の得意先との取引は部下の有吉に任せよう！

    今回の得意先との取引はわたくし有吉が担当致します
    得意先との取引中…
    ふざけるな、ばか野郎！

    申し訳ございません…
    有吉が大変失礼致しました…
    上司のわたくし上島の監督不行き届きでございます…


    【実行結果(キレなかった場合)】
    さて、今回の得意先との取引は部下の有吉に任せよう！

    今回の得意先との取引はわたくし有吉が担当致します
    得意先との取引中…
    今回の得意先との取引はわたくし有吉が無事任務を果たしました

    有吉君、よくやった！
    さすが私の右腕だ！

*/
public class ExceptionInheritancePractice{

    public static void main(String[] args){

        // 部下クラスのインスタンスを生成
        Subordinate sub = new Subordinate("有吉");

        // 上司クラスのインスタンスを生成
        Boss boss = new Boss("上島", sub);

        // 上司の働くメソッドを実行
        boss.work("得意先との取引");

    }

}

// トラブル例外クラス
class TroubleException extends Exception{}

// 社員抽象クラス
abstract class Employees{

    // 社員名
    protected String name;

    // 働く抽象メソッド
    public abstract void work(String workName) throws TroubleException;

}

// ここに上司クラスを作成してください
class Boss extends Employees {
	// 部下
	Subordinate sub;

	// コンストラクタ
	public Boss(String name, Subordinate sub) {
		super.name = name;
		this.sub = sub;
	}

	// 働く
	public void work(String workName) {
		// 部下インスタンスを生成
		Subordinate subordinate = new Subordinate(sub.name);

		try {
			System.out.println("さて、今回の" + workName + "は部下の" + sub.name + "に任せよう！");
			System.out.println();
			subordinate.work(workName);
			// 成功時
			System.out.println(sub.name + "君、よくやった!");
			System.out.println("さすが私の右腕だ!");

		} catch (TroubleException e) {
			System.out.println("申し訳ございません…");
			System.out.println(sub.name + "が大変失礼致しました…");
			System.out.println("上司のわたくし" + super.name + "の監督不行き届きでございます…");
		}

	}
}

// ここに部下クラスを作成してください
class Subordinate extends Employees{

	// コンストラクタ
	public Subordinate(String name) {
		super.name = name;
	}

	// 名前を取得する
	public String getName() {
		return super.name;
	}

	// 働く
	public void work(String workName) throws TroubleException {
		System.out.println("今回の" + workName + "は" + super.name + "が担当します。");
		System.out.println(workName + "中…");

		Random random = new Random();
		if(random.nextBoolean()) {
			System.out.println("ふざけるな、ばか野郎！");
			throw new TroubleException();
		}else {
			System.out.println("今回の" + workName + "は" + super.name + "が無事任務を果たしました");
		}
		System.out.println();
	}

}
