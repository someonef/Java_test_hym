package day20;

import java.io.*;
/*
 * recursion（递归）
 * 列出知道目录下文件或者文件夹，包含子目录中的内容。
 * 也就是列出指定目录下所有内容。
 * 
 * 因为目录中还有目录，只要使用同一个列出目录功能的函数完成即可。
 * 在列出过程中出现的还是目录的话，函数自身可以调用自身。
 * 
 * 这种表现形式或者编程手法，称作递归。
 * 
 * 要注意：
 * 	1.限定条件
 * 	2.要注意递归的次数，尽量避免内存溢出。
 * */
public class RecursionDemo {

	public static int getSum(int n){
		if(n==1)
			return 1;
		return n+getSum(n-1);
	}
	public static void toBin(int num){
		if(num>0){
			toBin(num/2);
			System.out.print(num%2);
		}
	}
	public static void showDir(File dir){
		File[] files = dir.listFiles();
		for(File f:files){
			System.out.println(f);
			if(f.isDirectory())
				showDir(f);
		}
	}
	public static void main(String[] args) {
//		showDir(new File("D:\\JavaWorkspace\\CZBK\\src"));
		toBin(6);
		System.out.println();
		System.out.println("sum: "+getSum(100));
	}

}
