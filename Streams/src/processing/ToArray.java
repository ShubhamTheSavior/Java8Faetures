package processing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToArray {

	public static void main(String[] args) {
		
		List<Integer> marks=new ArrayList<Integer>();
		
		for(int i=5;i<=50;i=i+5) {
			marks.add(i);
		}
		System.out.println(marks);
		
		List<Integer> evenMarks=marks.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		Integer[] ir=evenMarks.stream().toArray(Integer[]::new);
		
		for(Integer i: ir) {
			System.out.println(i);
			}
		
		Stream<Integer> s=Stream.of(99,999,9999,99999);
		s.forEach(System.out:: println);
		
		Double[] d={10.0,10.1,10.2,10.3};
		Stream<Double> s1=Stream.of(d);
		s1.forEach(System.out :: println);

	}

}
