package simplilearn;
class code{
	void opr() throws ArithmeticException{
		int a=90,b=0,res;
		if(b==0) {
			throw(new ArithmeticException("can't divide by zero"));
		}
		else {
			res=a/b;
			System.out.println("The result is"+res);
		}
		System.out.println("End of the program");
	}
}

public class Throwdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		code c=new code();
		try {
			c.opr();
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
