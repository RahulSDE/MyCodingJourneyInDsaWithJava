package HeapsAndPriorityQueue.Heaps;

import java.util.PriorityQueue;

public class IsDuplicateAllowedInHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        System.out.println(pq + " " + pq.peek());
        pq.add(1);
        System.out.println(pq  + " " + pq.peek());
    }
}
