/**
 * Driver for testing functionality of ArrayList, Stack, and Queue classes.
 * Some functionality is only tested in the ArrayList class even though it is
 * used in the Stack and Queue. This is done because the ArrayList is the
 * base model for all three programs and the function call is made through
 * the Stack or Queue class to the ArrayList class.
 *
 * @author Calvin Evans
 * @version 07/01/2017
 */

public class ArrayBasedDataStructuresDriver {
    /**
     * Main method: calls the individual tests.
     *
     * @param args: no args required, not used in tests
     */
    public static void main(String[] args) {
       // stackTests();
       // queueTests();
        arrayListTests();
        System.out.println("Testing...");
    }

    /**
     * This method tests the functionality of the ArrayList class. See the
     * ArrayList class for more information on its functions.
     */
    private static void arrayListTests() {

        ArrayList a = new ArrayList();

        //populates the ArrayList
        System.out.println("Testing ArrayList Class");
        System.out.println("");
        a.insert('B', 0);
        a.insert('a', 0);
        a.insert('t', 1);
        a.insert('q',1);
        a.insert(100, -2);
        a.insert("dog", 100);

        System.out.println("");
        System.out.println("Testing toString method");
        System.out.println("Expected output 100,a,t,B,dog");
        System.out.println(a.toString());

        //testing the .remove method for values outside of ArrayList
        System.out.println("");
        System.out.println("Testing .remove method for values outside of " +
                "ArrayList");
        System.out.println("Expected output: 2 error messages instructing " +
                "user ot valid values");
        a.remove(-1);
        a.remove(100);

        System.out.println("");
        System.out.println("Testing ArrayList .size");
        System.out.println("Expected output: 5");
        System.out.println("ArrayList size: " + a.size());

        ArrayList b = a;

        //testing the .equals method
        System.out.println("");
        System.out.println("Testing .equals method");
        System.out.println("Expected output: true");
        System.out.println("ArrayList a = ArrayList b: " + a.equals(b));

        //tests for .get .size and .isEmpty methods
        System.out.println("");
        System.out.println("Testing .get method");
        System.out.println("Expected output: 100");
        System.out.println("Index 0 contains:" + a.get(0));
        System.out.println("");
        System.out.println("Expected output: dog");
        System.out.println("Index " + (a.size() - 1) + " contains: " +
                (a.get(a.size() - 1)));
        System.out.println("");
        System.out.println("Expected output: Error message, out of bounds");
        System.out.println("Index " + (a.size()) + " containg: " + a.get(a
                .size()));
        System.out.println("");
        System.out.println("Testing .isEmpty method");
        System.out.println("Expected output: false");
        System.out.println("ArrayList is empty = " + a.isEmpty());

        //tests for .indexOf method
        System.out.println("");
        System.out.println("Testing .indexOf method");
        System.out.println("Expected output: 4");
        int myDog = a.indexOf("dog");
        System.out.println("myDog is at " + myDog);
        System.out.println("");
        System.out.println("Expected output: 0");
        int my100 = a.indexOf(100);
        System.out.println("my100 is at " + my100);
        System.out.println("");
        System.out.println("Testing a value that is not in ArrayList");
        System.out.println("Expected output: -1");
        int myImagination = a.indexOf("fairyland");
        System.out.println("myImagination is at " + myImagination);

        //empties array
        System.out.println("");
        System.out.println("Testing .remove method");
        System.out.println("Expected to print 100 a t B dog each on its own " +
                "line");
        while (a.isEmpty() == false) {
            System.out.println(a.remove(0));
        }

        //tests to ensure that array methods function correctly on empty array
        System.out.println("");
        System.out.println("Testing to ensure ArrayList emptied and container" +
                " resized properly");
        System.out.println("Expected output is true followed by 4 error " +
                "messages for invalid indexes");
        System.out.println("ArrayList is empty = " + a.isEmpty());
        System.out.println("Index 0 contains: " + a.get(0));
        System.out.println("Index " + (a.size() - 1) + " contains: " + a.get(a
                .size() - 1));
        System.out.println("Index " + a.size() + " contains: " + a.get(a.size
                ()));
        System.out.println("Index -2 contains: " + a.get(-2));

    }

