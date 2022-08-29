package inheri;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List li=new ArrayList();
		li.add(10);
		li.add("Deepan");
		li.add(20);
		
		li.add(250);
		li.add('j');
		System.out.println(li);
		li.add(0, "hi");
		System.out.println(li);
		boolean contains = li.contains(10);
		System.out.println(contains);
		System.out.println(li);
		int size = li.size();
		System.out.println(size);
		li.remove(1);
		li.remove("Deepan");
		System.out.println(li);
		li.add(2, 255);
		li.set(2, "ji");
		System.out.println(li);
		System.out.println(li);
	
List li2=new LinkedList();
li2.addAll(li);
System.out.println(li2);
li2.add(150);
System.out.println(li2);
li2.removeAll(li2);
System.out.println(li2);




}}


