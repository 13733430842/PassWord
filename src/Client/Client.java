package Client;

import mosi.Decryption;
import mosi.Encryption;
import zh.ASCII;
import zh.Resuilt;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encryption encryption=new Encryption();//摩斯加密
		Decryption decryption=new Decryption();//摩斯解密
		ASCII ascii=new ASCII();//自制加密
		Resuilt resuilt=new Resuilt(1);//自制解密
		ascii.setpwd("123456");
		String string=ascii.getresuilt(1);
		resuilt.setpwd(string);
		encryption.setpwd(string);
		decryption.setpwd(encryption.getresuilt());
		System.out.println(string);
		System.out.println(resuilt.getresuilt());
		System.out.println(encryption.getresuilt());
		System.out.println(decryption.getresuilt());
		System.out.println("自制长度："+string.length());
		System.out.println("摩斯长度："+encryption.getresuilt().length());
	}

}
