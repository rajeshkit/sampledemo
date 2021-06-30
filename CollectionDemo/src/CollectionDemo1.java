import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo1 {
	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setId(100);c1.setName("vijay");
		Customer c2=new Customer();
		c2.setId(200);c2.setName("kanika");
		Customer c3=new Customer();
		c3.setId(300);c3.setName("rahul");
		Customer c4=new Customer();
		c4.setId(400);c4.setName("manish");
		
		ArrayList<Customer> clist=new ArrayList<Customer>();
		clist.add(c1);
		clist.add(c2);
		clist.add(c3);
		clist.add(c4);
		for(Customer cust:clist) {
			if(cust.getId()==300) {
				System.out.println(cust.toString());
			}
		}
		
		Iterator<Customer> itr = clist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
		
	}
}
