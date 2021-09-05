import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class EncryptionTest {
//     public Encryption(String plainText, int shift){
//
Encryption testEncryption = new Encryption();
  String cipherText;
     @Test
     public void newEncryption_testEncryption() {
         assertEquals(true, testEncryption instanceof Encryption);

     }

     @Test
    public void newEncryption_getsPlainText() {

//         assertEquals("Judy",testEncryption.getPlainText());
     }

     @Test
    public void newEncryption_getsShift() {
//         assertEquals(5,testEncryption.getShift());
     }

//     @Test
//      public void newEncryption_getEncryptedText() {
//         assertEquals("cipherText",testEncryption.getEncryptedText("aaa",2));
//     }
 }