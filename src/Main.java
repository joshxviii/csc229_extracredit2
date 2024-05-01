import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a={3,5,12,450,1,1,5,6,23,6,8,9,321,2,3};

        System.out.println(RatioSum2(a));

        System.out.println(RatioSum1(a));

    }

    public static float RatioSum1(int[] list) {
        int[] temp = list;// create a temporary list so the original is unaffected.
        Arrays.sort(temp);// sort the array using the Arrays.sort method
        return ( (float)temp[temp.length-1]+temp[temp.length-2]) / (temp[0]+temp[1]);// get the sum of the first and last two numbers in the array and divide
    }// a solution that uses the Arrays.sort() method. O(n*log(n))

    public static float RatioSum2(int[] list) {

        int a,b,x,y;
        a=b=x=y = list[0];

        for (int i : list) {// compare each number in the array
            if (i>a) {// if 'i' is greater set 'a' to 'i' and set 'b' to what 'a' was previously.
                b=a;
                a=i;
            }
            else if (i>b)b=i;//if 'i' was not greater than 'a' check if it is greater than 'b' and set 'b' to 'i'.

            if (i<x){// if 'i' is smaller set 'x' to 'i' and set 'y' to what 'x' was previously.
                y=x;
                x=i;
            }
            else if (i<y) y=i;//if 'i' was not smaller than 'x' check if it is smaller than 'y' and set 'y' to 'i'.
        }

        return ((float)a+b) / (x+y);// get the sum of the first and second largest and divide by the sum of the first and second smallest numbers in the array.
    }// more involved solution by comparing values. O(n)

}