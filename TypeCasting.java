package L1;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Converting string to int (or Integer)
		System.out.println("Converting string to int (or Integer)" );
		System.out.println("give input number string: ");
		String str= sc.nextLine();
		int a =Integer.parseInt(str);
		System.out.println(a);
		
		//Converting string to double (or Double)
		System.out.println( "Converting string to double (or Double)");
		System.out.println("give input number string: ");
		String st= sc.nextLine();
		double b =Double.parseDouble(st);
		System.out.println(b);
		
		//Converting string to long (or Long)
		System.out.println("Converting string to long (or Long)" );
		System.out.println("give input number string: ");
		String s= sc.nextLine();
		long c=Long.parseLong(s);
		System.out.println(c);
		
		//Converting string to boolean (or Boolean)
		System.out.println("Converting string to boolean (or Boolean)" );
		System.out.println("give input string true or false: ");
		String sa= sc.nextLine();
		boolean d=Boolean.valueOf(sa);
		System.out.println(d);
		
		//Converting string to Character array
		System.out.println("Converting string to Character array" );
		System.out.println("give input string: ");
		String sb= sc.nextLine();
		char[] arr=sb.toCharArray();//()we can give seprator
		System.out.println(arr);
		
		//Converting string to Byte Array
		System.out.println("Converting string to Byte Array");
		System.out.println("give input string: ");
		String se= sc.nextLine();
		byte[] ar=se.getBytes();
		System.out.println(ar);
		

	}

}
