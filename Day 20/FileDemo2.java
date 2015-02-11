package day20;
import java.io.*;

/* FilenameFilter 文件名过滤器
 * 		accept(File dir,String name)：过滤器中，根据此方法过滤。
 * File
 * 	String list():返回一个String数组，列出指定目录内的文件名。
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
	//打印指定目录下的文件夹的名称
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
