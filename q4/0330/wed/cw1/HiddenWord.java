public class HiddenWord
{
    private String word;
    
    public HiddenWord(String word) {
        this.word = word;
    }

    public String getHint(String guess) {

        String total = "";

        boolean found = false;

        
        for(int i = 0; i < guess.length(); i++) {
            found = false;
            char hint = '*';

            for (int j = 0; j < word.length(); j++) {
                if(guess.charAt(i) == word.charAt(j)) {
                    hint = '+';

                    if(i == j) {
                        hint = word.charAt(i);
                    }
                }
            }
            
            total += hint;
        }

        return total;
    }
}
