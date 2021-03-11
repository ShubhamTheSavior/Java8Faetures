package processing;

import java.util.ArrayList;
import java.util.List;

public class CountMethod {

	public static void main(String[] args) {
		
		List<Integer> marks=new ArrayList<Integer>();
		
		for(int i=5;i<=50;i=i+5) {
			marks.add(i);
		}
		System.out.println(marks);
		
		Long evenMarksCount=marks.stream().filter(i->i%2==0).count();
		
		System.out.println(evenMarksCount);
		
	}

}
