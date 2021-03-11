package collectionslambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {

	public static void main(String[] args) {
		List<Integer>l=new ArrayList<>();
		l.add(80);
		l.add(55);
		l.add(0);
		l.add(100);
		/*
		 * System.out.println(l); Collections.sort(l, new MyComparator());
		 * System.out.println(l);
		 */
		
		Comparator<Integer> c=(Integer o1,Integer o2)->{
			return (o1<o2)?-1:(o1>o2)?1:0;
		};
		System.out.println(l);
		Collections.sort(l,c);
		System.out.println(l);
		
		l.stream().forEach(System.out::println);
		List<Integer> l2=l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
	}

}
