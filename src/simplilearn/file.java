package simplilearn;

import java.io.File;

public class file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("E:\\file.txt");
		System.out.println(f.exists());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.length());
		System.out.println(f.getParent());
		

	}

}
