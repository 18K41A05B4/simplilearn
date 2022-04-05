package simplilearn;

abstract class anonymousclass {
	public abstract void display();
}
public class abstractclass{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		anonymousclass a=new anonymousclass() {
			public void display() {
				System.out.println("abstrcat class cannot create object");
				
			}
		};
		a.display();

	}

}
