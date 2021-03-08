# PassWord
# 摩斯密码和自制密码
```
public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		* 摩斯加密
		* 国际通用的摩斯密码，以及自己添加了一些其他字符的摩斯密码
		*/
		Encryption encryption=new Encryption();//摩斯加密
		Decryption decryption=new Decryption();//摩斯解密
		
		/**
		* 自制的加密方法
		* 有三种加密模式，对应1,2,3
		*/
		ASCII ascii=new ASCII();//自制加密
		Resuilt resuilt=new Resuilt(1);//自制解密，选择模式1
		
		ascii.setpwd("123456");//输入需要加密的明文
		String string=ascii.getresuilt(1);//选择加密模式1，得到对应的密文
		System.out.println(string);//打印加密后的密文
		
		resuilt.setpwd(string);//输入密文进行解密
		System.out.println(resuilt.getresuilt());//打印解密后的明文
		
		encryption.setpwd(string);//将自制加密后的密文进行摩斯加密
		System.out.println(encryption.getresuilt());//打印摩斯加密后的密文
		
		decryption.setpwd(encryption.getresuilt());//输入摩斯密文，进行摩斯解密
		System.out.println(decryption.getresuilt());//打印摩斯解密后得到的明文
		
		System.out.println("自制长度："+string.length());//自制加密后的密文长度
		System.out.println("摩斯长度："+encryption.getresuilt().length());//摩斯加密后的密文长度
	}

```
