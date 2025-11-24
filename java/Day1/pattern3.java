import java.util.*;
public class pattern3{
	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int space = n-1;
		int num = 1;
		int orgnum = num;
		for(int i=0;i<n;i++){
			int val = 1;
			for(int j=0;j<space;j++){
				System.out.print(" ");
			}
			for(int k=0;k<num;k++){ 
				System.out.print(val);
				val++;
			}
			if(i != 0){
				int dupnum = orgnum;
				for(int l=0;l<=i;l++){
					if(dupnum != 0){
						System.out.print(dupnum);
					}
					dupnum--;
				}
				orgnum++;
			}
	 		System.out.println();
			space--;
			num++;
		}
	}
}