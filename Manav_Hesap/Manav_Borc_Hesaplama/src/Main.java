import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        //armut=2.14, elma=3.67, domates=1.11, muz=0.95,patlican=5.00;
        double kilo1,kilo2,kilo3,kilo4,kilo5;

        Scanner index=new Scanner(System.in);
        System.out.println("---GELAL Manava Hoşgeldiniz---");
        System.out.println("Armut(kg): ");
        kilo1=index.nextInt();
        System.out.println("Elma(kg): ");
        kilo2=index.nextInt();
        System.out.println("Domates(kg): ");
        kilo3=index.nextInt();
        System.out.println("Muz(kg): ");
        kilo4=index.nextInt();
        System.out.println("Patlıcan(kg): ");
        kilo5=index.nextInt();

        double toplam=(kilo1*2.14)+(kilo2*3.67)+(kilo3*1.11)+(kilo4*0.95)+(kilo5*5.00);
        System.out.println("Toplam Borcunuz: "+toplam);



    }
}