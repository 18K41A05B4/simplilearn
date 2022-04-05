package simplilearn;
import java.util.*;

public class grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p;
		Scanner sc=new Scanner(System.in);
		p=sc.nextInt();
		if(p>=90) {
			System.out.println("A+ grade and Distinction");
		}
		else if(p>=80&&p<90) {
				System.out.println("A grade and First class with Distinction");
				
			}
		else if(p>=65&&p<80) {
			System.out.println("B+ grade and First class");
			
		}
		else if(p>=50&&p<65) {
			System.out.println("B grade and Second class");
			
		}
		else if(p>=0&&p<50) {
			System.out.println("C grade and Third class");
			
		}
		else {
			System.out.println("Fail");
				
		}
			
		

	}

}
