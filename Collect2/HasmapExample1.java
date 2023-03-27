package Collect2;
import java.util.*;

public class HasmapExample1 {
	public static void main(String[] args) {
		HashMap<String,Long> hm = new HashMap<>();
		hm.put("mani", 9995297836l);
		hm.put("mathan", 8635286547l);
		//System.out.println(hm.get("mani"));
		
		for(String k : hm.keySet()) {
			//System.out.println(k);
			//System.out.println(hm.get(k));
		}
		for(Long l:hm.values()) {
			System.out.println(l);
		}
		//hm.forEach(k,l)->System.out.println(k+","+l);
		
	}

}
