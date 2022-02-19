import java.util.Scanner;

public class Factorial_calculating {
    public static void main(String[] args) {
        int n,r;
        double total1 = 1,total2=1,total3=1;

        Scanner input = new Scanner(System.in);
        System.out.print("C(n,r) için 'n' sayısını giriniz: ");
        n= input.nextInt();
        System.out.print("C(n,r) için 'r' sayısını giriniz: ");
        r= input.nextInt();

        for (int i=1;i<=n;i++){
            total1*=i;
        }

        for (int k=1;k<=r;k++){
            total2*=k;
        }

        for (int m=1;m<=(n-r);m++){
            total3*=m;
        }
        System.out.println("C(n,r) kombinasyonu = "+(total1/(total2*total3)));

    }
}
