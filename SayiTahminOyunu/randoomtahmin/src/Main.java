import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int rand = random.nextInt(100);
        System.out.println(rand);

        Scanner scan = new Scanner(System.in);
        boolean isWin = false;

        int[] list = new int[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("================== TAHMİN " + (i + 1) + " ==================");
            System.out.print("Lütfen tahmininizi giriniz: ");
            int num = scan.nextInt();
            if (num > 0 && num < 100) {
                list[i] = num;
                int mutlak = Math.abs(rand - num);
                if (Math.abs(rand - num) > 50) {
                    System.out.println("Tahmininiz çok uzak");
                } else if (mutlak > 30 && mutlak < 50) {
                    System.out.println("Biraz daha yaklaşabilirsiniz");
                } else if (mutlak > 15 && mutlak < 30) {
                    System.out.println("Yanii ortalama");
                } else if (mutlak > 5 && mutlak < 15) {
                    System.out.println("Yaklaştın");
                } else if (mutlak < 5) {
                    System.out.println("Çok yakınsın aşırıı");
                }
            } else {
                System.out.println("Hatalı giriş yaptınız! Lütfen 0-100 aralığında bir değer girin! Kalan hakkınız: " + (4 - i));
                continue;
            }
            if (rand != num) {
                System.out.println("Hatalı tahmin! Kalan hakkınız: " + (4 - i));
            }
            if (rand == num) {
                System.out.println("Tebrikler tahmnininiz doğru! ");
                isWin = true;
            }
            System.out.println("Tahminleriniz: " + Arrays.toString(Arrays.copyOf(list, i + 1)));
            if (isWin) {
                i = 5;
            }
        }
    }
}