public class Hamming {
    String left;
    String right;
    public Hamming(String leftStrand, String rightStrand) {
        left = leftStrand;
        right = rightStrand;
        if (left.length() != right.length()) {
            throw new IllegalArgumentException("strands must be of equal length");
        }
    }

    public int getHammingDistance() {
        
        int count = 0;
        
            for(int i = 0;i < right.length();i++) {
                if(right.charAt(i) != left.charAt(i)) {
                    count++;
                }
                
            }
        
        return count;
    } 
}
