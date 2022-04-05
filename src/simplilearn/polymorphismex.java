package simplilearn;
abstract class plane{
	public void takeoff() {
		System.out.println("Plane takeoff");
	}
	public void land() {
		System.out.println("plane lands slowly");
	}
	abstract void fly();
}
class cargoplane extends plane{
	

	@Override
	void fly() {
		System.out.println("This plane goes slowly");
		// TODO Auto-generated method stub
		
	}
	
}
public class polymorphismex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cargoplane c=new cargoplane();
		plane p;
		p=c;
		p.takeoff();
		p.land();
		p.fly();

	}

}
