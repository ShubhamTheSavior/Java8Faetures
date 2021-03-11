package processing;

import java.util.ArrayList;
import java.util.List;


public class MinMaxMethods {

	public static void main(String[] args) {
		
		List<Integer> marks=new ArrayList<Integer>();
		
		for(int i=5;i<=50;i=i+5) {
			marks.add(i);
		}
		System.out.println(marks);
		
		Integer min=marks.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min);
		Integer max=marks.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(max);
	}

}
