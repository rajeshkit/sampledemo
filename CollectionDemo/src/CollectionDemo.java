import java.util.TreeSet;

public class CollectionDemo {
	public static void main(String[] args) {
			TreeSet<String> al=new TreeSet<String>();//909090
			al.add("Rajesh");
			al.add("Revature");
			al.add("USA");
			al.add("chennai");
			al.add("USA");
			al.add(null);
			al.add("Java Batch");
			
			System.out.println(al);
			
//			// basic for loop
//			
//			// for each
//			for(String s:al) {
//				System.out.println(s.toString());
//			}
//			// iterator
//			Iterator<String> itr=al.iterator();
//			while(itr.hasNext()){
//				System.out.println(itr.next());
//			}
//			// forEach - jdk 1.8
//			
//			ArrayList al1=new ArrayList();
//			al1.add(45.5f);// before it gets added to arraylist al1
//						   //  interanlly jvm will convert from primitive type
//						  // to reference type Float.valueOf(45.5f);
//			al1.add(4.5f);
//			al1.add(47.5f);
//			al1.add(6.7f);
	}
	
}
