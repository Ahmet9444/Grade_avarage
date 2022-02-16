import java.util.Scanner;

public class body_mass_index {
    public static void main(String[] args){
        double boy,kilo,index;
        Scanner input=new Scanner(System.in);

        System.out.print("Boy ölçüsünü giriniz =");
        boy= input.nextDouble();
        System.out.print("Kilonuzu giriniz =");
        kilo= input.nextDouble();

        index=kilo/(boy*boy);

        System.out.println("Vücut kitle endeksiniz ="+index);
    }
}
