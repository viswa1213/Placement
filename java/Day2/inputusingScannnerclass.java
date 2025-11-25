import java.util.*;
public class inputusingScannnerclass{
	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
	
		int n = scanf.nextInt();
		System.out.print(n);

		char ch = scanf.next().charAt(0);
		System.out.print(ch);

        scanf.nextLine();

		String str = scanf.nextLine();
		System.out.print(str);

		float fl = scanf.nextFloat();
		System.out.printf("%.3f",fl);

		double db = scanf.nextDouble();
		System.out.print(db);

		boolean bo = scanf.nextBoolean();
		System.out.print(bo);
	}
}