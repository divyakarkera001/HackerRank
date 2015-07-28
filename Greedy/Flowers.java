package Greedy;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class Flowers{
	
	public static void main(String args[]){   

		Scanner in = new Scanner(System.in);
	    int N, K;
	    N = in.nextInt();
	    K = in.nextInt();
	    int Cost[] = new int[N];
	    for(int i=0; i<N; i++){
	    	Cost[i] = in.nextInt();
	    }
	    Arrays.sort(Cost);
	    int result = 0;
	    int rebuy = 1;
	    int j = N-1;
	    while(j>=0){
	    	
	    	for(int i = 0;i<K && j>=0; i++){
	            result += rebuy*Cost[j];
	            j--;
	         }
	         rebuy++;
	     }
	    int cnt = 0;
	    int  totalAmount=0;
	    
	    for (int i = N-1; i>=0; i--) {
	    	
            totalAmount += (cnt / K + 1) * Cost[i];
            cnt++;
	    }
       
	    System.out.println( result +","+ totalAmount);
      
   }
}
