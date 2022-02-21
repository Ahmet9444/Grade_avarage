import java.util.Scanner;

public class Min_Max_Value {
    public static void main(String[] args) {
        int maxVal=Integer.MIN_VALUE,minVal=Integer.MAX_VALUE;
        Scanner input = new Scanner(System.in);
        int numberSelect,enterNumber;
        System.out.println("Kaç tane sayi gireceksiniz :");
        numberSelect= input.nextInt();


        for (int i=1;i<=numberSelect;i++){
            System.out.print(i+". Sayıyı giriniz :");
            enterNumber= input.nextInt();

            if (maxVal<enterNumber){
                maxVal=enterNumber;
            }
            if (minVal>enterNumber){
                minVal=enterNumber;
            }

             }
        System.out.println("Max :"+maxVal);
        System.out.println("Min :"+minVal);


    }
}

