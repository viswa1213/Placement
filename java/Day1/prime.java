import java.util.*;
public class prime{
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
        int a = scanf.nextInt();
	int count = 0;
	for(int i=1;i<=a;i++){
		if(a%i==0){
		   count++;
		}
	}
	if(count == 2)
		System.out.print(a + " is a prime number");
	else
		System.out.print(a + " is not a prime number");


    }
}