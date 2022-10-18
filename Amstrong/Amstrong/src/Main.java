import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        number= input.nextInt();
        int basNumber=0,tenpNumber=number;
        int basValue;
        int result=0;
        while (tenpNumber!=0){
            tenpNumber/=10;
            basNumber++;
        }
        tenpNumber=number;
        while (tenpNumber!=0){
            basValue=tenpNumber%10;
            //System.out.println(basValue);
            tenpNumber/=10;
            result+=basValue;

        }
        System.out.print("Basamak sayıları toplamı: "+result);
    }
}