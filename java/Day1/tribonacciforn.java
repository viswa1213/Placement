import java.util.*;
public class tribonacciforn{
	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int first = 0;
		int second = 1;
		int third = 1;
		System.out.print("0 1 1");
		for(int i = 3;i<n;i++){
			int current = first + second + third;
			System.out.print(" " + current);
			first = second;
			second = third;
			third = current;
		}
	}
	
}