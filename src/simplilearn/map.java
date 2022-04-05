package simplilearn;
import java.util.*;
import java.io.*;
public class map {
	public static void main(String args[]) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(1, "jungkook");
		h.put(2,"Kimtaehyung");
		h.put(3, "jimin");
		h.put(4, "jhope");
		h.put(5, "rm");
		h.put(6, "jin");
		h.put(7, "suga");
		System.out.println(h);
		System.out.println(h.get(2));
		for(Map.Entry m:h.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		TreeMap<Integer,String> t=new TreeMap<Integer,String>();
		t.put(1, "jungkook");
		t.put(2,"Kimtaehyung");
		t.put(3, "jimin");
		t.put(4, "jhope");
		t.put(5, "rm");
		t.put(6, "jin");
		t.put(7, "suga");
		System.out.println(t);
		System.out.println(t.get(7));
		for(Map.Entry m:h.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(1,"Telangana");
		ht.put(2,"Odisha");
		ht.put(3, "Telangana");
		System.out.println(ht);
		
		
	}

}
