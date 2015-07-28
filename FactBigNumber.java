import java.math.BigDecimal;
import java.util.Scanner;
public class FactBigNumber {

	   public static void main(String args[])
	   {
	     
	 
	      Scanner in = new Scanner(System.in);
	 
	      int number = in.nextInt();
	      BigDecimal fact = new BigDecimal(1);
	      if (number < 0)
	         System.out.println(1);
	      else
	      {
	         for (int i = 1 ; i <= number ; i++ )
	            fact = fact.multiply(new BigDecimal(i));
	 
	         System.out.println(fact);
	      }
	   }
	
}
