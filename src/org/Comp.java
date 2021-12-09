package org;

import java.util.ArrayList;
import java.util.List;

public class Comp {
public static void main(String[] args) {

List li = new ArrayList();
	li.add(10);
	li.add("java");
	li.add('m');
	li.add(true);
	li.add(7777.8678f);
	li.add(50);
	System.out.println(li);
	//to find the size of list
	int size = li.size();
	System.out.println(size);
	//to get particular value from list
	Object object = li.get(5);
	System.out.println(object);
}
	
	
}
