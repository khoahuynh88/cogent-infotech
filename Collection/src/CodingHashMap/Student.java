package CodingHashMap;

import java.util.HashMap;
import java.util.*;
public class Student {

	private HashMap<Integer,String> empNames = new HashMap<Integer,String>();
	Scanner sc = new Scanner(System.in);
	
	public void setNames() {
		System.out.println("Enet roll num");
		int num = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		
		empNames.put(num, name);
	}
	
	public void printNames() {
		Collection <String> names = empNames.values();
		System.out.println(names);
	}
	
	public void getNames (int key) {
		System.out.println(empNames.get(key));
		
	}
	
	public void printNamesKeySet() {
		Set <Integer> set = empNames.keySet();
		for (Integer integer : set) {
			System.out.println("Key: "+ integer + " Names: "+ empNames.get(integer));
		}
	}
	
	public void printSize() {
		System.out.println("Size "+ empNames.size());
	}
	public void remove (int key) {
		empNames.remove(key);
	}
}
