import java.util.*;
public class allfactorsofaNumber{
	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
		int num = scanf.nextInt();
		System.out.println("Factors of the "+num+"are :");
		for(int i=1;i<=num;i++){
			if(num % i == 0)
				System.out.print(i+" ");
		}
	}
}