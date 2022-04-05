package simplilearn;
import java.util.Scanner;
class set{
	void display1() throws Exception{
		System.out.println("disp1 started");
		try {
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
		catch(Exception e) {
			System.out.println("Exception handled");
			throw e;
		}
		finally {
			System.out.println("disp1 terminated");
		}
	}
}

public class exceptionthrows1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started");
		set s1=new set();
		try {
			s1.display1();
		}
		catch(Exception e) {
			System.out.println("Exception handled in main");
		}
		System.out.println("Main terminated");

	}

}
