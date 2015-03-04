package dcll.sker;
import static org.junit.Assert.*;
import org.junit.Test;


public class SimpleStackTest {

    @Test
    public void testEmptyCreateStack(){
        SimpleStack<Integer> stack=new SimpleStackImpl<Integer>();
        
        assertTrue("A new stack should be empty", stack.isEmpty());
        assertEquals("A new stack has a size of 0",0,stack.getSize());
    }

    @Test
    public void testPush() throws EmptyStackException{
        SimpleStack<Integer> stack=new SimpleStackImpl<Integer>();
        Integer item=4;
        
        stack.push(item);
        
        assertFalse("The stack shouldn't be empty", stack.isEmpty());
        assertEquals("The stack should contain 1 item",1 , stack.getSize());
        assertSame("The pushed item is on top of the stack", item, stack.peek());
    }

    @Test
    public void testPeekEmpty(){
        SimpleStack<Integer> stack=new SimpleStackImpl<Integer>();
        boolean exceptionCaught=false;
        
        try {
            stack.peek();
        }
        catch (EmptyStackException e){
            exceptionCaught=true;
        }
        assertTrue("A new stack should be empty", stack.isEmpty());
        assertEquals("A new stack has a size of 0",0,stack.getSize());
        assertTrue("An exception should have been thrown", exceptionCaught);
    }

    @Test
    public void testPopEmpty(){
        SimpleStack<Integer> stack=new SimpleStackImpl<Integer>();
        boolean exceptionCaught=false;
        Integer item=4;

        try {
            item = stack.pop();
        }
        catch (EmptyStackException e){
            exceptionCaught=true;
        }
        assertEquals("The item didn't change", new Integer(4), item);
        assertTrue("The stack should be empty", stack.isEmpty());
        assertEquals("The stack has a size of 0",0,stack.getSize());
        assertTrue("An exception should have been thrown", exceptionCaught);
    }

    @Test
    public void testPopNotEmpty(){
        SimpleStack<Integer> stack=new SimpleStackImpl<Integer>();
        boolean exceptionCaught=false;
        Integer item=4;
        Integer item2=null;
        stack.push(item);

        try {
            item2=stack.pop();
        }
        catch (EmptyStackException e){
            exceptionCaught=true;
        }
        assertEquals("The item2 is equal to the top of the stack", item, item2);
        assertTrue("The stack should be empty", stack.isEmpty());
        assertEquals("The stack has a size of 0",0,stack.getSize());
        assertFalse("No exception should have been thrown", exceptionCaught);
    }
}
