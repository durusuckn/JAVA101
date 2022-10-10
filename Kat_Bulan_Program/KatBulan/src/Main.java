import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner index=new Scanner(System.in);
        System.out.println("Kaç sayı için işlem yapılacak: ");
        int gSayi;
        gSayi= index.nextInt();
        int i=1;
        int dSum,uSum;
        while(i<=gSayi){
            dSum= (int) Math.pow(4,i);
            uSum= (int) Math.pow(3,i);

            System.out.println("4'ün "+i+". kuvveti=" +dSum);
            System.out.println("3'ün "+i+". kuvveti=" +uSum);
            i++;
        }
    }
}