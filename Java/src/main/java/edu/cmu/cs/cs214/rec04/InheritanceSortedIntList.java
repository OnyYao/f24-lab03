package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList{
    // Write your implementation below with API documentation
    private int totalAdded = 0;


    /**
     * Adds the specified int to the list and increments
     * the count of elements added.
     *
     * @param num an integer to be added to the list
     * @return true if the list is changed as a result of the call
     */
    @Override
    public boolean add(int num) {
        boolean success = super.add(num);
        if (success) {
            this.totalAdded++;
        }
        return success;
    }       
    
    /**
     * Adds all of the elements of the IntegerList to the list and increments
     * the count of elements added by the size of the list.
     *
     * @param list IntegerList containing elements to be added to the list
     * @return true if the list changed as a result of the call
     */
    @Override
    public boolean addAll(IntegerList list) {
        return super.addAll(list);
    }

    /**
     * Returns the total number of elements added to the list, not
     * to be confused with the current size, which can go down
     * when an element is removed.
     *
     * @return the total number of elements added to the list
     */
    public int getTotalAdded() {
        return totalAdded;
    }

}