import jdk.jshell.spi.ExecutionControl;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner index=new Scanner(System.in);

        System.out.println("Lütfen kaç sayı gireceğinizi belirtiniz");
        int sayi=index.nextInt();
        System.out.println("Sayıları giriniz");
        int i =0;
        int toplam=0;
        int sayi1;
        while (i<sayi){

            sayi1= index.nextInt();
            if(sayi1%2==0){
                toplam=toplam+sayi1;
                i++;

            }
            else{
                i++;
                continue;
            }

        }
        System.out.println("Çift olan sayıların toplamı: "+toplam);

        int a,b;
        int toplam2=0;
        System.out.println("Hem üçle hem de dört ile tam bölünebilen sayılarımız on ikiye de tam olarak bölünür. Lütfen kaç sayı için işlem yapacağınızı giriniz :");
        a=index.nextInt();
        int j=1;
        while (j<=a){
            b=index.nextInt();
            if(b%4==0 && b%3==0){

                toplam2=toplam2+b;
                j++;
            }
            else {
                j++;

            }
        }
        System.out.println("12 ile tam bölünen sayılarımızın toplamı: "+toplam2);

    }
}