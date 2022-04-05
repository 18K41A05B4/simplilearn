package simplilearn;
import java.util.*;
class Data{
	void disp() {
		System.out.println("object");
	}
}

public class trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int arr_size=sc.nextInt();
		int arr[]=new int[arr_size];
		System.out.println("Enter the position to insert");
		int arr_pos=sc.nextInt();
		System.out.println("enter the elment to be inserted");
		int arr_ele=sc.nextInt();
		arr[arr_pos]=arr_ele;
		System.out.println("Array activity ended");
		System.out.println("object activity ");
		Data d=new Data();
		d.disp();
		d=null;
		d.disp();
		System.out.println("object activity ended");
		System.out.println("Arithmetic activity");
		System.out.println("Enter value1");
		int v1=sc.nextInt();
		System.out.println("Enter value2");
		int v2=sc.nextInt();
		int res=v1/v2;
		System.out.println(res);
		System.out.println("Arithmetic activity terminated");
		

	}
		
		catch(ArithmeticException e1) {
			System.out.println("Arithmetic Exception handled");
		}
		catch(NullPointerException e) {
			System.out.println("Null pointer Exception handled");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of bounds Exception handled");
		}
		

}
}
