public class Declaration {
    private String cipherText;
    private int shift;
    public  Declaration(String cipherText, int shift){
        this.cipherText = cipherText;
    }
    public String getCipherText() {
        return cipherText;
    }

    public int getShift() {
        return shift;
    }

    public static String getDecryptedText(String cipherText, int shift) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        cipherText = cipherText.toLowerCase();
        String plainText = "";
        for (int i = 0; i < cipherText.length(); i++) {
            int charIndex = alphabet.indexOf(cipherText.charAt(i));
            int newIndex = (charIndex - shift) % 26;
            if (newIndex < 0) {
                newIndex = alphabet.length() + newIndex;
            }
            char plainChar = alphabet.charAt(newIndex);
            plainText = plainText + plainChar;
        }
        return plainText;
    }
}
