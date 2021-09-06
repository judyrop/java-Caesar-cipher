import java.util.Scanner;

public class Decryption {

    public static void main(String[] args) {


    Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the cipher Text");
    String cipherText = myScan.nextLine();

        System.out.println("Enter shift:");
    int shift = myScan.nextInt();

    String plainText = Declaration.getDecryptedText(cipherText,shift);
        System.out.println("plainText:" + plainText);
}
//    static String alphabet = "abcdefghijklmnopqrstuvwxyz";
//    private String cipherText;
//    private int shift;
//    private String plainText;
////
//public Decryption(String cipherText,int shift){
//this.cipherText = cipherText;
//this.shift = shift;
//}
//    public  String getCipherText() {
//        return this.cipherText;
//    }
//    public int getShift(){
//
//    return this.shift;
//    }
//    public String getDecryptedText() {
//        cipherText = cipherText.toLowerCase();
//        String plainText = "";
//        for (int i = 0; i < cipherText.length(); i++) {
//            int charIndex = alphabet.indexOf(cipherText.charAt(i));
//            int newIndex = (charIndex - shift) % 26;
//            if (newIndex < 0) {
//                newIndex = alphabet.length() + newIndex;
//            }
//            char plainChar = alphabet.charAt(newIndex);
//            plainText = plainText + plainChar;
//        }
//        return "plainText";
//    }

}
