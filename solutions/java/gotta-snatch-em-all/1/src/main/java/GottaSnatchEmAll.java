import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        
        Set<String> collection = new HashSet<>();
        for(int i = 0;i < cards.size();i++) {
            collection.add(cards.get(i));
        }
        return collection;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean me = false;
        boolean they = false;
       for(String card : myCollection) {
           if(!theirCollection.contains(card)) {
               me = true;
               break;
           }
       }
        for(String card : theirCollection) {
           if(!myCollection.contains(card)) {
               they = true;
               break;
           }
       }
        return me && they;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        boolean common;
        Set<String> commonCards = new HashSet<>();
        for(Set<String> set : collections) {
            
            for(String card : set) {
                common = true;
                for(Set<String> collection : collections) {
                    if(!collection.contains(card)) {
                        common = false;
                        break;
                    }
                }
                if (common) {
                    commonCards.add(card);
                }
            }
        }
        return commonCards;
    }

    static Set<String> allCards(List<Set<String>> collections) {
         Set<String> allCards = new HashSet<>();
        for(Set<String> collection : collections) {
            for(String card : collection) {
                allCards.add(card);
            }
        }
        return allCards;
    }
}
