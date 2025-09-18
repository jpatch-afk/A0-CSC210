/**
 * Interface describing potential methods that a sequence could have 
 * 
 * @param <T> the type of elements stored in the sequence
 */
public interface SequenceADT<T> { 
    
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
   * @param sequence the sequence to be randomly rearranged
   */
  void rearrange(Object sequence);

  /**
    * Adds an element to the end of the sequence of the initialized data type
    * 
    * @param element the element to be added at the end of the sequence
    * @throws ArrayIndexOutOfBoundsException if the element is not a String 
    */
  void add(Object element);

  /**
    * Removes an element to the end of the sequence
    * 
    * @param element element to be removed at the end of the sequence
    * @throws ArrayIndexOutOfBoundsException if the element specified in the parameter does not exist
    */
  void remove(Object element);

  /**
    * Returns the element from the specified position in the sequence
    * 
    * @param position the specific position to grab the element from
    * @return the element from the specified position
    */
  int get(int position); 

  /**
    * Combines one sequence with another to create a new sequence
    * 
    * @param sequence the new sequence to be added to an exisiting sequence
    * @return a new sequence that combines the two sequences
    */
  String combine(Object sequence);
}