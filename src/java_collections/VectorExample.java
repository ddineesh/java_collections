package java_collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		Vector<String>  vector= new Vector<String>();
		vector.add("Jill");
		vector.add("Jack");
		vector.add("Jang");
		
		Iterator<String> iterator=vector.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}
