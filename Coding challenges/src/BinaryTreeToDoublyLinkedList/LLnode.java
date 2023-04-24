package BinaryTreeToDoublyLinkedList;

public class LLnode {
    private BTnode previousNode;
    private BTnode currentNode;
    private BTnode nextNode;

    public LLnode(BTnode previousNode, BTnode currentNode, BTnode nextNode) {
        this.previousNode = previousNode;
        this.currentNode = currentNode;
        this.nextNode = nextNode;
    }

    public BTnode getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(BTnode previousNode) {
        this.previousNode = previousNode;
    }

    public BTnode getCurrentNode() {
        return currentNode;
    }

    public void setCurrentNode(BTnode currentNode) {
        this.currentNode = currentNode;
    }

    public BTnode getNextNode() {
        return nextNode;
    }

    public void setNextNode(BTnode nextNode) {
        this.nextNode = nextNode;
    }
}
