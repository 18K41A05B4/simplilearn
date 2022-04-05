package simplilearn;

public class stringexmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("Hello,welcome to simplilearn");
		String s1="Hello world";
		System.out.println(s.charAt(5));
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.compareTo(s1));
		System.out.println(s.intern());
		System.out.println(s1.isEmpty());
		System.out.println(s.replace('H','J'));
		System.out.println(s.concat(s1));
		System.out.println(s.strip());
		
		StringBuffer sb=new StringBuffer("java programming");
		sb.append("hii");
		sb.deleteCharAt(0);
		sb.capacity();
		sb.insert(1, 'a');
		System.out.println(sb);
		StringBuilder sb1=new StringBuilder();
		sb1.append("Hello");
		sb1.replace(0, 1, "ja");
		sb1.reverse();
		sb1.hashCode();
		System.out.println(sb1);

	}

}
