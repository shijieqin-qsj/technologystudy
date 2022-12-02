package algorithm;

import datastructure.SingleNode;

public class LinkedList {


    /**
     * 单向链表反转  （后继断开存临时，前驱变后继，当前变前驱，后继变当前）
     * @param head
     * @return
     */
    public SingleNode linkedListReverse(SingleNode head){
        SingleNode currNode= head;
        SingleNode preNode=null;
        SingleNode nextNode;
        while( currNode!=null ){
//            当前结点用临时变量存储
            nextNode= currNode.getNext();
//            当前结点的前驱节点变成其后继结点
            currNode.setNext(preNode);
//           当前结点变成了下一个结点的前驱结点
            preNode=currNode;
//           原来的临时后继结点变成当前结点
            currNode=nextNode;
        }
        return preNode ;

    }


}
