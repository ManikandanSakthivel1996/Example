package Collect3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class liInt {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 5;
		int f = 6;
		int g = 7;
		int h = 10;
		int i = 9;
		int j = 10;
		ArrayList<Integer> number = new ArrayList<>();
		number.add(a);
		number.add(b);
		number.add(c);
		number.add(d);
		number.add(e);
		number.add(f);
		number.add(g);
		number.add(h);
		number.add(i);
		number.add(j);
		
		//List<Integer>num=number.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		//List<Integer>num=number.stream().limit(4).collect(Collectors.toList());
		//List<Integer>num=number.stream().skip(4).limit(2).collect(Collectors.toList());
		List<Integer>num=number.stream().distinct().collect(Collectors.toList());
		//List<Integer>num=numb.collect(Collectors.toList());
		//boolean num=number.stream().anyMatch(y->y==10);
		System.out.println(num);
		//num.forEach(x->System.out.println(x));
		}
	}