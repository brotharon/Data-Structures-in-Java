/**
 * Pre: Constructed with no arguments.
 * Post: Creates an array which can be manipulated similarly to a Queue
 * object using FIFO (First In First Out) ordering.
 * @author Calvin Evans
 * @version 07/01/2017
 */
public class Queue {
    ArrayList queue;

    /**
     * Pre: none. Takes no argument.
     * Post: Creates an ArrayList object which will be used as a Queue Object.
     */
    public Queue(){
        queue = new ArrayList();
    }

    /**
     * Pre: Takes in an object of any type as a parameter.
     * Post: Adds the Object obj to the end of the queue.
     * @param obj Takes in an Object of any type
     */
    void enqueue(Object obj){
        if (queue.get(0) == null){
            queue.insert(obj, 0);
        } else {
            queue.insert(obj, queue.size());
        }
    }

    /**
     * Pre: none
     * Post: Removes the Object at the front of the queue and returns that
     * Object.
     * @return returns the Object that is at the front of the queue.
     */
    Object dequeue(){
        return queue.remove(0);
    }

    /**
     * Pre: none
     * Post: none
     * @return returns the current size of the Queue as an int
     */
    int size(){
        return queue.size();
    }

    /**
     * Pre: none
     * Post: none
     * @return returns the Queue as a String separated by a comma
     */
    @Override
    public String toString() {
        return queue.toString();
    }

    /**
     * Pre: none
     * Post: none
     * @return returns a boolean true if the Queue is empty and false if not.
     */
    boolean isEmpty(){
        return queue.isEmpty();
    }

    /**
     * Pre: Takes in an Object of the Queue type.
     * Post: Compares the Object obj passed in to the method against this
     * Queue to determine if they are the same. If the passed in Object is
     * not a Queue they will not be equal, but the program can handle the
     * error checking for this. If both are empty they will be treated as
     * equal.
     * @param obj take in an Object obj of any type.
     * @return returns true if all associated values between the passed in
     * Object obj and this Queue are the same. Will return false if any
     * stored values differ or if the compared Object obj is not a queue.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Queue) {
            Queue check = (Queue) obj;
            if (check.size() == this.size() && this.isEmpty()) {
                return true;
            } else if (check.size() == this.size()) {
                for (int i = 0; i < this.size(); i++) {
                    if (!queue.get(i).equals(check.queue.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
