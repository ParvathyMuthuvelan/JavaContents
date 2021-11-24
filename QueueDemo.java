package com.training.collection;

import java.util.LinkedList;
import java.util.Queue;
  
public class QueueDemo {
  
    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>();
  
    
        for (int i = 1; i <= 5; i++)
            q.add(i);
  
            System.out.println("Elements of queue " + q);
  
        // To remove the head of queue.
        int element = q.remove(); //throws exception if queue is empty
        System.out.println("removed element :" + element);
  System.out.println("After remove");
        System.out.println(q);
  
        // To view the head of queue
        int head = q.peek();
        System.out.println("head of queue :"  + head);
        System.out.println("After peek Queue elements :"+q);
  
         int size = q.size();
        System.out.println("Size of queue :" + size);
        element=q.poll(); //returns null if queue is empty
        System.out.println("After poll Queue elements :"+q);
        q.add(10);
        System.out.println("After adding Queue elements :"+q);
    }
}
