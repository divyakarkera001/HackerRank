import java.io.*;
public class FunnyString{
	public static void main(String[] args){
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			int testCase = Integer.parseInt(reader.readLine());
			String[] words = new String[testCase];
			for(int i = 0;i < testCase;i++){
				words[i] = reader.readLine();
			}
			char[] wordsToChar;
			boolean funny = true;
			for(int i = 0; i< testCase; i++){
				
				wordsToChar = words[i].toCharArray();
				for(int j=1,k=wordsToChar.length-1;j<=wordsToChar.length/2 && k>=wordsToChar.length/2;j++,k--){
					
					if(Math.abs((int)wordsToChar[j]-(int)wordsToChar[j-1])!=Math.abs((int)wordsToChar[k]-(int)wordsToChar[k-1])){
						funny = false;
						
						break;
					}
				}
				if(funny){
					System.out.println("Funny");
				}
				else{
					System.out.println("Not Funny");
					funny = true;
				}
			}
		}catch(IOException e){
			
		}
	}

}
