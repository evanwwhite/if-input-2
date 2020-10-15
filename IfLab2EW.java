//Evan White
import java.util.Scanner;

public class IfLab2EW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a even or odd number: ");
		int num1 = input.nextInt();
		
		if(num1%2 == 0)
		{
			System.out.println(num1 + " is even\n");
		}
		else
		{ 
			System.out.println(num1 + " is odd\n");
		}
		
		
		System.out.println("Input your bill: ");
		int bill = input.nextInt();
		
		if(bill > 2000)
		{
		 System.out.println("Bill after discount: " + bill * .85 );
		}
	
		else
		{
			System.out.println("Bill after discount: " + bill);
		}
		
	}

}
/*
Input a even or odd number: 
6
6 is even

Input your bill: 
2001
Bill after discount: 1700.85
*/