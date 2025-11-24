import java.util.*;
public class perfectbundantdeficientNumber{
	public static void perfect(int num){
		int tot = 0;
		for(int i=1;i<num;i++){
			if(num % i == 0){
				tot += i; 
			}
		}
		if(tot == num)
			System.out.println(num + "is a perfect Number");
		else
			System.out.println(num + "is not a perfect Number");

		if(tot > num)
			System.out.println(num + "is a Abundant Number");
		else
			System.out.println(num + "is a not a Abundant Number");

		if(tot < num)
			System.out.println(num + "is a Deficient Number");
		else
			System.out.println(num + "is a not a Deficient Number");
	}
	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
		int num = scanf.nextInt();
		perfect(num);
	}
}
