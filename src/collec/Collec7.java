package collec;
import java.util.ArrayList;

	public class Collec7{
		public static void main(String[] args)
		{ ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(13);
		l1.add("HELLO");
		l1.add('A');
		l1.add("%");
		
		
		System.out.println(l1);
		ArrayList l2=new ArrayList();
		l2.add(23);
		l2.add(898);
		l2.add("Hi");
		l2.add('A');
		l2.add("%");
		


		System.out.println(l2);
		System.out.println("***************************************");
		l1.removeAll(l2);
		System.out.println(l1);
		System.out.println(l1.retainAll(l2));
		System.out.println(l2);
		

		}
	}
