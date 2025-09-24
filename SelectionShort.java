import  java.util.*;
import java.util.Scanner;
public class SelectionShort {
public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the Size of the Array");
    int n=sc.nextInt();
    int [] arr=new int[n];
        System.out.println("Enter the array Elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
      
        for(int i=0;i<n-1;i++){
            int minValue=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minValue]){
                    minValue=j;
                } 
            }
            int temp=arr[i];
                    arr[i]=arr[minValue];
                    arr[minValue]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.println("Shorted Array : "+arr[i]);
        }
        sc.close();
}
    
}
