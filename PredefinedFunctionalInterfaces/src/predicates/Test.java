package predicates;

import java.util.function.Predicate;

public class Test implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		if(t>10) 
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		System.out.println(t.test(5));
		
		Predicate<Integer> p=t1->{
			if(t1>10) 
				return true;
			else
				return false;
		};
		
		System.out.println(p.test(15));
	}

}
