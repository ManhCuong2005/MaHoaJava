/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahoajava;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author ACER
 */
public class MaHoaJava {
    public static String encrypt(String srcText) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String enrText;
        
        MessageDigest msd =  MessageDigest.getInstance("MD5");
        byte[] srcTextByte = srcText.getBytes("UTF-8");
        byte[] enrTextByte = msd.digest(srcTextByte);
        
        BigInteger bigInt = new BigInteger(1, enrTextByte);
        enrText = bigInt.toString(16);
        
        return enrText;
    }
}
