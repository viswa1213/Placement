import java.util.*;
public class floatingpointNumber{
	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		for(int i=0;i<n;i++){
			float num = scanf.nextFloat();
			System.out.print(num);
			System.out.printf("%-12s%.4e\n\n"," ",num);
			
		}
		 
	} 
}