
class ResistorColorTrio {
    int colorCode(String color) {
        return switch(color) {
            case "black" -> 0;
            case "brown" -> 1;
            case "red" -> 2;
            case "orange" -> 3;
            case "yellow" -> 4;
            case "green" -> 5;
            case "blue" -> 6;
            case "violet" -> 7;
            case "grey" -> 8;
            case "white" -> 9;
            default -> -1;
        };
    }

    String label(String[] colors) {
        int result = Integer.parseInt("" + colorCode(colors[0]) + colorCode(colors[1])) * (int)Math.pow(10,colorCode(colors[2]));
        if(colorCode(colors[2]) < 2 ) {
            return result + " ohms";
        } else if(colorCode(colors[2]) < 5) {
        return result / 1000 + " kiloohms";
        } else if(colorCode(colors[2]) < 8) {
            return result / 1000000 + " megaohms";
        }
        long number = Integer.parseInt("" + colorCode(colors[0]) + colorCode(colors[1])) * (long)Math.pow(10,colorCode(colors[2]));
        number = (number / 1000000000);
        
        return number + " gigaohms";
    }
}
