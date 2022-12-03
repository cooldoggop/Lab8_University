import java.util.*;
import static java.lang.Math.*;
public class lab_8 {
  /*  public static int[] strtoarr(String input) {
        int arr[] = new int[input.length()];
        for (int i = 0; i < input.length(); i++){
           arr[i] = input[i];
        }
    }*/
    public static double[] num1(int n, double arr[]){
        double result = 0; int i,j;
        double[] arr1 = new double[n];
        for (i = 0; i< n; i++){
            result += arr[i] * pow(6,i);
       }
        //all is ok ^
       for (i = 0; i < n; i++){
           arr[i] = (int)(result%10);
           result *= 0.1;
       }
       for (i = 0,j = n-1; i < n; i++, j--){
           arr1[j] = arr[i];
       }
       return arr1;
    }
    public static int[] num4(int arr[],int n) {
        for (int i = 0; i < n; i++) {
            int min = arr[i];
            int minnum = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minnum = j;
                }
            }
            int a = arr[i];
            arr[i] = min;
            arr[minnum] = a;
        }
        return arr;
    }
    public static int num3(double arr[], double a, double b){
        int dotsout = 0;
        for (int i = 0; i < arr.length - 1; i += 2) {
            if (pow(arr[i], 2) / pow(a, 2) + pow(arr[i + 1], 2) / pow(b, 2) > 1) {
                dotsout += 1;
            }
        }
        return dotsout;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input number of ex");
        int num = in.nextInt();
        int n;
        switch (num){
            case 1:
                System.out.println("Input length of number");
                n = in.nextInt();
                boolean check = true;
                double[] arr = new double[n];
                System.out.println("Input number for transfer");
                for (int i = 0; i < n; i++){
                    arr[i] = in.nextInt();
                    if (arr[i]>=6 || arr[i] < 0){check = false;}
                }
                if (check == true){
                    arr = num1(n,arr);
                    System.out.println(Arrays.toString(arr));
                }
                break;
            case 3:
                System.out.println("Input dots kol-vo");
                n = in.nextInt();
                double[] arr3 = new double[2*n];
                for (int i = 0; i < n; i++){arr3[i] = in.nextDouble();}
                System.out.println("Input a & b");
                double a = in.nextDouble();
                double b = in.nextDouble();
                System.out.println("Dots outside elipse" + num3(arr3,a,b));
                break;
            case 4:
                System.out.println("Input length");
                n = in.nextInt();
                int[] arr4 = new int[n];
                for (int i = 0; i < n; i++){arr4[i] = in.nextInt();}
                System.out.println(Arrays.toString(num4(arr4,n)));
                break;
        }
    }
}
