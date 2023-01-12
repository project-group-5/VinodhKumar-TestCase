package variable;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float c,ref;
		TempetureConverter tc=new TempetureConverter();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter temp in cel");
		c=sc.nextFloat();
		ref=tc.convert(c);
		System.out.println(ref);

	}

}
