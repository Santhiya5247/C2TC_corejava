package com.SanthiyaK.Assignments;
import java.util.Scanner;
public class StudentDetails 

{

    public static void main(String[] args)

    {

        Scanner scanner = new Scanner(System.in);



        System.out.print("Enter full name: ");

        String fullName = scanner.nextLine();



        System.out.print("Enter initial: ");

        char initial = scanner.next().charAt(0);

        scanner.nextLine(); // Consume newline



        System.out.print("Enter roll number: ");

        int rollNumber = scanner.nextInt();

        scanner.nextLine(); // Consume newline



        System.out.print("Enter marks: ");

        int marks = scanner.nextInt();



        // Calculate grade based on marks

        char grade;

        if (marks >= 90) {

            grade = 'A';

        } else if (marks >= 80) {

            grade = 'B';

        } else if (marks >= 70) {

            grade = 'C';

        } else if (marks >= 60) {

            grade = 'D';

        } else {

            grade = 'F';

        }



        // Calculate percentage

        double percentage = (double) marks / 100 * 100;



        // Displaying student details

        System.out.println("\nStudent Details:");

        System.out.println("Full Name: " + fullName +"." +initial);

        System.out.println("Roll Number: " + rollNumber);

        System.out.println("Marks: " + marks);

        System.out.println("Grade: " + grade);

        System.out.println("Percentage: " + percentage + "%");



        

        scanner.close();

    }

}
