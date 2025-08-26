import java.util.*;
public class SecondAndThirdLargest {
    public static void main(String[] args) {
        int a;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of array:");
        a=sc.nextInt();
        int [] arr = new int[a];
        for (int i=0;i<a;i++){
            arr[i]=sc.nextInt();


        }Arrays.sort(arr);

        System.out.print(arr[a-2]+" ");
        System.out.print(arr[a-3]+" ");
//                                   or
        //    if no. is duplicating then use this


        
//        int count = 1;
//        int last = arr[n - 1]; // largest
//
//        for (int i = n - 2; i >= 0; i--) {
//            if (arr[i] != last) {
//                count++;
//                last = arr[i];
//            }
//            if (count == 3) {
//                System.out.println("Second Largest = " + arr[i + 1]);
//                System.out.println("Third Largest = " + arr[i]);
//                return;
//                            or
//                       if the no is negative



//        int distinctCount = 1;
//        int last = arr[n - 1];
//
//        int second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
//
//        for (int i = n - 2; i >= 0; i--) {
//            if (arr[i] != last) {
//                distinctCount++;
//                if (distinctCount == 2) {
//                    second = arr[i];
//                } else if (distinctCount == 3) {
//                    third = arr[i];
//                    break;
//                }
//                last = arr[i];
//                System.out.println("Second Largest = " + arr[i + 1]);
//                System.out.println("Third Largest = " + arr[i]);
//            }
        }

    }
}
