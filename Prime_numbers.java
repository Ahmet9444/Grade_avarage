
public class Prime_numbers {
    public static void main(String[] args) {
       
        for (int i=2;i<=100;i++){
            int x=0;
           for (int k=2;k<i;k++){
               if (i%k==0){
                   x=1;
                   break;
               }
           }
           if(x==0){
               System.out.print(i+" ");
           }
        }
    }
}

