import java.util.*;
public class readinteger{
	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
		int i = 1;
		System.out.print("read the integer until -1 is entered");
		int sum = 0;
		int count = 0;
		int evencount = 0;
		int oddcount = 0;
		while(i != -1){
			i = scanf.nextInt();
			if(i != -1){
			sum += i;
			count++;
				if(i%2==0)
					evencount++;
				else
					oddcount++;
			}
		}
		System.out.println("sum of the numbers : "+sum);
		float avg = sum/count;
		System.out.printf("Average of the number : %.2f\n",avg);
		System.out.println("Even count of the numbers : "+oddcount);
		System.out.println("Odd count of the numbers : "+evencount);
		
	}
}