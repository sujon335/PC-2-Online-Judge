
package jp.co.worksap.global;

import java.util.NoSuchElementException;



public class ImmutableQueue<E> {

    private static class ImmutableStack<E> {

        private E start;
        private ImmutableStack<E> end;
        private int size;

        private ImmutableStack() {
            this.start = null;
            this.end = null;
            this.size = 0;
        }

        private ImmutableStack(E data, ImmutableStack<E> end) {
            this.start = data;
            this.end = end;
            this.size = end.size + 1;
        }


        public ImmutableStack<E> toReverseStack() {
            ImmutableStack<E> s = new ImmutableStack<E>();
            ImmutableStack<E> temp = this;
            while (!temp.isEmpty()) {
                s = s.push(temp.start);
                temp = temp.end;
            }
            return s;
        }

        public boolean isEmpty() {
            return this.size == 0;
        }

        public ImmutableStack<E> push(E data) {
            return new ImmutableStack(data, this);
        }
    }

    private ImmutableStack<E> main;
    private ImmutableStack<E> flip;  /* the reverse stack of main */


    
    public ImmutableQueue() {
        this.main=new ImmutableStack<E>();
        this.flip=new ImmutableStack<E>();
    }

    private ImmutableQueue(ImmutableStack<E> main,ImmutableStack flip) {
        this.main=main;
        this.flip=flip;
    }

    public ImmutableQueue<E> enqueue(E e) {
        if(e==null)
            throw new IllegalArgumentException();
        return new ImmutableQueue<E>(this.main.push(e),this.flip);
    }

    public ImmutableQueue<E> dequeue() {
        if (this.isEmpty())
                throw new NoSuchElementException();
        if(!this.flip.isEmpty()){
            return new ImmutableQueue<E>(this.main,this.flip.end);
        } else {
            /*reversed the main stack into flip and cleared it*/
            return new ImmutableQueue<E>(new ImmutableStack<E>(),this.main.toReverseStack().end);
        }

    }

    private void balanceQueue() {
        this.flip = this.main.toReverseStack();
        this.main = new ImmutableStack<E>();
    }

    public E peek() {
        if (this.isEmpty())
                throw new NoSuchElementException();
        if(this.flip.isEmpty()){
            balanceQueue();
        }
        return this.flip.start;
    }

    public int size() {
        int ss=this.main.size+this.flip.size;
        return ss;
    }

    public boolean isEmpty() {
            return size() == 0;
    }

}
