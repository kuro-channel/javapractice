/*

    コンストラクタとオーバーロードの問題

    車を表すCarクラスを作成してください。
    Carクラスを使用するConstructorOverloadPracticeクラスの
    mainメソッドはすでに完成しています。（変更しないでください）

    [Carクラス]
    １．車種を表すtypeインスタンスフィールド（String型）と、
        ナンバーを表すnumberインスタンスフィールド（int型）と、
        ガソリンを表すgasolineインスタンスフィールド（double型）の３つが
        あります。

    ２．コンストラクタをオーバーロードして２つ定義します。
        １つ目は、第一引数に車種、第二引数にナンバー、第三引数にガソリン
        を受け取り、引数の値をインスタンスフィールドに受け渡します。
        ２つ目は、第一引数に車種、第二引数にナンバーを受け取り、引数の値を
        インスタンスフィールドに受け渡します。ガソリンの量は初期値として
        5.0を設定します。

    ３．走行を表現するrunインスタンスメソッドを定義します。戻り値はなし、
        引数には走行する分のガソリン量(double型)を設定します。
        もし残ガソリン量が、走行ガソリン量よりも多い場合は
       「ナンバー○○の△△はガソリン○リットル分走行しました」と出力し、
        残ガソリン量を走行ガソリン量分減らします。
        もし残ガソリン量が、走行ガソリン量に満たない場合は、
       「ナンバー○○の△△はガソリン不足のため走行できません」と出力します。

    ４．車の情報を表示するshowInfoインスタンスメソッドを定義します。
        引数と戻り値はなしで、実装は下記実行結果を参考にしてください。

    【実行結果】
    ナンバー1234のトントはガソリン7.0リットル分走行しました
    ナンバー6789のファットはガソリン不足のため走行できません
    車種：トント　ナンバー：1234　ガソリン：3.0リットル
    車種：ファット　ナンバー：6789　ガソリン：5.0リットル

*/
public class ConstructorOverloadPractice{

    public static void main(String[] args){

        // １台目の車インスタンス生成
        Car car1 = new Car("トント", 1234, 10.0);

        // ２台目の車インスタンス生成
        Car car2 = new Car("ファット", 6789);

        // ２台の車を走行させる
        car1.run(7.0);
        car2.run(7.0);

        // ２台の車の情報を出力
        car1.showInfo();
        car2.showInfo();

    }

}

// ここにCarクラスを作成してください
class Car{
	private String type;
	private int number;
	private double gasoline;

	public Car(String type, int number, double gasoline) {
		this.type = type;
		this.number = number;
		this.gasoline = gasoline;
	}
	public Car(String type, int number) {
		this.type = type;
		this.number = number;
		this.gasoline = 5.0;
	}
	// 走行を表現するrunメソッド
	public void run(double gasoline) {
		if(this.gasoline >= gasoline) {
			this.gasoline -= gasoline;
			System.out.println("ナンバー" + this.number + "の" + this.type + "はガソリン" + gasoline + "リットル分走行しました");
		}else if(this.gasoline < gasoline) {
			System.out.println("ナンバー" + this.number + "の" + this.type + "はガソリン不足のため走行できません");
		}
	}
	// 車の情報を表示するshowInfoメソッド
	public void showInfo() {
		System.out.println("車種：" + this.type + " ナンバー：" + this.number +"　ガソリン：" + this.gasoline +"リットル");
	}
}
