package cogent.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArraylistDemo {
 public static void main(String[] args) {
	
		/*
		 * ArrayList<Integer> al = new ArrayList<>();
		 * 
		 * al.add(new Integer(20)); al.add(50);// Auto boxing // al.add("Cogent");
		 * 
		 * for (Object object : al) { String string = object.toString(); int a =
		 * Integer.parseInt(string); System.out.println("a: "+a); }
		 * 
		 * System.out.println("\n"); /// using Iterator
		 * 
		 * Iterator <Integer> itr = al.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); itr.remove(); } System.out.println("\n");
		 * System.out.println(al);
		 */
	 Scanner sc = new Scanner(System.in);
	 Student st = new Student();
	 String ans="";
	 do {
		 System.out.println("Do you want to add name?");
		 ans = sc.next();
		 if (ans.equalsIgnoreCase("yes")) {
	 System.out.println("Enter a name");
	 String name = sc.next();
	 st.setNames(name);}}
	 while (ans.equalsIgnoreCase("yes"));
	 
	System.out.println("\n"); 
	
	 st.printNames();
	 
	 System.out.println("\n"); 
	 st.searchName("khoa");
	 st.searchName("who");
	 System.out.println("\n"); 
	 st.searchName(0);
	 st.searchName(-1);
	 System.out.println("\n"); 
	 st.removeName("khoa");
	 st.printNames();
}
}
