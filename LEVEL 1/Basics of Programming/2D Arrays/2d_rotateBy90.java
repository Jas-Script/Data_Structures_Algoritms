import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
         Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][] = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        transpose(arr);
        colchange(arr);
        display(arr);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void transpose(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<=i;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
    }
    public static void colchange(int[][] arr){
         for (int i = 0; i < arr.length; i++) {
            int si = 0;
            int ei = arr[0].length - 1;
            while (si < ei) {

                int temp = arr[i][si];
                arr[i][si] = arr[i][ei];
                arr[i][ei] = temp;

                si++;
                ei--;
            }
        }
    }

}