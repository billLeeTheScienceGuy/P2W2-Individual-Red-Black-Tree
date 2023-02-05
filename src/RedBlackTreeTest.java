import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RedBlackTreeTest {
	protected RedBlackTree<Integer> testNode;
	/*
	 * This method tests the positioning of the enforce method
	 */
	@Test
	void testPosition() {
		testNode = new RedBlackTree<>();
    	testNode.insert(23);
    	testNode.insert(7);
    	testNode.insert(41);
    	testNode.insert(37);
    	//assert that they are in the right position.
    	assertTrue(testNode.root.data.equals(23) && testNode.root.leftChild.data.equals(7) && testNode.root.rightChild.data.equals(41) && testNode.root.rightChild.leftChild.data.equals(37));
	}
	/*
	 * This method tests the coloring of the enforce method
	 */
	@Test
	void testColor() {
		testNode = new RedBlackTree<>();
    	testNode.insert(8);
    	testNode.insert(7);
    	testNode.insert(10);
    	testNode.insert(11);
    	testNode.insert(9);
    	//check the black colors
    	assertTrue(testNode.root.blackHeight + testNode.root.leftChild.blackHeight + testNode.root.rightChild.blackHeight == 3);
    	//check the red colors
    	assertTrue(testNode.root.rightChild.leftChild.blackHeight == 0 && testNode.root.rightChild.rightChild.blackHeight == 0);
		
	}
	/*
	 * This method tests the exceptional case of the enforce method
	 * where the provided tree is against the rule of the RBT.
	 */
	@Test
	void testExceptional() {
		RedBlackTree<Integer> testNode = new RedBlackTree<>();
    	testNode.insert(45);
    	testNode.insert(26);
    	testNode.insert(72);
    	testNode.root.rightChild.blackHeight = 1;
    	testNode.insert(18);
        assertTrue(testNode.root.blackHeight == 1);
        assertTrue(testNode.root.leftChild.blackHeight == 0);
        assertTrue(testNode.root.rightChild.blackHeight == 0);
        assertTrue(testNode.root.rightChild.rightChild.blackHeight == 1);
		    
	}
	

}
