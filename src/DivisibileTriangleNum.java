
public class DivisibileTriangleNum {
	public static void main(String[] args){
		long naturalNum=0;
		int numOfFactors = 0;
		int len = 16;
		for(int i =1;numOfFactors<=len;i++){
			naturalNum+=i;
			numOfFactors = 0;
			
			for(int j =1 ;j<=naturalNum; j++){
				if(naturalNum%j == 0){
					numOfFactors++;
				}
			}
			if(numOfFactors > len){
				System.out.println(naturalNum);
				System.out.println(numOfFactors);
				System.out.print(i);
				break;
			}
			
		}
	}
}
