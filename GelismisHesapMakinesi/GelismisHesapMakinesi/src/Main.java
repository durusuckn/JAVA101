import java.util.Scanner;
public class Main {

    static int toplama(int a,int b){
        return a+b;
    }
    static int cikarma(int a, int b){
        return a-b;
    }

    static int carpma(int a,int b){
        return a*b;
    }

    static double bolme(int a,int b){
        return a/b;
    }
    static double pow(int a,int b){
        double pow=Math.pow(a,b);
        return pow;
    }
    static int mod(int a, int b){
        int mod=a%b;
        return mod;
    }

    static int alan(int a, int b){
       return a*b;

    }
    static int cevre(int a,int b){
        return 2*(a+b);
    }
    static double ortalama(int a,int b){
        return (a+b)/2;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String menu="İşlemler:\n1-Toplama İşlemi\n2-Çıkarma İşlemi\n3-Çarpma İşlemi\n4-Bölme İşlemi\n5-Üslü Sayı Alma İşlemi\n6-Mod Alma İşlemi\n7-Dikdörgen Alan-Çevre Bulma İşlemi\n8-Aritmetik Ortalama";
        System.out.println(menu);
        int select;

        do{
            System.out.println("Lütfen yapmak istediğiniz işlemi belirtiniz");
            select=scan.nextInt();
            if(select>0&&select<9){
                int number1=scan.nextInt();
                int number2=scan.nextInt();
                switch (select){
                    case 1:{
                        System.out.println("Cevap: "+toplama(number1,number2));
                        break;
                    }
                    case 2:{
                        System.out.println("Cevap: "+cikarma(number1,number2));
                        break;
                    }
                    case 3:{
                        System.out.println("Cevap: "+carpma(number1,number2));
                        break;
                    }
                    case 4:{
                        System.out.println("Cevap: "+bolme(number1,number2));
                        break;
                    }
                    case 5:{
                        System.out.println("Cevap: "+pow(number1,number2));
                        break;
                    }
                    case 6:{
                        System.out.println("Cevap: "+mod(number1,number2));
                        break;
                    }
                    case 7:{
                        System.out.println("Alan: "+alan(number1,number2)+"Çevre: "+cevre(number1,number2));
                        break;
                    }
                    case 8:{
                        System.out.println("Cevap: "+ortalama(number1,number2));
                        break;
                    }
                    default:{
                        System.out.println("Lütfen Geçerli bir sayi giriniz");
                        break;
                    }
                }
            }
            else break;



        }
        while(true);
    }
}