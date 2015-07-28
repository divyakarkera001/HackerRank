package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in); 
		int totalInteger = in.nextInt();
		int totalK = in.nextInt();
		int[] integer = new int[totalInteger];
		
		for(int i =0 ; i<totalInteger; i++){
			integer[i] = in.nextInt(); 
		}
		Arrays.sort(integer);
		int unfair = integer[0+totalK-1]-integer[0];
		for(int i =0 ,j = totalInteger-1; ; i++,j--){
			if(unfair>(integer[i+totalK-1]-integer[i]))
				unfair = integer[i+totalK-1]-integer[i];
			
			if(unfair>(integer[j]-integer[j+1-totalK]))
				unfair = integer[j]-integer[j+1-totalK];
			if((j+1-totalK)<=i)
				break;
		}
		System.out.println(unfair);
	}

}
