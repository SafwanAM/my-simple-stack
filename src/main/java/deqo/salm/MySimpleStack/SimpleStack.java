package deqo.salm.MySimpleStack;

import java.util.EmptyStackException;

/**
 * Created by 21305507 on 04/11/2016.
 * Commentaire répondant à l'exigence #3
 */
public interface SimpleStack {
    /**
     * Tests if this stack is empty.
     * @return true if empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Returns the number of items in this stack.
     * @return size of the stack
     */
    int getSize();

    /**
     * Pushes an item onto the top of this stack
     * null item is allowed.
     * @param item item to push
     */
    void push(Item item);

    /**
     * Looks at the object at the top of this stack
     * without removing it from the stack.
     * @return item which has been peek
     * @throws EmptyStackException if this stack is empty
     */
    Item peek() throws EmptyStackException;

    /**
     * Removes the object at the top of this stack
     * and returns that object as the value of this function.
     * @return item which has been poped
     * @throws EmptyStackException if this stack is empty
     */
    Item pop() throws EmptyStackException;
}
