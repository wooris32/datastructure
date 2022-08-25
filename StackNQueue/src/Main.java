import CustomQueue.CustomQueue;
import CustomStack.*;

public class Main {
    public static void main(String[] args) {
/* Stack test*/
/*
        CustomStack myStack = new CustomStack();
        CustomStack.myStack customStack = myStack.new myStack();

        customStack.pushData(1);
        customStack.pushData(2);
        customStack.pushData(3);
        System.out.println(customStack.printNode(customStack.peekData()));

        CustomStack.Node node = customStack.popData();
        node.printNode(node);

        customStack.popData();
        System.out.println(customStack.printNode(customStack.peekData()));
        System.out.println(customStack.isEmpty());
        customStack.popData();
        System.out.println(customStack.isEmpty());
*/
/*Queue Test*/

        CustomQueue customQueue = new CustomQueue();
        CustomQueue.myQueue myQueue = customQueue.new myQueue();

        myQueue.insert(1);
        myQueue.insert(2);
        myQueue.insert(3);

        System.out.println( myQueue.printNode(myQueue.peek()) );
        CustomQueue.Node qNode = myQueue.delete();
        qNode.printNode(qNode);
        System.out.println( myQueue.printNode(myQueue.peek()) );
        myQueue.delete();
        myQueue.delete();
        qNode =  myQueue.peek();
        System.out.println( myQueue.printNode(qNode) );

    }
}
