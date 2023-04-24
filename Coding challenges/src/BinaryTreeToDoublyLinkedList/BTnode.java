package BinaryTreeToDoublyLinkedList;

public class BTnode{
    private int order;
    private int value;

    private BTnode parentNode;
    private BTnode[] children;

    public BTnode(int order, int value, BTnode parentNode, BTnode[] children) {
        this.order = order;
        this.value = value;
        this.parentNode = parentNode;
        this.children = children;
    }

    public BTnode getParentNode() {
        return parentNode;
    }

    public void setParentNode(BTnode parentNode) {
        this.parentNode = parentNode;
    }

    public BTnode[] getChildren() {
        return children;
    }

    public void setChildren(BTnode[] children) {
        this.children = children;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}
