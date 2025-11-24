import java.util.*;
public class perfectSquareNumberfrom1ton{
	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
		int start = scanf.nextInt();
		int end = scanf.nextInt();
		for(int i = 1;i*i< end;i++){
			int square = i*i;
			if(square >= start && square <= end){
				System.out.print(square+" ");
			} 
		}
	}
}