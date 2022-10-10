import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner index=new Scanner(System.in);
        int toplam=0;
        int sayi;

        //Girilen negatif bir sayı olana kadar toplayan

        do {
            System.out.println("Sayı Giriniz: ");
            sayi=index.nextInt();
            if(sayi%2==1){
                toplam=toplam+sayi;
            }
        }
        while(sayi>0);

        System.out.println("Girilen tek sayıların toplamı: "+toplam);
    }
}