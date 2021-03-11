package processing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethod {

	public static void main(String[] args) {

		List<Integer> marks=new ArrayList<Integer>();
		
		marks.add(5);
		marks.add(17);
		marks.add(8);
		marks.add(56);
		marks.add(45);
		marks.add(89);
		marks.add(30);
		
		
		System.out.println(marks);
		
		List<Integer> naturalSorting=marks.stream().sorted().collect(Collectors.toList());
		
		System.out.println(naturalSorting);
		
		List<Integer> customisedSorting=marks.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		
		System.out.println(customisedSorting);
		
		Comparator<Integer> c=(a,b)->{
			if(a<b)
				return 1;
			else if(a>b)
				return -1;
			else
				return 0;
		};
		
		List<Integer> descendingSorting=marks.stream().sorted(c).collect(Collectors.toList());
		
		System.out.println(descendingSorting);
		
		List<Integer> descendingSorting1=marks.stream().sorted((a,b)->(a<b)?1:(a>b)?-1:0).collect(Collectors.toList());
		
		System.out.println(descendingSorting1);
		
		
	}
}
