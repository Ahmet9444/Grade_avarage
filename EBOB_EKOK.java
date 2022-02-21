import java.util.Scanner;

public class EBOB_EKOK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1,number2;
        System.out.print("Lütfen 1. sayıyı giriniz :");
        number1= input.nextInt();
        System.out.print("Lütfen 2. sayıyı giriniz :");
        number2= input.nextInt();
        int ebob=1;

        int i=1;
        while (i<=number1*number2){
            i++;
            if (i%number1==0 && i%number2==0){
                System.out.println("Ekok :"+i);
                break;
            }
        }
        int k=1;
        while(k<=number1 || k<=number2){
            k++;
            if (number1%k==0 && number2%k==0){
            ebob=k;
            }
        }
        System.out.println("Ebob :"+ebob);





                //--EBOB--//
        /*
        for (i=1;i<=number1;i++){
            if(number1%i==0 && number2%i==0){
               //System.out.println(i);
                ebob=i;
            }
        }
        System.out.println(ebob);*/
    }
}
