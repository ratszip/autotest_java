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
	 * main( String[] args ) throws Exception { //���ɹ�Կ��˽Կ getKeyPair(); //�����ַ���
	 * String password="liupengkun"; System.out.println("������ɵĹ�ԿΪ��"+keyMap.get(0));
	 * System.out.println("������ɵ�˽ԿΪ��"+keyMap.get(1)); String
	 * passwordEn=encrypt(password,keyMap.get(0));
	 * System.out.println(password+"\t���ܺ���ַ���Ϊ��"+passwordEn); String
	 * passwordDe=decrypt(passwordEn,keyMap.get(1));
	 * System.out.println("��ԭ����ַ���Ϊ��"+passwordDe); }
	 */
	private static String pk = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCCcIOv6k0ta/VtiZH15VCbrcPT33rZIdeGOwfsw346Pum+EH1sT+qfNZ/yNZkIdfxJNXr3sawLmJX158+2okzDszHLLbe9/yEseMo3z3zVInwa2406WwMBKXOQyW9ZrH+9AEAbB4JGAqCjJ2FQwjq5m2KpUkUJE9pEMPu62bAmcwIDAQAB";

//	  public static void main(String[] args) {
//	  System.out.println(encrypt("Upwhk123."));
//	  
//	  }
	 
	/**
	 * ���������Կ��
	 * 
	 * @throws NoSuchAlgorithmException
	 */

	/*
	 * public static void getKeyPair() throws Exception {
	 * //KeyPairGenerator���������ɹ�Կ����Կ�ԣ�����RSA�㷨���ɶ��� KeyPairGenerator keyPairGen =
	 * KeyPairGenerator.getInstance("RSA"); //��ʼ����Կ������������Կ��СΪ96-1024λ
	 * keyPairGen.initialize(1024,new SecureRandom()); //����һ����Կ�ԣ�������keyPair�� KeyPair
	 * keyPair = keyPairGen.generateKeyPair(); PrivateKey privateKey =
	 * keyPair.getPrivate();//�õ�˽Կ PublicKey publicKey = keyPair.getPublic();//�õ���Կ
	 * //�õ���Կ�ַ��� String publicKeyString=new
	 * String(Base64.encodeBase64(publicKey.getEncoded())); //�õ�˽Կ�ַ��� String
	 * privateKeyString=new String(Base64.encodeBase64(privateKey.getEncoded()));
	 * //����Կ��˽Կ���浽Map keyMap.put(0,publicKeyString);//0��ʾ��Կ
	 * keyMap.put(1,privateKeyString);//1��ʾ˽Կ }
	 */
	/**
	 * RSA��Կ����
	 *
	 * @param str       �����ַ���
	 * @param publicKey ��Կ
	 * @return ����
	 * @throws Exception ���ܹ����е��쳣��Ϣ
	 */
	public static String encrypt(String str) {
		// base64����Ĺ�Կ
		byte[] decoded = Base64.decodeBase64(pk);
		String outStr = null;
		RSAPublicKey pubKey;
		try {
			pubKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decoded));
			// RAS����
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
//            throw new RuntimeException("�ӽ��ܷ�ֵΪ["+maxBlock+"]������ʱ�����쳣", e);
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
	 * RSA˽Կ����
	 *
	 * @param str        �����ַ���
	 * @param privateKey ˽Կ
	 * @return ����
	 * @throws Exception ���ܹ����е��쳣��Ϣ
	 */
	/*
	 * public static String decrypt(String str,String privateKey) throws Exception {
	 * //Base64������ܺ���ַ��� byte[] inputByte =
	 * Base64.decodeBase64(str.getBytes("UTF-8")); //Base64�����˽Կ byte[] decoded =
	 * Base64.decodeBase64(privateKey); PrivateKey priKey =
	 * KeyFactory.getInstance("RSA").generatePrivate(new
	 * PKCS8EncodedKeySpec(decoded)); //RSA���� Cipher cipher =
	 * Cipher.getInstance("RSA"); cipher.init(Cipher.DECRYPT_MODE,priKey); String
	 * outStr=new String(cipher.doFinal(inputByte)); return outStr; }
	 */
}
