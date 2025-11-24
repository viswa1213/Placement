import java.util.*;
public class pattern2{
	public static void main(String[] args){	
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int a = n;
		for(int i=0;i<n;i++){
			for(int j=0;j<a;j++){
				System.out.print("*");
			}
			a--;
			System.out.println();
		}
	}
}