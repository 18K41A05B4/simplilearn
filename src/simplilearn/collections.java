package simplilearn;
import java.util.*;

public class collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(1);
		al.add(8);
		al.add(67);
		al.add(45);
		System.out.println(al);
		al.remove(1);
		al.sort(null);
		System.out.println(al);
		LinkedList l=new LinkedList();
		l.add(12);
		l.add(15);
		l.add(8);
		l.add(1, 34);
		l.sort(null);
		System.out.println(l);
		Vector<String> v=new Vector<String>();
		v.add("chinnu");
		v.add("Varun tej");
		v.add("krithika");
		v.add("sanvika");
		v.add("Vinnu");
		System.out.println(v);
		v.removeAllElements();
		System.out.println(v);
		PriorityQueue q=new PriorityQueue();
		q.add("chinnu");
		q.add("chinku");
		q.add("chinni");
		q.add("minni");
		q.add("vinnu");
		q.peek();
		System.out.println(q);
		
		
		

	}

}
