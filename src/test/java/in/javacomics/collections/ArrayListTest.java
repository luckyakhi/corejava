package in.javacomics.collections;

import static org.junit.Assert.*;
import in.javacomics.utils.TestReflectionUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.util.ReflectionUtils;


public class ArrayListTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_add_method_array_list() {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("First Element");
		arrayList.add("Second Element");
		assertEquals("First Element", arrayList.get(0));
		assertEquals("Second Element", arrayList.get(1));
	}
	
	@Test
	public void test_add_at_index_method_shifing_behavior(){
		List<String> arrayList = new ArrayList<String>(3);//initial capacity not size 
		arrayList.add("First Element");
		arrayList.add(1,"Third Element");
		arrayList.add(1,"Second Element");
		assertEquals("Second Element",arrayList.get(1));
		assertEquals("Third Element",arrayList.get(2));
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void test_add_at_index_grt_than_current_size(){
		List<String> arrayList = new ArrayList<>();
		arrayList.add("First Element");
		arrayList.add(2,"Second Element");
	}
	
	@Test
	public void test_default_initial_capacity_is_ten_on_addtion_of_one_element(){
		ArrayList<String> arrayList = new ArrayList<>();
		Field elementDataField = TestReflectionUtils.getPrivateFieldBasedOnName("elementData",ArrayList.class);
		Object[] elementData = (Object[]) ReflectionUtils.getField(elementDataField, arrayList);
		assertEquals(0,elementData.length);
		
		arrayList.add("First Element");
		
		elementData = (Object[]) ReflectionUtils.getField(elementDataField, arrayList);
		assertEquals(10,elementData.length);
	}
	
	@Test
	public void test_ensure_capacity(){
		ArrayList<String> arrayList = new ArrayList<>();
		Field elementDataField = TestReflectionUtils.getPrivateFieldBasedOnName("elementData",ArrayList.class);
		arrayList.ensureCapacity(13);
		arrayList.add("First Element");
		Object[] elementData = (Object[]) ReflectionUtils.getField(elementDataField, arrayList);
		assertEquals(13,elementData.length);
	}

}
