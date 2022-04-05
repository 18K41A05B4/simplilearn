package simplilearn;
class MyException extends Exception{
	String str1;
	MyException(String str2){
		str1=str2;
	}
	public String toString() {
		return("My exception occured:"+str1);
	}
}

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Try block started");
			throw new MyException("This is my error msg");
		}
		catch(MyException exp) {
			System.out.println("catch block");
			System.out.println(exp);
		}

	}

}
