package com.dio.bootcampjava.stack;

import com.dio.bootcampjava.node.Node;

public class Stack<T> {

    private Node<T> firstNodeRef;

    public Stack(){
        this.firstNodeRef = null;
    }

    public boolean isEmpty(){
        return firstNodeRef == null;
    }

    public T top(){
        return firstNodeRef.getContent();
    }

    public void push(T object){
        Node aux = firstNodeRef, node = new Node(object);
        firstNodeRef = node;
        node.setNextNode(aux);
    }

    public T pop(){
        if (!this.isEmpty()) {
            Node popped = firstNodeRef;
            firstNodeRef = firstNodeRef.getNextNode();
            return (T) popped.getContent();
        }
        return null;
    }

    @Override
    public String toString() {

        String returnString = "";
        Node aux = firstNodeRef;

        while (aux != null){
            returnString += aux.getContent() + "\n";
            aux = aux.getNextNode();
        }
        return returnString;
    }
}