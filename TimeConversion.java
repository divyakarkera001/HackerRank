import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TimeConversion {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String time_12hr = reader.readLine();
			String format = time_12hr.substring(time_12hr.length()-2);
			String[] timePara = time_12hr.substring(0,time_12hr.length()-2).split(":");
			String hrs = timePara[0];
			if(!hrs.equals("12") && format.equals("PM")){
				int time = Integer.parseInt(hrs) + 12;
				hrs =Integer.toString(time);
			}
			else if(format.equals("AM") && hrs.equals("12")){
				
				hrs = "00";
			}
			System.out.print(hrs+":"+timePara[1]+":"+timePara[2]);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
