import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.*;




public class SumBigNumber {

	public static void main(String[] args) {
		 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			
				String sizeStr = reader.readLine();
			    String elements = reader.readLine();
				StringTokenizer st = new StringTokenizer(elements);
				BigDecimal sum = new BigDecimal("0"); 
				int sizeArray=Integer.parseInt(sizeStr);
				int count = 0;
				
				while (st.hasMoreElements()) {
					count++;
					sum = sum.add(new BigDecimal((String)st.nextElement()));
					if(count == sizeArray){
						break;
					}
				}
				System.out.println(sum);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
 
		
	}
}
