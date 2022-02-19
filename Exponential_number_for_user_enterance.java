import java.util.Scanner;
public class Exponential_number_for_user_enterance {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int userNumber,exponentailNumber,total=1;
        System.out.print("Lütfen üslü sayı için taban sayıyı giriniz : ");
        userNumber= input.nextInt();
        System.out.print("Lütfen üslü sayı için üs giriniz : ");
        exponentailNumber= input.nextInt();

        for (int i=1; i<=exponentailNumber;i++){
            total=total*userNumber;
        }
        System.out.println("Girilen sayının üslü cevabı : " +total );
    }
}
