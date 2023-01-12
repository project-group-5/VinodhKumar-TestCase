package variable;

import java.util.Scanner;

public class TestVariableOperator {

	public static void main(String[] args) {
		int num1,num2,sum;
		
		System.out.println("enter the no's");
		
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		sum=num1/num2;
		System.out.println("the sum " +num1 + "/" +num2 + "=" +sum);

	}

}
