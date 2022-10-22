package collec;

import java.util.ArrayList;

public class Collec5 {
	public static void main(String[] args)
	{ ArrayList l1=new ArrayList();
	l1.add(10);
	l1.add(13);
	l1.add("HELLO");
	l1.add('A');
	l1.add("%");
	if(l1.contains('A'))
	{
	System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	

	}
}
