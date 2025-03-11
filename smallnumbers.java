import java.util.Scanner;

public class smallnumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your first number");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter your third number");
        int num3 = sc.nextInt();

        int smallest = num1;
        if(num2 < smallest ){
            smallest =num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        System.out.print("The smallest number is " + smallest);

}}

