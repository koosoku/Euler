
public class LargestPalindromeSum {
	public static void main(String[] args){
		int max = 0;
		for(int i = 999 ; i>0; i--){
			for(int j = 999 ; max<i*j && j>0 ; j--){
				if(palindrome(i*j)){
					max = i*j;
				}
			}
		}
		System.out.println(max);
	}
	public static boolean palindrome(int test){
		
		/*think about this later
		 * int tmp = 1000;
		int digits = 0;
		for(int i = 0; tmp>0; i++){
			digits++;
			tmp = tmp/10;
		}
		System.out.println(digits);*/
		int tmp = test;
		int reverse = 0;
		
		while(tmp>0){
			reverse = reverse*10 +tmp%10;
			tmp = tmp/10;
		}
		return reverse == test;
	}
	
}
