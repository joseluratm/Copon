
import static algoritmos.AES128.decrypt;
import static algoritmos.AES128.encrypt;
import algoritmos.RC4;
import algoritmos.RC4.InvalidKeyException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonio Martinez Sirvent y Jose Luis Llinares Anton
 */
public class AlgoritmosDeCifrado {
    
    public String algoritmoRC4(String msg, String clave)
    {
         System.out.println("RC4");
         String resultado = "";
           try {
            System.out.println("Mensaje a cifrar: "+msg);
            System.out.println("Clave (min 5 dígitos): "+clave);
            RC4 rc4 = new RC4(clave);
            char[] result = rc4.encrypt(msg.toCharArray());
            //System.out.println("Mensaje cifrado RC4:\n" + new String(result));
            //System.out.println("Mensaje descifrado RC4:\n"
            //       + new String(rc4.decrypt(result)));
            resultado = new String(result);
            
        } catch (InvalidKeyException e) {
            System.err.println(e.getMessage());
        }
           return resultado;
    }
    
    public String algoritmoAES(String msg, String clave)
    {
        System.out.println("AES 128");
            try {
                
                System.out.print("Mensaje a cifrar: ");
                System.out.print("Clave (16)(0123456789abcdef): ");                      
                System.out.print("\n");
                
                //clave = "0123456789abcdef";
                byte[] cipher = encrypt(msg, clave);
                System.out.print("cipher:  ");
                for (int i=0; i<cipher.length; i++)
                  System.out.print(new Integer(cipher[i])+" ");
                System.out.println("");
                
                String decrypted = decrypt(cipher, clave);  
                System.out.println("decrypt: " + decrypted);
                String resultado = new String("arreglar"); //TODO
                return resultado;
          } catch (Exception e) {
            e.printStackTrace();
          }
            return "holi :D";
    }
    
    public String desencriptarRC4(String encriptado, String clave) throws Exception
    {
            RC4 rc4 = new RC4(clave);
            char[] m = encriptado.toCharArray();
            char[] decrypted = rc4.decrypt(m);
            String b = new String(decrypted);
            return b;
    }
}
