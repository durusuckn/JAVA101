import java.util.Scanner;
public class Main {
    static String asal(int a){
        for (int i=2;i<a;i++){
            int blm=a%i;
            if (blm==0&&a!=2){
                return "Asal Sayı değildir";
            }
        }
        return "Asal Sayıdır";
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int number=scan.nextInt();
        System.out.println(asal(number));

    }
}