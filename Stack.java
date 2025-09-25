import java.util.*;
public class Stack {
    int top;
    int Size=5;
    int Stack []=new int[Size];
     Stack(){
        top=-1;
    }
    void push(int value){
        if(top==Size-1)  // if(top==Size-1)
        {
            System.out.println("Stack Overflow");
        }
        else{
            top++;
            Stack[top]=value;
            System.out.println("Pushed "+value+" to stack");
        }
    }
    
    boolean isFull() {
        return top == Size - 1;
    }
     int  pop() {
    if (top==-1) {
        System.out.println("Stack Underflow");
        return -1;  
    } else {
        int poppedValue = Stack[top];
        top--;
        System.out.println("Popped " + poppedValue + " from stack");
        return poppedValue;
    }
}
    boolean isEmpty(){
        return top==-1;
        }
        int peek(){
            if(top==-1){
                System.out.println("Stack is empty");
                return -1;
            }else{
                return Stack[top];
            }
        }
     void display(){
            if(top==-1){
                System.out.println("Stack is empty");
            }else{
                System.out.println("Stack elements:");
                for(int i=top;i>=0;i--){
                    System.out.println(Stack[i]);
                }
            }
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
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
        s.display();
        
    }
    
    }

