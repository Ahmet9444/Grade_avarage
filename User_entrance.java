import java.util.Scanner;

public class User_entrance {
    public static void main(String[] args){
        String userName, password;
        int select;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen kullanıcı adınızı giriniz =");
        userName= input.nextLine();
        System.out.print("Şifrenizi giriniz =");
        password= input.nextLine();

        if(userName.equals("ahmet94") && password.equals("1234")){
            System.out.println("Giriş yaptınız!!");
        }
        else {
            System.out.println("Kullanıcı adı yada şifre yanlış!\n Şifrenizi sıfırlamak ister misiniz?\n 1-Evet\n 2-Hayır");
            select= input.nextInt();
            if(select==1){
                Scanner inp = new Scanner(System.in);
                System.out.println("Lütfen yeni şifre giriniz:");
                String abc = inp.nextLine();
                if(abc.equals("1234")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz!");
                }else{
                    System.out.println("Şifre oluşturuldu");
                }

             }else if(select==2){
                System.out.println("Ekranı kapatabilirsiniz.İyi günler!");
            }
            else {
                System.out.println("Hatalı seçim yaptınız!");
            }

        }

    }
}
