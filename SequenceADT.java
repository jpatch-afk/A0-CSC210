public interface SequenceADT {
    
   /**
     * Creates a new String sequence
     * 
     * @return a new String sequence 
     */
    String[] newSequence(); 

    /**
     * Returns the length of the array
     * 
     * @return the size of the sequence
     */
    int length();

    /**
     * Rearranges the sequence randomly
     * 
     * @param sequence
     */
    void rearrange(Object sequence);

    /**
     * Adds an element to the end of the sequence of the initialized data type
     * 
     * @param element
     * @throws ArrayIndexOutOfBoundsException if the element is not a String 
     */
    void add(Object element);

    /**
     * Removes an element to the end of the sequence
     * 
     * @param element
     * @throws ArrayIndexOutOfBoundsException if the element specified in the parameter does not exist
     */
    void remove(Object element);

    /**
     * Returns the element from the specified position in the sequence
     * 
     * @param position
     * @return the element from the specified position
     */
    int get(int position); 


    /**
     * Combines one sequence with another to create a new sequence
     * 
     * @param sequence 
     * @return a new sequence that combines the two sequences
     */
    String combine(Object sequence);
}