
public class SumPrime2Million {
	public static void main(String[] args){
		long sum = 0;
		for(int i =2;i<=2000000;i++){
			for(int j = 2; j<=(int)Math.sqrt(i)+1; j++){
				if( i% j == 0)
					break;
				if (j==(int)Math.sqrt(i)+1)
					sum+=i;			
			}
		}
		System.out.println(sum);
	}
}
