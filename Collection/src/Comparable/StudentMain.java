package Comparable;
import java.util.*;
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Student> st = new ArrayList<>();
		
		st.add(new Student(1,"a1"));
		st.add(new Student(2,"a3"));
		st.add(new Student(3,"a2"));
		st.add(new Student(4,"a4"));
		st.add(new Student(5,"a5"));
		
		for (Student student : st) {
			System.out.println(student.toString());
		}
		
		st.sort(new StudentComparator());
		
		System.out.println("After sort");

		for (Student student : st) {
			System.out.println(student.toString());
		}
	}

}
