package simplilearn;
import java.util.*;
class set1{
	void display1() throws ArithmeticException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Arithmetic activity");
		System.out.println("Enter value1");
		int v1=sc.nextInt();
		System.out.println("Enter value2");
		int v2=sc.nextInt();
		int res=v1/v2;
		System.out.println(res);
		System.out.println("Arithmetic activity terminated");
	}
}
class set2{
	void display2() throws ArithmeticException{
		set1 s1=new set1();
		s1.display1();
	}
}
class set3{
	void display3() throws ArithmeticException{
		set2 s2=new set2();
		s2.display2();
	}
}

public class exceptionthrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		set3 s3=new set3();
		try {
			s3.display3();
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception handled");
		}

	}

}
