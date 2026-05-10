import java.util.Scanner;

public class BinaryConverterB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        StringBuilder binary = new StringBuilder();
      
        for (int n = num; n > 0; n /= 2) {
            int rem = n % 2; 
            binary.insert(0, rem); 
        }

        if (binary.length() == 0) {
            binary.append("0");
        }

        System.out.println("Binary of " + num + " = " + binary);

        sc.close();
    }
}
