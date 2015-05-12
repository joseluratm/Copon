/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

/**
 *
 * @author toni
 */
public class RC4 {
 
    private char[] key;
    private int[] sbox;
    private static final int SBOX_LENGTH = 256;
    private static final int KEY_MIN_LENGTH = 5;
   
 
    public char[] decrypt(final char[] msg) {
        return encrypt(msg);
    }
 
    public char[] encrypt(final char[] msg) {
        sbox = initSBox(key);
        ExtendedAscii as = new ExtendedAscii();
        char[] code = new char[msg.length];
        int i = 0;
        int j = 0;
        for (int n = 0; n < msg.length; n++) {
            i = (i + 1) % SBOX_LENGTH;
            j = (j + sbox[i]) % SBOX_LENGTH;
            swap(i, j, sbox);
            int rand = sbox[(sbox[i] + sbox[j]) % SBOX_LENGTH];
            char c = (char)(rand ^ as.getValueAscii(msg[n]));
            
            code[n] = c;
        }
        return code;
    }
 
    private int[] initSBox(char[] key) {
        int[] sbox = new int[SBOX_LENGTH];
        int j = 0;
 
        for (int i = 0; i < SBOX_LENGTH; i++) {
            sbox[i] = i;
        }
 
        for (int i = 0; i < SBOX_LENGTH; i++) {
            j = (j + sbox[i] + key[i % key.length]) % SBOX_LENGTH;
            swap(i, j, sbox);
        }
        return sbox;
    }
 
    private void swap(int i, int j, int[] sbox) {
        int temp = sbox[i];
        sbox[i] = sbox[j];
        sbox[j] = temp;
    }
 
    public void setKey(String key) throws InvalidKeyException {
        if (!(key.length() >= KEY_MIN_LENGTH && key.length() < SBOX_LENGTH)) {
            throw new InvalidKeyException("La clave tiene que tener una longitud entre  "
                    + KEY_MIN_LENGTH + " y " + (SBOX_LENGTH - 1));
        }
 
        this.key = key.toCharArray();
    }
    public class InvalidKeyException extends Exception {
 
        private static final long serialVersionUID = 1L;
 
         public InvalidKeyException(String message) {
            super(message);
        }
    }
}