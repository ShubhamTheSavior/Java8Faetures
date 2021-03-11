package maps;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		
		List<Integer> marks=new ArrayList<Integer>();
		
		for(int i=5;i<=50;i=i+5) {
			marks.add(i);
		}
		System.out.println(marks);
		
		List<Integer> evenMarks=marks.stream().map(i->i+5).collect(Collectors.toList());
		
		System.out.println(evenMarks);
		
	}
}
