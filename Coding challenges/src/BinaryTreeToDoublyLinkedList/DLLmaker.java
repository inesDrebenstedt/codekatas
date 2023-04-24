package BinaryTreeToDoublyLinkedList;

import java.util.*;

public class DLLmaker {
    /*
    DLL elements by index:
    0: head node = smaller grandchild of smaller child, value = 25
    1: smaller child of root node, value = 12
    2: bigger grandchild of smaller child, value = 30
    3: root node, value = 10
    4: bigger grandchild of bigger child, value = 36
    5: tail node = bigger child of root node, value = 15
     */

    public static LinkedList<LLnode> makeDLL(ArrayList<BTnode> orderedBTnodes){
        LinkedList<LLnode> result = new LinkedList<LLnode>();

        // get smallest grandchild of smaller child and set it as head:
        BTnode headNode = Collections.min(orderedBTnodes, Comparator.comparing(BTnode::getOrder).reversed()
                .thenComparing(BTnode::getValue));
        // 25
        LLnode head = new LLnode(null, headNode, headNode.getParentNode());
        BTnode biggerGrandchildOfSmallerChild = Collections
                .max(List.of(headNode.getParentNode().getChildren()), Comparator.comparing(BTnode::getValue));
        // 12
        LLnode second = new LLnode(headNode, headNode.getParentNode(), biggerGrandchildOfSmallerChild);
        Optional<BTnode> rootNode =  orderedBTnodes.stream().filter(node -> node.getOrder() == 0).findFirst();
        // 30
        LLnode third = new LLnode(headNode.getParentNode(), biggerGrandchildOfSmallerChild, rootNode.get());

        Optional<BTnode> biggerChild = Arrays.stream(rootNode.get().getChildren()).max(Comparator.comparing(BTnode::getValue));
        Optional<BTnode> biggerGrandchildOfBiggerChild = Arrays.stream(biggerChild.get().getChildren()).max(Comparator.comparing(BTnode::getValue));
        // 10
        LLnode fourth = new LLnode(biggerGrandchildOfSmallerChild,rootNode.get(),  biggerGrandchildOfBiggerChild.get());
        // 36
        LLnode fifth = new LLnode(rootNode.get(), biggerGrandchildOfBiggerChild.get(), biggerGrandchildOfBiggerChild.get().getParentNode());
        // 15
        LLnode tail = new LLnode(biggerGrandchildOfBiggerChild.get(), biggerGrandchildOfBiggerChild.get().getParentNode(), null );

        result.add(head);
        result.add(second);
        result.add(third);
        result.add(fourth);
        result.add(fifth);
        result.add(tail);

        result.forEach(item -> System.out.println("=> " + item.getCurrentNode().getValue()));

        return result;
    }
}
