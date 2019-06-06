/*

    オーバーライドに関する基本問題

    目覚まし時計を表すAlarmClockクラスを作成してください。

    普通の時計を表すClockクラスはすでに完成しています。
    （変更しないでください）

    また、AlarmClockクラスを使用するOverrideBasicPracticeクラス
    のmainメソッドはすでに完成しています。（変更しないでください）

    [AlarmClockクラス]
    １．Clockクラスを継承します。

    ２．スーパークラスから受け継いだ３つのインスタンスフィールド
        (時・分・秒)のほかに、アラーム時刻(時・分)を表すalarmHourと
        alarmMinuteインスタンスフィールド（int型）を定義します。

    ３．５つの引数の値を受け取るコンストラクタを定義します。
        そのうち時・分・秒の３つの値は、スーパークラスのコンストラクタ
        を利用してインスタンスフィールドに受け渡します。

    ４．スーパークラスにあるshowDataインスタンスメソッドを適切にオーバーライド
        します。出力内容は、下記実行結果を参考にしてください。

    【実行結果】
    ただいまの時刻：10時15分30秒

    ただいまの時刻：15時45分20秒
    アラーム設定時刻：6時30分

*/
public class OverrideBasicPractice{

    public static void main(String[] args){

        // 普通の時計オブジェクトの生成
        Clock c1 = new Clock(10, 15, 30);

        // 普通の時計の情報の表示
        c1.showData();

        System.out.println();

        // 目覚まし時計オブジェクトの生成
        AlarmClock c2 = new AlarmClock(15, 45, 20, 6, 30);

        // 目覚まし時計の情報の表示
        c2.showData();

    }

}

// 時計クラス
class Clock{

    // 時分秒
    private int hour;
    private int minute;
    private int second;

    // コンストラクタ
    public Clock(int hour, int minute, int second){

        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    // 情報表示メソッド
    public void showData(){
        System.out.println("ただいまの時刻：" + hour + "時" + minute + "分" + second + "秒");
    }

}

// ここにAlarmClockクラスを作成してください
class AlarmClock extends Clock {
	// 時
	private int alarmHour;
    // 分
	private int alarmMinute;

	// コンストラクタ
	public AlarmClock(int hour, int minute, int second, int alarmHour, int alarmMinute) {
		super(hour,minute,second);
		this.alarmHour = alarmHour;
		this.alarmMinute = alarmMinute;
	}

	@Override
	public void showData() {
		super.showData();
		System.out.println("アラーム設定時刻：" + alarmHour + "時" + alarmMinute + "分");
	}

}
