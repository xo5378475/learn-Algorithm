package com.atguigu.queue;

import java.util.Scanner;

public class ArrayQueueDemo {

    public static void arrayQueueTest(){
         ArrayQueue<Integer> arrayQueue = new ArrayQueue<>(3);
        char key = ' ';// 接收用戶輸入
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("s(show): show queue");   
            System.out.println("e(exit): exit program");   
            System.out.println("a(add): add data to queue");   
            System.out.println("g(get): get data from queue");   
            System.out.println("h(head) read head data from queue");
            key = scanner.next().charAt(0);
            switch (key) {
                case 's':
                    arrayQueue.showQueue();
                    break;
                
                case 'a':
                    System.out.println("Input a number");
                    int value = scanner.nextInt();
                    try {
                        arrayQueue.addQueue(value);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }                   
                    break;
                
                case 'g':
                    try {
                        int res = arrayQueue.getQueue();
                        System.out.printf("Take data is %d\n",res);
                    } catch (Exception e) {
                        //TODO: handle exception
                         System.out.println(e.getMessage());
                    }
                    break;
                
                   case 'h':
                    try {
                        int res = arrayQueue.headQueue();
                        System.out.printf("Queue head data is %d\n",res);
                    } catch (Exception e) {
                        //TODO: handle exception
                         System.out.println(e.getMessage());
                    }
                    break;

                case 'e':
                    scanner.close();
                    loop = false;
                    break;
            
            }
        }
       
        System.out.println("Program exit");
    }

    public static void main(String[] args) {
       arrayQueueTest();
    }   
}
