import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        float urun;

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen ürün fiyatını giriniz: ");
        urun=input.nextFloat();

        float KDV=(urun*18)/100;
        float KDVPlus=(urun+KDV);
        System.out.println("KDV'siz Fiyat: "+ urun+ "TL");
        System.out.println( "KDV'li Fiyat: "+KDVPlus + "TL");
        System.out.println("KDV Tutarı: "+KDV + "TL");





    }
}
