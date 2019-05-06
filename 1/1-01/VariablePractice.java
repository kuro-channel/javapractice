/*
    変数に関する問題

    VariablePracticeクラスのmainメソッドのコメントの
    指示通りに、プログラムを記述してください。
    下記、【実行結果】と同じ内容が出力されればOKです。

    【実行結果】
    りんごの価格：130円
    りんごの個数：6個
    りんごの総価格：780円
*/
public class VariablePractice{

    public static void main(String[] args){

        // りんごの価格を表現するint型の変数を宣言してください
        // (変数名はお任せします)
    	int applePrice = 0;

        // りんごの価格変数に130を代入してください
    	applePrice = 130;

        // りんごの個数を表現するint型の変数を宣言し、
        // 初期値として6を代入してください（変数名はお任せします）
    	int appleQuantity = 6;

        // りんごの総価格を表現するint型の変数を宣言し、
        // 初期値にりんご価格変数の値×りんご個数変数の値の演算結果
        // を代入してください（変数名はお任せします）
    	int totalAppleAmount = applePrice * appleQuantity;

        // りんご価格変数の値を出力してください
    	System.out.println("りんごの価格:" + applePrice + "円");

        // りんご個数変数の値を出力してください
    	System.out.println("りんごの個数:" + appleQuantity + "個");

        // りんご総価格変数の値を出力してください
    	System.out.println("りんごの総価格:" + totalAppleAmount + "円");
    }

}
