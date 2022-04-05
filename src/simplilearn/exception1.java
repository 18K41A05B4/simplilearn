package simplilearn;


public class exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[3];
		try {
			a[5]=2;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is out of bounds");
		}
		catch(Exception exp) {
			System.out.println("Generic catch");
		}
		finally {
			System.out.println("Array length:"+a.length);
		}

	}

}
