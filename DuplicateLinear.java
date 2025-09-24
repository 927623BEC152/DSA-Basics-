import java.util.*;
public class DuplicateLinear
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
	    boolean found=false;
	    int key=sc.nextInt();
	    int pos =-1;
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]==key){
	        pos=i;
	        System.out.println(pos);
	        found=true;
	        }
	    }
	    if(!found){
	       
	        System.out.println("no value found");
	        
	    }
		sc.close();
	}
} 
    

