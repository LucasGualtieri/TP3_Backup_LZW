package tests;

import java.io.IOException;

import src.utils.StreamManager;
import src.Algoritmos.Criptografia.Cipher;
// import src.Algoritmos.Criptografia.Strategies.*;

public class CipherTest {
	public static void main(String[] args) throws IOException {

		Cipher c = new Cipher();

		StreamManager sm = new StreamManager();

		sm.writeUTF("Olá mundo!");

		byte[] cipheredMsg = c.cipher(Cipher.KEY, sm.toByteArray());
		System.out.println("Ciphered Data: " + new String(cipheredMsg));

		sm = new StreamManager(c.decipher(Cipher.KEY, cipheredMsg));

		System.out.println("Deciphered Data: " + sm.readUTF());

		byte b = 127;

		System.out.println("b: " + b);
		System.out.println("b: " + ++b);
		System.out.println("b: " + --b);

	}
}
