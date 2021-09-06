import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class DecryptionTest {
//    Decryption testDecryption = new Decryption("cipherText", 5);
Decryption testDecryption = new Decryption();
    @Test
     public void newDecryption_testDecryption() {
        assertEquals(true,testDecryption instanceof Decryption);
    }

    @Test
    public void newDecryption_getsCipherText() {
//        assertEquals("cipherText",testDecryption.getCipherText());
    }

    @Test
   public void newDecryption_getsShift() {
//        assertEquals(5,testDecryption.getShift());
    }

//    @Test
//    public void newDecryption_getsDecryptedText() {
//        assertEquals("plainText",testDecryption.getDecryptedText());
//    }
}