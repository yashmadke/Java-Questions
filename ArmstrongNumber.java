import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isArmstrong(int n) {
        String numStr = Integer.toString(n);
        int numDigits = numStr.length();
        int sum = 0;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(isArmstrong(num));

        sc.close();
    }
}