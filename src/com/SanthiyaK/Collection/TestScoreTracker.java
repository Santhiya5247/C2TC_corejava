package com.SanthiyaK.Collection;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class TestScoreTracker 
	{
	    public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);

	        // Input size of the array
	        System.out.println("Enter the size of the array:");
	        int n = scanner.nextInt();
	        
	        // Input elements into the array
	        int[] array = new int[n];
	        System.out.println("Enter " + n +"integers:");
	        for (int i = 0; i < n; i++) 
	        {
	            array[i] = scanner.nextInt();
	        }

	        // Convert array to ArrayList
	        ArrayList<Integer> arrayList = new ArrayList<>();
	        for (int num : array) 
	        {
	            arrayList.add(num);
	        }

	        // Output elements in the ArrayList
	        System.out.println("Elements in the ArrayList:");
	        for (int num : arrayList)
	        {
	            System.out.println(num);
	        }

	        scanner.close();
	    }
	}

