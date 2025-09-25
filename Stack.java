import java.util.*;
public class Stack {
    int top;
    int Size=5;
    int stack []=new int[Size];
     Stack(){
        top=-1;
    }
    void push(int value){
        if(isFull())  // if(top==Size-1)
        {
            System.out.println("Stack Overflow");
        }
        else{
            top++;
            stack[top]=value;
            System.out.println("Pushed "+value+" to stack");
        }
    }
    
    boolean isFull() {
        return top == Size - 1;
    }
     void pop() {
    if (isEmpty()) {
        System.out.println("Stack Underflow");
    } else {
        int poppedValue = stack[top];
        top--;
        System.out.println("Popped " + poppedValue + " from stack");
    }
}
    boolean isEmpty(){
        return top==-1;
        }
        
   
    public static void main(String[] args){
       // Scanner sc=new Scanner(System.in);
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        
       s.pop();
      // s.peek();
    }
    
    }

