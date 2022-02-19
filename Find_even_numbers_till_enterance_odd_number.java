import java.util.Scanner;

public class Find_even_numbers_till_enterance_odd_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number=0,total=0;
        do{
            System.out.print("Bir sayı giriniz: ");
            number= scan.nextInt();
            if(number%2==0){
                    total+=number;
            }
        }while (number%2==0);
            System.out.println("Cift ve 4 ün katları olan sayıların toplamı: " + total);
        }
    }

