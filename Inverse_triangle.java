import java.util.Scanner;

public class Inverse_triangle {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Ters üçgen için basamak değerini giriniz:");
        number= input.nextInt();
        for (int a=number;a>=1;a--){
            for (int b=number-a;b>=1;b--){
                System.out.print(" ");
            }
            for (int y=2*a-1;y>=1;y--){
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}
