import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiagonalDiff {
	
	public static void main(String args[]){
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			int N = Integer.parseInt(reader.readLine());
	        int diff = 0;
	        String[] row;
	        String nxtRow;
	        for(int i = 0;i < N;i++)
	        {
	        	nxtRow = reader.readLine();	
	        	row = nxtRow.split(" ");
	            diff+=Integer.parseInt(row[i])-Integer.parseInt(row[N-i-1]);
	        }
	        System.out.println(Math.abs(diff));
		}
		catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
}
