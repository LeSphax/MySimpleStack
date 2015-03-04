package dcll.sker;

public class SimpleStackImpl<Item> implements SimpleStack<Item>{

    int size;
    Cell<Item> head;

    public SimpleStackImpl(){
        size=0;
        head=null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void push(Item o) {
        Cell<Item> cell=new Cell<Item>(o,head);
        size++;
        head=cell;
    }

    @Override
    public Item peek() throws EmptyStackException {
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return head.getItem();
    }

    @Override
    public Item pop() throws EmptyStackException {
        if (isEmpty()){
            throw new EmptyStackException();
        }
        Item item=head.getItem();
        head=head.getNext();
        size--;
        return item;
    }

    class Cell<T>{
        T item;
        public Cell<T> next;

        public Cell(T item, Cell<T> next){
            this.item=item;
            this.next=next;
        }

        public T getItem(){
            return item;
        }

        public Cell<T> getNext(){
            return next;
        }
    }
}
