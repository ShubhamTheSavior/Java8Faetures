package predicates;

import java.util.function.Predicate;

public class GatesPredicates {

	public static void main(String[] args) {
		
		Integer[] data=new Integer[] {0,10,22,15,30,55,90};

		Predicate<Integer> p1=i->i%2==0;
		Predicate<Integer> p2=i->i>10;
		
		for (Integer integer : data) {
			if(p1.and(p2).test(integer)) {
				System.out.println(integer);
			}
			if(p1.or(p2).test(integer)) {
				System.out.println("----------");
				System.out.println(integer);
			}
			if(p1.negate().test(integer)) {
				System.out.println("----------");
				System.out.println(integer);
			}
		}
	}

}
