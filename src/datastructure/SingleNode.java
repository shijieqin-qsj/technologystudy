package datastructure;

/**
 * 单向链表结点
 */
public class SingleNode {

    private int val;


    //后继结点
    private SingleNode next;

    private SingleNode() {
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public SingleNode getNext() {
        return next;
    }

    public void setNext(SingleNode next) {
        this.next = next;
    }

    public SingleNode(int val, SingleNode next) {
        this.val = val;
        this.next = next;
    }
}
