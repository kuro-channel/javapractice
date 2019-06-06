/*

    抽象に関する基本問題

    動物を表すAnimal抽象クラスはすでに完成しています。
    （変更しないでください）

    その中に、動物が鳴くことを表現している歌うsingメソッドがあります。
    しかし、歌うsingメソッドは抽象メソッドであり、中身は実装していません。
    何故なら、動物によって鳴き声が違うから実装できないのです。

    具体的な動物として、次の３つのクラスを作成してください。

    １．犬クラス Dog
    ２．猫クラス Cat
    ３．鳥クラス Bird

    下記の実行結果を参考にして、歌うsingメソッドを実装してください。

    また、AbstractBasicPracticeクラスのmainメソッドは未完成です。
    以下の手順に従ってmainメソッドを実装してください。

    １．３匹の動物たちを表すAnimal配列型変数animalsの宣言と
        配列オブジェクトの生成を行います。

    ２．動物たち配列変数の各要素に、順番に犬・猫・鳥オブジェクトを
        生成・代入します。

    ３．forループを使って動物たち配列変数を走査し、各動物の歌う
        singメソッドを呼び出します。

    【実行結果】
    わんわん
    にゃーにゃー
    ぴよぴよ

*/
public class AbstractBasicPractice{

    public static void main(String[] args){

        // ３匹の動物たちを表すAnimal配列型変数animals
        // の宣言と配列オブジェクトの生成
    	Animal[] animals = new Animal[3];

        // 動物たち配列変数の各要素に、順番に犬・猫・鳥
        // オブジェクトを生成・代入
    	animals[0] = new Dog();
    	animals[1] = new Cat();
    	animals[2] = new Bird();

        // forループを使って動物たち配列変数を走査し、
        // 各動物の歌うsingメソッドの呼び出し
    	for(Animal animal: animals) {
    		animal.sing();
    	}

    }

}

// 動物抽象クラス
abstract class Animal{
    public abstract void sing();
}

// ここにDogクラスを作成してください
class Dog extends Animal {
	@Override
	public void sing() {
		System.out.println("わんわん");
	}
}
// ここにCatクラスを作成してください
class Cat extends Animal {
	@Override
	public void sing() {
		System.out.println("にゃーにゃー");
	}
}
// ここにBirdクラスを作成してください
class Bird extends Animal {
	@Override
	public void sing() {
		System.out.println("ぴよぴよ");
	}
}
