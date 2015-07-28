import java.io.InputStreamReader;
import java.util.Scanner;


public class SherlockandTheBeast {
	public static void main(String[] args){
		
		Scanner in = new Scanner(new InputStreamReader(System.in));
		int testCases = in.nextInt();
		int[] totalDigit = new int[testCases];
		
		for(int i = 0; i<testCases; i++){
			totalDigit[i]=in.nextInt(); 	         
		}
		
		
		for(int i = 0; i<testCases; i++){
			
			if(totalDigit[i]%3 == 0){
				
				printNumber(totalDigit[i],0);
				
			}else if(totalDigit[i]%5 == 0){
				
				if(totalDigit[i] == 5){
					printNumber(0,5);
				}else {
					if((totalDigit[i]-5)%3 == 0)
						printNumber(totalDigit[i]-5,5);
					else
						printNumber(totalDigit[i]-10,10);
				}
				
				
			}
			else{
				boolean found = false;
				int N = totalDigit[i] ;
				for(int j = 1; ; j++){
					
					N -=5;
					if(N<3){
						found = false;
						break;
					}
					if(N%3 == 0){
						
						printNumber(N,j*5);
						found = true;
						break;
					}
				}/*for (int j = N; j >= 0; j--) {
                    if (j % 3 == 0 && (N - j) % 5 == 0) {
                        
                    	printNumber(j,N-j);
                    	found = true;
                        break;
                 }
           }*/
				if(!found)
					System.out.println("-1");
			}
			
		}
 	}
	private static void printNumber(int no3, int no5){
		
		StringBuilder str =  new StringBuilder();
		for(int i = 0; i<no3; i++){
			str.append('5'); 	         
		}
		for(int i = 0; i<no5; i++){
			
			str.append('3');   	         
		}
		System.out.println(no3+" , "+no5);
	}

}
