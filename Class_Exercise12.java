import java.util.Scanner;
import java.util.InputMismatchException;

public class Class_Exercise12 {
	private static double numbers = 1, sum = 0;
	private static Scanner scan = new Scanner(System.in);
		public static double sum() {
		do{ 
			System.out.println("Enter a number");
			try{
					numbers = scan.nextDouble();
					sum = numbers + sum;
					}
					catch(InputMismatchException ex) {
					System.out.println("No letters, only numbers");
					scan.next();
					}
					
			} while(numbers!= 0); 
				System.out.println("The sum is " + sum);
				return sum;
	
		}
		
		
		public static void main (String[] args) {
		sum();
		}
	}