import java.util.*;
public class noofDigits{
	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
		int num = scanf.nextInt();
		int count = 0;
		while(num!=0){
			count++;
			num = num / 10;
		}
		System.out.print(count);
	}
}