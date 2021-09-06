import java.util.Scanner;

public class Encryption {
//    private String plainText;
//    private int shift;
//
//    public String getPlainText() {
//        return plainText;
//    }
//
//    public void setPlainText(String plainText) {
//        this.plainText = plainText;
//    }
//
//    public int getShift() {
//        return shift;
//    }
//
//    public void setShift(int shift) {
//        this.shift = shift;
//    }
//

    public static void main(String[] args) {
//        Encryption encrypt = new Encryption();
//        Declare declare = new Declare;

        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter plain text");
//        System.out.println("Enter the plain key:");
        String plainText = myScan.nextLine();

        System.out.println("Enter shift:");
        int shift = myScan.nextInt();


//        String cipherText = declare.getEncryptedText(plainText, shift);
        System.out.println("CipherText:" + Declare.getEncryptedText(plainText,shift));
    }

// Declare declare = new Declare();
//    public  String getEncryptedText(){
//
//       }


}
