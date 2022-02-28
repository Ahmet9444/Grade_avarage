import java.util.Scanner;

public class PalindromNumber {

    static  boolean isPalindrom(int number){

        int temp=number, reverseNumber=0,lastNumber;
        while(temp!=0){
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp/=10;

        }

        if (number==reverseNumber){
        System.out.println("Girilen sayi polindrom sayıdır.\n " + reverseNumber+"="+number);
        }else {
            System.out.println("Girilen sayı bir polindrom sayısı değildir!!\n" + number+"!=" +reverseNumber);
        }
        return true;
    }
    public static void main(String[] args) {
        int number;
        System.out.println("Lütfen bir sayı giriniz :");
        Scanner input = new Scanner(System.in);
        number= input.nextInt();
        isPalindrom(number);


        }
    }

