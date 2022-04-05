package simplilearn;


import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		Double a,b,r;
		char op;
		 a=scan.nextDouble();
		 b=scan.nextDouble();
		 op=scan.next().charAt(0);
		switch(op) {
		     case '+':r=a+b;
		    	 System.out.print(r);
		          break;
		     case '-':r=a-b;
		    	 System.out.print(r);
	          break;
		     case '*':r=a*b;
		    	 System.out.print(r);
	          break;
		     case '/':r=a/b;
		    	 System.out.print(r);
	          break;
		     case '%':r=a%b;
		    	 System.out.print(r);
	          break;
	          default:System.out.println("Invalid operator");
	          break;
		
		}
		scan.close();

	}

	public void add() {
		// TODO Auto-generated method stub
		
	}

}
