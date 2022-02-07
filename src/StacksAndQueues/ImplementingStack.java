package StacksAndQueues;

class Stack_{
    private int []arr;
    private int size;
    private int TOP = -1;
    private int DEFAULT_SIZE = 10;
    public Stack_(int n){
        arr = new int[n];
        size = n;
    }
    public Stack_(){
        arr = new int[DEFAULT_SIZE];
        size = DEFAULT_SIZE;
    }

    public int peek(){
        if(TOP == -1){
            return -1;  // ERROR !!
        }
        return arr[TOP];
    }

    public void push(int val){
        if(isFull()){
            System.out.println("Stack is FULL");
            return;
        }
        arr[++TOP] = val;
    }

    private boolean isFull() {
        return TOP == size ;
    }

    public int poll(){
        return arr[TOP--];
    }

    public void pop(int val){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        TOP--;
    }

    public boolean isEmpty() {
        return TOP == -1;
    }
}
public class ImplementingStack {
    public static void main(String []args){
        Stack_ stack = new Stack_();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        while(!stack.isEmpty()){
            System.out.print(stack.poll() + " ");
        }
    }
}
