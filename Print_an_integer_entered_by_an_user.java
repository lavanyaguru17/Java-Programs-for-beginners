
import java.util.Scanner;

class Print_an_integer_entered_by_an_user {

    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = reader.nextInt();
        System.out.print("You entered number: " + number);
    }
}
