package com.javacodegeeks.junit;

//first code of the build 
	import static org.junit.Assert.*;

	import java.util.*;

	import org.junit.*;

	 

	public class JUnitFirstTest {

	 

	    private ArrayList<String> testList;

	 

	    @BeforeClass

	    public static void onceExecutedBeforeAll() {

	        System.out.println("@BeforeClass: onceExecutedBeforeAll");

	    }
	 

	    @Before

	    public void executedBeforeEach() {

	        testList = new ArrayList<String>();

	        System.out.println("@Before: executedBeforeEach");

	    }

	 

	    @AfterClass

	    public static void onceExecutedAfterAll() {

	        System.out.println("@AfterClass: onceExecutedAfterAll");

	    }

	 

	    @After

	    public void executedAfterEach() {

	        testList.clear();

	        System.out.println("@After: executedAfterEach");

	    }

	 

	    @Test

	    public void EmptyCollection() {
	        assertTrue(testList.isEmpty());

	        System.out.println("@Test: EmptyArrayList");

	 

	    }


	    @Test

	    public void OneItemCollection() {

	        testList.add("oneItem");

	        assertEquals(1, testList.size());

	        System.out.println("@Test: OneItemArrayList");
	    }
	}