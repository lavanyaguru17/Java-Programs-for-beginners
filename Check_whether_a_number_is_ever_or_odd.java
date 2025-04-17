//compile time
class Check_whether_a_number_is_ever_or_odd {

    public static void main(String[] args) {
        int num = 7;
        if (num % 2 == 0) {
            System.out.println("The number " + num + " is even");
        } else {
            System.out.println("The number " + num + " is odd");
        }
    }
}

//run time
import java.util.Scanner;
class Check_whether_a_number_is_ever_or_odd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = scanner.nextInt();
        String result = (num % 2 == 0) ? "even" : "odd";
        System.out.println(String.format("The number %d is %s", num, result));
    }
}
