import java.util.*;
public class EvenNumberBetween1to100{
	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
		for(int i=1;i<=100;i++){
			if(i%2 == 0)
				System.out.print(i + " ");
		}
	}

}