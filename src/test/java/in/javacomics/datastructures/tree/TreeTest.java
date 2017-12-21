package in.javacomics.datastructures.tree;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import in.javacomics.datastructures.tree.BinaryTree;
import in.javacomics.datastructures.tree.StandardBinaryTree;

public class TreeTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_string_tree() {
		BinaryTree<String> stringBinaryTree = createBinaryTreeWithRootValue("A");
		stringBinaryTree.setLeftSubTree(createBinaryTreeWithRootValue("B"));
		stringBinaryTree.getLeftSubTree().getRoot().setLeftChild(new StandardBinaryTree.Node<String>(stringBinaryTree.getLeftSubTree().getRoot(),null,null,"D"));
		stringBinaryTree.setRightSubTree(createBinaryTreeWithRootValue("C"));
		stringBinaryTree.geRightSubTree().setLeftSubTree(createBinaryTreeWithRootValue("E"));
		stringBinaryTree.geRightSubTree().setRightSubTree(createBinaryTreeWithRootValue("F"));
		System.out.println("Pre order --->");
		stringBinaryTree.doPreOrderTraversal((String x) -> System.out.println(x));	
		System.out.println("In order --->");
		stringBinaryTree.doInOrderTraversal((String x) -> System.out.println(x));
		System.out.println("Post order --->");
		stringBinaryTree.doPostOrderTraversal((String x) -> System.out.println(x));
	}

	private BinaryTree<String> createBinaryTreeWithRootValue(String value) {
		BinaryTree<String> stringBinaryTree = new StandardBinaryTree<String>();
		stringBinaryTree.setRoot(new StandardBinaryTree.Node<String>(null,null,null,value));
		return stringBinaryTree;
	}
	
	@Test
	public void test_BFS_tree() {
		BinaryTree<String> stringBinaryTree =  createBinaryTreeWithRootValue("A");
		System.out.println("BFS order --->");
		stringBinaryTree.doBFSTraversal((String x) -> System.out.println(x));	
		System.out.println("In order --->");
		stringBinaryTree.doInOrderTraversal((String x) -> System.out.println(x));
		System.out.println("Pre order --->");
		stringBinaryTree.doPreOrderTraversal((String x) -> System.out.println(x));
	}

}
