package pkg;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String > names = Arrays.asList("Tech", "Cogent", "Tutorial", "Tom", "Tina", "Amit");
		 Predicate<String> p = (s) -> s.startsWith ("T");
		 
		 for (String st : names) {
			if (p.test(st)) System.out.println(st);
		}
	}

}
