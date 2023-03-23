package cogent.infotech;

public class InstrumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Instrument t[]= new Instrument[3];

t[0]= new Piano();
t[1]= new Flute();
t[2]= new Guitar();

		for (int i=0; i<t.length; i++)
		{
			if(t[i] instanceof Piano){System.out.println("This is Pano");}
			if(t[i] instanceof Flute){System.out.println("This is Flure");}
			if(t[i] instanceof Guitar){System.out.println("This is Guitar");}
			t[i].play();
		}
	}

}
