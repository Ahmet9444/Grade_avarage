import java.util.Scanner;

public class Greengrocer {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5,toplam;
        double armutkilo,elmakilo,domkilo,muzkilo,patkilo;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kilo Armut? = ");
        armutkilo= input.nextDouble();
        System.out.print("Kaç kilo Elma? = ");
        elmakilo= input.nextDouble();
        System.out.print("Kaç kilo Domates? = ");
        domkilo= input.nextDouble();
        System.out.print("Kaç kilo Muz? = ");
        muzkilo= input.nextDouble();
        System.out.print("Kaç kilo Patlıcan? = ");
        patkilo= input.nextDouble();

        toplam = armut*armutkilo + elma*elmakilo + domates*domkilo + muz+muzkilo + patlican*patkilo;

        System.out.println("Toplam tutar = "+toplam);


    }
}
