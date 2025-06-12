
public class ProductOfOddInteger {
	public static void main(String[] args) {
        long product = 1;
        String series = "";

        for (int i = 1; i <= 15; i += 2) {
            product *= i;
            series += i;
            if (i < 15) {
                series += " × ";
            }
        }

        System.out.println("Product of odd numbers from 1 to 15 = " + product);
        System.out.println("(Odd numbers: " + series + " = " + product + ")");
    }
}
