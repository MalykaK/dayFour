package com.capgemini.day4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionClient1 {
public static void main(String[] args) {
	int number1;
int number2;

//Scanner scanner = new Scanner(System.in);
System.out.println("Please enter 2 integers");

try(Scanner scanner = new Scanner(System.in)) {
	number1=scanner.nextInt();
	number2=scanner.nextInt();
	//scanner.close();

	int result= number1/number2;
	System.out.println("Result"+result);
	
}/*
catch(InputMismatchException e) {
	System.out.println("Please provide valid input");
}
catch(ArithmeticException e) {
	System.out.println("Divisor mut not be Zero");
}*/
/*finally {
	if(scanner!=null)
		scanner.close();
}*/

/*catch(Exception e) {\\error parent it executes first it need to be written after the present catch exception
	
}*/
catch(InputMismatchException | ArithmeticException e)
{
	//System.out.println(e.getMessage());\\it return error messge
	System.out.println(e);//internally print toString print fully qualified name and error messge
	/*if(e instanceof ArithmeticException)
		System.out.println("Divisor should be 0");
	else if(e instanceof InputMismatchException)
		System.out.println("Plese provide valid code");
		*/
	e.printStackTrace();
}

System.out.println("End");	                                

}
}
