/*
[Employeeクラス]
    Employeeクラスはフィールドとして社員番号(int型)と社員名(String型)の
    ２つの情報を保持します。

    Employeeクラスには次の３つのメソッドが必要です。
    １．社員番号と社員名をオブジェクトにセットするためのsetDataメソッド
    ２．社員番号の情報をオブジェクトから取得するためのgetIdメソッド
    ３．社員名の情報をオブジェクトから取得するためのgetNameメソッド
 */
public class Employee {

	// 社員番号
	private int id;

	// 社員名
	private String name;

	public void setData(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}

}
