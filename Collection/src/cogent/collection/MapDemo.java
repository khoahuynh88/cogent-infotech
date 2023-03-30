package cogent.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map <String, Integer> map = new HashMap<>();

map.put("John", 30);
map.put("Tom", 20);
map.put("Lee", 18);

Set <String > keyset = map.keySet();

System.out.println(keyset);


Collection<Integer> values = map.values();
System.out.println(values);

for (String key : keyset) { System.out.println("Key:" + key+ " Value "+ map.get(key));
	
}

	}

}
