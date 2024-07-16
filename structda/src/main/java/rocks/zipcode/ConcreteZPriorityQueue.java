package rocks.zipcode;

import java.util.*;

// Helper class to pair element with its priority
class PriorityElement<E> implements Comparable<PriorityElement<E>> {
    E element;
    Integer priority;

    PriorityElement(E element, Integer priority) {
        this.element = element;
        this.priority = priority;
    }

    @Override
    public int compareTo(PriorityElement<E> other) {
        return this.priority.compareTo(other.priority);
    }
}

public class ConcreteZPriorityQueue<E> implements ZPriorityQueue<E> {
    private PriorityQueue<PriorityElement<E>> queue;

    public ConcreteZPriorityQueue() {
        this.queue = new PriorityQueue<>();
    }

    @Override
    public void enqueue(E element, Integer priority) {
        queue.add(new PriorityElement<>(element, priority));
    }

    @Override
    public E dequeue(Integer priority) {
        for (PriorityElement<E> item : queue) {
            if (item.priority.equals(priority)) {
                queue.remove(item);
                return item.element;
            }
        }
        throw new NoSuchElementException("No element found with the given priority.");
    }

    @Override
    public E peek(Integer priority) {
        for (PriorityElement<E> item : queue) {
            if (item.priority.equals(priority)) {
                return item.element;
            }
        }
        throw new NoSuchElementException("No element found with the given priority.");
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public int size(Integer priority) {
        int count = 0;
        for (PriorityElement<E> item : queue) {
            if (item.priority.equals(priority)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
