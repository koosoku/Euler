
public class Multiples35 {
	public static void main(String[] args){
		int sum = 0;
		for(int i = 0; i*3 < 1000; i++){
			sum += i*3;
		}
		for(int i = 0; i*5 < 1000; i++){
			sum += i*5;
		}
		for(int i = 0; i*15 < 1000; i++){
			sum -= i*15;
		}
		System.out.println(sum);
		
	}
}
