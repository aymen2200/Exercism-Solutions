class RaindropConverter {

    String convert(int number) {
        String str = "";
        if(number % 3 == 0) {
            str += "Pling";
        }
        if(number % 5 == 0) {
            str += "Plang";
        }
        if(number % 7 == 0) {
            str += "Plong";
        }
        if(str.length() == 0) {
            str = String.valueOf(number);
        }
        return str;
    }

}
