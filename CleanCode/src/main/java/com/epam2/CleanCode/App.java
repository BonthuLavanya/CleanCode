package com.epam2.CleanCode;
import java.util.*;
/**
 * Hello world!
 *
 */

public class App{
  
  public static String standardsofhouse()
  {
    return("\nThe  Standard of materials for HouseConstruction\n1:We use standard Materials\n2:We use Above standards\n3:We use High standard Materials\n4:We use High standard Materials and you can get fully automated home");
  }
  public static String cost_of_selected_standard(int housestandard)
  {
    String a="";
    if(housestandard==1)
    {
      a=a+"Construction cost per Square feet is:Rs.1200\n";
    }
    else if(housestandard==2)
    {
      a=a+"Construction cost per Square feet is:Rs.1500\n";
    }
    else if(housestandard==3)
    {
      a=a+"Construction cost per Square feet is:Rs.1800\n";
    }
    else if(housestandard==4)
    {
      a=a+"Construction cost per Square feet is:Rs.2500\n";
    }
      a=a+"Enter 1 if you are ok with cost\nEnter 2 if you want to change your selection:";
    return a;
  }
  public static void main(String[]args){
   Scanner obj=new Scanner(System.in);
   System.out.println("Enter 1 to calculate S.I (or) Enter 2 to calculate C.I:");
   int input=obj.nextInt();
   double principal,rate_of_Interest,time,n;
   if(input==1)
   {
    System.out.print("Enter the Principal : ");
    principal = obj.nextDouble();
    System.out.print("Enter the Rate of interest : ");
    rate_of_Interest = obj.nextDouble();
    System.out.print("Enter the Time period : ");
    time = obj.nextDouble();
    Simple_Interest s=new Simple_Interest(principal,rate_of_Interest,time);
    System.out.print("Simple Interest is: " +s.calulatesi());
   }
   else
   {
    System.out.print("Enter the Principal : ");
    principal = obj.nextDouble();
    System.out.print("Enter the Rate of interest : ");
    rate_of_Interest = obj.nextDouble();
    System.out.print("Enter the Time period : ");
    time = obj.nextDouble();
    System.out.print("Enter the number of times the interest is : ");
    n = obj.nextDouble();
    Compound_Interest c=new Compound_Interest(principal,rate_of_Interest,time,n);
    System.out.println("Compond Interest is " +c.calulateci());
   }
   int amount=0,decision=0,no_of_sqfeets=0;
    System.out.println(standardsofhouse());
    System.out.println("Choose  Standard of materials for HouseConstruction:");
    int housestandard=obj.nextInt();
    System.out.println(cost_of_selected_standard(housestandard));
    decision=obj.nextInt();
    while(decision!=1)
    {
      System.out.println(standardsofhouse());
      housestandard=obj.nextInt();
      System.out.println(cost_of_selected_standard(housestandard));
      decision=obj.nextInt();
    }
    if(housestandard==1)
    {
      amount=1200;
    }
    else if(housestandard==2)
    {
      amount=1500;
    }
    else if(housestandard==3)
    {
      amount=1800;
    }
    else 
    {
      amount=2500;
    }
    System.out.println("Enter no.of Squarefeets:");
    no_of_sqfeets=obj.nextInt();
    amount=amount*no_of_sqfeets;
    System.out.println("The total cost for construction is:Rs."+amount);
    obj.close();
  }
}