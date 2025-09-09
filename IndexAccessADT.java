/**
 * Interface describing the fundamental methods supported directly by Java's built-in arrays 
 * 
 * @param <T> the type of elements stored in the array 
 */
public interface IndexAccessADT<T> {

    /*
     * In the constructor, the array of type T would be initialized through calling the method T[] newArray() and specifiying the type and the length. 
     */

    /**
     * Creates a new array of type T, using the method newArray to create a new array. Leaves the length blank and name blank for adaptability 
     * @return a new array of type T
     */
    T[] newArray();

    /**
     * Gets the element at the specified index
     * 
     * @param index the index of the element to retrieve (0-based)
     * @return the element at the specified index
     * @throws ArrayIndexOutOfBoundsException if index is out of bounds of the array size
     */
    T get(int index);
    
    /**
     * Sets the element at the specified index to the given value
     * 
     * @param index the index where to store the element (0-based)
     * @param element the element to store
     * @throws ArrayIndexOutOfBoundsException if index is out of bounds of the array size
     * @throws IllegalArgumentException if element is of the wrong type for the array
     */
    void fill(int index, T element);
    
    /**
     * Returns the length of the array
     * 
     * @return the size of the array
     */
    int length();
    
    /**
     * Checks if this array reference is equal to another object
     * 
     * @param other the object to compare with
     * @return true if both objects are equal to one another
     */
    boolean equals(Object other);

    /**
     * Compares this array reference to another object lexicographically 
     * 
     * @param other the object to compare with 
     * @return 0 if the object are equal
     * @return a negative integer if this array is less than another object lexicographically 
     * @return a positive integer if another object is greater than this array lexicographically.
     */
    int compare(Object other);


    /**
     * Sorts the array in acsending order 
     * 
     * @param array the object to be sorted 
     */
    void sort(Object array);     

}

//Unit Tests 

/*
 * Create an array with a length of 5 that contains integers. 
 * 
 * Write a print statement that calls the length method. This should print out an integer; in this case, the integer 5.
 * 
 * Then, write a new print statement calling the get() method, using the parameter of 4, for example: get(4). This returns an expected integer as the index is in bounds.   
 * 
 * Then, write a print statement that calls the fill() method. Using the parameter 2 for the index and 5 for the new element, for example: fill(2,5). Running this method doesn't return anything as the index is within bounds and the element is the same type of the array. 
 * 
 * Then, write a print statement that also uses the fill() parameter, but uses the parameter 6 for the index and 14 for the element, for example. This throws the ArrayIndex exception as the index is out of bounds. 
 * 
 * Finally, write another print statement using the fill() method. Use the parameter 2 for the index and "cats" as the element. This throws the IllegalArgument Exception as the element is a String and the array requires a int type.
 */