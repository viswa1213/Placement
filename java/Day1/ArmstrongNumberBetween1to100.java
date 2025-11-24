import java.util.*;
public class ArmstrongNumberBetween1to100{
	public static int digit(int num){
		int count = 0;
		while(num!=0){
			num = num/10;
			count++;
		}
	return count;
}
	public static int multiple(int num,int n){
		int mul = 1;
		for(int i=0;i<n;i++){
			mul = mul*num;
		}
		return mul;
	}
	public static void ArmstrongNumber(int num){
		int org = num;
		int nofDigit = digit(num);
		int[] arr = new int[nofDigit];
		int j=0;
		while(num != 0){
			arr[j] = num%10;
			num = num/10;
			j++;
		}
		int tot = 0;
		for(int i=0;i<arr.length;i++){
			arr[i] = multiple(arr[i],nofDigit);
			tot = tot + arr[i];
		}
		if(tot == org){
			System.out.print(tot +" ");
		}
	}
	public static void main(String[] args){
		for(int i=1;i<=100;i++){
			ArmstrongNumber(i);
		}
	}
}