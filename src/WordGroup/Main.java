package WordGroup;

public class Main {
    public static void main(String[] args) {
        WordGroup wg = new WordGroup("How");
        Boolean result = wg.addWord("Who");
        if (result) {
        	System.out.println(wg.wordLength() + ": " + wg.wordListAsString());
        } else {
        	System.out.println("Error in addWord");
        }
    }

}
