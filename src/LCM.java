
public class LCM {
	public static void main(String[] args){
		int product = 1;
		int tmp = 0;
		int length = 20;
		int pow[] = new int[length+1];
		int tmpcount[] = new int[length+1];
		for(int i = 1; i<=length; i++){
			tmp = i;
			for(int j = 2 ;j<=tmp; j++){
				if(tmp%j == 0){
					tmpcount[j]++;
					tmp = tmp/j;
					j = 1;
				}
			}
			for(int k = 0; k<=length; k++ ){
				if(tmpcount[k]>pow[k]){
					pow[k] = tmpcount[k];
				}
				tmpcount[k] = 0;
			}
		}
		for(int i = 1 ; i<=length; i++){
			product = product * (int)Math.pow(i, pow[i]);
		}
		
		
		System.out.println(product);
	}
}
