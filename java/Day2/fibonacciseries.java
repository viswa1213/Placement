import java.util.*;
public class fibonacciseries{
	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int last = 0;
		int next = 1;
		System.out.print(last+" "+next);
		for(int i=2;i<n;i++){
			int current = last + next;
			System.out.print(" "+current);
			last = next;
			next = current;
		}
	}
}