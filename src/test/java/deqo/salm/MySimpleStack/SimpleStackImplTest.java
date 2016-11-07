package deqo.salm.MySimpleStack;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class SimpleStackImplTest {

    SimpleStack simpleStack;

    @Before
    public void setUp() throws Exception {
        simpleStack = new SimpleStackImpl();
        System.out.println("Je suis executé avant chaque test \n");
    }

    @Test
    public void testIsEmpty() throws Exception {
        assertEquals(true, simpleStack.isEmpty());
        String element1 = "toto";
        simpleStack.push(new Item(new String(element1)));
        assertEquals(false, simpleStack.isEmpty());
    }

    @Test
    public void testGetSize() throws Exception {
        assertEquals(0, simpleStack.getSize());
        String element1 = "toto";
        simpleStack.push(new Item(new String(element1)));
        simpleStack.push(new Item(new String(element1+"2")));
        //la taille doit augmenter de 2
        assertEquals(2, simpleStack.getSize());
    }

    @Test
    public void testPush() throws Exception {
        Item ita = new Item(new Integer(8));
        assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        //la pile doit être augmentée dans un item
        assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.peek();
        //on doit retrouver l'objet initial
        assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        assertEquals(8, integer.intValue());
        assertEquals(ita.getValue(), integer);
    }

    @Test
    public void testPeek() throws Exception {
        Item ita = new Item(new Integer(8));
        assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.peek();
        //ne doit pas retirer l'objet de la pile
        assertEquals(1, simpleStack.getSize());
        //on doit retrouver l'objet initial
        assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        assertEquals(8, integer.intValue());
        assertEquals(ita.getValue(), integer);
    }

    @Test
    public void testPop() throws Exception {
        Item ita = new Item(new Integer(8));
        assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.pop();
        //on doit retirer l'objet de la pile
        assertEquals(0, simpleStack.getSize());
        //on doit retrouevr l'objet initial
        assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        assertEquals(8, integer.intValue());
        assertEquals(ita.getValue(), integer);
    }

    @Test(expected = EmptyStackException.class)
    public void testPeekEmptyStackException() {
        simpleStack.peek();
    }

    @Test(expected = EmptyStackException.class)
    public void testPopEmptyStackException() {
        simpleStack.pop();
    }
}