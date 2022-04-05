package simplilearn;

public class outerclass {
	private String msg="welcome to java";
	class inner{
		void hello() {
			System.out.println(msg+",let us start");
		}
	}

	public static void main(String[] args) {
		outerclass ou=new outerclass();
		outerclass.inner in=ou.new inner();
		in.hello();
		// TODO Auto-generated method stub

	}

}
