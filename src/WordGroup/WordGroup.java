package WordGroup;

import java.util.Arrays;
import java.util.LinkedList;

public class WordGroup {

    // -------------------------
    // Class Attributes 
    // -------------------------
    private LinkedList<String> ll = new LinkedList<String>();
    private String WordKey;

    // -------------------------
    // Constructors
    // -------------------------
    public WordGroup(String s1) {
        this.ll.add(s1);
        char[] chararray = s1.toLowerCase().toCharArray();
        Arrays.sort(chararray);
        this.WordKey = String.valueOf(chararray);
    }
    
    // -------------------------
    // Methods
    // -------------------------
    public String getWordKey() {
    	return this.WordKey;
    }

    public int wordLength() {
    	return this.WordKey.length();
    }

    public Boolean wordMatchesGroup(String s1) {
    	if (s1.length() != this.WordKey.length()) {
    		return false;
    	}
    	char[] chararray = s1.toLowerCase().toCharArray();
    	Arrays.sort(chararray);
    	return (this.WordKey.equals(String.valueOf(chararray)));
    }
}
