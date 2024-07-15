package rocks.zipcode;

import java.util.ArrayDeque;

public class ConcreteZStack<E> implements ZStack<E>{

    ArrayDeque<E> myDeque = new ArrayDeque<>();

    @Override
    public void push(E item) {
        myDeque.push(item);
    }

    @Override
    public E pop() {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'pop'");
        return myDeque.pop();
    }

    @Override
    public E peek() {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'peek'");
        return myDeque.peek();
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
        if (myDeque.size() == 0){
            return true;
        } else {
            return false;
        }

    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
//        throw new UnsupportedOperationException("Unimplemented method 'size'");
        return myDeque.size();

    }

}
