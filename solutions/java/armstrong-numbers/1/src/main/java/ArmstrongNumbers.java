class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        int number = numberToCheck;
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        int original = numberToCheck;
        for (int i = 0;i < count;i++) {
            number += Math.pow(numberToCheck % 10,count);
            numberToCheck = numberToCheck / 10;
        }
        return number == original;

    }

}
 