package BiPredicate;

import java.util.function.BiPredicate;

public class Test {

	public static void main(String[] args) {
		
		BiPredicate<String,String> biPredicate=(a,b)->{
			if(a.equals(b))
				return true;
			else
				return false;
		};

		System.out.println(biPredicate.test("shubham", "rushabh"));
		System.out.println(biPredicate.test("shubham", "shubham"));
	}

}
