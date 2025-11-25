import java.util.*;
public class reverseNumber{
	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
		int num = scanf.nextInt();
		int rev = 0;
		while(num != 0){
			int last = num % 10;
			rev = rev*10 + last;
			num = num / 10;
		}
		System.out.print(rev);
	}
}