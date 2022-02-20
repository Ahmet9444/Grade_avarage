import java.util.Scanner;

public class Diamond_shape_with_stars {
    public static void main(String[] args) {
        int n;
        Scanner stars = new Scanner(System.in);
        System.out.print("Lütfen pozitif bir sayi giriniz:");
        n = stars.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int m=1;m<=(2*i-1);m++){
                System.out.print("*");
            }
            System.out.println(" ");

        }
        for (int a = n; a >= 1; a--) {
            for (int b = n-a+1; b >= 1; b--) {
                System.out.print(" ");
            }
            for (int c=(2*a-3);c>=1;c--){
                System.out.print("*");
            }
            System.out.println(" ");

        }


    }
}

