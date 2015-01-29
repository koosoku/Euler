
public class DivisibileTriangleNum {
	public static void main(String[] args){
		long naturalNum=0;
		long copyNaturalNum=0;
		int numOfFactors = 1;
		int len = 500; 
		for(int i =1;numOfFactors<=len;i++){
			int[][] recorder = new int[2][10];
			naturalNum= copyNaturalNum + i;
			numOfFactors = 1;
			copyNaturalNum = naturalNum;
			
			for(int j =2 ;j<500; j++){
				if(naturalNum == 1)
					break;
				if(naturalNum%j == 0){
					naturalNum = naturalNum/j;
					for(int k= 0; k<recorder[1].length;k++){
						if(recorder[0][k] == j){
							recorder[1][k] ++;
							j--;
							break;
						}
						if(recorder[0][k] == 0){
							recorder[0][k] = j;
							recorder[1][k] ++;
							j--;
							break;
						}
						
					}
				}
			}
			
			int j = 0;
			while(recorder[0][j]!=0){
				numOfFactors *= (recorder[1][j]+1);
				j++;
			}
			if(numOfFactors > len){
				System.out.println(copyNaturalNum);
				System.out.println(numOfFactors);
				System.out.print(i);
				break;
			}
			
		}
	}
}
