package com.tnsif.miniproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Operations
{
   public static Scanner in;
   public static Connection con;
   static
   {
  in=new Scanner(System.in);
  try
  {
  con=DB_Connection.getConnection();
  }
  catch(SQLException e)
  {
 e.printStackTrace();
  }
   }
public static int insert() throws SQLException
   {
String emp_name,designation,location;
int id;
double salary;

System.out.println("Insert Operation");
System.out.println("id:");
id=in.nextInt();
System.out.println("employee name:");
emp_name=in.next();
System.out.println("designation:");
designation=in.next();
System.out.println("location:");
location=in.next();
System.out.println("salary:");
salary=in.nextDouble();

String query= ("INSERT INTO employees values(?,?,?,?,?)");
PreparedStatement pt=con.prepareStatement(query);
pt.setInt(1, id);
pt.setString(2,emp_name);
pt.setString(3,designation);
pt.setString(4,location);
pt.setDouble(5,salary);
int rowsAffected= pt.executeUpdate();
return rowsAffected;
}
//delete opertaion
public static int delete() throws SQLException
{
System.out.println("Delete Operation");
int id,rowsAffected;
System.out.println("Enter Employee id:");
id=in.nextInt();
String query=("DELETE FROM employees where employee_id="+id+";");
Statement st= con.createStatement();
rowsAffected=st.executeUpdate(query);
return rowsAffected;
}
public static void show() throws SQLException
{
String query="SELECT * FROM employees";
Statement st= con.createStatement();
ResultSet rs=st.executeQuery(query);
String line="____________________________";
line=line.replace("_","_");
System.out.printf("%s\n%-4s%-30s%-25s%-10s%-10s\n%s\n",line,"id","emp_Name","designation","location","salary",line);
while(rs.next())
{
System.out.printf("%-4d%-30s%-25s%-10s%-10s\n%s\n",rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),line);
}

}
public static int update() throws SQLException
{
 System.out.println("Update Operation");
 int id,rowsAffected,option;
 String query;
 String[] columns = {"id","emp_name","designation","location","salary"};
 id = in.nextInt();
 System.out.println("Choose which column to update : \n1.id\n2.emp_name\n3.designation\n4.location\n5.salary");
 option = in.nextInt();
 if( option>4||option<1)
 {
System.out.println("Invalid Column!");
return 0;
 }
 System.out.println("Enter "+columns[option-1]+" updated value : ");
 if(option != 4)
 {
in.nextLine();
String val = in.nextLine();
query = "UPDATE employees SET "+columns[option-1]+"="+"'"+val+"' WHERE employee_id="+id;
 }
 else
 {
int val = in.nextInt();
query = "UPDATE employees SET "+columns[option-1]+"="+val+" WHERE employee_id="+id;
in.nextLine();
 }
 Statement st = con.createStatement();
 rowsAffected = st.executeUpdate(query);
 return rowsAffected;
 }

}
