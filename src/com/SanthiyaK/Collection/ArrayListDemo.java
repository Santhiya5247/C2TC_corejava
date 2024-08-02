package com.SanthiyaK.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
class ArrayListDemo
{
public static void main(String[] args)
{
    List list1 =new ArrayList();
	System.out.println("Size:"+list1.size());
	System.out.println("Is list is Empty?:"+list1.isEmpty());
	list1.add(10);
	list1.add(20);
	list1.add(true);
	list1.add(false);
	list1.add(20);
	list1.add("Hello");
	list1.add(56.78);
	list1.add(20);
	list1.add('A');
	list1.add(3,"Hi");
	list1.add(20);
	System.out.println("List is"+list1);
	System.out.println("IS this contain 16?:"+list1.contains(16));
	list1.remove(56.78);
	System.out.println("List is"+list1);
	
	
}
}
