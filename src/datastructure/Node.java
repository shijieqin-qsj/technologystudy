package datastructure;

/**
 * 双向链表结点
 */
public class Node {

    public int val;

    //前驱结点
    public Node pre;

    //后继结点
    public Node next;

    public Node() {
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(int val, Node pre, Node next) {
        this.val = val;
        this.pre = pre;
        this.next = next;
    }
}
