import java.util.Scanner;

public class Finding_horoscope {
    public static void main(String[] args) {
        int mouth,day;
        boolean isError=false;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğdugunuz ayı sayı olarak giriniz:");
        mouth= input.nextInt();
        System.out.print("Doğdugunuz günü sayı olarak giriniz:");
        day= input.nextInt();

        if(mouth==1){
            if (1<=day && day<=21){
                System.out.println("Oğlak burcu");
            }else if(22<=day && day<=31){
                System.out.println("Kova burcu");
            }
            else{
                isError=true;
            }
        }
        else if (mouth==2){
            if (1<=day && day<=19){
                System.out.println("Kova burcu");
            }else if(20<=day && day<=29){
                System.out.println("Balık burcu");
            }else{
                isError=true;
            }
        }
        else if (mouth==3){
            if (1<=day && day<=21){
                System.out.println("Balık burcu");
            }else if(22<=day && day<=31){
                System.out.println("Koç burcu");
            }
            else{
                isError=true;
            }
        }
        else if (mouth==4){
            if (1<=day && day<=20){
                System.out.println("Koç burcu");
            }else if(21<=day && day<=30){
                System.out.println("Boğa burcu");
            }
            else{
                isError=true;
            }
        }
        else if (mouth==5){
            if (1<=day && day<=21){
                System.out.println("Boğa burcu");
            }else if(22<=day && day<=31){
                System.out.println("İkizler burcu");
            }
            else{
                isError=true;
            }
        }
        else if (mouth==6){
            if (1<=day && day<=22){
                System.out.println("İkizler burcu");
            }else if(23<=day && day<=30){
                System.out.println("Yengeç burcu");
            }
            else{
                isError=true;
            }
        }
        else if (mouth==7){
            if (1<=day && day<=22){
                System.out.println("Yengeç burcu");
            }else if(23<=day && day<=31){
                System.out.println("Aslan burcu");
            }
            else{
                isError=true;
            }
        }
        else if (mouth==8){
            if (1<=day && day<=22){
                System.out.println("Aslan burcu");
            }else if(23<=day && day<=31){
                System.out.println("Başak burcu");
            }
            else{
                isError=true;
            }
        }
        else if (mouth==9){
            if (1<=day && day<=22){
                System.out.println("Başak burcu");
            }else if(23<=day && day<=30){
                System.out.println("Terazi burcu");
            }
            else{
                isError=true;
            }
        }
        else if (mouth==10){
            if (1<=day && day<=22){
                System.out.println("Terazi burcu");
            }else if(23<=day && day<=31){
                System.out.println("Akrep burcu");
            }
            else{
                isError=true;
            }
        }
        else if (mouth==11){
            if (1<=day && day<=21){
                System.out.println("Akrep burcu");
            }else if(22<=day && day<=31){
                System.out.println("Yay burcu");
            }
            else{
                isError=true;
            }
        }
        else if (mouth==12){
            if (1<=day && day<=22){
                System.out.println("Yay burcu");
            }else if(22<=day && day<=31){
                System.out.println("Oğlak burcu");
            }
            else{
                isError=true;
            }
        }
        else{
            isError=true;
        }
        if (isError){
            System.out.println("Hatalı giriiş tekrar dene!!");

        }
        
    }
}
