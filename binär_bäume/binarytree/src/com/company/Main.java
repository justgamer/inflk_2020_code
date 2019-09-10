package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Ahne ahne = new Ahne("A", "B",'m');

        BinaryTree b10 = new BinaryTree(10);
        BinaryTree b7 = new BinaryTree(7);
        BinaryTree b20 = new BinaryTree(20);
        BinaryTree b40 = new BinaryTree(40);
        BinaryTree b6 = new BinaryTree(6, b7, b20);
        BinaryTree b11 = new BinaryTree(11, b10, null);
        BinaryTree b9 = new BinaryTree(9, b6, b11);
        BinaryTree b3 = new BinaryTree(3,null, b40);
        BinaryTree b5 = new BinaryTree(5, b3,b9);
        Main m = new Main();
        System.out.println(m.countNodes(b5));
    }
    public void checkPreOrder(BinaryTree b){
        System.out.println(b.getContent());
        if(b.getNodeLeft() != null){
            checkPreOrder(b.getNodeLeft());
        } if(b.getNodeRight() != null){
            checkPreOrder(b.getNodeRight());
        }
    }
    public void checkPostOrder(BinaryTree b){
        if(b.getNodeLeft() != null){
            checkPostOrder(b.getNodeLeft());
        } if(b.getNodeRight() != null){
            checkPostOrder(b.getNodeRight());
        }
        System.out.println(b.getContent());

    }
    public void checkInOrder(BinaryTree b){
        if(b.getNodeLeft() != null){
            checkInOrder(b.getNodeLeft());
        }
        System.out.println(b.getContent());

        if(b.getNodeRight() != null){
            checkInOrder(b.getNodeRight());
        }
    }
    public int countNodes(BinaryTree b){
        int counter = 1;
        if(b.getNodeLeft() != null){
            counter += countNodes(b.getNodeLeft());
        } if(b.getNodeRight() != null){
            counter += countNodes(b.getNodeRight());
        }
        return counter;
    }
}
