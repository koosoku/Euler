
public class longestCollatz {

	public static void main(String[] args){
		int largestCount = 0;
		int largestNum = 0;
		int temp;
		
		for(int i = 1; i<=1000000; i++){
			 temp = collatzCounter(i);
			 
			 if(temp>largestCount){
					largestCount = temp;
					largestNum = i;
			}
		}
		System.out.println(largestCount);
		System.out.println(largestNum);
			
		
	}
	
	public static int collatzCounter(int input){
		
		int counter = 1;
		
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
