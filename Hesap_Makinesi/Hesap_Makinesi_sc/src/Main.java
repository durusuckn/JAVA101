import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("-----HESAP MAKİNESİ-----");

        System.out.println("1- Toplama İşlemi\n2- Çıkarma İşlemi\n3- Çarpma İşlemi\n4- Bölme İşlemi");
        Scanner index=new Scanner(System.in);

        System.out.println("Yapmak istediğiniz işlemi giriniz:");

        int islem=index.nextInt();
        System.out.println("Sayı 1:");
        double sayi1=index.nextDouble();
        System.out.println("Sayı 2:");
        double sayi2=index.nextDouble();


        switch (islem){
            case 1:
                System.out.println("Toplam: "+(sayi2+sayi1));
                break;
            case 2:
                System.out.println("Fark:" +(sayi1-sayi2));
                break;
            case 3:
                System.out.println("Çarpım: "+(sayi1*sayi2));
                break;
            case 4:
                System.out.println("Bölüm: "+ (sayi1/sayi2));
                break;
            default:
                System.out.println("Lütfen Geçerli bir işlem giriniz");
        }

    }
}