import java.util.Scanner;
public class Calculatin_area_of_triangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b,c,d,e;
        double area;

        System.out.print("Birinci kenarı giriniz = ");
        a= input.nextInt();

        System.out.print("İkinci kenarı giriniz = ");
        b= input.nextInt();

        System.out.print("Üçüncü kenarı giriniz = ");
        c= input.nextInt();

        d=(a+b+c)/2; //ücgenin çevresi bölü 2
        e=(d)*(d-a)*(d-b)*(d-c); // alan*alan
        area=Math.sqrt(e); //alan

        System.out.println("Üçgenin Alanı = "+area);



    }


}
