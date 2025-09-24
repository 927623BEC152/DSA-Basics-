import java.util.*;
public class LinearSearch

{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter the size of the array");
	    int n=sc.nextInt();
	    int [] arr=new int [n];
	    System.out.println("Enter the array element: ");
	    for(int i=0;i<n;i++){
	    arr[i]=sc.nextInt();
	        
	    }
	    System.out.println("Enter the number to search");
	    int key=sc.nextInt();
	    int pos =-1;
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]==key){
	        pos=i;
	        break;
	        }
	    }
	    if(pos !=-1){
	        System.out.println(pos);
	    }else{
	        System.out.println("no value found");
	        
	    }
		sc.close();
	}
}