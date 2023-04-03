import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		HashSet<String>set= new HashSet<String>();
		String a = "For if dremas die";
		String b = "Life is a broken-winged bird";
		String c = " That cannot fly";
		set.add(a.toLowerCase());
		set.add(b.toLowerCase());
		set.add(c.toLowerCase());
		System.out.println(set);
		System.out.println(a.length());
		System.out.println(b.length());
		System.out.println(c.length());
		

	}

}
