package simplilearn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailvalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pt="[a-z]+@[a-z]+.com";
		String s="simplilearn.com";
		Pattern p=Pattern.compile(pt);
		Matcher t=p.matcher(s);
		if(t.find()) {
			System.out.println("Email is valid");
		}
		else {
			System.out.println("Email is not valid");
			
		}
		
		

	}

}
