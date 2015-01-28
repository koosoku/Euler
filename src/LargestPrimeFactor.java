import java.math.BigInteger;

public class LargestPrimeFactor {
	public static void main(String[] args){
		BigInteger b = new BigInteger("600851475143");
		//BigInteger b = new BigInteger("175");
		BigInteger[] array;
		//this algorithim would create way to many objects
		int max = 1;
		for(int i =2; i<=20000 ; i++){
			BigInteger a = new BigInteger(Integer.toString(i));
			if(b.remainder(a) == BigInteger.ZERO){
				b = b.divide(a);
				max = i;
				i--;
			}
		}
		
		System.out.println(max);
		
		
		
			
			
			
		/*	
		int test = 13195;
		int largestPrime = 0;
		for(int i = 2 ;i<=test;i++){
			if(test%i == 0){
				test = test/i;
				largestPrime = i;
				i=2;
			}
		}
		System.out.print(largestPrime);
		*/
	}
}
