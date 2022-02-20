import java.util.Scanner;

public class Sum_digit_place_for_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,basValue=0,result=0;
        System.out.print("sayi giriniz:");
        number= input.nextInt();
        System.out.print(number+"=");
        while(number!=0){

            basValue=number%10;
            result+=basValue;
            number/=10;
            System.out.print(basValue+"+");
        }

        System.out.println("="+result);

    }
}
