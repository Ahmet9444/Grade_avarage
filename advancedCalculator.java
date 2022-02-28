import java.util.Scanner;

public class advancedCalculator {

    static int sum(int a,int b){
        int result = a+b;
        System.out.println("Toplam deger = "+result);
        return result;
    }
    static int minus(int a,int b){
        int result = a-b;
        System.out.println(a+"-"+b+" = "+result);
        return result;
    }
    static int multiplication(int a,int b){
        int result = a*b;
        System.out.println(a+"Çarpım"+b+" = "+result);
        return result;

    }
    static int division(int a,int b){
        int result = a/b;
        System.out.println(a+"/"+b+" = "+result);
        return result;
    }
    static int pow(int a,int b){
        int result = 1;
        for (int i=1;i<=b;i++){
            result*=a;
        }
        System.out.println(a+" üssü "+b+" = "+result);
        return result;
    }
    static int mod(int a,int b){
        int result = a%b;
        System.out.println(a+" mod "+b+" = "+result);
        return result;
    }

    static int dikCev(int a,int b){
        int result = 2*(a+b);
        System.out.println("Dikdörtgenin çevresi = "+result);
        return result;

    }
    static int dikAlan(int a,int b){
        int result = a*b;
        System.out.println("Dikdörtgenin Alanı = "+result);
        return result;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int select;

        String menu =   "1-Toplama\n" +
                        "2-Çıkarma\n" +
                        "3-Çarpma\n" +
                        "4-Bölme\n" +
                        "5-Üslü Sayı Hesaplama\n" +
                        "6-Mod alma\n" +
                        "7-Dikdörtgen Alan ve Çevre Hesabı\n" +
                        "0-Çıkış";
        while (true){
            System.out.println("==============================");
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz :");
            select= scan.nextInt();
            if (select==0){
                break;
            }
            System.out.print("ilk sayıyı giriniz =");
            int a= scan.nextInt();
            System.out.print("ikinci sayıyı giriniz =");
            int b= scan.nextInt();

            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    multiplication(a,b);
                    break;
                case 4:
                    division(a,b);
                    break;
                case 5:
                    pow(a,b);
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    dikCev(a,b);
                    dikAlan(a,b);
                    break;

            }
        }
    }
}
