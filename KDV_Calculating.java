import java.util.Scanner;

public class KDV_Calculating {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        System.out.println("lütfen KDV'li tutarı giriniz :");
        double tutar,KDVmiktari,KDVliTutar,KDVsizTutar,KDVmiktarsekiz,KDVlitutarsekiz;
                tutar = inp.nextFloat();

                KDVmiktari=tutar*0.18;
                KDVliTutar=tutar+KDVmiktari;
                KDVmiktarsekiz =tutar*0.08;
                KDVlitutarsekiz=tutar+KDVmiktarsekiz;


        System.out.println("KDV'siz tutar = "+tutar);
        String b = (tutar<1000) ? ("KDV'li tutar (%18) = "+KDVliTutar + " \nKDV Miktarı(%18) = "+KDVmiktari): ("KDV'li tutar (%8) = "+KDVlitutarsekiz +"\nKDV Miktarı(%8) = "+KDVmiktarsekiz);
        System.out.println(b);


    }
}
