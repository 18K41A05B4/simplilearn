package simplilearn;
import java.util.*;
class overageException extends Exception{
	public String toString() {
		return "age is over the limit";
	}
}
class underageException extends Exception{
	public String toString() {
		return "age is under the limit";
	}
}

public class customexception {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(age<18) {
			underageException u=new underageException();
			System.out.println(u.toString());
		}
		else if(age>65) {
			overageException o=new overageException();
			System.out.println(o.toString());
		}
		else {
			System.out.println("eligible for driving liscense");
		}

	}

}
