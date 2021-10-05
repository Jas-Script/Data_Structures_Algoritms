import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc= new Scanner(System.in);
    int n1=sc.nextInt();
    int m1=sc.nextInt();
    int[][]a1= new int[n1][m1];
    for(int i=0;i<n1;i++){
        for(int j=0;j<m1;j++){
            a1[i][j]=sc.nextInt();
        }
    }
     int n2=sc.nextInt();
    int m2=sc.nextInt();
    int[][]a2= new int[n2][m2];
    for(int i=0;i<n2;i++){
        for(int j=0;j<m2;j++){
            a2[i][j]=sc.nextInt();
        }
    }
    if(m1!=n2){
        System.out.println("Invalid input");
        return;
    }
    int[][] m= new int[n1][m2];
    for(int i=0;i<n1;i++){
        for(int j=0;j<m2;j++){
            for(int k=0;k<n2;k++){
                m[i][j]+=a1[i][k]*a2[k][j];
            }
        }
    }
    for(int i=0;i<n1;i++){
        for(int j=0;j<m2;j++){
         System.out.print(m[i][j]+" ");   
        }
        System.out.println();
    }
 }

}