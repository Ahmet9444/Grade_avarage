import java.util.Scanner;

public class Airlines_Ticket_Price {
    public static void main(String[] args) {
        int km, yas, yoltip;
        double toplamtutar, indirimlitutar,sontutar;
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Gideceğiniz mesafeyi KM cinsinden giriniz:");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz:");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz : \n1-> Tek yön \n2-> Gidiş Dönüş\n");
        yoltip = input.nextInt();


        if (km > 0 && yas > 0) {
            toplamtutar = km * 0.10;

            switch (yoltip){
                case 1:
                    if (yas<12){
                    indirimlitutar = toplamtutar/2;
                        System.out.println(indirimlitutar);
                }
                else if (12<=yas && yas<=24){
                    indirimlitutar=toplamtutar*0.9;
                        System.out.println(indirimlitutar);
                }else if(yas>65){
                    indirimlitutar=toplamtutar*0.7;
                        System.out.println(indirimlitutar);
                }
                else {
                    isError = true;
            }break;
                case 2:
                    if (yas<12){
                        indirimlitutar = toplamtutar/2;
                        sontutar=indirimlitutar*0.8*2;
                        System.out.println(sontutar);
                    }
                    else if (12<=yas && yas<=24){
                        indirimlitutar=toplamtutar*0.9;
                        sontutar=indirimlitutar*0.8*2;
                        System.out.println(sontutar);
                    }else if(yas>65){
                        indirimlitutar=toplamtutar*0.7;
                        sontutar=indirimlitutar*0.8*2;
                        System.out.println(sontutar);
                    }
                    else {
                        isError = true;
                    }
                    break;

            }
        }else {
            isError = true;

            }
        if (isError){
            System.out.println("hatalı giriş tekrar deneyiniz!!");
        }

        }

    }

