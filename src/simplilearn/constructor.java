package simplilearn;
class car{
	String name,color;
	int carno,price;
	car(){
		System.out.println("Advanced car");
	}
	car(String a,String b,int c,int d){
		name=a;
		color=b;
		carno=c;
		price=d;
	}
	
}

public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car obj=new car();
		
		car obj2=new car("bugati","blue",12016,50000000);
		System.out.println(obj2.name);
		System.out.println(obj2.color);
		System.out.println(obj2.carno);
		System.out.println(obj2.price);

	}

}
