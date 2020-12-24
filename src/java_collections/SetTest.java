package java_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	

	public static void main(String...strings)
	{
		System.out.println("=================================s");	
		Set set= Set.of("Cricket","Hockey","Baseball","Soccer");
		System.out.println(set);
		System.out.println("=================================s");
		Set hashSet=new HashSet<>(set);
		System.out.println(hashSet);
		hashSet.add("BasketBall");
		System.out.println("=================================s");
		System.out.println(hashSet);
		//Hash set will not store the values in the same order which it inserted
		Set linkedHSet =new LinkedHashSet<>(set);
		System.out.println("=================================s");
		linkedHSet.add("BasketBall");
		System.out.println(linkedHSet);
		Set treeSet=new TreeSet<>(set);

		System.out.println("=================================s");
		treeSet.add("BasketBall");
		System.out.println(treeSet);
	}
}
