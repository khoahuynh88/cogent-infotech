import gl.itp.hyd65.cs123.khoa.Advisor;
import gl.itp.hyd65.cs123.khoa.Greeter;

public class GreeterTest {
	public static void main(String[] args) {
		Greeter [] greeter = new Greeter[args.length];
		
		
		for (int i=0; i<args.length;i++)
		{
			greeter[i]= new Greeter(args[i]);
			greeter[i].sayHello();
		}
		
		Advisor a = new Advisor();
		 a.getAdvice();
		
		for (int i=0; i<args.length;i++)
		{
			greeter[i].sayGoodBye();
		}
	}
	
}
