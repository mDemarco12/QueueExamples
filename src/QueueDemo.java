import java.util.*;

public class QueueDemo {

    //First: Create queue of Array
    public static void main(String[] args) {

         ArrayDeque aq = new ArrayDeque();
//
//        //Add to queue
//        aq.offer("Hi");
//        aq.offer(9);
//        aq.offer(8.7);
//
//        System.out.println(aq);
//
//        aq.offer("Hello");
//        System.out.println(aq);
//        aq.offer(65);
//        System.out.println(aq);
//
//        //Dequeue
//        System.out.println(aq.pop());
//        System.out.println(aq);
//
//        System.out.println(aq.pop());
//        System.out.println(aq);
//
//        aq.offer("New Element");
//        System.out.println(aq);
//
//        //Peek
//        System.out.println(aq.peek());
//        System.out.println(aq);

        //Create an object of type Deque by calling arrayDeque
       //Deque q = new ArrayDeque();

        //Array Based Queue
        Queue<String> q = new ArrayDeque<>();

        //Linked list Queue
        Queue<Integer> q1 = new LinkedList<>();

        //Priority Queue

        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.offer("S");
        pq.offer("N");
        pq.offer("F");
        pq.offer("A");
        pq.offer("D");

        System.out.println(pq);






    }



}
