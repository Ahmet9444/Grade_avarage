import java.util.Scanner;

public class Propose_the_events_according_to_the_temperature {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int heat;

        System.out.print("Sıcaklığı giriniz: ");
        heat= input.nextInt();

        if(heat<=5){
            System.out.println("hava kayak yapmak için uygun");
        }else if(heat>5&&heat<=15){
            System.out.println("Bu havada sinemaya gidebilirsin");
        }else if (heat>15&&heat<=25){
            System.out.println("Bu havada pikniğe gidebilirsin");
        }else if(heat>25){
            System.out.println("Bu havada yüzmeye gidebilirsin");
        }

    }
}
