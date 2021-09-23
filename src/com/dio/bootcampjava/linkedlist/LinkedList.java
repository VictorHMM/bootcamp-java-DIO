package com.dio.bootcampjava.linkedlist;
import com.dio.bootcampjava.node.Node;

public class LinkedList<T> {

    private Node<T> firstNodeRef;
    private int listSize;

    public LinkedList() {
        this.firstNodeRef = null;
        this.listSize = 0;
    }

    public boolean isEmpty(){
        return firstNodeRef == null;
    }

    public int size(){
        return listSize;
    }

    public void add(T content){
        Node<T> newNode = new Node<>(content);

        if(!this.isEmpty()){
            Node<T> aux = firstNodeRef;
            while (aux.getNextNode() != null){
                aux = aux.getNextNode();
            }
            aux.setNextNode(newNode);
        }else
            firstNodeRef = newNode;
        listSize++;
    }

    private Node<T> getNode(int index){
        Node<T> aux = firstNodeRef;
        for (int i = 0; i <= index; i++){
            aux = aux.getNextNode();
        }
        return aux;
    }

    public T get(int index){
        return getNode(index).getContent();
    }

    public T remove(int index){
        Node<T> removedNode = this.getNode(index);

        if (index == 0){
            firstNodeRef = removedNode.getNextNode();
            listSize--;
            return removedNode.getContent();
        }
        Node<T> previousNode = this.getNode(index - 1);
        previousNode.setNextNode(removedNode.getNextNode());
        listSize--;
        return removedNode.getContent();
    }

    @Override
    public String toString() {
        String returnString = "";
        Node<T> aux = firstNodeRef;
        while(aux.getNextNode() != null){
            returnString +="[Node{content=" + aux.getContent() + "}]--->";
        }
        returnString += "null";
        return returnString;
    }
}
