package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList {
    private SortedIntList sortedList = new SortedIntList();
    private int totalAdded = 0;

    public DelegationSortedIntList () {

    }

    @Override
    public boolean add(int num) {
        boolean success = sortedList.add(num);
        if (success) {
            totalAdded++;
        }
        return success;
    }

    @Override
    public boolean addAll(IntegerList list) {
        boolean success = sortedList.addAll(list);
        if (success) {
            totalAdded += list.size();
        }
        return success;
    }

    @Override
    public int get(int index) {
        return sortedList.get(index);
    }

    @Override
    public boolean remove(int num) {
        return sortedList.remove(num);
    }

    @Override
    public boolean removeAll(IntegerList list) {
        return sortedList.removeAll(list);
    }

    @Override
    public int size() {
        return sortedList.size();
    }

    public int getTotalAdded() {
        return totalAdded;
    }
}