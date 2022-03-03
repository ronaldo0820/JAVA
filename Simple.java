import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the dividend is:");
	int dividend=sc.nextInt();
		System.out.println("Enter the divisor:");
	int divisor=sc.nextInt();
	int quotient = dividend / divisor;
    int remainder = dividend % divisor;
    System.out.println("Quotient is "+ quotient);
        System.out.println("Remainder is" +remainder);
	}
}
