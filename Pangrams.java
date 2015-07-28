import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Pangrams {

	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
				char[] stringChar = reader.readLine().toCharArray();
				
				long a_m = 0;
				long n_z = 0;
			
				for(int i = 0; i < stringChar.length;i++){
					
					//Calculating the ascii value of the alphabet; if -64 is above 26 then char maybe small letter
					int ascii = ((int)(stringChar[i])-64>26)?(int)(stringChar[i])-96:(int)(stringChar[i])-64; 
					
					//Checking if the char is alphabet
					if(ascii>=1 && ascii<=26){
						if(ascii<14){
							
							a_m = a_m |(1 << (ascii - 1));
							
						}else{
							n_z = n_z|(1 << (ascii - 14));
							
						}
					}
				}
				if(a_m == 8191 && n_z == 8191){
					System.out.println("pangram");
				}else{
					System.out.println("not pangram");
				}
				
		}catch(IOException e){
			
			e.printStackTrace();
		}

	}

}
