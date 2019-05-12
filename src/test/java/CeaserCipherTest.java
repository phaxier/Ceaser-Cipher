import org.junit.*;
import static org.junit.Assert.*;

public class CeaserCipherTest{

    @Test
    public void isEncrypt_ableTo_encrypt() {
        CeaserCipher ceasercipher = new CeaserCipher();
        assertEquals("cd", ceasercipher.isEncrypt("ab",2));
    }

    @Test
    public void runDecrypt_ableTo_decrypt() {
        CeaserCipher testCeaserCipher = new CeaserCipher();
        assertEquals("xy", testCeaserCipher.runDecrypt("za",2));
    }

}