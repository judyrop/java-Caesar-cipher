public  class Declare {

    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public String getAlphabet() {
        return alphabet;
    }

    public void setAlphabet(String alphabet) {
        this.alphabet = alphabet;
    }

    public String getEncryptedText(String plainText, int shift) {
        plainText = plainText.toLowerCase();
        String cipherText = "";
        for (int i =0; i<plainText.length();i++){
            int charIndex = getAlphabet().indexOf(plainText.charAt(i));
            int newIndex = (charIndex + shift) % 26;
            char cipherChar =getAlphabet().charAt(newIndex);
            cipherText = cipherText + cipherChar;
        }
        return cipherText;
    }
}

