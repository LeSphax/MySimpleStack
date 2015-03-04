package dcll.sker;


public class EmptyStackException extends Exception{
    public EmptyStackException(){
        System.out.println("You can't peek/pop an empty stack!");
    }
}
