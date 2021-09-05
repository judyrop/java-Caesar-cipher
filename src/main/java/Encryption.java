
public class Encryption {


    Declare declare = new Declare();
    public  String getEncryptedText(String plainText,int shift){
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
