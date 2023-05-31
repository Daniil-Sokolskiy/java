package homework4;

import java.util.LinkedList;
import java.util.Queue;

public class task2 {
    public static void main(String[] args) {
        LinkedList <Integer> link = new LinkedList<>();
        link.add(1);
        link.add(2);
        link.add(3);
        link.add(4);
        link.add(5);
        link.add(6); // первый в очереди на данный момент
        enqueue(4, link);
        System.out.println(link);
        dequeue(link);
        System.out.println(link);
        int fst = first(link);
        System.out.println(fst);
    }
    public static LinkedList <Integer> enqueue(Integer x, LinkedList <Integer> l) {
        Queue <Integer> qu = new LinkedList<Integer>();
        while(l.peek() != null) qu.add(l.pop());
        while(qu.peek() != x) l.add(qu.remove());
        l.addFirst(qu.remove());
        while(qu.peek() != null) l.add(qu.remove());
        return l;
    }
    public static LinkedList <Integer> dequeue(LinkedList <Integer> l) {
        Queue <Integer> qu = new LinkedList<Integer>();
        while(l.size() != 1) qu.add(l.pop());
        l.clear();
        while(qu.peek() != null) l.add(qu.remove());
        return l;
    }
    public static Integer first(LinkedList <Integer> l) {
        return l.getLast();
    }
}
