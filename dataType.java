package L1;

import java.util.Scanner;

public class dataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		System.out.println("give input number: ");
		int num =sc.nextInt();
		
		// convert into double type
	    double data = num;
	    System.out.println("The double value: " + data);
	    
	    // convert into int type
	    System.out.println("give input double type: ");
		int x =sc.nextInt();
	    int numb = (int)x;
	    System.out.println("The integer value: " + numb);
	    
	    // converts int to string type
	    System.out.println("give input int number: ");
		int y =sc.nextInt();
	    String str = String.valueOf(y);
	    System.out.println("The string value is: " + str);
	    
	    // convert string variable to int
	    System.out.println("give input string number: ");
		String xy =sc.next();
	    int number = Integer.parseInt(xy);
	    System.out.println("The integer value is: " + number);

	}

}
