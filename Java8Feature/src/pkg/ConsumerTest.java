package pkg;
import java.util.function.*;
public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer <String> c = (x) -> System.out.println(x.toLowerCase());
		c.accept("COGENT");
	}

}
