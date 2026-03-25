class RnaTranscription {

    String transcribe(String dnaStrand) {
       char[] rna = new char[dnaStrand.length()];
        char n;
        for(int i = 0;i < dnaStrand.length();i++) {
            n = dnaStrand.charAt(i);
            switch(n) {
                case 'A': rna[i] = 'U';
                    break;
                case 'C': rna[i] = 'G';
                    break;
                case 'G': rna[i] = 'C';
                    break;
                case 'T': rna[i] = 'A';
                    break;
            }
        }
        String rnaStrand = new String(rna);
        return rnaStrand;
        
    }

}
