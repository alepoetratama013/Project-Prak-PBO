
package app;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SHA256 {
    // method untuk hash password
    public String generate(String str) throws NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(str.getBytes());
        byte[] digest = md.digest();
        String result = new BigInteger(1, digest).toString(16).toUpperCase();
        return result;
    }
}
