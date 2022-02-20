import java.util.Scanner;

public class ATM_Project_with_switch {
    public static void main(String[] args) {
    String userName, password;
    Scanner input = new Scanner(System.in);
    int right = 3;
    int select, balance = 6000;

    while (right > 0) {
        System.out.print("Lütfen kullanıcı adınızı giriniz :");
        userName = input.nextLine();
        System.out.print("Lütfen şifreyi giriniz :");
        password = input.nextLine();

        if (userName.equals("ahmet94") && password.equals("baba123")) {
            System.out.println("Benim bankama hoşgeldiniz :)");
            do {
                System.out.println("1-Para Çekme\n" +
                        "2-Para Yatırma\n" +
                        "3-Bakiye Sorgulama\n" +
                        "4-Çıkış Yap");
                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:");
                select = input.nextInt();
                switch (select){
                    case 1:
                        System.out.println("Lütfen çekmek istediğiniz tutarı giriniz:");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz!!\n");
                        } else {
                            balance -= price;
                            System.out.println("Yeni bakiyeniz :" + balance+"\n");
                        }
                        break;
                    case 2:
                        System.out.println("Yatırılacak olan tutarı giriniz :");
                        price = input.nextInt();
                        balance += price;
                        System.out.println("Yeni bakiyeniz :" + balance+"\n");
                        break;
                    case 3:
                        System.out.println("Hesabınızdaki bakiye :" + balance+"\n");
                        break;
                }
            }
            while (select != 4) ;
            System.out.println("Bizi seçtiğiniz için teşekkürler!!");
            break;

        }else{
            right--;
            System.out.println("Kullanıcı adı veya parola yanlış lütfen tekrar deneyeniz!");
            if (right == 0) {
                System.out.println("Hesabınız bloke olmuştur.Bankayla konuş.");
            } else {
                System.out.println("Kalan giriş hakkınız :" + right);
                }
            }
        }
    }
}
