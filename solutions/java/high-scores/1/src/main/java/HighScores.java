import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class HighScores {
    List<Integer> highScores = new ArrayList<>();
    
    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
    }
    
    List<Integer> scores() {
        return highScores;
    }

    Integer latest() {
        return highScores.get(highScores.size() - 1);
    }

    Integer personalBest() {
        return Collections.max(highScores);
    }

    List<Integer> personalTopThree() {
        List<Integer> sorted = new ArrayList<>(highScores);
        Collections.sort(sorted,Collections.reverseOrder());
        return sorted.subList(0,Math.min(sorted.size(),3));
    }
    

}
