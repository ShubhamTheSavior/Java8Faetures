package collectionslambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ObjectCollection {

	public static void main(String[] args) {
		Student s1=new Student("shubham",1000);
		Student s2=new Student("rushabh",1657);
		Student s3=new Student("ak",2598);
		Student s4=new Student("mom",1250);
		
		List<Student> s=new ArrayList<>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		
		System.out.println(s);
		
		Comparator<Student> c=( i1, i2)->{
			return (i1.getMarks()<i2.getMarks()?-1:(i1.getMarks()>i2.getMarks()?+1:0));
		};
		
		Collections.sort(s,c);
		
		System.out.println(s);
		
		Comparator<Student> c1=(l1,l2)->{return l1.getName().compareTo(l2.getName());};
		
		Collections.sort(s,c1);
		
		System.out.println(s);

	}

}
