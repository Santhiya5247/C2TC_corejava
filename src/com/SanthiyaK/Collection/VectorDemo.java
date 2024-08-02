package com.SanthiyaK.Collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo 
{
public static void main(String[] args)
{
	Vector<String> animals=new Vector<>();
	animals.add("cow");
	animals.add("Dog");
	animals.add("Horse");
	animals.add("cat");
	System.out.println("Initial vectors"+animals);
	String element=animals.get(2);
	System.out.println("Element at index 2:"+element);
	Iterator<String> iterate = animals.iterator();
	System.out.print("vector:\n");
	while(iterate.hasNext())
	{
		System.out.println(iterate.next());
		
	}
	element=animals.remove(1);
	System.out.println("Remove Element:"+element);
	System.out.println("New Vector"+animals);
	}
	

}
