package filtering;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestOne {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(8);
		numbers.add(15);
		numbers.add(3);
		numbers.add(75);
		numbers.add(52);
		numbers.add(45);
		
		
		
		System.out.println(numbers);
		
		
		List<Integer> evennolist = new ArrayList<Integer>();
		
		for(int i=0;i<numbers.size();i++) {
			if((numbers.get(i)%2)==0)
			evennolist.add(numbers.get(i));
		}
		
		System.out.println(evennolist);
		
		
		List<Integer> aa=numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(aa);
		
		

	}

}
