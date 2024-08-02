package com.SanthiyaK.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo 
{
 public static void main(String[] args)
 {
	 LinkedList<Integer> linkedlist=new LinkedList();
	 linkedlist.add(10);
	 linkedlist.add(20);
     linkedlist.add(40);
     linkedlist.addFirst(5);
     linkedlist.add(2,60);
     linkedlist.add(40);
     System.out.println("Number List is"+linkedlist);
     System.out.println("First element is "+linkedlist.getFirst());
     System.out.println("Last element is "+linkedlist.getLast());
     linkedlist.removeFirst();
     linkedlist.removeLast();
     System.out.println("Number List after removing first and Last element is"+linkedlist);
     ListIterator<Integer> li=linkedlist.listIterator();
     System.out.println(li.next()+"\t");
     li=linkedlist.listIterator(linkedlist.size());
     while(li.hasNext());
     {
    	 int n=li.previous();
    	 System.out.println(n+"\t");
    	 if(n==20)
    		 li.add(9999);
    	 if(n==60)
    		 li.set(5555);
     }
     System.out.println("Number list is:"+linkedlist);
     Collections.sort(linkedlist);
     System.out.println("Number List in Ascending Order"+linkedlist);
     Collections.sort(linkedlist);
     System.out.println("Number List in Descending Order"+linkedlist);
 }
 
}
