package simplilearn;

public class outerclass2 {
	private String msg="inner classes";
	void display() {
		class inner{
			void hello() {
				System.out.println(msg);
			}
		}
		inner l=new inner();
		l.hello();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerclass2 o=new outerclass2();
		o.display();

	}

}
