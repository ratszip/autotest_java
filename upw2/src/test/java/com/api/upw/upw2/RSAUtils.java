package com.api.upw.upw2;

import org.apache.commons.codec.binary.Base64;

//import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
//import javax.crypto.IllegalBlockSizeException;
//import javax.crypto.NoSuchPaddingException;

//import java.io.ByteArrayOutputStream;
//import java.io.IOException;
//import java.io.UnsupportedEncodingException;
import java.security.*;
import java.security.interfaces.RSAPublicKey;
//import java.security.spec.InvalidKeySpecException;
//import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
//import org.apache.commons.io.IOUtils;

/**
 * Hello RSA!
 *
 */
public class RSAUtils {
	/*
	 * private static Map<Integer,String> keyMap=new HashMap<>(); public static void
	 * main( String[] args ) throws Exception { //生成公钥和私钥 getKeyPair(); //加密字符串
	 * String password="liupengkun"; System.out.println("随机生成的公钥为："+keyMap.get(0));
	 * System.out.println("随机生成的私钥为："+keyMap.get(1)); String
	 * passwordEn=encrypt(password,keyMap.get(0));
	 * System.out.println(password+"\t加密后的字符串为："+passwordEn); String
	 * passwordDe=decrypt(passwordEn,keyMap.get(1));
	 * System.out.println("还原后的字符串为："+passwordDe); }
	 */
	private static String pk = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCCcIOv6k0ta/VtiZH15VCbrcPT33rZIdeGOwfsw346Pum+EH1sT+qfNZ/yNZkIdfxJNXr3sawLmJX158+2okzDszHLLbe9/yEseMo3z3zVInwa2406WwMBKXOQyW9ZrH+9AEAbB4JGAqCjJ2FQwjq5m2KpUkUJE9pEMPu62bAmcwIDAQAB";

//	  public static void main(String[] args) {
//	  System.out.println(encrypt("Upwhk123."));
//	  
//	  }
	 
	/**
	 * 随机生成密钥对
	 * 
	 * @throws NoSuchAlgorithmException
	 */

	/*
	 * public static void getKeyPair() throws Exception {
	 * //KeyPairGenerator类用于生成公钥和密钥对，基于RSA算法生成对象 KeyPairGenerator keyPairGen =
	 * KeyPairGenerator.getInstance("RSA"); //初始化密钥对生成器，密钥大小为96-1024位
	 * keyPairGen.initialize(1024,new SecureRandom()); //生成一个密钥对，保存在keyPair中 KeyPair
	 * keyPair = keyPairGen.generateKeyPair(); PrivateKey privateKey =
	 * keyPair.getPrivate();//得到私钥 PublicKey publicKey = keyPair.getPublic();//得到公钥
	 * //得到公钥字符串 String publicKeyString=new
	 * String(Base64.encodeBase64(publicKey.getEncoded())); //得到私钥字符串 String
	 * privateKeyString=new String(Base64.encodeBase64(privateKey.getEncoded()));
	 * //将公钥和私钥保存到Map keyMap.put(0,publicKeyString);//0表示公钥
	 * keyMap.put(1,privateKeyString);//1表示私钥 }
	 */
	/**
	 * RSA公钥加密
	 *
	 * @param str       加密字符串
	 * @param publicKey 公钥
	 * @return 密文
	 * @throws Exception 加密过程中的异常信息
	 */
	public static String encrypt(String str) {
		// base64编码的公钥
		byte[] decoded = Base64.decodeBase64(pk);
		String outStr = null;
		RSAPublicKey pubKey;
		try {
			pubKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decoded));
			// RAS加密
			Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
			cipher.init(Cipher.ENCRYPT_MODE, pubKey);
			outStr = Base64.encodeBase64String(cipher.doFinal(str.getBytes("UTF-8")));
			// outStr=Base64.encodeBase64URLSafeString(rsaSplitCodec(cipher,
			// Cipher.ENCRYPT_MODE, str.getBytes("UTF-8"),
			// pubKey.getModulus().bitLength()));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return outStr;

	}
//    private static byte[] rsaSplitCodec(Cipher cipher, int opmode, byte[] datas, int keySize){
//        int maxBlock = 0;
//        if(opmode == Cipher.DECRYPT_MODE){
//            maxBlock = keySize / 8;
//        }else{
//            maxBlock = keySize / 8 - 11;
//        }
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        int offSet = 0;
//        byte[] buff;
//        int i = 0;
//        try{
//            while(datas.length > offSet){
//                if(datas.length-offSet > maxBlock){
//                    buff = cipher.doFinal(datas, offSet, maxBlock);
//                }else{
//                    buff = cipher.doFinal(datas, offSet, datas.length-offSet);
//                }
//                out.write(buff, 0, buff.length);
//                i++;
//                offSet = i * maxBlock;
//            }
//        }catch(Exception e){
//            throw new RuntimeException("加解密阀值为["+maxBlock+"]的数据时发生异常", e);
//        }
//        byte[] resultDatas = out.toByteArray();
//        //IOUtils.closeQuietly(out);
//        try {
//			out.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        
//        return resultDatas;
//    }
	/**
	 * RSA私钥解密
	 *
	 * @param str        加密字符串
	 * @param privateKey 私钥
	 * @return 铭文
	 * @throws Exception 解密过程中的异常信息
	 */
	/*
	 * public static String decrypt(String str,String privateKey) throws Exception {
	 * //Base64解码加密后的字符串 byte[] inputByte =
	 * Base64.decodeBase64(str.getBytes("UTF-8")); //Base64编码的私钥 byte[] decoded =
	 * Base64.decodeBase64(privateKey); PrivateKey priKey =
	 * KeyFactory.getInstance("RSA").generatePrivate(new
	 * PKCS8EncodedKeySpec(decoded)); //RSA解密 Cipher cipher =
	 * Cipher.getInstance("RSA"); cipher.init(Cipher.DECRYPT_MODE,priKey); String
	 * outStr=new String(cipher.doFinal(inputByte)); return outStr; }
	 */
}
