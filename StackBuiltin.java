import java.util.Stack;
public class StackBuiltin {
    public static void main(String[] args){
        Stack <Integer> s = new Stack <> ();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        System.out.println("Stack: " + s);
        System.out.println("Stack size: " + s.size());
        System.out.println("Popped element: " + s.pop());
        System.out.println("Top element: " + s.peek());
        System.out.println("Is stack empty? " + s.isEmpty());
        System.out.println("Stack size: " + s.size());
        System.out.println("Stack after pop: " + s);




    }
    
}
