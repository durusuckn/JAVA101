import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("-------GİRİŞ YAP-------");
        String username,password,passwordRm;
        Scanner index=new Scanner(System.in);
        System.out.println("Lütfen Kullanıcı adını giriniz:");
        username=index.nextLine();
        System.out.println("Lütfen şifrenizi giriniz:");
        password=index.nextLine();

        if (username.equals("patika") && password.equals("patika")){
            System.out.println("Başarılı bir şekilde giriş yapınız :)");
        }
        else {
            System.out.println("Şifreniz hatalı isterseniz şifreyi değiştirebilirsiniz\nŞifreyi değiştimek için 1'e değiştirmek istemezseniz 2'ye basın");
            int dogru=index.nextInt();
            switch (dogru){
                case 1:
                    System.out.println("Yeni Şifrenizi giriniz: ");
                    passwordRm=index.next();
                    if(passwordRm.equals("patika"))
                    {
                        System.out.println("Eski şifreniz ve yeni şifreniz aynı olamaz.");
                    }
                    else{
                            System.out.println("Şifreniz başarılı bir şekilde değiştirildi...");
                        }
                break;

                case 2:
                    System.out.println("Tekrar Giriş Yapmayı deneyebilirsiniz..");
                    break;
                default:
                    System.out.println("Lütfen sadece 1 veya 0 giriniz");
                    break;

            }
        }






    }
}