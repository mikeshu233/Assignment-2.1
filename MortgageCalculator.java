import java.util.Scanner;
public class MortgageCalculator{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mortgage Calculator");
        System.out.println("Principle: ");
        double p = sc.nextDouble();
        System.out.println("Rate: ");
        double r = sc.nextDouble();
        System.out.println("Years: ");
        double n = sc.nextDouble();
        double a = p*Math.pow(1+r, n);
        System.out.println("Amount: " + a);
    }
}