package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {
    static void hashSetExample(){
        HashSet<Integer> st = new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(2);
        System.out.println(st); //1,2,3
        st.add(1);
        st.add(2);
        st.add(48);
        st.add(15);
        System.out.println(st); //unordered list
        st.remove(2); //removed
        System.out.println(st.contains(2)); //false
        System.out.println(st.size()); //2
    }

    static void linkedHashSetExample(){
        LinkedHashSet<Integer> st = new LinkedHashSet<>();
        st.add(1);
        st.add(2);
        st.add(2);
        System.out.println(st); //1,2,3
        st.add(1);
        st.add(2);
        st.add(48);
        st.add(15);
        System.out.println(st); //ordered list
        st.remove(2); //removed
        System.out.println(st.contains(2)); //false
        System.out.println(st.size()); //2
    }
    static void treeSet(){
        TreeSet<Integer> st = new TreeSet<>();
        st.add(1);
        st.add(2);
        st.add(2);
        System.out.println(st); //1,2,3
        st.add(1);
        st.add(2);
        st.add(48);
        st.add(15);
        System.out.println(st); //sorted list
        st.remove(2); //removed
        System.out.println(st.contains(2)); //false
        System.out.println(st.size()); //2
    }
    public static void main(String[] args) {
        System.out.println("HashSet: ");
        hashSetExample();
        System.out.println("Linked Hashset: ");
        linkedHashSetExample();
        System.out.println("TreeSet: ");
        treeSet();
    }
}
