import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.StringTokenizer;
import java.io.*;


public class PlusMinus {
	public static void main(String[] args){
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			int totalInteger = Integer.parseInt(reader.readLine());
			String spaceSeperatedInteger = reader.readLine();
			StringTokenizer element = new StringTokenizer(spaceSeperatedInteger);
			int count = 0;
			int next = 0;
			float negFrac = 0;
			float posFrac = 0;
			float zeroFrac = 0;
			float oneNth = 1f/totalInteger;
		    DecimalFormat df = new DecimalFormat("#.###");
		    df.setRoundingMode(RoundingMode.CEILING);
		    float oneNthRounded = new Float(df.format(oneNth));
		    
		    while (element.hasMoreElements()) {
				count++;				
				next =  Integer.parseInt((String)element.nextElement());
				if(next == 0){
					zeroFrac += oneNth;
				}
				else if(next>0){
					posFrac += oneNth;
				}
				else{
					negFrac += oneNth;
				}
				if(count == totalInteger){
					break;
				}
			}
		    System.out.println(Math.round(posFrac*1000.0)/1000.0);
		    System.out.println(Math.round(negFrac*1000.0)/1000.0);
		    System.out.println(Math.round(zeroFrac*1000.0)/1000.0);
		    
		}catch(IOException e ){
			
		}
	}
}
