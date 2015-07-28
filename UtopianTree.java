import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class UtopianTree {

	public static void main(String[] args) {
	       
			int testCases;
			int[] cycleArry;
			Scanner in = new Scanner(System.in);
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	         try{
	        	 testCases = in.nextInt();
	        	 if(testCases<=10 && testCases>0){
	        		 cycleArry = new int[testCases];
		        	 System.out.println("Enter number of test cases");
		        	 for(int i=0; i<testCases; i++){
		        		 int cycle = in.nextInt();
		        		 if(cycle>=0 && cycle<=60){
		        			 cycleArry[i] =cycle;
		        		 }
		        		 else{
		        			 System.out.println("Cycle cannot be less than 0 or greater than 60");
		        			 System.exit(0);
		        		 }
		        				  
		        	 }
		        	 in.close();
		        	 int growth = 1;
		        	 for(int i=0; i<testCases; i++){
		        		
		        		 if(cycleArry[i]%2 == 0){
		        			 growth = (int) Math.pow(2, (cycleArry[i]/2)+1) - 1 ;
		        			
		        		 }
		        		 else{
		        			 growth = 2*((int) Math.pow(2, (cycleArry[i]/2)+1) - 1) ;
		        		 }
		        		 System.out.println(growth);	  
		        	 }
	        	 }
	        	 else{
	        		 System.out.println("TestCase cannot be less than 0 or greater than 10");
	        	 }
	         }
	         catch (InputMismatchException e) 
	         { 
	        	 System.out.println("Integers only, please."+e.getMessage()); 
	         }
	         catch(Exception e){
	        	 System.err.println(e.getMessage());
	         }
	}
}
	


