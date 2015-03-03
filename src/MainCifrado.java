
import static algoritmos.AES128.decrypt;
import static algoritmos.AES128.encrypt;
import algoritmos.RC4;
import algoritmos.RC4.InvalidKeyException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author toni
 */
public class MainCifrado {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in); 
       System.out.println("<====Prueba de cifrado=====>");
       System.out.print("Elige el crifrado que quieres (AES) o (RC4) (1 - 2):");
       String opcion = in.nextLine();
       if ("1".equals(opcion)) {
           System.out.println("AES 128");
            try {
                System.out.print("Mensaje a cifrar: ");
                String msg = in.nextLine().toLowerCase();
                System.out.print("Clave (16)(0123456789abcdef): ");
                String clave = in.nextLine().toLowerCase();  
                //clave = "0123456789abcdef";
                byte[] cipher = encrypt(msg, clave);
                System.out.print("cipher:  ");
                for (int i=0; i<cipher.length; i++)
                  System.out.print(new Integer(cipher[i])+" ");
                System.out.println("");
                
                String decrypted = decrypt(cipher, clave);  
                System.out.println("decrypt: " + decrypted);
          } catch (Exception e) {
            e.printStackTrace();
          } 
       }
       else if ("2".equals(opcion)){
           System.out.println("RC4");
           try {
            System.out.print("Mensaje a cifrar: ");
            String msg = in.nextLine().toLowerCase();
            System.out.print("Clave (min 5 dígitos): ");
            String clave = in.nextLine().toLowerCase();  
            RC4 rc4 = new RC4(clave);
            char[] result = rc4.encrypt(msg.toCharArray());
            System.out.println("Mensaje cifrado RC4:\n" + new String(result));
            System.out.println("Mensaje descifrado RC4:\n"
                    + new String(rc4.decrypt(result)));
        } catch (InvalidKeyException e) {
            System.err.println(e.getMessage());
        }
       }    
       else System.out.print("Entrada incorrecta, adios");
    }
}
