import java.util.*;
public class powerofaNumber{
	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
		System.out.print("Number");
		int number = scanf.nextInt();
		System.out.print("Power");
		int power = scanf.nextInt();
		int ans = 1;
		for(int i=0;i<power;i++){
			ans = ans * number;
		}
		System.out.print(ans);
	}
}