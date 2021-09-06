public  class Declare {

        private String plainText;
        private int shift;
        public Declare( String plainText, int shift){
            this.plainText = plainText;
            this.shift = shift;
        }

        public String getPlainText() {
            return plainText;
        }
//
//        public void setPlainText(String plainText) {
//            this.plainText = plainText;
//        }
//
        public int getShift() {
            return shift;
        }
//
//        public void setShift(int shift) {
//            this.shift = shift;
//        }

//        String alphabet = "abcdefghijklmnopqrstuvwxyz";

//    public String getAlphabet() {
//        return alphabet;
//    }
//
//    public void setAlphabet(String alphabet) {
//        this.alphabet = alphabet;
//    }

    public static String getEncryptedText(String plainText, int shift) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        plainText = plainText.toLowerCase();
        String cipherText = "";
        for (int i =0; i<plainText.length();i++){
            int charIndex = alphabet.indexOf(plainText.charAt(i));
            int newIndex = (charIndex + shift) % 26;
            char cipherChar =alphabet.charAt(newIndex);
            cipherText = cipherText + cipherChar;
        }
        return cipherText;
    }
}

