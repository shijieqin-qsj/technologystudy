package datastructure;


/**
 * 用数组实现队列
 */
public class ArrayQueue{
    //队列长度
    private int maxSize;

    //队列头
    private int head;

    //队列尾
    private int tail;

    //队列
    private int[] arr;

     public ArrayQueue(int maxSize){
         this.head=-1;
         this.tail=-1;
         this.maxSize=maxSize;
         arr=new int [this.maxSize];

     }

     //判断队列是否满
     public boolean isFull(){
         return tail==maxSize- 1;
     }

//     判断队列是否为空
     public boolean isEmpty(){
         return tail==head;
     }



}
