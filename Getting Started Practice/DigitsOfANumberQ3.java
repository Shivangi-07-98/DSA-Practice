import java.util.*;
public class DigitsOfANumberQ3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int div = 1;
        int temp = n;
        while (temp >= 10) {
            temp = temp / 10;
            div *= 10;
        }

        while (div >= 1) {
            int quo = n / div;
            System.out.print(quo);
            n = n % div;
            div = div / 10;
        }
    }
}