import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arrival=new int[n];
        int[] depart=new int[n];
        for(int i=0;i<n;i++){
            arrival[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            depart[i]=sc.nextInt();
        }
        Arrays.sort(arrival);
        Arrays.sort(depart);
        int i=1;
        int j=0;
        int p=1;
        int maxi=1;
        while(i<n && j<n){
            if(arrival[i]<depart[j]){
                p++;
                i++;
            }
            else{
                p--;
                j++;
            }
            maxi=Math.max(maxi,p);
        }
        System.out.println(maxi);
        
        
    }
}