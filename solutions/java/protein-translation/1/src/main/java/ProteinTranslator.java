import java.util.List;
import java.util.ArrayList;

class ProteinTranslator {

    List<String> translate(String rna) {
        
        List<String> pro = new ArrayList<>();
        String str;
        int i = 2;
        outerLoop:
        while(i < rna.length()) {
            
            str = String.valueOf(rna.charAt(i - 2)) + String.valueOf(rna.charAt(i - 1)) + String.valueOf(rna.charAt(i));
            switch(str) {
                case "AUG": pro.add("Methionine");
                    break;
                case "UUU","UUC": pro.add("Phenylalanine");
                    break;
                case "UUA","UUG": pro.add("Leucine");
                    break;
                case "UCU", "UCC", "UCA", "UCG": pro.add("Serine");
                    break;
                case "UAU", "UAC": pro.add("Tyrosine");
                    break;
                case "UGU", "UGC": pro.add("Cysteine");
                    break;
                case "UGG": pro.add("Tryptophan");
                    break;
                case "UAA", "UAG", "UGA": break outerLoop;
                default: throw new IllegalArgumentException("Invalid codon");
            }
            i += 3;
        }
        
        if(rna.length() - 1 == i - 2 || rna.length() - 1 == i - 1) {
            throw new IllegalArgumentException("Invalid codon");
        }
        return pro;
    
}
}
