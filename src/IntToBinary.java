/**
 * @author Glen Feldkamp
 * Simple class to convert entered decimal value to binary code.
 */
import java.util.*;
public class IntToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer to convert to binary: ");
		int entered = input.nextInt();
		int temp = entered;
		String binary = "";
		if(temp == 0)
			binary = "0";
		while(temp != 0)
		{
			binary = binary + temp%2;
			temp = temp/2;
		}
		String output = new StringBuffer(binary).reverse().toString();
		System.out.println("You entered: " + entered + " Binary conversion is " + output);
		input.close();
	}
}
