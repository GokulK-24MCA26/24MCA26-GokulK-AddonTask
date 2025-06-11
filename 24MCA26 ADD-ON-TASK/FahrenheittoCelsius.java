import java.util.Scanner;

public class FahrenheittoCelsius{
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
//	 This program converts temperature from Fahrenheit to Celsius using the formula:
//			C = (5/9) × (F - 32)
//			
//		Problem Flow:
//		Input temperature in Fahrenheit
//		Apply formula: C = (5 / 9.0) × (F - 32)
//		Display result in Celsius
//		
//		Input / Output Example:
//		Sample Inputs to Test (from question):
//		68, 150, 212, 0, -22
//		Sample Output (for 68°F):
//		68.000000 deg F is 20.000000 deg 
System.out.println("Input temperature in Fahrenheit: ");
double F=sc.nextDouble();
double C=(5/9.0)*(F-32);
System.out.printf("Sample Output (for %.0f°F ):\n %.6f deg F is %.6f ",F,F,C);


	
}
}
