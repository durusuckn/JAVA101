import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        /*Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin
         sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.*/


        int matematik;
        int fizik;
        int kimya;
        int turkce;
        int tarih;
        int muzik;

        System.out.println("lÜTFEN MATEMATİK NOTUNU GİRİNİZ:");
        Scanner input=new Scanner(System.in);
        matematik= input.nextInt();

        System.out.println("lÜTFEN FİZİK NOTUNU GİRİNİZ:");
        fizik= input.nextInt();

        System.out.println("lÜTFEN KİMYA NOTUNU GİRİNİZ:");
        kimya= input.nextInt();

        System.out.println("lÜTFEN TÜRKÇE NOTUNU GİRİNİZ:");
        turkce= input.nextInt();

        System.out.println("lÜTFEN TARİH NOTUNU GİRİNİZ:");
        tarih= input.nextInt();

        System.out.println("lÜTFEN MÜZİK NOTUNU GİRİNİZ:");
        muzik= input.nextInt();

        int toplam;
        toplam=(matematik+fizik+kimya+turkce+tarih+muzik);60
        double ortalama=toplam/6;
        System.out.println("Ortalama:" +ortalama);

        String durum= ortalama>=60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.println(durum);














    }
}
