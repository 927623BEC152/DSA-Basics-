import java.util.*;
public class BubbleShort {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Size of the Array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the array Elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                } 

            }
        }
        for(int i=0;i<n;i++){
            System.out.println("Shorted Array : "+arr[i]);
        }

    }
    
}
