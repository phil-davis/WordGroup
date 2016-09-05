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
        String result = instance.wordKey();
        assertEquals(expResult, result);
    }

    @Test
    public void checkSortedKeycba() {
        System.out.println("Checking sorted key cba");

        WordGroup instance = new WordGroup("cba");
        String expResult = "abc";
        String result = instance.wordKey();
        assertEquals(expResult, result);
    }

    @Test
    public void checkSortedKeyABC() {
        System.out.println("Checking sorted key ABC");

        WordGroup instance = new WordGroup("ABC");
        String expResult = "abc";
        String result = instance.wordKey();
        assertEquals(expResult, result);
    }

    @Test
    public void checkSortedKeyCBA() {
        System.out.println("Checking sorted key CBA");

        WordGroup instance = new WordGroup("CBA");
        String expResult = "abc";
        String result = instance.wordKey();
        assertEquals(expResult, result);
    }

    @Test
    public void checkSortedKeya() {
        System.out.println("Checking sorted key a");

        WordGroup instance = new WordGroup("a");
        String expResult = "a";
        String result = instance.wordKey();
        assertEquals(expResult, result);
    }

    @Test
    public void checkSortedKeyA() {
        System.out.println("Checking sorted key A");

        WordGroup instance = new WordGroup("A");
        String expResult = "a";
        String result = instance.wordKey();
        assertEquals(expResult, result);
    }

    @Test
    public void checkSortedKeyNull() {
        System.out.println("Checking sorted key Null");

        WordGroup instance = new WordGroup("");
        String expResult = "";
        String result = instance.wordKey();
        assertEquals(expResult, result);
    }

    @Test
    public void checkSortedKeyMixed1() {
        System.out.println("Checking sorted key mixed 1");

        WordGroup instance = new WordGroup("QwErTy");
        String expResult = "eqrtwy";
        String result = instance.wordKey();
        assertEquals(expResult, result);
    }

    @Test
    public void checkSortedKeyMixed2() {
        System.out.println("Checking sorted key mixed 1");

        WordGroup instance = new WordGroup("qWeRtY");
        String expResult = "eqrtwy";
        String result = instance.wordKey();
        assertEquals(expResult, result);
    }

    @Test
    public void checkSortedKeyNumeric() {
        System.out.println("Checking sorted key numeric");

        WordGroup instance = new WordGroup("5y32X9a");
        String expResult = "2359axy";
        String result = instance.wordKey();
        assertEquals(expResult, result);
    }

    @Test
    public void checkSortedKeyRepeat() {
        System.out.println("Checking sorted key repeat");

        WordGroup instance = new WordGroup("t588Yftc9y5k5");
        String expResult = "555889cfkttyy";
        String result = instance.wordKey();
        assertEquals(expResult, result);
    }

    @Test
    public void checkWordMatchesGroup1() {
        System.out.println("Checking if word matches group 1");

        WordGroup instance = new WordGroup("abc");
        Boolean expResult = true;
        Boolean result = instance.wordMatchesGroup("abc");
        assertEquals(expResult, result);
    }

    @Test
    public void checkWordMatchesGroup2() {
        System.out.println("Checking if word matches group 2");

        WordGroup instance = new WordGroup("abc");
        Boolean expResult = true;
        Boolean result = instance.wordMatchesGroup("ABC");
        assertEquals(expResult, result);
    }

    @Test
    public void checkWordMatchesGroup3() {
        System.out.println("Checking if word matches group 3");

        WordGroup instance = new WordGroup("abc");
        Boolean expResult = true;
        Boolean result = instance.wordMatchesGroup("CBA");
        assertEquals(expResult, result);
    }

    @Test
    public void checkWordMatchesGroupNull() {
        System.out.println("Checking if word matches group Null");

        WordGroup instance = new WordGroup("");
        Boolean expResult = true;
        Boolean result = instance.wordMatchesGroup("");
        assertEquals(expResult, result);
    }

    @Test
    public void checkWordMatchesGroupMixed() {
        System.out.println("Checking if word matches group mixed");

        WordGroup instance = new WordGroup("fYx59pW3qX55");
        Boolean expResult = true;
        Boolean result = instance.wordMatchesGroup("pX5Y3x59f5qW");
        assertEquals(expResult, result);
    }

    @Test
    public void checkWordMatchesGroupShorter() {
        System.out.println("Checking if word matches group shorter");

        WordGroup instance = new WordGroup("fYx59pW3qX55");
        Boolean expResult = false;
        Boolean result = instance.wordMatchesGroup("pX5Y3x59fqW");
        assertEquals(expResult, result);
    }

    @Test
    public void checkWordMatchesGroupLonger() {
        System.out.println("Checking if word matches group longer");

        WordGroup instance = new WordGroup("fYx59pW3qX55");
        Boolean expResult = false;
        Boolean result = instance.wordMatchesGroup("pX5Y3x5g9f5qW");
        assertEquals(expResult, result);
    }

    @Test
    public void checkWordMatchesGroupDifferent() {
        System.out.println("Checking if word matches group different");

        WordGroup instance = new WordGroup("fYx59pW3qX55");
        Boolean expResult = false;
        Boolean result = instance.wordMatchesGroup("pXkY3x59f5qW");
        assertEquals(expResult, result);
    }

    @Test
    public void checkWordMatchesGroupNull1() {
        System.out.println("Checking if word matches group null 1");

        WordGroup instance = new WordGroup("");
        Boolean expResult = false;
        Boolean result = instance.wordMatchesGroup("x");
        assertEquals(expResult, result);
    }

    @Test
    public void checkWordMatchesGroupNull2() {
        System.out.println("Checking if word matches group null 2");

        WordGroup instance = new WordGroup("x");
        Boolean expResult = false;
        Boolean result = instance.wordMatchesGroup("");
        assertEquals(expResult, result);
    }

    @Test
    public void checkWordLengthNull() {
        System.out.println("Checking length of word for Null");

        WordGroup instance = new WordGroup("");
        int expResult = 0;
        int result = instance.wordLength();
        assertEquals(expResult, result);
    }

    @Test
    public void checkWordLength1() {
        System.out.println("Checking length of word 1");

        WordGroup instance = new WordGroup("9");
        int expResult = 1;
        int result = instance.wordLength();
        assertEquals(expResult, result);
    }

    @Test
    public void checkWordLength12() {
        System.out.println("Checking length of word 12");

        WordGroup instance = new WordGroup("gP28dYx49Yta");
        int expResult = 12;
        int result = instance.wordLength();
        assertEquals(expResult, result);
    }

    @Test
    public void checkWordListAsString1() {
        System.out.println("Checking wordListAsString with only 1 word");

        WordGroup instance = new WordGroup("DcBa");
        String expResult = "DcBa";
        String result = instance.wordListAsString();
        assertEquals(expResult, result);
    }

    @Test
    public void checkWordListAsStringEmpty() {
        System.out.println("Checking wordListAsString with empty word");

        WordGroup instance = new WordGroup("");
        String expResult = "";
        String result = instance.wordListAsString();
        assertEquals(expResult, result);
    }

}
