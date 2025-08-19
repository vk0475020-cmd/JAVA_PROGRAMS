import java.util.*;
public class ReverseOfNumber {
    public static void main(String[] args) {
        int a,b=0,x;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the no=");
        a=sc.nextInt();//123
        while(a!=0){
            x=a%10;
            b=x+b*10;
            a/=10;
        }
        System.out.println(b);
        //                                  OR
        //                             (USING STRING )


//        String str = Integer.toString(a);
//        System.out.print("Reversed number: ");
//        for(int i = str.length() - 1; i >= 0; i--) {
//            System.out.print(str.charAt(i));

    }
}
