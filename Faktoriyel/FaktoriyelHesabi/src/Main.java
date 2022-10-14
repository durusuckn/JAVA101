import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner index=new Scanner(System.in);
        int n,r,c;
        int c1=1;
        int c2=1;
        int c3=1;
        System.out.println("Lütfen hesaplamak istediğiniz kombinasyonu n,r şeklinde giriniz: ");
        n=index.nextInt();
        r=index.nextInt();

        int m=n-r;

        for(int i=1;i<=n;i++){
            c1=i*c1;
        }
        for(int i=1;i<=r;i++){
            c2*=i;
        }
        for (int i=1;i<=m;i++){
            c3*=i;
        }
        c=c1/(c2*c3);
        System.out.println("Kombinasyon: "+c);


    }
    }
