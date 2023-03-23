package gl.itp.hyd65.cs123.khoa;

public class Greeter {
String name;

public Greeter(String name) {
	super();
	this.name = name;
}

public void sayHello(){System.out.println("Hello "+ this.name);}

public void sayGoodBye(){System.out.println("Good bye" + this.name);}
}
