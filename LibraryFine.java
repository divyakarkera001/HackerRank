import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LibraryFine {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] actualReturnDate = reader.readLine().split(" ");
			String[] expectedReturnDate = reader.readLine().split(" ");
			if(Integer.parseInt(expectedReturnDate[2])<Integer.parseInt(actualReturnDate[2]))
			{
				System.out.println("10000");
				System.exit(0);
			}
			if((Integer.parseInt(expectedReturnDate[1])<Integer.parseInt(actualReturnDate[1]))&& expectedReturnDate[2].equals(actualReturnDate[2]))
			{
				System.out.println(500*(Integer.parseInt(actualReturnDate[1])-Integer.parseInt(expectedReturnDate[1])));
				System.exit(0);
			}
			
			if((Integer.parseInt(expectedReturnDate[0])<Integer.parseInt(actualReturnDate[0]))
					&& expectedReturnDate[1].equals(actualReturnDate[1])&& expectedReturnDate[2].equals(actualReturnDate[2]))
			{
				System.out.println(15*(Integer.parseInt(actualReturnDate[0])-Integer.parseInt(expectedReturnDate[0])));
				System.exit(0);
			}
			System.out.println(0);
		}
		 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
}
