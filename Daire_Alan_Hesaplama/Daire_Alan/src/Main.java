import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi=3.14;
        int yaricap;
        Scanner index=new Scanner(System.in);

        System.out.println("Alan ve Çevresini Hesaplamak istediğiniz Dairenin Yarıçapını Giriniz: ");

        yaricap= index.nextInt();

        double alan,cevre;

        cevre=2*pi*yaricap;

        alan=pi*yaricap*yaricap;
        System.out.println("Dairenin merkez açı ölçüsünü giriniz: ");
        int aci=index.nextInt();

        double daireDilim=(pi*(yaricap*yaricap)*aci)/360;



        System.out.println("Dairenin Alanı: "+alan+"\nDairenin Çevresi:"+cevre+"\nAçısı Girilen Daire Alanı:"+ daireDilim);



    }
}