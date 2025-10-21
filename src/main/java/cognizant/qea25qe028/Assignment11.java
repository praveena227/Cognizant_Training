package cognizant.qea25qe028;
import java.util.*;

public class Assignment11{

	//Question 1. Write a Java program to demonstrate the use of   collections (ArrayList)?
    static void demoArrayList() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        System.out.println("ArrayList: " + list);
    }

 // Question 2. Write a Java program to demonstrate the use of   collections (HashMap)?
    static void demoHashMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Math", 90);
        map.put("Science", 85);
        System.out.println("HashMap: " + map);
    }

 // Question 3. Write a Java program to demonstrate the use of   collections (HashSet)?
    static void demoHashSet() {
        HashSet<String> set = new HashSet<>(Arrays.asList("Red", "Green", "Blue", "Red"));
        System.out.println("HashSet: " + set);
    }

 // Question 4. Write a Java program to demonstrate the use of   collections (LinkedList)?
    static void demoLinkedList() {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("One", "Two", "Three"));
        System.out.println("LinkedList: " + list);
    }

 // Question 5. Write a Java program to demonstrate the use of   collections (TreeSet)?
    static void demoTreeSet() {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(5, 3, 8, 1));
        System.out.println("TreeSet: " + set);
    }

 // Question  6. Write a Java program to demonstrate the use of   collections (PriorityQueue)?
    static void demoPriorityQueue() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(20);
        System.out.println("PriorityQueue: " + pq);
    }

  //Question 7.  Write a Java program to demonstrate the use of   collections (Stack)?
    static void demoStack() {
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        System.out.println("Stack: " + stack);
    }

 // Question 8. Write a Java program to demonstrate the use of   collections (Vector)?
    static void demoVector() {
        Vector<String> vector = new Vector<>(Arrays.asList("A", "B", "C"));
        System.out.println("Vector: " + vector);
    }

  //Question 9. Write a Java program to demonstrate the use of   collections (Deque)?
    static void demoDeque() {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("First");
        deque.addLast("Last");
        System.out.println("Deque: " + deque);
    }

 // Question 10. Write a Java program to demonstrate the use of   collections (LinkedHashMap)?
    static void demoLinkedHashMap() {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        System.out.println("LinkedHashMap: " + map);
    }

 // Question 11.Write a Java program to demonstrate the use of   collections (LinkedHashSet)?
    static void demoLinkedHashSet() {
        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList("Dog", "Cat", "Dog"));
        System.out.println("LinkedHashSet: " + set);
    }

 // Question 12. Find duplicates in a list
    static void findDuplicates(List<String> list) {
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        for (String item : list) {
            if (!seen.add(item)) {
                duplicates.add(item);
            }
        }
        System.out.println("Duplicates: " + duplicates);
    }

 // Question 13. Compare two HashMaps for equality
    static void compareHashMaps() {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        map1.put("A", 1);
        map2.put("A", 1);
        System.out.println("HashMaps equal: " + map1.equals(map2));
    }

    // Question 14–22: Creating various collections
    static void createCollections() {
    	// Question 14. Demonstrate creating an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
     // Question 15. Demonstrate creating a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
      //Question 16. Demonstrate creating a HashSet  
        HashSet<String> hashSet = new HashSet<>();
      //Question 17. Demonstrate creating a LinkedHashSet 
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
     // Question 18. Demonstrate creating a TreeSet 
        TreeSet<String> treeSet = new TreeSet<>();
     // Question 19. Demonstrate creating a PriorityQueue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
     // Question 20. Demonstrate creating a HashMap using the Map   interface  
        Map<String, String> hashMap = new HashMap<>();
     // Question 21. Demonstrate creating a LinkedHashMap 
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
     // Question 22. Demonstrate creating a TreeMap  
        TreeMap<String, String> treeMap = new TreeMap<>();

        System.out.println("ArrayList created: " + arrayList);
        System.out.println("LinkedList created: " + linkedList);
        System.out.println("HashSet created: " + hashSet);
        System.out.println("LinkedHashSet created: " + linkedHashSet);
        System.out.println("TreeSet created: " + treeSet);
        System.out.println("PriorityQueue created: " + priorityQueue);
        System.out.println("HashMap (via Map interface) created: " + hashMap);
        System.out.println("LinkedHashMap created: " + linkedHashMap);
        System.out.println("TreeMap created: " + treeMap);
    }

    public static void main(String[] args) {
        demoArrayList();
        demoHashMap();
        demoHashSet();
        demoLinkedList();
        demoTreeSet();
        demoPriorityQueue();
        demoStack();
        demoVector();
        demoDeque();
        demoLinkedHashMap();
        demoLinkedHashSet();
        findDuplicates(Arrays.asList("apple", "banana", "apple", "orange"));
        compareHashMaps();
        createCollections();
    }
}
