/**
 * Interface describing the fundamental operations supported directly by Java's built-in arrays
 * 
 * @param <T> the type of elements stored in the array 
 */
public interface IndexAccessADT<T> {
    
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
     */
    void fill(int index, T element);
    
    /**
     * Returns the length of the array
     * 
     * @return the size of the array
     */
    int length();
    
    /**
     * Creates a shallow copy of the array
     * 
     * @return a new array containing the same elements
     */
    T[] clone();
    
    /**
     * Checks if this array reference is equal to another object
     * 
     * @param other the object to compare with
     * @return true if both objects are equal to one another
     */
    boolean equals(Object other);

    /**
     * Comapres this array reference to another object lexicographically 
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


    /**
     * 
     */
    
}

// add int[], char[], String[], etc. 

//Unit Tests 

/*
 * int[5] newInt = {2, 4, 6, 8, 10};
 * 
 * 
 * Returns an expected integer value 
 * System.out.println(newInt.length);
 * 
 * Returns an expected integer as index is in bounds; returns the integer 10
 * System.out.println(newInt.get(4))
 * 
 * Doesn't return anything, but works expectically as the index is in bounds
 * System.out.println(newInt.fill(2, 5))
 * 
 * Throws an exception as the index parameter provided in the initialization of the newInt array 
 * System.out.println(newInt.fill(6, 14))
 * 
 * Throws an exception as the element in the parameter is of the incorrect data type 
 * System.out.println(newInt.fill(2, "cats"))
 */