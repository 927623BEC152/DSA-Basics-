import java.util.*;
public class MergeShort {
    public static void mergeshort(int []arr,int low,int upper){
        if(low<upper){
            int mid=(low+upper)/2;
             mergeshort(arr,low,mid);
        mergeshort(arr,mid+1,upper);
        merge (arr, low, mid, upper);
        }
    }
       
      public static void  merge (int []arr,int low,int mid,int upper){
        int n=upper-low+1;
        int [] b=new int[n];
           int  i=low;
           int  j=mid+1;
           int  k=low;
            while(arr[i]<=mid && arr[j] <=upper){
                if(arr[i]<=arr[j]){
                    b[k]=arr[i];
                    i++;
                    k++;
                }else{
                    b[k]=arr[j];
                    i++;
                    j++;
                }
            }
            if(i>mid){
                while(j<=upper){
                    b[k]=arr[j];
                    j++;
                    k++;
                }
            }else{
                while(i<=mid){
                    b[k]=arr[i];
                    i++;
                    k++;
                }
            }
            for(k=low;k<=upper;k++){
                arr[k]=b[k];
            }
        }
    
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            int [] arr=new int [n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            mergeshort(arr,0,arr.length-1);
            for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
        }
    }

