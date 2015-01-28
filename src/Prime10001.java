
public class Prime10001 {
	public static void main(String[] args){
		int count = 1;
		int tmp = 0;
		for(int i =1;count<10001;i++){
			for(int j = 2; j<=(int)Math.sqrt(i); j++){
				if( i% j == 0)
					break;
				if (j==(int)Math.sqrt(i))
					count++;			
			}
			tmp = i;
		}
		System.out.println(tmp);
	}
}
