package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BurgerServingTime {
	public static void main(String[] args){
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
				int testCase = Integer.parseInt(reader.readLine());
				int [][] serving = new int [testCase][3];
				String[] arg;
				for(int i = 0;i < testCase;i++){
					arg = reader.readLine().split(" ");
					serving[i][0] = Integer.parseInt(arg[0]);
					serving[i][1] = Integer.parseInt(arg[0])+Integer.parseInt(arg[1]);
					serving[i][2] = i+1;
				}
				for(int i = 0;i < testCase;i++){
					int max = serving[i][1];
					int pos = serving[i][2];
					for(int j = i+1;j<testCase;j++){
						if(max>serving[j][1]||(max==serving[j][1]&&((serving[i][0])>(serving[j][1]-serving[j][0])))){
							max = serving[j][1];
							serving[j][1] = serving[i][1];
							serving[i][1] =max; 
							pos = serving[j][2];
							serving[j][2] = serving[i][2]; 
							serving[i][2] = pos;
						}						
					}
				}
				for(int i = 0;i < testCase;i++){
					System.out.print(serving[i][2]+" ");
				}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
