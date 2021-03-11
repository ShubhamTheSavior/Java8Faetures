package jodatimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DateTime {
	public static void main(String[] args) {
		ArrayList<Object> a=new ArrayList<>();
		LocalDate ld=LocalDate.now();
		a.add(ld);
		int dd=ld.getDayOfMonth();
		a.add(dd);
		int mm=ld.getMonthValue();
		a.add(mm);
		int yy=ld.getYear();
		a.add(yy);
		System.out.println(a);
		
		ArrayList<Object> b=new ArrayList<>();
		LocalTime lt=LocalTime.now();
		b.add(lt);
		int h=lt.getHour();
		b.add(h);
		int m=lt.getMinute();
		b.add(m);
		int s=lt.getSecond();
		b.add(s);
		System.out.println(b);
		
		ArrayList<Object> c=new ArrayList<>();
		LocalDateTime ldt=LocalDateTime.now();
		c.add(ldt);
		LocalDateTime ldt1=LocalDateTime.of(1995,Month.APRIL,28,12,45);
		c.add(ldt1);
		System.out.println(c);
		
		
		ArrayList<Object> d=new ArrayList<>();
		ZoneId zi=ZoneId.systemDefault();
		d.add(zi);
		
		
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1989,06,15);
		Period p = Period.between(birthday,today);
		System.out.println(p.getYears()+"/"+p.getMonths()+"/"+p.getDays());
		
		
	
		
		
		
		
	}

}
