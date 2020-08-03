package web.util;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.logging.Logger;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import web.controller.WizardController;
 
public class EncryptionDecryptionManager {
	private static final Logger mLog = Logger.getLogger(EncryptionDecryptionManager.class.getName());
	 private static SecretKeySpec secretKey;
	    private static byte[] key;
	  
	    public static String decode(String valueToEncode) {
	    	try {
				String decodeValue = java.net.URLDecoder.decode(valueToEncode, StandardCharsets.UTF_8.toString());
			    return decodeValue;
	    	} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
	    		mLog.severe(e.getMessage());
				e.printStackTrace();
			}
	    return null;
	    }
	 public static String encode(String valueToEncode) {
		String encodedValue = null;
		try {
			encodedValue = URLEncoder.encode( valueToEncode, StandardCharsets.UTF_8.toString());
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return encodedValue;
	 }
	   static 
	    {
	    	String myKey = "test";
	        MessageDigest sha = null;
	        try {
	            key = myKey.getBytes("UTF-8");
	            sha = MessageDigest.getInstance("SHA-1");
	            key = sha.digest(key);
	            key = Arrays.copyOf(key, 16); 
	            secretKey = new SecretKeySpec(key, "AES");
	        } 
	        catch (NoSuchAlgorithmException e) {
	            e.printStackTrace();
	        } 
	        catch (UnsupportedEncodingException e) {
	            e.printStackTrace();
	        }
	    }
	   public static String encrypt(Integer intToEncrypt)  {
		   String encrypt = encrypt(intToEncrypt.toString()) ; 
		   return encrypt;
	   }
	    public static String encrypt(String strToEncrypt) 
	    {
	        try
	        {
	            
	            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
	            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
	            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
	        } 
	        catch (Exception e) 
	        {
	            System.out.println("Error while encrypting: " + e.toString());
	        }
	        return null;
	    }
	 
	    public static String decrypt(String strToDecrypt) 
	    {
	        try
	        {
	            //decode first
	        	String decodeValue = decode(strToDecrypt);
	            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
	            cipher.init(Cipher.DECRYPT_MODE, secretKey);
	            return new String(cipher.doFinal(Base64.getDecoder().decode(decodeValue)));
	        } 
	        catch (Exception e) 
	        {
	            System.out.println("Error while decrypting: " + e.toString());
	        }
	        return null;
	    }
}
