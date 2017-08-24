package com.jazasoft.strategy;

import org.testng.annotations.Test;

/**
 * Created by mdzahidraza on 25/08/17.
 */
public class EncryptorTest {
    @Test
    public void testEncrypt() throws Exception {
        IEncryptionStrategy aesStrategy = new AesEncryptionStrategy();
        Encryptor aesEncryptor = new Encryptor(aesStrategy);
        aesEncryptor.setPlainText("This is plain text");
        aesEncryptor.encrypt();

        IEncryptionStrategy blowfishStrategy = new BlowfishEncryptionStrategy();
        Encryptor blowfishEncryptor = new Encryptor(blowfishStrategy);
        blowfishEncryptor.setPlainText("This is plain text");
        blowfishEncryptor.encrypt();
    }
}
