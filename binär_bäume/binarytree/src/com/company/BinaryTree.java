package com.company;

public class BinaryTree {
    private BinaryTree nodeLeft;
    private BinaryTree nodeRight;
    private int content;

    public BinaryTree(int content, BinaryTree nodeLeft, BinaryTree nodeRight){
        this.content = content;
        this.nodeLeft = nodeLeft;
        this.nodeRight = nodeRight;
    }
    public BinaryTree(int content){
        this.content = content;
    }
    public BinaryTree(){
    }
    public BinaryTree getNodeLeft() {
        return nodeLeft;
    }
    public void setNodeLeft(BinaryTree nodeLeft) {
        this.nodeLeft = nodeLeft;
    }

    public BinaryTree getNodeRight() {
        return nodeRight;
    }

    public void setNodeRight(BinaryTree nodeRight) {
        this.nodeRight = nodeRight;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }
}
