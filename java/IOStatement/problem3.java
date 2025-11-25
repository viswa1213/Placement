import java.util.*;
public class problem3{
	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
		int F = scanf.nextInt();
		int C = scanf.nextInt();
		float F1= (C * (9f/5f)) + 32;
		float C1 = (F-32)*(5f/9f);
		System.out.printf("%.2f\n",F1); 
		System.out.printf("%.2f",C1);
	}
}