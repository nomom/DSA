/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt;

/**
 *
 * @author Acer
 */
public class LinkedList<T> implements ListInterface<T> {

    private int noOfEntries = 0;
    private Node headNode;
    private Node tailNode;

    public LinkedList() {
        this.noOfEntries = 0;
        this.headNode = null;
        this.tailNode = null;
    }

    @Override
    public void addAtFront(T newData) {
        Node newNode = new Node(newData);
        if (isEmpty()) {
            headNode = newNode;
            tailNode = headNode;
        } else {
            newNode.next = headNode;
            headNode.prev = headNode;
            headNode = newNode;
        }

        noOfEntries++;  // need update the size? i nt sure
    }

    @Override
    public void addAtEnd(T newData) {
        Node newNode = new Node(newData);
        if (tailNode == null) {
            headNode = newNode;
            tailNode = newNode;
        } else {
            newNode.prev = tailNode;
            tailNode.next = newNode;
            tailNode = newNode;
        }
        noOfEntries++;
    }
    
    

    @Override
    public T getData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removeData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public T viewData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getSize() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isEmpty() {
        boolean result = noOfEntries == 0;
        return result;
    }

    @Override
    public void clear() {
        noOfEntries = 0;
        headNode = null;
        tailNode = null;
    }

    private class Node {

        private T data;
        private Node next;
        private Node prev;

        private Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}
