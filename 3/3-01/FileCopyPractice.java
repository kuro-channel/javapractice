import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*

    ファイル入出力に関する問題

    FileCopyPracticeクラスのmainメソッドは未完成です。

    あるテキストファイルの内容を、別のテキストファイルにコピーする
    プログラムを作成してください。

    その方法は、コピー元ファイルからFileReaderクラスとBufferedReader
    クラスをうまく使ってデータを読み取り、そのデータをコピー先ファイル
    にFileWriterクラスとBufferedWriterクラスとPrintWriterクラスをうまく
    使って書き込みます。

    コピー元ファイル名およびコピー先ファイル名の指定にはコマンドライン
    引数を使用してください。

    >java FileCopyPractice コピー元ファイル名 コピー先ファイル名

    コマンドラインが不正（２つの文字列が渡ってこない）の場合は
    「２つのファイル名を正しく指定してください」と表示して
    プログラムを終了します。

    コピー元ファイルが見つからない場合はFileNotFoundExceptionがスロー
    されます。その際は「ファイル名の指定が不正です」と表示して
    プログラムを終了します。

    それ以外にもIOExceptionがスローされますので、そのときは
    「入出力エラーです」と表示してプログラムを終了します。

    オープンしたファイルは適切にクローズしてください。

 */
public class FileCopyPractice {

	public static void main(String[] args) {

		BufferedReader br = null;
		PrintWriter pw = null;
		if (args.length != 2) {
			System.out.println(" ２つのファイル名を正しく指定してください");
			return;
		}
		try {
			//コピー元ファイル名のオープン
			br = new BufferedReader(new FileReader(args[0]));
			//コピー先ファイル名のオープン
			pw = new PrintWriter(new BufferedWriter(new FileWriter(args[1])));

			String str;

			//コピー元ファイルから １行分の文字列を取得
			while ((str = br.readLine()) != null) {
				//取得した文字列をコピー先ファイルに書き込み
				pw.println(str);
			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイル名の指定が不正です");
		} catch (IOException e) {
			System.out.println("入出力エラーです");
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			// PrintWriterの closeメソッドは IOException例外を送出しないため
			if (pw != null) {
				pw.close();
			}
		}
	}
}