    /**
     * This method tests the functionality of the Queue class. The queue
     * functions just like a line at the bank, the first in is the first out
     * . You have less access to the information in the Queue than the
     * information in the ArrayList, but behavior is fixed and more
     * predictable. See the Queue class for more information on its functions.
     */
    private static void queueTests() {

        Queue a = new Queue();

        System.out.println("");
        System.out.println("Testing Queue Class");
        //populates the queue
        a.enqueue('B');
        a.enqueue('a');
        a.enqueue('t');

        //tests .size method
        System.out.println("");
        System.out.println("Testing .size method");
        System.out.println("Expected output: 3");
        System.out.println("Queue size = " + a.size());

        //tests . isEmpty method
        System.out.println("");
        System.out.println("Testing .isEmpty method with populated method");
        System.out.println("Expected output: false");
        System.out.println("Queue is empty = " + a.isEmpty());

        System.out.println("");
        System.out.println("Testing .toString method");
        System.out.println("Expected output: B, a, t");
        System.out.println(a.toString());

        //tests .equals method
        System.out.println("");
        System.out.println("Testing .equals method");
        System.out.println("Expected output: true");
        Queue b = a;
        System.out.println("Queue a = Queue b: " + a.equals(b));

        //the following was built for testing and works, meaning you cannot
        // compare a Queue to something that is not a Queue.
        //String logHome = new String("log home");
        //Queue c = logHome;
        //System.out.println (a.equals(c));

        Queue d = new Queue();
        System.out.println("Expected output: false");
        System.out.println("Queue a = Queue d: " + d.equals(a));

        //tests .dequeue method and depopulates the Queue
        System.out.println("");
        System.out.println("Testing .dequeue method");
        System.out.println("Expected output: B a t each on its own line");
        while (a.isEmpty() == false) {
            System.out.println(a.dequeue());
        }
        //tests .isEmpty on an empty Queue
        System.out.println("");
        System.out.println("Testing .isEmpty on empty Queue");
        System.out.println("Expected output: true");
        System.out.println("Queue is empty = " + a.isEmpty());
    }

    /**
     * This method tests the functionality of the Stack class. The Stack
     * functions just like a pile of cups, the first (bottom cup) in is the
     * last out. You have less access to the information in the Stack than the
     * information in the ArrayList, but behavior is fixed and more
     * predictable. See the Stack class for more information on its functions.
     */
    private static void stackTests() {

        Stack a = new Stack();

        System.out.println("");
        System.out.println("Testing Stack Class");
        //populates the Stack
        a.push('B');
        a.push('a');
        a.push('t');

        //Tests the .size method
        System.out.println("");
        System.out.println("Testing .size method");
        System.out.println("Expected output: 3");
        System.out.println("Stack size = " + a.size());

        //tests .isEmpty method
        System.out.println("");
        System.out.println("Testing .isEmpty method on populated Stack");
        System.out.println("Expected output: false");
        System.out.println("Stack is empty = " + a.isEmpty());

        System.out.println("");
        System.out.println("Testing .toString method");
        System.out.println("Expected output: t, a, B");
        System.out.println(a.toString());

        System.out.println("");
        System.out.println("Testing .equals method");
        System.out.println("Expected output: true");
        Stack b = a;

        //the following was built for testing and works, meaning you cannot
        // compare a Stack to something that is not a Stack.
        //String logHome = new String("log home");
        //Stack c = logHome;
        //System.out.println (a.equals(c));

        //tests .equals method
        System.out.println("Stack a = Stack b: " + b.equals(a));
        Stack d = new Stack();
        System.out.println("Expected output: false");
        System.out.println("Stack a = Stack d: " + d.equals(a));

        //tests .pop method and depopulates Stack
        System.out.println("");
        System.out.println("Testing .pop method");
        System.out.println("Expected output: t a B each on its own line");
        while (a.isEmpty() == false) {
            System.out.println(a.pop());
        }

        //tests .isEmpty on an empty Stack
        System.out.println("");
        System.out.println("Testing .isEmpty method on an empty Stack");
        System.out.println("Expected output: true");
        System.out.println("Stack is empty = " + a.isEmpty());
    }
}
