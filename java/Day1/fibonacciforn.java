import java.util.*;
public class fibonacciforn{
	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int prev = 0;
		int next = 1;
		System.out.print(prev + " " + next);
		for(int i=2;i<n;i++){
			int current = prev + next;
			System.out.print(current);
			prev = next;
			next = current;
		}
	}
}