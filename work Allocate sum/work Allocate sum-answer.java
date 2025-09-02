import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] res=new int[n][2];
        int maximum=0;
        for(int i=0;i<n;i++){
            res[i][0]=sc.nextInt();
            res[i][1]=sc.nextInt();
            maximum=Math.max(maximum,res[i][0]);
        }
        int[] arr=new int[maximum+1];
        Arrays.sort(res, (a, b) -> b[1] - a[1]);
        int total=0;
        for(int i=0;i<n;i++){
            int deadline=res[i][0];
            int profit=res[i][1];
            for(int j=deadline;j>0;j--){
                if(arr[j]==0){
                    arr[j]=profit;
                    total+=arr[j];
                    break;
                }
            }
        }
            System.out.println(total);
        
    }
}