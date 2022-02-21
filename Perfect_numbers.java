import java.util.Scanner;

public class Perfect_numbers {
    public static void main(String[] args) {
        int number,i,summary=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen pozitif tam sayı giriniz :");
        number= input.nextInt();
        if (number>0){
            for (i=1;i<number;i++){
                if(number%i==0) { //sayıyı tam bölen sayılar -->i
                    // System.out.println(i);
                    summary=summary+i; //sayıyı tam bölen tam sayıların toplamı
                }
            }
            System.out.println(summary); //sayıyı tam bölen tam sayıların toplamı
            if(summary==number){
                System.out.println("mükemmel sayi");
            }else {
                System.out.println("mükemmel sayi değil!!");
            }


        }else {
            System.out.println("Lütfen pozitif tam sayı giriniz!!");
        }
    }
}
