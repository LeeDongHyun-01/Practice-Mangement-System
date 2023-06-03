import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {

	public static void main(String[] args) {
		Date k = new Date();
		System.out.println(k);
		SimpleDateFormat w = new SimpleDateFormat("yyyy - MM - dd HH:mm:ss");
		try {
			FileOutputStream m = new FileOutputStream("TimeLog.txt");
			FileWriter a = new FileWriter("text.txt", true);
			PrintWriter b = new PrintWriter(a);
			b.println(w.format(k) + "Hold fast to dreams");
			//b.println(w.format(k) +"For if dreams die");
			//b.println(w.format(k) + "Life is a broken-winged bird");
			//b.println(w.format(k) + "That cannot fly");
			b.close();
			m.close();
			FileReader c = new FileReader("text.txt");

			int d;
			while((d = c.read()) != -1) {
				System.out.print((char) d);
			}
			c.close();
			
		}
		catch(FileNotFoundException a) {
			a.printStackTrace();
		}
		catch(IOException a) {
			a.printStackTrace();
		}
			

	}

}
