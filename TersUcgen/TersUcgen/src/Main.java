import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner index=new Scanner(System.in);

        System.out.print("Ters üçgen için n sayısını giriniz:");
        int n=index.nextInt();

        for(int i=(n-1); i>=1; i--){
            for(int k=1; k<=(n-i); k++){
                System.out.print(" ");
            }

            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}