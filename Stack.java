/**
 * Pre: Constructed with no arguments.
 * Post: Creates an array which can be manipulated similarly to a Stack
 * object using FILO (First In Last Out) ordering.
 *
 * @author Calvin Evans
 * @version 07/01/2017
 */
public class Stack {
    ArrayList stack;

    /**
     * Pre: none
     * Post: creates an instance of Stack object with nothing stored in it.
     */
    public Stack() {
        stack = new ArrayList();
    }

    /**
     * Pre: Takes in an Object as an argument.
     * Post: Inserts the object parameter into the 0 index location of the
     * Stack array.
     *
     * @param obj
     */
    void push(Object obj) {
        stack.insert(obj, 0);
    }

    /**
     * Pre: none
     * Post: Removes the top item in the Stack and returns that Object.
     *
     * @return returns the Object that was most recently added to the stack.
     */
    Object pop() {
        return stack.remove(0);
    }

    /**
     * Pre: none
     * Post: none
     *
     * @return returns the size of the current Stack as an int.
     */
    int size() {
        return stack.size();
    }

    /**
     * Pre: none
     * Post: none
     *
     * @return returns the Stack as a String. Uses the toString method from
     * the ArrayList to construct the String.
     */
    @Override
    public String toString() {
        return stack.toString();
    }

    /**
     * Pre: none
     * Post: none
     *
     * @return: returns a boolean as true if the Stack is empty and false if
     * it is not empty.
     */
    boolean isEmpty() {
        return stack.isEmpty();
    }

    /**
     * Pre: Takes in any object. Object should be an instance of the Stack
     * Object.
     * Post: Compares the Object that was passed in against this Stack and
     * determines if they are the same.
     *
     * @param obj Any object, but should be an instance of Stack
     * @return returns a boolean as true if the Object passed in is the same
     * as this Stack or false if not.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Stack) {
            Stack check = (Stack) obj;
            if (check.size() == this.size() && this.isEmpty()) {
                return true;
            } else if (check.size() == this.size()) {
                for (int i = 0; i < this.size(); i++) {
                    if (!stack.get(i).equals(check.stack.get(i))) {
                        //compares the stored objects at each index of obj
                        // and this Stack.
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
