import java.util.*;
public class compoundintrest{
	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
		int p = scanf.nextInt();
		int r = scanf.nextInt();
		int n = scanf.nextInt();
		int t = scanf.nextInt();
		
		int A = P*(1 + r*n)*n*t;
		int CI = A - P;
		System.out.print(CI);
	}
}