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
    	// Trim space front and back
    	// Then only consider the first word the caller passed in.
    	String firstWord = s1.trim().split(" ",2)[0];
        this.ll.add(firstWord);
        char[] chararray = firstWord.toLowerCase().toCharArray();
        Arrays.sort(chararray);
        this.WordKey = String.valueOf(chararray);
    }
    
    // -------------------------
    // Methods
    // -------------------------
    public Boolean addWord(String s1) {
    	// Trim space front and back
    	// Then only consider the first word the caller passed in.
    	String firstWord = s1.trim().split(" ",2)[0];
    	if (this.wordMatchesGroup(firstWord)) {
    		if (!this.ll.contains(firstWord)) {
    			this.ll.add(firstWord);
    		}
            return true;
    	} else {
    		return false;
    	}
    }
    
    public String wordKey() {
    	return this.WordKey;
    }

    public int wordLength() {
    	return this.WordKey.length();
    }

    public int wordCount() {
    	return this.ll.size();
    }

    public String wordListAsString() {
    	return String.join(" ", this.ll);
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
