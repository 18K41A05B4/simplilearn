package simplilearn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pt="[a-z]+";
		String check="welcome to the world";
		Pattern p=Pattern.compile(pt);
		System.out.println(p);
		Matcher c=p.matcher(check);
		while(c.find()) {
			System.out.println(c.group(0));
		}

	}
}
