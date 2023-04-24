package test;

import org.junit.Test;
import BinaryTreeToDoublyLinkedList.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class BTtoDLLTest {

    @Test
    public void checkIfRootNode(){
        BTnode newRootNode = new BTnode(0, 10, null,null);
        assertEquals(0, newRootNode.getOrder());
        assertEquals(null, newRootNode.getParentNode());
    }

    @Test
    public void checkIfChildNodeOfFirstOrder(){
        BTnode rootNode = new BTnode(0, 10, null,null);
        BTnode childNode = new BTnode(1, 12, rootNode, null);
        rootNode.setChildren(new BTnode[]{childNode});

        assertEquals(0, rootNode.getOrder());
        assertEquals(null, rootNode.getParentNode());
        assertEquals(1, childNode.getOrder());
        assertEquals(rootNode, childNode.getParentNode());
    }

    @Test
    public void checkIfHeadNode(){
        BTnode rootNode = new BTnode(0, 10, null,null);
        BTnode childNode = new BTnode(1, 12, rootNode, null);
        BTnode grandchildNode = new BTnode(2, 25, childNode,null);

        rootNode.setChildren(new BTnode[]{childNode});
        childNode.setChildren(new BTnode[]{grandchildNode});

        LLnode headNode = new LLnode(null, grandchildNode, childNode);
        assertEquals(childNode, headNode.getNextNode());
    }

    @Test
    public void checkIfTailNode(){
        BTnode rootNode = new BTnode(0, 10, null,null);
        BTnode childNode = new BTnode(1, 15, rootNode, null);
        BTnode grandchildNode = new BTnode(2, 36, childNode,null);

        rootNode.setChildren(new BTnode[]{childNode});
        childNode.setChildren(new BTnode[]{grandchildNode});

        LLnode tailNode = new LLnode(childNode, grandchildNode, null);
        assertEquals(null, tailNode.getNextNode());
    }

    @Test
    public void checkIfSequentialNode(){

        BTnode rootNode = new BTnode(0, 10, null,null);
        BTnode biggerChildNode = new BTnode(1, 15, rootNode, null);
        BTnode smallerChildNode = new BTnode(1, 12, rootNode, null);

        BTnode grandchildNodeFromBiggerChild = new BTnode(2, 36, biggerChildNode,null);
        BTnode smallerGrandchildNodeFromSmallerChild = new BTnode(2, 25, smallerChildNode,null);
        BTnode biggerGrandchildNodeFromSmallerChild = new BTnode(2, 30, smallerChildNode,null);

        rootNode.setChildren(new BTnode[]{biggerChildNode, smallerChildNode});
        biggerChildNode.setChildren(new BTnode[]{grandchildNodeFromBiggerChild});
        smallerChildNode.setChildren(new BTnode[]{smallerGrandchildNodeFromSmallerChild, biggerGrandchildNodeFromSmallerChild});

        LLnode sequentialNode = new LLnode(biggerGrandchildNodeFromSmallerChild, rootNode, grandchildNodeFromBiggerChild);
        assertEquals(grandchildNodeFromBiggerChild, sequentialNode.getNextNode());
        assertEquals(biggerGrandchildNodeFromSmallerChild, sequentialNode.getPreviousNode());
    }

    @Test
    public void checkIfDLLhasCorrectEnds(){
        BTnode rootNode = new BTnode(0, 10, null,null);
        BTnode biggerChildNode = new BTnode(1, 15, rootNode, null);
        BTnode smallerChildNode = new BTnode(1, 12, rootNode, null);

        BTnode grandchildNodeFromBiggerChild = new BTnode(2, 36, biggerChildNode,null);
        BTnode smallerGrandchildNodeFromSmallerChild = new BTnode(2, 25, smallerChildNode,null);
        BTnode biggerGrandchildNodeFromSmallerChild = new BTnode(2, 30, smallerChildNode,null);

        rootNode.setChildren(new BTnode[]{biggerChildNode, smallerChildNode});
        biggerChildNode.setChildren(new BTnode[]{grandchildNodeFromBiggerChild});
        smallerChildNode.setChildren(new BTnode[]{smallerGrandchildNodeFromSmallerChild, biggerGrandchildNodeFromSmallerChild});

        BTnode[] givenNodes = new BTnode[]{rootNode, biggerChildNode, smallerChildNode, grandchildNodeFromBiggerChild, smallerGrandchildNodeFromSmallerChild, biggerGrandchildNodeFromSmallerChild};
        ArrayList<BTnode> nodes = new ArrayList<BTnode>(Arrays.asList(givenNodes));
        LinkedList<LLnode> dllStructure = DLLmaker.makeDLL(nodes);
        assertEquals(25, dllStructure.get(0).getCurrentNode().getValue());
        assertEquals(15, dllStructure.getLast().getCurrentNode().getValue());
        assertEquals(30, dllStructure.get(3).getPreviousNode().getValue());
    }
}
