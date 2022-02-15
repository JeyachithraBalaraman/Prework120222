package Prework;
import java.util.Scanner;
public class Prework140222 {

	//main method which contains switch and do while loop

    public static void main(String[] args) {

              int choice;

              Scanner sc = new Scanner(System.in);

do {
System.out.println();	
System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

choice = sc.nextInt();

switch (choice) {

case(0):

choice = 0;

break;


case (1): {

		
		    	   System.out.println("Enter number for Palindrome check");
		    	   long num=sc.nextLong();
		    	 
		    	   long revNum=0;
		    	   long num1=num;
		    	   long digit=0;
		    	   for (long i=10;num!=0;)
		    	   {
		    		   
		    		   digit=num%10;
		    		   num=num/10;
		    		   revNum=(revNum*i)+digit;
		    		  
		    	   }
		    	   
		    	   if (num1==revNum) 
		    	   
		    		   System.out.println(num1+" is a Palindrome");
		    	       
		    	   
		    		   else 
		    	     
	                   System.out.println(num1+" is not a Palindrome");
	               
		      
break;
}
case 2: {
	    	   System.out.println("Enter number of rows of stars");
		    	   int row=sc.nextInt();
	   	           
		    	   for (int i=row;i<=row&&i!=0;i=i-1)
		    	   {
		    		  System.out.println();
		    		  for (int j=1;j<=i;j++)
		    		  {
		    		  System.out.print("*");
		    		  }
		    	   }


break;
}
case 3: {

    	   System.out.println("Enter number to check for Prime/Composite");
    	   int num =sc.nextInt();
    	   int count = 0;
    	   for ( int i=2;i<num;i++) 
    	   {
    		  if (num%i==0)
    			  count=count+1;
    		 
    	   }
    	   if (count!=0)
    		   System.out.println(num + " is a composite number");
    	   else
    		   System.out.println(num +" is a prime number");
	         	   
      
break;
}
case 4: {

			        	    	   System.out.println("Enter number of terms - Fibonacci series");
						    	   int num =sc.nextInt();
						    	   int i=0;
						    	   int next=0; 
						    	   int j=1;
						    	   
						    	   if ( num == 0 || num == 1)
						    		   System.out.print(i);
						    	   else if (num == 2)
						    		   System.out.print(i + "," + j);
						    		   else if (num > 2)
						    		   {
						    			   System.out.print(i + "," +j);
						    		       for (int k=3;k<=num;k++)
						    		       {
						    		    	   next=i+j;
						    		    	   System.out.print(","+next);
						    		    	   i=j;
						    		    	   j=next;
						    		       }	   
						    		   }
						    	   
break;
}
default:
        System.out.println("Invalid choice. Enter a valid no.\n");
}     
} while (choice != 0);

System.out.println("Exited Successfully!!!");
}


	

}
