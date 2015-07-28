import java.io.*;
import java.util.StringTokenizer;
public class AngryProfessor {
	public static void main(String[] args){
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
				int numberOfTestCase = Integer.parseInt(reader.readLine());

				String[]result = new String[numberOfTestCase];
				int count = 0;
				for(int i = 0;i <numberOfTestCase;i++){
					
					int[] classPara = convertStringToIntegerArray(reader.readLine().split(" "));
					int[] arivalTime = convertStringToIntegerArray(reader.readLine().split(" "));
					
					if(arivalTime.length<classPara[1]){
						result[i] ="Yes";
					}
					else{
						
						for(int j=0; j<arivalTime.length;j++){
							if(arivalTime[j]<1){
								count++;
							}
						}
						if(count>=classPara[1]){
							result[i] ="YES";
						}
						else{
							result[i] ="NO";
						}
					}
					count = 0;
				}
				for (int i = 0; i < result.length; i++) {
					System.out.println(result[i]);
				}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	static int[] convertStringToIntegerArray(String[] stringArray){
		int[] intArray = new int[stringArray.length];
	      for (int i = 0; i < stringArray.length; i++) {
	         
	         intArray[i] = Integer.parseInt(stringArray[i]);
	      }
		return intArray;
		
	}
}
