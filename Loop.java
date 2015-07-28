import java.util.Scanner;


public class Loop {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numberofSeries = in.nextInt();
        int[][] term = new int[numberofSeries][3];
        for(int i = 0; i<=numberofSeries; i++ ){
        	String line = in.nextLine();
        	if(line != ""){
        		String[] abn = line.split(" ");
        		if(!abn[0].equals(""))
       		 	{
        			term[i-1][0] = Integer.parseInt(abn[0]);
        			term[i-1][1] = Integer.parseInt(abn[1]);
        			term[i-1][2] = Integer.parseInt(abn[2]);
       		 	}
        	}
        }
        for(int i = 0; i<numberofSeries; i++ ){
        	int a,b,n;
        	a = term[i][0];
			b = term[i][1];
			n = term[i][2];
			int sum = a;
			
			for(int j = 0;j<n;j++){
				
				sum = sum+(int) ( Math.pow(2,j)*b);
				System.out.print(sum +" ");
			}
			System.out.print("\n");
        }
        
    }
}
