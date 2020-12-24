Java Collection Framework

The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.

Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.

Java Collection means a single unit of objects.  
Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes
(ArrayList ->performance O(1), Vector, LinkedList -> performance O(N), PriorityQueue, HashSet, LinkedHashSet, TreeSet).

List: 
  - it stores the objects with duplicate
  - ArrayList 
  - LinkedArrayList
  - Vector
  - Stack
 
 Set:
 
  - HashSet => Never care about insertion order or sorting order
  - LinkedHashSet => Never care about sorting order by it keeps the insertion order
  - TreeSet => Never care about insertion order by keeps the sorting order in ascending implements NavigableSet
  
 Queue:
 
  - PriorityQueue => Stores the objects in natural sorting order
  
 Map:
 
	- its part of the Collection frame work and only colection does not implement Collection interface
	- Both HashMap and HashTable used the Hashing technic
	- HashMap => Never care about order or sorting order and null allowed for the value
	- HashTable => Never care about order or sorting order. but its Synchornized meaning thread safe and key value should not be null
	- LinkedHashMap => 1. Never care about sorting order by it keeps the insertion order 
					   2. Insertion and Deletion is slower due to the above reason
					   3. Iteration will be faster
	- TreeMap => Never care about insertion order by keeps the sorting order in ascending implements NavigableMap
