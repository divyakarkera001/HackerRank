
public class EvenFibonacci {
		
	public static void main(String[] args){
		
		long fib3 = 0;
		long fib1 = 1;
		long fib2 = 2;
		long eveSumFib = fib2;
		
		for(long i = 2; fib2<4000000; i++){
			
			fib3 = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib3;
			System.out.println(fib3);
			if ((fib3 & 1) == 0){
				
				eveSumFib = fib3 + eveSumFib;
			}
		}
		System.out.println(eveSumFib);
		
	}
	
	
}
