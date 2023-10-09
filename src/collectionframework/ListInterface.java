package collectionframework;
import java.util.*;
public class ListInterface {
    public static void arrayListExample(){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l); //1,2,3
        System.out.println(l.get(1)); //1-based indexing =>2
        l.set(1,10); //modify at index i=1
        System.out.println(l); //1,10,3
        System.out.println(l.contains(10)); //true
    }
    static void linkedListExample(){
        LinkedList<Integer> li = new LinkedList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        System.out.println(li); //1,2,3
        System.out.println(li.get(1)); //1-based indexing =>2
        li.set(1,10); //modify at index i=1
        System.out.println(li); //1,10,3
        System.out.println(li.contains(10)); //ture
    }
    public static void stackExample(){
        Stack<String> str = new Stack<>();
        str.push("pw");
        str.push("skills");
        System.out.println(str.peek());  //skills
        System.out.println(str.pop()); //skills (will also remove it)
        System.out.println(str.peek()); //pw
        System.out.println(str.size()); //1
        System.out.println(str.empty()); //false
    }
    public static void main(String[] args) {
        System.out.println("ArrayList: ");
        arrayListExample();
        System.out.println("LinkedList: ");
        linkedListExample();
        System.out.println("Stack: ");
        stackExample();
    }
}
