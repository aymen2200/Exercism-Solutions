import java.util.HashSet;
import java.util.Set;
public class PangramChecker {

    public boolean isPangram(String input) {
        Set<Character> letters = new HashSet<>();
        input = input.toLowerCase();
        for(int i = 0;i < input.length();i++) {
            if(Character.isLetter(input.charAt(i))) {
                letters.add(input.charAt(i));
            }
        }
        if(letters.size() == 26) {
            return true;
        } else {
            return false;
        }
    }

}
