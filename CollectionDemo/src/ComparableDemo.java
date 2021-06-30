import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
	public static void main(String[] args) {
		ArrayList<Float> al=new ArrayList<Float>();
		al.add(5.4f);
		al.add(3.5f);
		al.add(8.7f);
		al.add(6.7f);
		al.add(9.0f);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
	}
}
