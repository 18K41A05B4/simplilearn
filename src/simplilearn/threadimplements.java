package simplilearn;
class thrd1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread inside the thread class");
		
	}
	
}
class thrd2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread2 inside the thread class");
		
	}
	
}

public class threadimplements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thrd1 t1=new thrd1();
		Thread o=new Thread(t1);
		thrd2 t2=new thrd2();
		Thread o1=new Thread(t2);
		o.start();
		o1.start();

	}

}
