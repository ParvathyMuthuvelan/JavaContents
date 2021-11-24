package com.training.collection;

import java.util.PriorityQueue;

class PriorityQueueDemo {
    
  
  public static void main(String args[])
  {
      // Creating empty priority queue
      PriorityQueue<Integer> pQueue = new PriorityQueue<>();

      // Adding items to the pQueue using add()
      pQueue.add(10);
      pQueue.add(20);
      pQueue.add(15);
System.out.println("queue elements ="+pQueue);
PriorityQueue<String> pq = new PriorityQueue<>();

pq.add("C");
pq.add("A");
pq.add("D");

System.out.println(pq);
      // Printing the top element of PriorityQueue
      //System.out.println(pQueue.peek());

      // Printing the top element and removing it from the PriorityQueue container
     // System.out.println(pQueue.poll());

      // Printing the top element again
     // System.out.println(pQueue.peek());
  }
}

