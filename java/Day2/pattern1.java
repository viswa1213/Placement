import java.util.*;
public class pattern1{
	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int num = 1;
		for(int i=0;i<n;i++){
			num = 1;
			for(int j=0;j<=i;j++){
				System.out.printf("%-10d",num);
				num++;
			}
			System.out.println();
		}
	}
}