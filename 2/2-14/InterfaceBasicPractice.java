/*

    次の３つのインタフェースがあります。(変更しないでください) 
    ・飛行可能を表現するFlyableインタフェース(飛ぶfly抽象メソッドが定義されています)
	・水泳可能を表現するSwimableインタフェース(泳ぐswim抽象メソッドが定義されています) 
	・食事可能を表現するEatableインタフェース(食べるeat抽象メソッドが定義されています)

	また、食事可能インタフェースを実装した抽象クラスBirdが定義されています。(変更しないでください)
	ここでは、eatメソッドを実装していません。何故なら、鳥の種類によって食べるものが異なるからです。
	次の指示に従って具体的な鳥を表す３種類のクラスを作成してください。

	[つばめSwallowクラス]
	１．Bird抽象クラスを継承します。
	２．Flyableインタフェースを実装します。
	３．飛ぶメソッドと食べるメソッドを実装します。出力内容は下記実行結果を参考にしてください。

	[ペンギンPenguinクラス]
	１．Bird抽象クラスを継承します。
	２．Swimableインタフェースを実装します。
	３．泳ぐメソッドと食べるメソッドを実装します。出力内容は下記実行結果を参考にしてください。

	[カワセミAtthisクラス]
	１．Bird抽象クラスを継承します。
	２．FlyableとSwimableインタフェースを実装します。
	３．飛ぶメソッドと泳ぐメソッドと食べるメソッドを実装します。出力内容は下記実行結果を参考にしてください。
	また、InterfaceBasicPracticeクラスのmainメソッドは一部未完成です。

	次のように処理を実装してください。

	１．鳥配列オブジェクトを拡張for文でループします。
	２．食べるメソッドを実行します。
	３．もし飛行可能の鳥ならば飛ぶメソッドを実行します。
	４．もし水泳可能の鳥ならば泳ぐメソッドを実行します。

	【実行結果】
	つばめが虫を食べました。
	つばめがスイスイ飛んでます。
	ペンギンが魚を食べました。
	ペンギンがスイスイ泳いでいます。
	カワセミが子魚を食べました。
	カワセミがスイスイ飛んでます。
	カワセミがスイスイ泳いでいます。
*/
public class InterfaceBasicPractice{

    public static void main(String[] args){

        Birds[] birds = {new Swallow(), new Penguin(), new Atthis()};

        for(Birds bird: birds) {
        	// 食べる
        	bird.eat();

        	// 飛行可能な鳥の場合
        	if(bird instanceof Flyable) {
        		((Flyable) bird).fly();
        	}
        	// 水泳可能な鳥の場合
        	if(bird instanceof Swimable) {
        		((Swimable) bird).swim();
        	}
        }
    }
}

interface Flyable{
    void fly();
}

interface Swimable{
    void swim();
}

interface Eatable{
    void eat();
}

abstract class Birds implements Eatable{}

// つばめクラス
class Swallow extends Birds implements Flyable{
	@Override
	public void eat() {
		System.out.println("つばめが虫を食べました。");
	}
	@Override
	public void fly() {
		System.out.println("つばめがスイスイ飛んでます。");
	}
}

//ペンギンクラス
class Penguin extends Birds implements Swimable{
	@Override
	public void eat() {
		System.out.println("ペンギンが魚を食べました。");
	}
	@Override
	public void swim() {
		System.out.println("ペンギンがスイスイ泳いでいます。");
	}
}

//カワセミクラス
class Atthis extends Birds implements Flyable, Swimable{
	@Override
	public void eat() {
		System.out.println("カワセミが子魚を食べました。");
	}
	@Override
	public void fly() {
		System.out.println("カワセミがスイスイ飛んでます。");
	}
	@Override
	public void swim() {
		System.out.println("カワセミがスイスイ泳いでいます。");
	}
}
