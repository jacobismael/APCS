import java.util.ArrayList;
import java.util.List;

public class Scramble
{
	/** Scrambles a given word.
	* @param word the word to be scrambled
	* @return the scrambled word (possibly equal to word)
	* Precondition: word is either an empty string or contains only uppercase letters.
	* Postcondition: the string returned was created from word as follows:
	* - the word was scrambled, beginning at the first letter and continuing from left to right
	* - two consecutive letters consisting of "A" followed by a letter that was not "A" were swapped
	*/
	public static String scrambleWord(String word)
	{
		char[] letters = new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			letters[i] = word.charAt(i);
		}

		for (int i = 0; i < letters.length; i++) {
			int randi = (int)(Math.random() * letters.length);
           	char temp = letters[randi];

			//System.out.println(randi);

			letters[randi] = letters[i];
			letters[i] = temp;
		}
		return new String(letters);
	}
	
	/** Modifies wordList by replacing each word with its scrambled
	* version, removing any words that are unchanged as a result of scrambling.
	* @param wordList the list of words
	* Precondition: wordList contains only non-null objects
	* Postcondition:
	* - all words unchanged by scrambling have been removed from wordList
	* - each of the remaining words has been replaced by its scrambled version
	* - the relative ordering of the entries in wordList is the same as it was
	* before the method was called
	*/
	public static void scrambleOrRemove(List<String> wordList)
	{
		for(int i = 0; i < wordList.size(); i++) {
			String oldWord = wordList.get(i);
			wordList.set(i, scrambleWord(wordList.get(i)));

			if(wordList.get(i).compareTo(oldWord) == 0) {
				wordList.remove(wordList.get(i));
			}
		}
	}
}
