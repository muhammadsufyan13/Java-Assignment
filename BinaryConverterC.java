import java.util.Scanner;

public class BinaryConverterD {

    public static String convert(int value) {
        if (value == 0) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        int n = value;

        while (n > 0) {
            sb.insert(0, n % 2);
            n /= 2;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        String binaryForm = convert(number);

        System.out.println("Binary form of " + number + " is: " + binaryForm);

        input.close();
    }
}
