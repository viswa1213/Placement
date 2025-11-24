import java.util.*;
public class diamondforn{
	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int space =  n-1;
		int stars = 1;
		for(int i=0;i<n;i++){
			for(int j=0;j<space;j++){
				System.out.print(" ");
			}
			for(int k=0;k<stars;k++){
				System.out.print("*");
			}
			stars+=2;
			space--;
			System.out.println();
		}
		space = 1;
		stars -= 4;
		for(int i=0;i<n;i++){
			for(int j=0;j<space;j++){
				System.out.print(" ");
			}
			for(int k=0;k<stars;k++){
				System.out.print("*");
			}
			stars-=2;
			space++;
			System.out.println();
		}
	}
}