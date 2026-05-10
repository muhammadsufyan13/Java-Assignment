import java.util.Scanner;

public class BinaryConverterC {

    public static int[] convert(int number) {
        if (number == 0) {
            return new int[]{0};
        }

        int temp = number;
        int length = 0;
        while (temp > 0) {
            length++;
            temp /= 2;
        }

        int[] binary = new int[length];
        temp = number;
        for (int i = length - 1; i >= 0; i--) {
            binary[i] = temp % 2;
            temp /= 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int value = input.nextInt();

        int[] bits = convert(value);

        System.out.print("Binary array: ");
        for (int b : bits) {
            System.out.print(b);
        }
        System.out.println();

        input.close();
    }
}
