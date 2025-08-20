import java.util.Scanner;
public class PrimeNo {
    public static void main(String[] args) {
        int a, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no=");
        a = sc.nextInt();

        if (a < 2) {
            System.out.println("f**k you!! enter valid no");
            return;
        } else {
            for (int i = 2; i <= a/2; i++) {// a/2 because it id checking odd no
                if (a % i == 0) {
                    c = 1;
                    break;
                }
            }
        }

        if (c == 1) {
            System.out.println("not prime no");
        } else {
            System.out.println("prime no");
        }
    }
}
