import java.util.*;
public class palindrome{
	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
		int num = scanf.nextInt();
		int orgnum = num;
		int rev = 0;
		while(num!=0){
			int last = num % 10;
			rev = rev * 10 + last;
			num = num / 10;
		}
		if(rev == orgnum)
			System.out.print(orgnum+" is a palindrome");
		else
			System.out.print(orgnum+" is not a palindrome");
	}
}