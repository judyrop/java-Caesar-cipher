
public class Encryption {
    private String plainText;
    private int shift;

    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

 Declare declare = new Declare();
    public  String getEncryptedText(){
        plainText = plainText.toLowerCase();
         String cipherText = "";
        for (int i =0; i<plainText.length();i++){
            int charIndex = declare.getAlphabet().indexOf(plainText.charAt(i));
            int newIndex = (charIndex + shift) % 26;
            char cipherChar =declare.getAlphabet().charAt(newIndex);
            cipherText = cipherText + cipherChar;
        }
        return "cipherText";
       }



}
