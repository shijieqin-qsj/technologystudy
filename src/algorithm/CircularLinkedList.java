package algorithm;

import datastructure.SingleNode;

import java.util.List;

/**
 *  单向环形链表
 */
public class CircularLinkedList {

    /**
     * 创建单向环形链表
     * @return
     */
    public SingleNode createCircularLinkedList(List< SingleNode> nodeList){
        //链表头指针
        SingleNode first=null;
        //辅助指针
        SingleNode current =first;
        for(int i=0;i<nodeList.size();i++){
            if(i==0){
                first=nodeList.get(i);
            }
            current.setNext(nodeList.get(i));
            current=current.getNext();
            current.setNext(first);
        }
        return first;
    }
}
