package com.dio.bootcampjava.doublylinkedlist;
import com.dio.bootcampjava.doublenode.DoubleNode;

public class DoublyLinkedList<T> {
    DoubleNode<T> firstNodeRef, lastNodeRef;
    int listSize;

    public DoublyLinkedList(int listSize) {
        this.listSize = listSize;
        this.firstNodeRef = null;
        this.lastNodeRef = null;
    }

    public boolean isEmpty(){
        return firstNodeRef == null;
    }

    public int size(){
        return listSize;
    }

    private DoubleNode<T> getNode(int index){
        DoubleNode<T> aux = firstNodeRef;
        for (int i = 0; i <= index && aux != null; i++){
            aux = aux.getNextNode();
        }
        return aux;
    }

    public T get(int index){
        return this.getNode(index).getContent();
    }

    public void add(T content){
        DoubleNode<T> newNode = new DoubleNode<>(content);

        if (this.isEmpty()){
            firstNodeRef = newNode;
            lastNodeRef = newNode;
        }else{
            newNode.setPreviousNode(lastNodeRef);
            lastNodeRef = newNode;
        }
            listSize++;
    }

    public void add(int index, T content){
        DoubleNode<T> newNode = new DoubleNode<>(content);
        DoubleNode<T> aux = this.getNode(index);

        newNode.setNextNode(aux);
        if(aux != null) {
            newNode.setPreviousNode(aux.getPreviousNode());
            newNode.getNextNode().setPreviousNode(newNode);
        }else{
            newNode.setPreviousNode(lastNodeRef);
            lastNodeRef = newNode;
        }
        if(index == 0){
            firstNodeRef = newNode;
        }else{
            newNode.getPreviousNode().setNextNode(newNode);
        }
        listSize++;
    }

    public T remove(int index){
        DoubleNode<T> aux = this.getNode(index);

        if (aux.getPreviousNode() == null){
            firstNodeRef = firstNodeRef.getNextNode();
            if(firstNodeRef != null)
                firstNodeRef.setPreviousNode(null);
        }else if(aux.getNextNode() == null){
            lastNodeRef = lastNodeRef.getPreviousNode();
            if (lastNodeRef != null)
                lastNodeRef.setNextNode(null);
        }else{
            aux.getPreviousNode().setNextNode(aux.getNextNode());
            aux.getNextNode().setPreviousNode(aux.getPreviousNode());
        }
            listSize--;
            return aux.getContent();
    }

}
