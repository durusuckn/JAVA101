import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Harmonik seri hesaplamak için n sayısını giriniz");
        int number=scan.nextInt();

        double harmonik=0;

        for(double i=1; i<=number;i++){
            harmonik+=1/i;
        }
        System.out.println(harmonik);


    }
}