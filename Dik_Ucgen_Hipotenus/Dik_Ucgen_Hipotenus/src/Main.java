import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {

        Scanner index=new Scanner(System.in);

        System.out.println("Lütfen dik üçgenin bilinen kenar uzunluklarını giriniz");

        int a,b;

        a=index.nextInt();
        b=index.nextInt();

        int toplam= (a*a)+(b*b);

        double hipotenus;
        hipotenus=Math.sqrt(toplam) ;

        System.out.println("Hipotenüs: "+hipotenus);

        //ÜÇGENİN ÇEVRE VE ALAN HESABI

        double cevre=(a+b+hipotenus);

        System.out.println("Üçgenin Çevre Uzunluğu: " +cevre+ " dir.");

        double u=cevre/2;
        double alan2=u*(u-a)*(u-b)*(u-hipotenus);
        double alan=Math.sqrt(alan2);

        System.out.println("Üçgenin Alan Uzunluğu: "+alan+" dır");



    }
}