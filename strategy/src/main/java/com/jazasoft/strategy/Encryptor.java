package com.jazasoft.strategy;

/**
 * Created by mdzahidraza on 25/08/17.
 */
public class Encryptor {

    private IEncryptionStrategy strategy;
    private String plainText;

    public Encryptor(IEncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public void encrypt() {
        strategy.encryptData(plainText);
    }

    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }
}
