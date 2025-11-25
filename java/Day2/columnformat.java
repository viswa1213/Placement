import java.util.*;
public class columnformat{
	public static void main(String[] args){
		System.out.println("Number          Odd/Even");
		for(int i=0;i<10;i++){
			if(i%2==0)
				System.out.printf(" %-15d %s\n",i,"Even");
			else
				System.out.printf(" %-15d %s\n",i,"Odd");
		}
	} 
}