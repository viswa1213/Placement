import java.util.*;
public class GCD{
	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
		int num1 = scanf.nextInt();
		int num2 = scanf.nextInt();
		int max,min;
		if(num1 > num2){
			max = num1;
			min = num2;
		}
		else{
			max = num2;
			min = num1;
		}
			
		int rem = 1;
		while(rem!=0){
			rem = max % min;
			if(rem != 0){
				max = min;
				min = rem;
			}
		}
		System.out.print("GCD of("+num1+","+num2+") is "+min);
	}
}