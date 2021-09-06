import java.util.Scanner;

public class App {

    public static void main(String[] args) {


            Scanner myScan = new Scanner(System.in);
            System.out.println("Enter the input Text");
            String inputText = myScan.nextLine();

            System.out.println("Enter shift:");
            int shift = myScan.nextInt();
            System.out.println("What do you want to do ?reply 1 for decrypt and 2 for encrypt");
            int reply = myScan.nextInt();
            if (reply == 1){
                String plainText = Declaration.getDecryptedText(inputText,shift);
                System.out.println("plainText:" + plainText);
                System.out.println("The decrypted text is :" + inputText );
            }
            else if(reply == 2){
                String cText = Declare.getEncryptedText(inputText,shift);
                System.out.println("CipherText:" + cText);
                System.out.println("The encrypted text is:" + inputText);
            }
            else {
                System.out.println("Invalid input");
            }
        }

    }


