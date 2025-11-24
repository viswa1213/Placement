import java.util.*;
public class pattern1{
	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		for(int i=0;i<n;i++){
			int a = 1;
			for(int j=0;j<=i;j++){
				System.out.print(a);
				a++;
			}
			System.out.println();
		}
	}
}