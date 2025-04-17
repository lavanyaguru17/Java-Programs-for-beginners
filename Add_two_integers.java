//compile time
class Add_two_integers {

    public static void main(String[] args) {
        int first = 10;
        int second = 20;
        int result = first + second;
        System.out.print(first + " + " + second + " = " + result);
    }
}

//run time
import java.util.Scanner;
class Add_two_integers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int first = scanner.nextInt();
        System.out.print("Enter the second number:");
        int second = scanner.nextInt();
        int result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }
}
