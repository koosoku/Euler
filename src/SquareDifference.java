
public class SquareDifference {
	public static void main(String[] args){
		int squareSum = 0;
		int sumSquare = 0;
		for(int i = 1; i<=100; i++){
			squareSum += i*i;
			sumSquare +=i;
		}
		sumSquare = sumSquare*sumSquare;
		
		System.out.println(sumSquare-squareSum);
	}
}
