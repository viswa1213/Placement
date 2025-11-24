import java.util.*;
public class printallnumfrom1tonexceptmultipleof5{
	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();	
		for(int i=0;i<=n;i++){
			if(i%5 == 0)
				continue;
			else
				System.out.print(i+" ");
		}
	}
}