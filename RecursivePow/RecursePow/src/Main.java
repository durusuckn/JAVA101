import java.util.Scanner;

public class Main {
    static double recursive(int a,int b){
        double pow=Math.pow(a,b);
        return pow;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("***Üst değer hesaplama***");
        do {

            System.out.println("Taban değeri:");
            int taban=scan.nextInt();
            System.out.println("Üs değeri: ");
            int us=scan.nextInt();
            System.out.println("Cevap: "+recursive(taban,us));
            if(us<0){
                break;
            }
        }
        while (true);
    }
}