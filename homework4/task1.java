package homework4;


import java.util.Deque;
import java.util.LinkedList;

public class task1 {
    public static void main() {
        LinkedList <Integer> ll = new LinkedList<>();
        ll.add(4);
        ll.add(11);
        ll.add(21);
        ll.add(42);
        ll.add(0);
        System.out.println(Reverse(ll));
    }
    public static Deque <Integer> Reverse(LinkedList <Integer> l) {
        Deque <Integer> deq = new LinkedList<Integer>(); 
        if (l.size()==0) {return deq;} 
        while(l.isEmpty() == false) {
            deq.add(l.pollLast());
        }   
        return deq;
    }
}

