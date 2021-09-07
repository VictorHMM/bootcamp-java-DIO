package com.dio.bootcampjava.bookstack;
import com.dio.bootcampjava.stack.Stack;
import com.dio.bootcampjava.node.Node;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack bookStack = new Stack();
        int option;
        do {
            System.out.println("===== Book Stack =====");
            System.out.println("1 - See the book on top");
            System.out.println("2 - Insert book");
            System.out.println("3 - Remove the book on top");
            System.out.println("4 - See all books");
            System.out.println("5 - Exit");
            option = input.nextInt();
            switch (option) {
                case 1:
                    if (bookStack.isEmpty())
                        System.out.println("There is no book to see.");
                    else
                        System.out.println(bookStack.top());
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("Insert the book's title:");
                    String title = input.nextLine();
                    System.out.println("Insert the book's author: ");
                    String author = input.nextLine();
                    System.out.println("Insert the number of pages:");
                    int pages = input.nextInt();
                    bookStack.push((new Book(title, author, pages)));
                    break;
                case 3:
                    if (bookStack.isEmpty())
                        System.out.println("There is no book to remove.");
                    else
                        System.out.println(bookStack.pop());
                    break;
                case 4:
                    if (bookStack.isEmpty())
                        System.out.println("There are no books to display.");
                    else{
                        System.out.println(bookStack);
                    }
                    break;
            }
        }while(option != 5);
    }
}
