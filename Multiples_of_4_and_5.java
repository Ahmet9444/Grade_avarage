import java.util.Scanner;

public class Multiples_of_4_and_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
       System.out.print("sayi giriniz: ");
       number= scan.nextInt();

        for (int i=1;i<=number;i*=4){
            System.out.println("4 ün katları= "+i);
        }
        for (int k=1;k<=number;k*=5){
            System.out.println("5 in katları= "+k);
        }
    }
}
