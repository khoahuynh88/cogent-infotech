package cogent.collection;

import java.util.*;
public class Student {
	
Scanner sc = new Scanner(System.in);	
 private List<String> names = new ArrayList<>();
 
 public void setNames(String name) {
	 
	 names.add(name);
 }
 
 public void printNames() {
	 System.out.println("All student name");
	 Iterator<String> itr = names.iterator(); 
	 while(itr.hasNext()) {
	System.out.println(itr.next());
 }
 }	 
 
public void searchName(String name) {
	
	if (names.contains(name)) {System.out.println("Student exit");}
	else System.out.println("Student not exit");
}	 

public void searchName(int index) {
	try{
		System.out.println(names.get(index));
		} catch (Exception e) {System.out.println("Ther is no student");}
 }

public void removeName(String name) {
	names.remove(name);
	
}
}