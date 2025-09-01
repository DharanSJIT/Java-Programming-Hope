import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       char[] arr=new char[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.next().charAt(0);
       } 
        int c=0;
        int c1=0;
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]=='P'){
                c++;
            }
            else if(arr[i]=='T'){
                c1++;
            }
        }
        int[] police=new int[c];
        int[] theif=new int[c1];
        int poli=0;
        int thei=0;
        for(int i=0;i<n;i++){
            if(arr[i]=='P'){
                police[poli++]=i;  
            }
            else{
                theif[thei++]=i;
            }
        }
        int count=0;
        int i=0;
        int j=0;
        while(i<c && j<c1){
            int temp=Math.abs(police[i]-theif[j]);
            if(temp<=k){
                i++;
                j++;
                count++;
            }
            else if(police[i]<theif[j]){
                i++;
            }
            else{
                j++;
            }
        }
        
        System.out.println("Maximum thieves caught: "+count);
    }    
}