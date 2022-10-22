package collec;

import java.util.ArrayList;

public class Collec3 {
	public static void main(String[] args)
	{ ArrayList l1=new ArrayList();
	l1.add(10);
	l1.add(13);
	l1.add("HELLO");
	l1.add('A');
	l1.add("%");
	ArrayList l2=new ArrayList();
	l2.add(30);
	l2.add("I");
	l2.add("HELLO");
	System.out.println(l1);
	System.out.println(l2);
	System.out.println("****************************");
	l1.addAll(l2);
	System.out.println(l1);
	System.out.println(l2);
	
	}

}

