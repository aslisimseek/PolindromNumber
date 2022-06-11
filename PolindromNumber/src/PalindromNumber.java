import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number..:");
        int number = scanner.nextInt();

        System.out.println(number + " is " + isPalindromNumber(number));
    }

    private static boolean isPalindromNumber(int number) {
        int temp = number;
        int reverseNumber = 0;
        int lastNumber = 0;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }
}
