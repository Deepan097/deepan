package company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Linked {
	public static void main(String[] args) {
		
	List<Integer> l  = new ArrayList<Integer>();
	l.add(10);
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	l.add(50);
	l.add(60);
	
	
	Set s=new  LinkedHashSet();
	s.addAll(l);
	
	System.out.println("*********Task 6 ******");
	System.out.println("list is :"+l);
	System.out.println("set is :"+s);
	
	
	
	System.out.println("*********** Task 7********");
	int size = l.size();
	int size2 = s.size();
	System.out.println("list size is:"+ size);
	System.out.println( "set size is"+ size2);
	
	System.out.println("************ Task8********");
	Object index = l.get(size-1);
	System.out.println("\t"+index);
	
	
	System.out.println("***********Task9**********");
	for (int i = 0; i < 5; i++) {
		System.out.println(l.get(i));
	}
	System.out.println("***********Task10***********************");
	                               
	System.out.println("middleindex"+l.get(size/2));
	System.out.println("**************Task11***");
	for (int i = size-5; i <size; i++) {
		System.out.println(l.get(i));
	}
	
	System.out.println("**************Task12***");	
	for (int i = 0; i < size; i=i+2) {
		System.out.println(l.get(i));
	}
	
	System.out.println("**************Task13***");
	for (int i = 0; i < size; i++) {
		System.out.println(l.get(i));
	}
		
	System.out.println("**************Task14***");
	for (int obj : l) {
		System.out.println(obj);
	}
	
	System.out.println("**************Task15***");
	System.out.println(l.get(0));
	}

}