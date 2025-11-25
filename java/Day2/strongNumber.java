import java.util.*;
public class strongNumber{
	public static int factorial(int num){
		int fact = 1;
		for(int i=1;i<=num;i++){
			fact = fact * i;
		}
		return fact;
	}
	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
		int num = scanf.nextInt();
		int orgnum = num;
		int sum = 0;
		while(num!=0){
			int digit = num % 10;
			sum += factorial(digit);
			num = num / 10;
		}
		if(orgnum == sum)
			System.out.print(orgnum +" is a Strong Number");
		else
			System.out.print(orgnum +" is not a Strong Number");
	}	
}