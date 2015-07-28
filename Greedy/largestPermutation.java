package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class largestPermutation {
	public static void main(String[] args){
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			try {
					String[] arg = reader.readLine().split(" ");
					
					int totalNo = Integer.parseInt(arg[0]);
					int totalSwaps = Integer.parseInt(arg[1]);
					
					int number =  Integer.parseInt(reader.readLine());
					int[] numberArray = new int[totalNo];
					int i = totalNo-1;
					
					//Splitting the number into single number
					while(number>0){
						
						numberArray[i] = number%10;
						number /= 10;
						i--;
					}
					outterLoop:
					for( i = 0; i<totalNo; i++){
						
						for( int j = i+1; j< totalNo; j++){
							
							if(totalSwaps == 0){
								
								break outterLoop;
							}
							if(numberArray[i]<numberArray[j]){
								
								numberArray[i] = numberArray[i] ^ numberArray[j];
								numberArray[j] = numberArray[i] ^ numberArray[j];
								numberArray[i] = numberArray[i] ^ numberArray[j];
								totalSwaps--;
							}
							
						}
						
					}
					
					//Displaying Largest permutation no
					for( i = 0; i< totalNo; i++){
						
						System.out.print(numberArray[i]);
					}
			}
			catch(IOException e){
				e.printStackTrace();
			}
	}

}
