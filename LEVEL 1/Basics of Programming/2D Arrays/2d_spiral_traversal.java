import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int lr=0;
        int hr=n-1;
        int lc=0;
        int hc=m-1;
        int tno=n*m;
        int ctr=0;
        while(ctr<tno){
 for(int i=lr;i<=hr&&ctr<tno;i++){
            System.out.println(arr[i][lc]);
            ctr++;
        }
        lc++;
        for(int i=lc;i<=hc&&ctr<tno;i++){
            System.out.println(arr[hr][i]);
            ctr++;
        }
        hr--;
        for(int i=hr;i>=lr&&ctr<tno;i--){
            System.out.println(arr[i][hc]);
            ctr++;
        }
        hc--;
        for(int i=hc;i>=lc&&ctr<tno;i--){
            System.out.println(arr[lr][i]);
            ctr++;
        }
        lr++;
        }
       
    }

}