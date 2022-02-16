import java.util.Scanner;

public class Practical_Note_Avarage {
    public static void main(String[] args) {

        int mat,fizik,kimya,tarih,muzik,turkce;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu gir :");
        mat=input.nextInt();

        System.out.print("fizik notunu gir :");
        fizik=input.nextInt();

        System.out.print("kimya notunu gir :");
        kimya=input.nextInt();

        System.out.print("türkçe notunu gir :");
        turkce=input.nextInt();

        System.out.print("tarih notunu gir :");
        tarih=input.nextInt();

        System.out.print("Muzik notunu gir :");
        muzik=input.nextInt();

        double toplam = mat + muzik+turkce+tarih+kimya+fizik; // not: toplam double türünde olmalı ki double / double olarak tam sonuc versin
        double ort = toplam/6;

        System.out.println("tüm derslerin not ortalaması : " + ort);

        String b = (ort>=60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println("Sonuc : " +b);


    }

}
