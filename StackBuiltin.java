import java.util.ArrayList;
public class StackBuiltin {
    public static void main(String[] args){
        ArrayList <Integer> s = new ArrayList <> ();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);
        s.add(60);
        System.out.println("Stack: " + s);
        System.out.println("Stack size: " + s.size());
        System.out.println("Popped element: " + s.remove(s.size() - 1));
        System.out.println("Top element: " + s.get(s.size() - 1));
        System.out.println("Is stack empty? " + s.isEmpty());
        System.out.println("Stack size: " + s.size());
        System.out.println("Stack after pop: " + s);




    }
    
}
