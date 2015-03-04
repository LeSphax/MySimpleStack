package dcll.sker;


public class Cell<T>{
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
