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

    public Node top(){
        return firstNodeRef;
    }

    public void push(Node node){
        Node aux = firstNodeRef;
        firstNodeRef = node;
        node.setNextNode(aux);
    }

    public Node pop(){
        if (!this.isEmpty()) {
            Node popped = firstNodeRef;
            firstNodeRef = firstNodeRef.getNextNode();
            return popped;
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