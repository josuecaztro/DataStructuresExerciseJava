package rocks.zipcode;

import java.sql.Array;
import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ConcreteZPriorityQueue<E> implements ZPriorityQueue<E> {

//    ArrayDeque<E> queue = new ArrayDeque<>();
    PriorityQueue<E> queue = new PriorityQueue<E>();
//    ZPriorityQueue<E> queue;


    @Override
    public void enqueue(E element, Integer priority) {
        queue.add(element);
//        throw new UnsupportedOperationException("Unimplemented method 'enqueue'");
    }

    @Override
    public E dequeue(Integer priority) {
        return queue.remove();
//        throw new UnsupportedOperationException("Unimplemented method 'dequeue'");
    }

    @Override
    public E peek(Integer priority) {
        return queue.peek();
//        throw new UnsupportedOperationException("Unimplemented method 'peek'");
    }

    @Override
    public int size() {
        return queue.size();
//        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public int size(Integer priority) {
        dequeue(priority);
        return queue.size();
//        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public boolean isEmpty() {
        return (queue.isEmpty());
//        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

}
