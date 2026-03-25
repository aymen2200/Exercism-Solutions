class Acronym {
    String phrase;
    Acronym(String phrase) {
       this.phrase = phrase; 
    }

    String get() {
        char[] acr = new char[phrase.length()];
        int count = 1;
        boolean found = false;
        acr[0] = phrase.charAt(0);
        for(int i = 0;i < phrase.length();i++) {
            if(phrase.charAt(i) == ' ' || phrase.charAt(i) == '-' || phrase.charAt(i) == '_') {
                found = true;
            } else {
                if(found == true) {
                    acr[count] =  phrase.charAt(i);
                    count++;
                    found = false;
                } 
            }
        }
        String result = new String(acr,0,count);
        return result.toUpperCase();
    }

}
