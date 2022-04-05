package simplilearn;
class rt{
	int add(int a,int b) {
		return a+b;
	}
	float multi(int a,int b,int c) {
		return a+b+c;
	}
	double multi(int a,double b) {
		return a+b;
	}
	
}

public class returntype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rt o=new rt();
		System.out.println(o.add(10,20));
		System.out.println(o.multi(34, 63,8));
		System.out.println(o.multi(34, 63.3));

	}

}
