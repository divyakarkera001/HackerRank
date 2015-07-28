package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GridChallenge {
	
	public static void main(String[] args){
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
				int testCase = Integer.parseInt(reader.readLine());
				int noOfChar = Integer.parseInt(reader.readLine());
				String[][] words = new String[testCase][noOfChar];
				StringBuilder[] combStr = new StringBuilder[testCase];
				for(int i = 0;i < testCase;i++){
					combStr[i] = new StringBuilder("");
					for(int j = 0;j < noOfChar;j++){
						words[i][j] = sortString(reader.readLine().toString());
						//System.out.println(words[i][j]);
						combStr[i].append(words[i][j]);
					}
				}
				String combStrSorted; 
				for(int i = 0;i<testCase;i++){
					
					combStrSorted = sortString(combStr[i].toString());
					boolean equal = true;
					for(int j = 0,k=0,l=noOfChar;l<combStrSorted.length()&&k<noOfChar;l+=5,k++){
					
						//System.out.println(combStrSorted.substring(j, l));
						if(!combStrSorted.substring(j, l).equals(words[i][k])){
							System.out.println("No");
							j = l;
							equal = false;
							break;
						}
					
					j = l;
					}
					if(equal)
						System.out.println("Yes");
				}
			}catch(IOException e){
				
				e.printStackTrace();
			}
	}
	
	public static String sortString(String str){

		char[] charStr = str.toCharArray();
		Arrays.sort(charStr);
		//System.out.println(charStr.toString());
		return new String(charStr);
	}
}
