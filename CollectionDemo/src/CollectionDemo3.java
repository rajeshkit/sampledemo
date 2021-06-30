import java.util.TreeMap;

public class CollectionDemo3 {
	public static void main(String[] args) {
		TreeMap<String,String> hm=new TreeMap<String,String>();
		hm.put("600000", "Chennai");
		hm.put("200000", "mumbai");
		hm.put("200000", "Kashmir");
		hm.put("300000", "hYB");
		hm.put("900000", "Gujrat");
		
		Customer c1=new Customer();
		c1.setId(100);c1.setName("vijay");
		Customer c2=new Customer();
		c2.setId(200);c2.setName("kanika");
		Customer c3=new Customer();
		c3.setId(300);c3.setName("rahul");
		Customer c4=new Customer();
		c4.setId(400);c4.setName("manish");
		
		TreeMap<String,Customer> hm1=new TreeMap<String,Customer>();
		hm1.put("600000", c1);
		hm1.put("200000", c2);
		hm1.put("200000", c3);
		hm1.put("300000", c4);
	
		
		System.out.println(hm.entrySet());
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		
		
		
		
		
		
			
	}
}
