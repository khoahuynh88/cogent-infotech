package CodingHashMap;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import sorting.Employee;

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1 = new TreeSet<>();
		
		set1.add( "Obama");
		set1.add("Tom");
		set1.add( "Khoa");
		set1.add("Rambo");
		set1.add( "Khoa");
		
		for (String st: set1) {
			System.out.println(st);
			
		}
		Object first = ((TreeSet<String>) set1).first();
		System.out.println("The first element "+first);
		
		Object last = ((TreeSet<String>) set1).last();
		System.out.println("The lest element " +last);
		
		set1.remove(last);
		
		 Iterator value = set1.iterator();
		  
	        // Displaying the values after iterating through the set
	        System.out.println("The iterator values are: ");
	        while (value.hasNext()) {
	            System.out.println(value.next());
	        }
	       System.out.println("check size"+set1.size() ); 
	}

}
