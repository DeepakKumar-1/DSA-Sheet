package StacksAndQueues;

class Queue_{
    private int []arr;
    private final int DEFAULT_SIZE = 10;
    private int size = DEFAULT_SIZE;
    int top = -1;
    public Queue_(int n){
        arr = new int[n];
        size = n;
    }
    public Queue_(){
        arr = new int[DEFAULT_SIZE];
    }
    public boolean isFull(){
        return top == size;
    }
    public boolean isEmpty(){
        return top == -1;
    }

    public void enqueue(int val){
        if(isFull()){
            System.out.println("Queue is FULL");
            return;
        }
        arr[++top] = val;
    }
    public void dequeue(int val){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        shift(arr);
        top--;
    }
    public void shift(int []arr){
        for(int i=0; i<top; i++){
            arr[i] = arr[i+1];
        }
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return arr[top];
    }
    public int poll(){
        if(isEmpty()){
            return -1;
        }
        int x = arr[0];
        shift(arr);
        top--;
        return x;
    }
}
public class ImplementingQueues {
    public static void main(String []args){
        Queue_ queue = new Queue_();
        queue.enqueue(90);
        queue.enqueue(100);
        queue.enqueue(80);
        while (!queue.isEmpty()){
            System.out.println(queue.poll() + " ");
        }
    }
}
