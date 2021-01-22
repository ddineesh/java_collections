package java_collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArraysListExample {

	public static void main(String... args)
	{
		List<String> firstArrayList=new ArrayList<String>();
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
		
		
		List<String> synFirstArrayList=Collections.synchronizedList(firstArrayList);
		
		synchronized (synFirstArrayList) {
		      Iterator<String> i = synFirstArrayList.iterator(); // Must be in synchronized block
		      while (i.hasNext())
		          System.out.println(i.next());
		  }
		
	}
}
