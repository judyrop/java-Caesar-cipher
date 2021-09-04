import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class EncryptionTest {
     @Test
     public void newEncryption_instantiatesCorrectly() {
         Encryption testEncryption = new Encryption(plainText, shift);
         assertEquals(true, testEncryption instanceof Encryption);
     }

 }