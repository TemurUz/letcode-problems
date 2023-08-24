package study.list_node;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList implements List<Node> {
    private Node head= null;
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Node> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Node node) {
        if (node == null) return false;
        Node current = head;

        if (current == null) {
            head = node;
            size++;
            return true;
        }

        while (current.getNext() != null)
            current = current.getNext();

        current.setNext(node);
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Node current = head;

        while (head.getNext() != null){
            if (o.equals(current)){
                current.setNext(current.getNext().getNext());
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Node> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Node> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public Node get(int index) {
        if (index >= size) return null;
        Node current = head;
        int counter = 0;

        while (counter < index){
            counter ++;
            current = current.getNext();
        }

        return current;
    }

    @Override
    public Node set(int index, Node element) {
        return null;
    }

    @Override
    public void add(int index, Node element) {

    }

    @Override
    public Node remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Node> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Node> listIterator(int index) {
        return null;
    }

    @Override
    public List<Node> subList(int fromIndex, int toIndex) {
        return null;
    }
}
