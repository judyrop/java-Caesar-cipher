public  class Declare {

        private String plainText;
        private int shift;

        public Declare(String plainText, int shift){
            this.plainText = plainText;
            this.shift = shift;

        }

        public String getPlainText() {
            return plainText;
        }

        public int getShift() {
            return shift;
        }


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

