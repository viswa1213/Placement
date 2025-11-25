import java.util.*;
public class sumofDigits{
	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
		int num = scanf.nextInt();
		int sum = 0;
		while(num != 0 ){
			sum += num % 10;
			num = num / 10;
		}
		System.out.print(sum);
	}
}