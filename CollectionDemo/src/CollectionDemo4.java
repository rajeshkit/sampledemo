import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CollectionDemo4 {
	public static void main(String[] args) {
	
		TreeMap<String, String> hm = new TreeMap<String, String>();
		hm.put("600000", "Chennai");
		hm.put("200000", "mumbai");
		hm.put("200000", "Kashmir");
		hm.put("300000", "hYB");
		hm.put("900000", "Gujrat");
		
		for(Entry<String, String> h:hm.entrySet()) {
			System.out.println(h.getKey()+"  "+h.getValue());
		}	
		
		Iterator<Entry<String, String>> itr = hm.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<String, String> e=itr.next();
			System.out.println(e.getKey()+"  "+e.getValue());
		}
		
		for(String k:hm.keySet()) {
			System.out.println(hm.get(k));
		}
		
		Iterator<String> itr1= hm.keySet().iterator();
		while(itr1.hasNext()) {
			System.out.println(hm.get(itr1.next()));
		}

	}
}
