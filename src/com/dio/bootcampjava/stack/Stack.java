package com.dio.bootcampjava.stack;

import com.dio.bootcampjava.node.Node;

public class Stack {

    private Node firstNodeRef;

    public Stack(){
        this.firstNodeRef = null;
    }

    public boolean isEmpty(){
        return firstNodeRef == null;
    }

    public Object top(){
        return firstNodeRef.getContent();
    }

    public void push(Object obj){
        Node aux = firstNodeRef, node = new Node(obj);
        firstNodeRef = node;
        node.setNextNode(aux);
    }

    public Object pop(){
        if (!this.isEmpty()) {
            Node popped = firstNodeRef;
            firstNodeRef = firstNodeRef.getNextNode();
            return popped.getContent();
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