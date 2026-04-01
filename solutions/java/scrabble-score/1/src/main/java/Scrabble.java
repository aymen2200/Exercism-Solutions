class Scrabble {
    String word;
    Scrabble(String word) {
        this.word = word.toUpperCase();
    }

    int getScore() {
        if(word != "") {
            String newWord = word;
            word = word.substring(1);
            return switch(newWord.charAt(0)) {
                case 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' -> 1;
                case 'D', 'G' -> 2;
                case 'B', 'C', 'M', 'P' -> 3;
                case 'F', 'H', 'V', 'W', 'Y' -> 4;
                case 'K' -> 5;
                case 'J', 'X' -> 8;
                case 'Q', 'Z' -> 10;
                default -> throw new IllegalArgumentException("Only English alphabet letters accepted unfortunately.");
            } + getScore();
        }
        return 0;
    }

}
