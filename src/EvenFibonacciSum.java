public class EvenFibonacciSum {
	public static void main(String[] args){
	
		int fibo1 = 1;
		int fibo2 = 1;
		int tmp;
		int sum = 0;
		for(int i = 0; fibo2<4000000; i++){
			if (fibo2%2 == 0)
				sum+=fibo2;
			tmp = fibo2;
			fibo2 = fibo1+fibo2;
			fibo1 = tmp;		
		}
		
		System.out.print(sum);
	}
}
