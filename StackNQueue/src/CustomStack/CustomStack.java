package CustomStack;

public class CustomStack {
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
        public void printNode(Node n){
            System.out.println(n.data);
        }
    }

    public class myStack{
        public Node top;

        public myStack(){
            this.top = new Node();
        }

        public void pushData(int n){
            Node tempNode= new Node(n);
            tempNode.nextData = top;
            this.top = tempNode;
        }

        public Node popData(){
            Node popNode = top;
            top = top.nextData;
            return popNode;
        }

        public Node peekData(){
            return top;
        }

        public boolean isEmpty(){
            return top.nextData==null;
        }

        public String printNode(Node n){
            return n.data+"";
        }
    }
}
