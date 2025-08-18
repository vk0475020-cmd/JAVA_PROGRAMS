import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a 2 no's for  swaping");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("before swaping");
        System.out.println("a="+a );
        System.out.println("b="+b);
         int temp=a;
         a=b;
         b=temp;
        System.out.println("after swaping");
        System.out.println("a="+a);
        System.out.println("b="+b);



//        now swapping without using temp variable
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println("a="+a);
//        System.out.println("b="+b);



    }
}
