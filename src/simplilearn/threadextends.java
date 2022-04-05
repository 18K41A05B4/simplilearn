package simplilearn;
class thrd extends Thread{
	public void run() {
		System.out.println("thread inside the thread class");
	}
}
class thrd4 extends Thread{
	public void run() {
		System.out.println("thread1 inside the thread class");
	}
}

public class threadextends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thrd t=new thrd();
		t.start();
		thrd4 t1=new thrd4();
		t1.start();

	}

}
