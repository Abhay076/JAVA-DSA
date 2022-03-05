import java.util.HashMap;
import java.util.Set;

public class InbuiltMapUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map=new HashMap<>();
		map.put("abc", 1);
		map.put("def", 3);
		map.put("ghi", 4);
		map.put("abc", 4);

		
		//presence
		if(map.containsKey("abc")) {
			System.out.println("map has abc");
		}
		if(map.containsKey("abc1")) {
			System.out.println("map has abc1");
		}
		//getValue
		int v=map.get("abc");
		System.out.println(v);
		
		int v1=0;
		if(map.containsKey("abc1")) {
			v=map.get("abc");
		}
		System.out.println(v1);
		
		//Remove
		map.remove("abc");
		if(map.containsKey("abc")) {
			System.out.println("map has abc");
		}
		
		//size
		System.out.println(map.size());
		
		//Iterative
		Set<String> keys=map.keySet();
		for(String s:keys) {
			System.out.println(s);
		}
		
		
		

	}

}
