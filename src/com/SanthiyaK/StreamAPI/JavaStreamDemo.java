package com.SanthiyaK.StreamAPI;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class JavaStreamDemo
{
	public static void main(String[] args)
	{
		
	}
public static void filterExample()
{
	List<Integer> list=Arrays.asList(3,4,12,20,25);
	list.stream()
	.filter(num->num % 5==0)
	.forEach(System.out::println);
}
public static void mapExample()
{
	List<Integer> list=new ArrayList<>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	List<Integer> result=list.stream()
			.map(x->x*2)
			.collect(Collectors.toList());
	System.out.println(result);
}
public static void flatmapExample()
{
	List<Integer> list=new ArrayList<>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	List<Integer> result=list.stream()
			.flatMap(x->Stream.of(x,x*x))
			.collect(Collectors.toList());
	System.out.println(result);
}
}
