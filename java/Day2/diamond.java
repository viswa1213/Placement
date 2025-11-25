import java.util.*;
public class diamond{
	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int space = n-1;
		int star = 1;
		for(int i=0;i<n;i++){
			for(int j=0;j<space;j++){
				System.out.print(" ");
			}
			for(int k=0;k<star;k++){
				System.out.print("*");
			}
			System.out.println();
			space--;
			star+=2;
		}
		space = 1;
		star-=4;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<space;j++){
				System.out.print(" ");
			}
			for(int k=0;k<star;k++){
				System.out.print("*");
			}
			System.out.println();
			space++;
			star-=2;
		}
	}
}