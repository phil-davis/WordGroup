package WordGroup;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestWordGroup {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

    @Test
    public void checkSortedKeyabc() {
        System.out.println("Checking sorted key abc");

        WordGroup instance = new WordGroup("abc");
        String expResult = "abc";
        String result = instance.getWordKey();
        assertEquals(expResult, result);
    }

    @Test
    public void checkSortedKeycba() {
        System.out.println("Checking sorted key cba");

        WordGroup instance = new WordGroup("cba");
        String expResult = "abc";
        String result = instance.getWordKey();
        assertEquals(expResult, result);
    }

    @Test
    public void checkSortedKeyABC() {
        System.out.println("Checking sorted key ABC");

        WordGroup instance = new WordGroup("ABC");
        String expResult = "abc";
        String result = instance.getWordKey();
        assertEquals(expResult, result);
    }

    @Test
    public void checkSortedKeyCBA() {
        System.out.println("Checking sorted key CBA");

        WordGroup instance = new WordGroup("CBA");
        String expResult = "abc";
        String result = instance.getWordKey();
        assertEquals(expResult, result);
    }

    @Test
    public void checkSortedKeya() {
        System.out.println("Checking sorted key a");

        WordGroup instance = new WordGroup("a");
        String expResult = "a";
        String result = instance.getWordKey();
        assertEquals(expResult, result);
    }

    @Test
    public void checkSortedKeyA() {
        System.out.println("Checking sorted key A");

        WordGroup instance = new WordGroup("A");
        String expResult = "a";
        String result = instance.getWordKey();
        assertEquals(expResult, result);
    }

    @Test
    public void checkSortedKeyNull() {
        System.out.println("Checking sorted key Null");

        WordGroup instance = new WordGroup("");
        String expResult = "";
        String result = instance.getWordKey();
        assertEquals(expResult, result);
    }

    @Test
    public void checkSortedKeyMixed1() {
        System.out.println("Checking sorted key mixed 1");

        WordGroup instance = new WordGroup("QwErTy");
        String expResult = "eqrtwy";
        String result = instance.getWordKey();
        assertEquals(expResult, result);
    }

    @Test
    public void checkSortedKeyMixed2() {
        System.out.println("Checking sorted key mixed 1");

        WordGroup instance = new WordGroup("qWeRtY");
        String expResult = "eqrtwy";
        String result = instance.getWordKey();
        assertEquals(expResult, result);
    }

    @Test
    public void checkSortedKeyNumeric() {
        System.out.println("Checking sorted key numeric");

        WordGroup instance = new WordGroup("5y32X9a");
        String expResult = "2359axy";
        String result = instance.getWordKey();
        assertEquals(expResult, result);
    }

    @Test
    public void checkSortedKeyRepeat() {
        System.out.println("Checking sorted key repeat");

        WordGroup instance = new WordGroup("t588Yftc9y5k5");
        String expResult = "555889cfkttyy";
        String result = instance.getWordKey();
        assertEquals(expResult, result);
    }

}
