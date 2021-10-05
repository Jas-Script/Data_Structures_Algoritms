import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] a= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int i=0;
        int j=0;
        int turn=0;
        while(i>=0&&i<n&&j>=0&&j<m){
            turn+=a[i][j];
            turn=turn%4;
            if(turn==0){
                j++;
            }
            else if(turn==1){
                i++;
            }
             else if(turn==2){
                j--;
            }
            else{
                i--;
            }
             if (i < 0) {
                i++;
                break;
            } else if (j < 0) {
                j++;
                break;
            } else if (i == a.length) {
                i--;
                break;
            } else if (j == a[0].length) {
                j--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }

}