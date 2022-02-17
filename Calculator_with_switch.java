import java.util.Scanner;

public class Calculator_with_switch  {
    public static void main(String[] args){
        int n1,n2,select;
        Scanner input =new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz =");
        n1= input.nextInt();
        System.out.println("ikinci sayiyi giriniz =");
        n2= input.nextInt();
        System.out.println("lutfen bir işlem seçiniz =");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select= input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam ="+(n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma ="+(n1-n2));
                break;
            case 3:
                System.out.println("Çarpma ="+(n1*n2));
                break;
            case 4:

                String sonuc = (n2==0)?"Lütfen ikinci sayıyı 0'dan farklı giriniz!!":"bölme ="+(n1/n2);
                System.out.println(sonuc);
                break;
            default:
                System.out.println("Yanlış seçim lütfen dogru seçim yapınız!!");
        }
    }

}




