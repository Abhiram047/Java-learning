import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Weight Conversion Program

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight conversion program");
        System.out.println("1: lbs to kgs");
        System.out.println("2: kgs to lbs");

        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.print("Enter your weight in lbs: ");
            weight = scanner.nextDouble();
           newWeight = weight * 0.453592;
            System.out.printf("New weight in kgs is: %.2f" , newWeight);
        }

      else if(choice == 2){
            System.out.print("Enter your weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("New weight in lbs is: %.2f" , newWeight);
        }

       else{
            System.out.println("It's an invalid choice");
        }

        scanner.close();
    }
}
