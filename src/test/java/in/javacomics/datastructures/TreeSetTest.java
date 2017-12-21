package in.javacomics.datastructures;

import java.util.TreeSet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TreeSetTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected=ClassCastException.class)
	public void test_tree_set_throws_exception_when_item_is_not_comparable() {
		TreeSet<NotComparable> treeSet = new TreeSet<NotComparable>();
		treeSet.add(new NotComparable("1", "Item1", "Item1"));
	}

}
class NotComparable {
	private String id;
	private String name;
	private String description;
	public NotComparable(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	
	
}
