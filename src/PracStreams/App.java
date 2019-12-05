package PracStreams;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> ls = new ArrayList<>(); 
		for (int i = 0; i< 11; i++) {
			ls.add(i);
		}
		
		ls.stream().max(Integer::compare).get();
		ls.stream().min(Integer::compare).get();
		
		ls.stream().filter(num -> num % 2 == 0).forEach(System.out::println);
		ls.stream().filter(num -> num % 2 != 0).forEach(System.out::println);
		
		
		ls.stream().reduce((identity, accumulator) -> identity + accumulator).get();
		
		ls.stream().map(i -> Math.pow(i, 2)).filter(i -> i %2 == 0).forEach(System.out :: println);
		
		
		
	}
	


}
