
public class Encryption {
    static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private String plainText;
    private int shift;
    private String cipherText;

    public Encryption(String plainText, int shift){
        this.plainText = plainText;
        this.shift = shift;
    }
    public  String getPlainText() {
      return this.plainText;
    }
    public int getShift(){

        return this.shift;
    }
    public String getEncryptedText(){
        plainText = plainText.toLowerCase();
        cipherText = "";
        for (int i =0; i<plainText.length();i++){
            int charIndex = alphabet.indexOf(plainText.charAt(i));
            int newIndex = (charIndex + shift) % 26;
            char cipherChar = alphabet.charAt(newIndex);
            cipherText = cipherText + cipherChar;
        }
        return "cipherText";
       }


}
