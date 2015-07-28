import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CaesarCipher {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
				int len = Integer.parseInt(reader.readLine());
				char[] text = reader.readLine().toCharArray();
				int key = Integer.parseInt(reader.readLine());
				
				for(int i = 0; i<len;i++){
					
					int ascii = (int)text[i];
					if(ascii>=97 && ascii<=122){
						System.out.print((char)(((ascii+key-97)%26)+97));
					}else if(ascii>=65 && ascii<=90){
						System.out.print((char)(((ascii+key-65)%26)+65));
					}
					
					else{
						System.out.print(text[i]);
					}
				}
		}catch(IOException e){
			
		}
	}
}
