import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class DnDCharacter {
    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;
    public DnDCharacter() {
        this.strength = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.constitution = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.charisma = ability(rollDice());
    }
    int ability(List<Integer> scores) {
        
        return scores.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .mapToInt(Integer::intValue)
                .sum();
        
    }

    List<Integer> rollDice() {
        
            Random rand = new Random();
            List<Integer> list = new ArrayList<>();
            list.add(rand.nextInt(6) + 1);
            list.add(rand.nextInt(6) + 1);
            list.add(rand.nextInt(6) + 1);
            list.add(rand.nextInt(6) + 1);
            return list;
           
        
    }

    int modifier(int input) {
        return (int)Math.floor((input - 10) / 2.0) ;
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }
    

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return 10 + modifier(constitution);
    }
}
