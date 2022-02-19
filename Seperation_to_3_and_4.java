import java.util.Scanner;

public class Seperation_to_3_and_4 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int k;
        double m;
        System.out.println("bir sayı giriniz:");
        k= input.nextInt();

       for (int i = 0; i<=k; i++) {
           if ((i % 4 == 0) && (i % 3 == 0)) {
               System.out.println(i);
           }
       }
    }
}


