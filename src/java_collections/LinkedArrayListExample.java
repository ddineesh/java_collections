package java_collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> firstArrayList=new LinkedList<String>();
		int counter=0;
		firstArrayList.add("Jill");
		firstArrayList.add("Jack");
		firstArrayList.add("Jang");
		//Since its List we can add duplicates
		firstArrayList.add("Jill");
		firstArrayList.add("Jack");
		firstArrayList.add("Jang");
		
		Iterator<String> iterator=firstArrayList.iterator();
		while(iterator.hasNext())
		{
			System.out.println(++counter+": "+iterator.next());
		}
	}

}
