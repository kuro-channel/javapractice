/*

    継承とインタフェースの問題

    ミュージシャンを表現するMusician抽象クラスは
    完成しています。(変更しないでください)

    また、歌唱可能を表現するSingableインタフェースと、
    演奏可能を表現するPlayableインタフェースも完成して
    います。(変更しないでください)

    あるバンドを構成するためにボーカリストVocalistクラス、
    ギタリストGuitaristクラス、コーラス＆ドラマーChorusDrummer
    クラスを作成してください。

    [Vocalistクラス]
    １．Musician抽象クラスを継承し、Singableインタフェースを実装します。

    ２．名前(String型)を受け取るコンストラクタを定義します。適切に値を
        保持してください。

    ３．歌うsingメソッドを実装してください。「○○は熱唱しました！」と
        出力してください。

    [Guitaristクラス]
    １．Musician抽象クラスを継承し、Playableインタフェースを実装します。

    ２．ギターの種類を表すguitarTypeインスタンスフィールド(String型)を持ちます。

    ３．第一引数に名前(String型)、第二引数にギターの種類(String型)を受け取る
        コンストラクタを定義します。適切に値を保持してください。

    ４．演奏playメソッドを実装してください。「○○は△△を演奏しました！」
        と出力してください。

    [ChorusDrummerクラス]
    １．Musician抽象クラスを継承し、Singableインタフェースと
        Playableインタフェースを実装します。

    ２．名前(String型)を受け取るコンストラクタを定義します。適切に値を
        保持してください。

    ３．歌うsingメソッドを実装してください。「○○はコーラスでハモりました！」
        と出力してください。

    ４．演奏playメソッドを実装してください。「○○はドラムを演奏しました！」
        と出力してください。

    また、InheritanceInterfacePracticeクラスのmainメソッドは一部未完成です。
    「ミュージックスタート！」以下を次のように実装してください。

    １．forループで走査します。
    ２．歌うことが可能であれば歌います。
    ３．演奏が可能であれば演奏します。

    【実行結果】
    桜井は熱唱しました！
    田原はリードギターを演奏しました！
    中川はベースを演奏しました！
    鈴木はコーラスでハモりました！
    鈴木はドラムを演奏しました！

*/
public class InheritanceInterfacePractice{

    public static void main(String[] args){

        // ミュージシャン配列の作成
        Musician[] band = {
                            new Vocalist("桜井"),
                            new Guitarist("田原","リードギター"),
                            new Guitarist("中川","ベース"),
                            new ChorusDrummer("鈴木")
                           };

        // ミュージックスタート！
        for(Musician musician: band) {
        	// 歌うことが可能
        	if(musician instanceof Singable) {
        		((Singable)musician).sing();
        	}
        	// 演奏することが可能
        	if(musician instanceof Playable) {
        		((Playable)musician).play();
        	}
        }
    }
}

// ミュージシャン抽象クラス
abstract class Musician{

    // 名前フィールド
    private String name;

    // コンストラクタ
    public Musician(String name){
        this.name = name;
    }

    // 名前取得メソッド
    public String getName(){
        return name;
    }

}

// 歌唱可能インタフェース
interface Singable{
    void sing();
}

// 演奏可能インタフェース
interface Playable{
    void play();
}

// ここにボーカリストクラスを作成してください
class Vocalist extends Musician implements Singable{
	// コンストラクタ
	public Vocalist(String name) {
		super(name);
	}
	@Override
	public void sing() {
		System.out.println(super.getName() + "は熱唱しました！");
	}
}
// ここにギタリストクラスを作成してください
class Guitarist extends Musician implements Playable{
	// ギターの種類
	private String guitarType;

	// コンストラクタ
	public Guitarist(String name, String guitarType) {
		super(name);
		this.guitarType = guitarType;
	}

	@Override
	public void play() {
		System.out.println(super.getName() + "は" + this.guitarType + "を演奏しました！");
	}
}


// ここにコーラス＆ドラマークラスを作成してください
class ChorusDrummer extends Musician implements Singable, Playable{
	// コンストラクタ
	public ChorusDrummer(String name) {
		super(name);
	}

	@Override
	public void sing() {
		System.out.println(super.getName() + "はコーラスでハモりました！");
	}

	@Override
	public void play() {
		System.out.println(super.getName() + "はドラムを演奏しました！");
	}
}
