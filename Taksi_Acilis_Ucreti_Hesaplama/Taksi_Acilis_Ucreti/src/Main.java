import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner index=new Scanner(System.in);
        double kmDeger=2.20;
        int acilis=10;
        System.out.println("Lütfen gideceğiniz mesafeyi KM cinsinden giriniz");

        double km= index.nextDouble();

        double odenecek= acilis+(kmDeger*km);

        String taksimetre= odenecek<=20? "Ödenecek Tutar: 20 TL" : "Ödenecek Tutar:" +odenecek;

        System.out.println(taksimetre);




    }
}