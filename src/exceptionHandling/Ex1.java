package exceptionHandling;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

public class Ex1 {
    public static void main(String[] args) {
        int i, j, k=0;
        try {
            i = 10;
            j = 2;
            k = i / j;
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[7]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            //System.out.println("Cannot divide by 0");
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
        //All the operating system resources are closed in the finally block/ Prevent Memory Leakage
        finally{
            System.out.println("I am the boss");
        }
        System.out.println(k);
    }
}
