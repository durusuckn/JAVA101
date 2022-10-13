import java.util.Scanner;
public class Main {
    static String isPalindrom(int number){
        int temp=number;
        int reversenumber=0;
        int lastnumber;
        while(temp!=0){
            lastnumber=temp%10;
            reversenumber=(reversenumber*10)+lastnumber;
            temp/=10;
        }
        if(reversenumber==number){

            return "Sayı Palindromdur.";
        }
        else {
            return "Sayı Palidrom değildir";
        }
    }
    public static void main(String[] args) {
        Scanner index=new Scanner(System.in);
        int sayi1,sayi2;
        System.out.println("Denemek istenilen sayıları giriniz");
        sayi1= index.nextInt();
        System.out.println(isPalindrom(sayi1));
        sayi2= index.nextInt();
        System.out.println(isPalindrom(sayi2));

    }
}