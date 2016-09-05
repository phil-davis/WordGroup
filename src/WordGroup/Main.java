package WordGroup;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

class BigWordCountFirst implements Comparator<Object> {@Override
public int compare(Object arg0, Object arg1) {
	WordGroup x = (WordGroup)arg0;
	WordGroup y = (WordGroup)arg1;
	// Bigger wordCount is required to sort first
	if(x.wordCount() > y.wordCount()) {
		return -1;
	} else if(x.wordCount() == y.wordCount()) {
		return 0;
	} else {
		return 1;
	}
}}

public class Main {
    public static void main(String[] args) {
        LinkedList<WordGroup> ll = new LinkedList<WordGroup>();
        Scanner scan = new Scanner(System.in);
        
        while (true) {
	        System.out.println("Enter a word (or RETURN to finish): ");
	        String s = scan.nextLine();
	        if (s.equals("")) {
	        	break;
	        }
	        
            ListIterator<WordGroup> listIterator = ll.listIterator();
        	Boolean wordAdded = false;
        	while (listIterator.hasNext()) {
        		wordAdded = listIterator.next().addWord(s);
        		if (wordAdded) {
        			break;
        		}
    		}
        	
	        if (!wordAdded) {
	            WordGroup newGroup = new WordGroup(s);
	            ll.add(newGroup);
	        }
	    };
        
        Collections.sort(ll, new BigWordCountFirst());
        
        if (ll.size() == 0) {
	        System.out.println("No words to count.");
        } else {
	        System.out.println("Word groups and counts:");
	        ListIterator<WordGroup> listIterator2 = ll.listIterator();
	    	while (listIterator2.hasNext()) {
	    		WordGroup wg = listIterator2.next();
	        	System.out.println(wg.wordCount() + ": " + wg.wordListAsString());
			}
        }
        scan.close();
    }

}
