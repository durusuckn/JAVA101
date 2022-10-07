import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
*/
        int matematik,fizik,turkce,kimya,muzik;

        Scanner index=new Scanner(System.in);

        System.out.println("Lütfen Matematikten aldığınız notu giriniz: ");

        matematik= index.nextInt();

        System.out.println("Lütfen Fizikten aldığınız notu giriniz: ");

        fizik= index.nextInt();

        System.out.println("Lütfen Türkçeden aldığınız notu giriniz: ");

        turkce= index.nextInt();

        System.out.println("Lütfen Kimyadan aldığınız notu giriniz: ");

        kimya= index.nextInt();

        System.out.println("Lütfen Müzikten aldığınız notu giriniz: ");

        muzik= index.nextInt();
        if(0<=matematik && matematik<=100 && 0<=fizik && fizik<=100 && 0<=turkce && turkce<=100 && 0<=kimya && kimya<=100 && 0<=muzik && muzik<=100 )
        {
            double ortalama= (matematik+fizik+turkce+kimya+muzik)/5;
            System.out.println("Ortalamanız: "+ortalama);

            if(ortalama<55){
                System.out.println("Malesef Sınıfta Kaldınız");
            }
            else {
                System.out.println("Tebrikler Sınıftan Geçtiniz.");
            }
        }
        else
        {
            System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz...");
        }





    }
}