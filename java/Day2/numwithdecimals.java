import java.util.*;
public class numwithdecimals{
	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
		float num = scanf.nextFloat();

		System.out.printf("%.2f\n",num);
		System.out.printf("%.3f\n",num);
		System.out.printf("%.5f\n",num);
	}
}