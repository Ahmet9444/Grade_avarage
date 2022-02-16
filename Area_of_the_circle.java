import java.security.cert.CertPathValidatorResult;
import java.util.Scanner;

public class Area_of_the_circle {
    public static void main(String[] args){
        double cevre,alan,pi=3.14,r,a,dilimcevre,dilimalan;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz =");
        r= input.nextDouble();

        cevre = 2*pi*r;
        alan = pi*r*r;
        System.out.println("Dairenin çevresi = "+cevre+"\nDairenin alanı = "+alan);

        System.out.print("\nDaire diliminin açısını giriniz =");
        a= input.nextDouble();

        dilimcevre=cevre*a/360;
        dilimalan=alan*a/360;
        System.out.println("Daire diliminin çevresi = "+dilimcevre+"\nDaire diliminin alanı = "+dilimalan);

    }
}
