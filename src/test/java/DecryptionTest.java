import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecryptionTest {
    Decryption testDecryption = new Decryption("cipherText", 5);

    @Test
     public void newDecryption_testDecryption() {
        assertEquals(true,testDecryption instanceof Decryption);
    }

    @Test
    public void newDecryption_getsCipherText() {
        assertEquals("cipherText",testDecryption.getCipherText());
    }

    @Test
   public void newDecryption_getsShift() {
        assertEquals(5,testDecryption.getShift());
    }
}