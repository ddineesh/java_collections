package java_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetCollectionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Character> characters = 	List.of('A','Z','A','B','Z','F');
		
		Set<Character> treeSet=new TreeSet<>(characters);
		
		System.out.println("Tree Set:"+treeSet);
		

		Set<Character> linketHashSet=new LinkedHashSet<>(characters);
		
		System.out.println("Linked Hash Set:"+linketHashSet);
		
Set<Character> hashSet=new HashSet<>(characters);
		
		System.out.println("Hash Set:"+hashSet);
	}

}
