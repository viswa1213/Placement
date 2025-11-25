import java.util.*;
public class problem2{
	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
		int r = scanf.nextInt();
		float pie = 3.14f;
		float area = pie * r * r;
		float circumference = 2 * pie * r;
		System.out.printf("Area : %.2f\n",area);
		System.out.printf("Circumference : %.2f",circumference);
	}
}