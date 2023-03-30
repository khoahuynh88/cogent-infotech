package pkg;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
public class StudentTest {
public static void main(String[] args) {
	Student st1 = new Student(1,4,"John");
	Student st2 = new Student(2,5,"Tom");
	
	List <Student> list = new ArrayList<>();
	list.add(st1);
	list.add(st2);
	
	Predicate <Integer> p = (s) -> s==2;
	
	for (Student student : list) {
		if (p.test(student.getRollNo())){
			System.out.println(student.getName());}
	}
}
}
