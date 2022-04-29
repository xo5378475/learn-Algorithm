package com.atguigu.queue;

// import java.util.ArrayList;

class ArrayQueue<E> {
    private int maxSize; // 表示數組的最大容量
    private int front; // 
    private int rear;
    private Object[] arr; // 用於存放數據，模擬對列
    //ArrayList
    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new Object[maxSize];
        front = -1; // 指向對列頭部,分析出front是指向對列頭的前一個位置
        rear = -1;// 指向對列尾 ,指向對列尾的數據(即是對列最後一個數據)     
    }

    // 
    public boolean isFull(){
        return rear == maxSize - 1;
    }

    public boolean isEmpty(){
        return rear == front;
    }

    public void addQueue(E n){
        if(isFull()){
            System.out.println("Queue is full ,it can't add any data");
            return;
        }
        rear++;
        arr[rear] = n;
    }

    @SuppressWarnings("unchecked")
    public E getQueue(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty, it can't take any data");
        }
        front++;
        return (E) arr[front];
    }

    public void showQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }
    }


    @SuppressWarnings("unchecked")
    public E headQueue(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        return (E) arr[front+1];
    }

}

