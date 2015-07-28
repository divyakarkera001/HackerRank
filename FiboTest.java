import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
public class FiboTest {
	public static BigInteger sqrt(BigInteger n) {
		  BigInteger a = BigInteger.ONE;
		  BigInteger b = new BigInteger(n.shiftRight(5).add(new BigInteger("8")).toString());
		  while(b.compareTo(a) >= 0) {
		    BigInteger mid = new BigInteger(a.add(b).shiftRight(1).toString());
		    if(mid.multiply(mid).compareTo(n) > 0) b = mid.subtract(BigInteger.ONE);
		    else a = mid.add(BigInteger.ONE);
		  }
		  return a.subtract(BigInteger.ONE);
		}
	 public static boolean chkPerfectSquare(BigInteger n){
	        
		 BigInteger sqr = sqrt(n);
		 
	        return (sqr.multiply(sqr).compareTo(n) == 0);
	    }
	    public static void main(String[] args) {
	       
	        Scanner in = new Scanner(System.in);
	        int testCases = in.nextInt();
	        ArrayList<BigInteger> fibList = new ArrayList<>();
	        long []fibArray = new long[testCases];
	        for(int i=0; i<testCases; i++){
	        	fibList.add(new BigInteger(in.next()));   
	           
	        }
	        for(int i=0; i<testCases; i++){
	        	
	            if(chkPerfectSquare(fibList.get(i).pow(2).multiply(BigInteger.valueOf(5)).add(BigInteger.valueOf(4)) ) ||chkPerfectSquare(fibList.get(i).pow(2).multiply(BigInteger.valueOf(5)).subtract(BigInteger.valueOf(4)))){
	                System.out.println("IsFibo");
	            }else{
	                System.out.println("IsNotFibo");
	            }
	        }
	       
	    }
	

}
