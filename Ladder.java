import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ladder {
	
	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int ladderSize = 0;
		try{
			ladderSize = Integer.parseInt(reader.readLine());
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
		String hash;
	    String space;
	    for(int i=ladderSize-1,j=1;i>=0&&j<=ladderSize;i--,j++){
	        space =  new String(new char[i]).replace('\0', ' ');
	        hash =  new String(new char[j]).replace('\0', '#');
	        System.out.println(space+hash);
	    }
	}
}