package java_collections;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import java_collections.pojo.StringLengthComparator;

public class QueueCollectionRunner {

	public static void main(String[] args) {

		Queue<String> queue=new PriorityQueue<>(); 
		
		//if the queue is empty the below method will returned null other it will return 
		//the next available object in the queue
		System.out.println(queue.poll());
		queue.offer("Apple");
		queue.offer("Orange");
		queue.offer("grapes");
		queue.offer("Banana");
		queue.addAll(List.of("Guva","Kivi","Jack furit"));
		System.out.println(" Queue : "+ queue);
		//now the poll method will return first available object ( techinically first inserted object i.e. Apple
		System.out.println(queue.poll());
		// once the object is poled from the queue, if will be removed from the queue 
		System.out.println(" Queue : "+ queue);

		//The below Comparator will sort the elements based on the string length of the queue objects
		
		Queue<String> stringLengthSortedQueue=new PriorityQueue<>(new StringLengthComparator());
		stringLengthSortedQueue.addAll(List.of("Guva","Apples","Orange","Kivi","Jack furit"));
		System.out.println(" Queue sorted based on the String Length : "+ stringLengthSortedQueue);
	}

}
