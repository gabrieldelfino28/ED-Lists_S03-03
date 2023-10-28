package controller;

import linkedlist.model.LinkedList;

public class TwoLargestControl {
    public TwoLargestControl() {
        super();
    }

    public int[] findTwoLargest(LinkedList<Integer> l) throws Exception {
        int largestA = l.get(0);
        int largestB = l.get(0);
        for (int pos = 0; pos < l.size(); pos++) {
            if (l.get(pos) > largestA) {
                largestB = largestA;
                largestA = l.get(pos);
            }else if (l.get(pos) > largestB) {
                largestB = l.get(pos);
            }
        }
        return new int[] {largestA, largestB};
    }
}
