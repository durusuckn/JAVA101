
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double boy,kilo;

        Scanner index=new Scanner(System.in);

        System.out.println("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy=index.nextDouble();
        System.out.println("Lütfen Kilonuzu kg cinsinden giriniz: ");
        kilo=index.nextDouble();

        double bkIndex=kilo/(boy*boy);

        System.out.println("Vücut Kitle Indexiniz: "+ bkIndex);


    }
}