package BiFunction;

import java.util.function.BiFunction;

public class Test {

	public static void main(String[] args) {

		BiFunction<Integer,Integer,Integer> biFunction=
				(a,b)->{
					return a+b;
				};
				
		System.out.println(biFunction.apply(10, 20));
	}

}
