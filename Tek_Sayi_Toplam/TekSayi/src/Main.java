import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner index=new Scanner(System.in);
        int toplam=0;
        int sayi;

        //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

        do {
            System.out.println("Sayı Giriniz: ");
            sayi=index.nextInt();
            if(sayi%4==0){
                toplam=toplam+sayi;
            }
        }
        while(sayi%2!=1);

        System.out.println("Girilen tek sayıların toplamı: "+toplam);
    }
}