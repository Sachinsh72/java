package collectionframework;

import java.util.*;

public class QueueInterface {
    static void linkedListExample(){
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.peek()); //1
        System.out.println(q.poll()); //1 - also will remove
        System.out.println(q.peek()); //2
        System.out.println(q.isEmpty()); //false
        System.out.println(q.size()); //2
        System.out.println(q); //2,3
    }
    static void priorityQueueExample(){
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // default min pq
        //PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //we can make max pq
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek()); //5 - as min has high priority
        System.out.println(pq); //gurantee - top most priority element will be process rest has not.
        System.out.println(pq.poll()); //5
        System.out.println(pq);
        System.out.println(pq.peek()); //7
    }
    static void dequeueExample(){
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq); //2,1,3,4
        System.out.println(dq.pollFirst()); //2
        System.out.println(dq.pollLast()); //4
        System.out.println(dq); //1,3
    }
    public static void main(String[] args) {
        System.out.println("LinkedList: ");
        linkedListExample();
        System.out.println("PriorityQueue: ");
        priorityQueueExample();
        System.out.println("ArrayDequeue: ");
        dequeueExample();
    }
}
