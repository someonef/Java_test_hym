package day20;

import java.io.*;
/*
 * recursion���ݹ飩
 * �г�֪��Ŀ¼���ļ������ļ��У�������Ŀ¼�е����ݡ�
 * Ҳ�����г�ָ��Ŀ¼���������ݡ�
 * 
 * ��ΪĿ¼�л���Ŀ¼��ֻҪʹ��ͬһ���г�Ŀ¼���ܵĺ�����ɼ��ɡ�
 * ���г������г��ֵĻ���Ŀ¼�Ļ�������������Ե�������
 * 
 * ���ֱ�����ʽ���߱���ַ��������ݹ顣
 * 
 * Ҫע�⣺
 * 	1.�޶�����
 * 	2.Ҫע��ݹ�Ĵ��������������ڴ������
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
