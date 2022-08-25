package CustomQueue;

import CustomStack.CustomStack;

public class CustomQueue {
    public class Node {
        int data;
        Node nextData;

        public Node(){
            this.nextData =null;
        }
        public Node(int data){
            this.data = data;
            this.nextData =null;
        }
        public void setNextNode(Node n){
            this.nextData = n;
        }
        public void printNode(Node n){
            System.out.println(n.data);
        }
    }

    public class myQueue{
        Node top;
        Node rear;
        public myQueue(){
            top =rear = null;
        }

        public void insert(int n) {
            Node tempNode = new Node(n);

            if(isEmpty()){
                top =rear =tempNode;
            }else{
                rear.nextData = tempNode;
                rear = tempNode;
            }
        }

        public Node delete(){
            Node tempNode = top;
            top = top.nextData;
            return tempNode;
        }

        public Node peek(){
            return top;
        }

        public boolean isEmpty(){
            return (top==null && rear ==null);
        }

        public String printNode(Node n){
            return n==null? "Queue is Empty" : n.data + "";
        }

    }

}
