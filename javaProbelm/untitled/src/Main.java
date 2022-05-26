import java.util.Scanner;

public class Main {
   public static void sum(int a, int b){
      Integer sum= Integer.sum(a,b);
       System.out.println(sum);

   }
    public static void main(String[] args) {

//     Integer c=  sum(4,5);
//        System.out.println(c);
        Scanner sum=new Scanner(System.in);
        System.out.println("Enter First Number");
        Integer a=sum.nextInt();
        System.out.println("Enter Second Number");
        Integer b=sum.nextInt();
        sum(a,b);
      //  System.out.println(sum(a,b));

    }
}