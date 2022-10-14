import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner index=new Scanner(System.in);
        int n,x;
        System.out.println("Taban: ");
        n=index.nextInt();
        System.out.println("Kuvvet: ");
        x=index.nextInt();

        int us=1;
        for(int i=1;i<=x;i++){
            us*=n;
        }
        System.out.println("Üslü Sayı Hesabı Sonucu: "+us);
    }
}