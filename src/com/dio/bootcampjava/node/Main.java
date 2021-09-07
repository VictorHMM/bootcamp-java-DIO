package com.dio.bootcampjava.node;

public class Main {
    public static void main(String[] args) {
        Node<String> node1 = new Node<>("node1");
        Node<String> node2 = new Node<>("node2");
        node1.setNextNode(node2);
        System.out.println(node1);
        System.out.println(node1.getNextNode());
    }
}
