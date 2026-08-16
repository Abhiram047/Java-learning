import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
    // Temperature converter program

        Scanner scanner = new Scanner(System.in);
    double temp;
    double newTemp;
    String unit;

    System.out.print("Enter Temperature: ");
    temp = scanner.nextDouble();

    System.out.print("Convert into Celsius or Kelvin? (C or K): ");
    unit = scanner.next().toUpperCase();

    newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp + 273.15);

        System.out.printf("%.2f°%s" , newTemp , unit);
      scanner.close();
    }
}