import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Sıralamak için seçtiğiniz 3 sayıyı lütfen giriniz: ");
        Scanner index=new Scanner(System.in);

        double a=index.nextDouble();
        double b=index.nextDouble();
        double c=index.nextDouble();

        System.out.println("a="+a+ "\nb= "+b+ "\nc= "+c);

        if(a>b && a>c){
            if(b>c){
                System.out.println("c<b<a");
            }
            else if(b==c) {
                System.out.println("b=c<a");
            } else {
                System.out.println("b<c<a");
            }
        } else if (b>a && b>c) {

            if (a>c){

                System.out.println("c<a<b");
            } else if (a==c) {
                System.out.println("c=a<b");

            }
            else {
                System.out.println("a<c<b");
            }

        } else if (c>a && c>b) {

            if (a>b){
                System.out.println("b<a<c");
            } else if (a==b) {
                System.out.println("b=a<c");
            }
            else {
                System.out.println("a<b<c");
            }

        }
        else {
            System.out.println("a=b=c");
        }

    }
}