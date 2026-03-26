class NaturalNumber {
    int number;
    Classification clas;
    NaturalNumber(int number) {
        if(number < 1) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
            
            
        }
        this.number = number;
        int sum = 0;
        for(int i = 1;i < number;i++) {
            if(number % i == 0) {
                sum += i;
            }
        }
        if(sum > number) {
            clas = Classification.ABUNDANT;
        }
        if(sum < number) {
            clas = Classification.DEFICIENT;
        }
        if(sum == number) {
            clas = Classification.PERFECT;
        }
    }
    

    Classification getClassification() {
        return clas;
    }
}
