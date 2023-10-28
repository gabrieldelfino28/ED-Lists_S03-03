package view;

import controller.TwoLargestControl;
import linkedlist.model.LinkedList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<Integer> lista = new LinkedList<>();
        TwoLargestControl largest = new TwoLargestControl();
        try{
            lista.addLast(3);
            lista.addLast(5);
            lista.addLast(8);
            lista.addLast(12);
            lista.addLast(9);
            lista.addLast(7);
            lista.addLast(6);
            lista.addLast(2);
            lista.addLast(3);
            lista.addLast(7);
            lista.addLast(16);
            lista.printList();
            System.out.println("Two largest files of the linked list: " +Arrays.toString(largest.findTwoLargest(lista)));
        }catch (Exception err) {
            System.err.println(err.getMessage());
        }
    }
}
