import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen hesaplamak istediğiniz yılı giriniz:");
        year= input.nextInt();

        if(year%400==0){
            System.out.println("Artık yıldır!!");
        }
        else if(year%100==0){
            System.out.println("Artık yıl değildir!!");
        }
        else if(year%4==0){
            System.out.println("Artık yıldır!!");
        }
        else{
            System.out.println("Artık yıl değildir!!");
        }

    }
}
