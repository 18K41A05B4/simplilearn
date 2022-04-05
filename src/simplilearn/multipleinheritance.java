package simplilearn;
interface calci1{
	void add();
}
interface calci2{
	void sub();
}
class calci implements calci1,calci2{
	public void add() {
		System.out.println("Inside add");
	}
	public void sub() {
		System.out.println("Inside sub");
	}
}

public class multipleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calci c1=new calci();
		c1.add();
		c1.sub();

	}

}
