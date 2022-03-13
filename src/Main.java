import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Sayı adedi giriniz: ");
        Scanner scan = new Scanner(System.in);
        int data = scan.nextInt();
        int[] value = new int[data];
        for (int i = 0; i < data; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz :");
            value[i] = scan.nextInt();
        }
        Arrays.sort(value);
        System.out.println("\nEn büyük sayı : " + value[data - 1]);
        System.out.println("En küçük sayı : " + value[0]);
    }
}
