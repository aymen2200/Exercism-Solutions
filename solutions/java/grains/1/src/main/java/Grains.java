import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        BigInteger result = BigInteger.ONE;
        if(square > 0 && square < 65) {
          for(int i = 0;i < square - 1;i++) {
            result = result.multiply(BigInteger.valueOf(2));
          }
        } else {
            throw new IllegalArgumentException("square must be between 1 and 64");
        } 
        
        
        return result;
    }

    BigInteger grainsOnBoard() {
        BigInteger value = BigInteger.ZERO;
        for(int i = 1;i < 65;i++) {
            value = value.add(grainsOnSquare(i));
        }
        return value;
    }

}
