import java.util.Scanner;

public class Exam_Score {
    public static void main(String[] args){
        int mat,muz,fzk,kimya,turkce;
        int matenot,muznot,fzknot,kimyanot,turknot;
        int mat2,muz2,fzk2,kimya2,turkce2;
        //int mat1=1,mat2=0,muz1=1,muz2=0,fiz1=1,fiz2=0,kim1=1,kim=0,tur1=1,tur2=0;
        Scanner input=new Scanner(System.in);

        System.out.print("Matematik notu: ");
        mat= input.nextInt();
         matenot = (mat>=0&&mat<=100)?1:0;
        mat2 = (mat>=0&&mat<=100)?mat:0;
        //System.out.println(matnot);

        System.out.print("Müzik notu: ");
        muz= input.nextInt();
         muznot = (muz>=0&&muz<=100)?1:0;
         muz2= (muz>=0&&muz<=100)?muz:0;
        //System.out.println(muznot);

        System.out.print("Fizik notu:");
        fzk= input.nextInt();
        fzknot= (fzk>=0&&fzk<=100)?1:0;
        fzk2=(fzk>=0&&fzk<=100)?fzk:0;
        //System.out.println(fzknot);

        System.out.print("Kimya notu: ");
        kimya= input.nextInt();
         kimyanot= (kimya>=0&&kimya<=100)?1:0;
        kimya2= (kimya>=0&&kimya<=100)?kimya:0;
        //System.out.println(kimyanot);

        System.out.print("Türkçe notu: ");
        turkce= input.nextInt();
         turknot= (turkce>=0&&turkce<=100)?1:0;
        turkce2= (turkce>=0&&turkce<=100)?turkce:0;
        //System.out.println(turkcenot);

        double avarage = (mat2+muz2+fzk2+kimya2+turkce2)/(matenot+muznot+fzknot+kimyanot+turknot);

        if(avarage<=55){
            System.out.println("\nOrtalama notunuz başarılı değil sınıfta kaldınız!!");
            System.out.println("Ortalama: "+avarage);
        }else{
            System.out.println("\nTebrikler sınıfı başarılı olarak geçtiniz!!");
            System.out.println("Ortalama: "+avarage);
        }
    }
}
