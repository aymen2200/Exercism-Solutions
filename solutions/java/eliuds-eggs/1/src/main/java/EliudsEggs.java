public class EliudsEggs {
    public int eggCount(int number) {
        int count = 0;
        String str = Integer.toBinaryString(number);
        for(int i = 0;i < str.length();i++) {
            if(str.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
