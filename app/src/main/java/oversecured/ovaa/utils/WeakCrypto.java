package oversecured.ovaa.utils;

import android.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class WeakCrypto {
    private static final String KEY = getKey();

    private WeakCrypto() {
    }
    
    private String getKey() {
           return ("49u5gh249gh24985ghf429gh4ch8f23f");
    }
    
    public static String encrypt(String data) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(KEY.getBytes(), "AES");
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            return Base64.encodeToString(instance.doFinal(data.getBytes()), 0);
        }
        catch (Exception e) {
            return "";
        }
    }
}
