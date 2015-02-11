package day20;
import java.io.*;

/* FilenameFilter �ļ���������
 * 		accept(File dir,String name)���������У����ݴ˷������ˡ�
 * File
 * 	String list():����һ��String���飬�г�ָ��Ŀ¼�ڵ��ļ�����
 * 	File listFile():
 *	
 *  
 * */

public class FileDemo2 {

	public static void listDemo2(){
		File dir= new File("D:\\JavaWorkspace\\CZBK");
		File[] files = dir.listFiles();
		System.out.println(files.length);
		for(File f : files){
			System.out.println(f.getName()+"::"+f.length());
		}
	}
	public static void acceptDemo(){
		File dir = new File("D:\\JavaWorkspace\\CZBK");
		String[] arr = dir.list(new FilenameFilter(){
			public boolean accept(File dir,String name){
				return name.endsWith(".java");
			}
		});
		
		System.out.println(arr.length);
		for(String name : arr){
			System.out.println(name);
		}
	}
	public static void listRootsDemo(){
		File[] files = File.listRoots();
		for(File f:files){
			
			System.out.println(f);
		}
	}
	//��ӡָ��Ŀ¼�µ��ļ��е�����
	public static void listDemo(){
		File f =  new File("c:\\");
		String[] names = f.list();
		for(String name : names){
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
//		listRootsDemo();
//		listDemo();
//		acceptDemo();
		listDemo2();
	}

}
