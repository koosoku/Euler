
public class longestCollatz {

	public static void main(String[] args){
		long largestCount = 0;
		long largestNum = 0;
		long temp;
		
		for(long i = 1; i<=1000000; i++){
			 temp = collatzCounter(i);
			 
			 if(temp>largestCount){
					largestCount = temp;
					largestNum = i;
			}
		}
		System.out.println(largestCount);
		System.out.println(largestNum);
		
	}
	
	public static long collatzCounter(long input){
		
		long counter = 1;
		
		System.out.print(input+ "\t");
		while (input != 1){
			if (input %2 == 0){
				input = input/2;
			}
			else {
				input = input*3+1;
			}
			counter++;
		}
		System.out.println(counter);
		return counter;
	}
}
