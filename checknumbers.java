import java.util.Scanner;

public class checknumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Input number from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is positive or negative
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }




    }







}
