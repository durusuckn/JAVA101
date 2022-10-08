import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner index=new Scanner(System.in);
        System.out.println("----------UÇAK BİLETİ FİYATI HESAPLAMA PROGRAMINA HOŞGELDİNİZ---------------");
        System.out.println("Lütfen KM cinsinden gitmek istediğiniz mesafeyi giriniz:");

        double mesafe=index.nextDouble();

        System.out.println("Yaş: ");

        int yas=index.nextInt();

        System.out.println("Bilet tipiniz:\n1- Tek-Yön\n2- Gidiş-Dönüş");

        int tip=index.nextInt();
        double toplam;
        if(mesafe>=0 && yas>=0 && tip==1 || tip==2){
            if(tip==1){
                toplam=(0.10*mesafe);
                if(yas<=12){
                    toplam=toplam/2;
                    System.out.println("Toplam:" +toplam);
                } else if (yas>12&&yas<=24) {
                    toplam=toplam-(toplam*10/100);
                    System.out.println("Toplam: "+toplam);
                } else if (yas>=65) {
                    toplam=toplam-(toplam*30/100);
                    System.out.println("Toplam: "+toplam);
                }
                else{
                    System.out.println("Toplam: "+toplam);
                }
            }
            else{
                toplam=2*(0.10*mesafe);
                toplam=toplam-(0.2*toplam);
                if(yas<=12){
                    toplam=(toplam/2);
                    System.out.println("Toplam:" +toplam);
                } else if (yas>12&&yas<=24) {
                    toplam=toplam-(toplam*10/100);
                    System.out.println("Toplam: "+toplam);
                } else if (yas>=65) {
                    toplam=toplam-(toplam*30/100);
                    System.out.println("Toplam: "+toplam);
                }
                else{
                    System.out.println("Toplam: "+toplam);
                }

            }
        }
        else {
            System.out.println("Hatalı Veri Girişi Yaptınız Lütfen Tekrar Deneyiniz...");
        }
    }
}