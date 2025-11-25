import java.util.*;
public class problem1{
	public static void main(String[] args){
		Scanner scanf  = new Scanner(System.in);
		System.out.println("Enter two Numbers");
		int a = scanf.nextInt();
		int b = scanf.nextInt();
		System.out.println("Enter the operatore +,-,*,/");
		char op = scanf.next().charAt(0);
		if(op == '+'){
			int add = a + b;
			System.out.println("result : "+add);
		}
		else if(op == '-'){
			int sub = a - b;
			System.out.println("result : "+sub);
		}
		else if(op == '*'){
			int mul = a * b;
			System.out.println("result : "+mul);
		}
		else if(op == '/'){
			int div = a / b;
			System.out.println("result : "+div);
		}
		else{
			System.out.println("Enter a valid operator");
		}
			
	}
}