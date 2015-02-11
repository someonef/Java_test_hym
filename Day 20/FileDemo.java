package day20;
/*
 * File类的常见方法。
 * 	1.创建
 * 		boolean createNewFile():在指定位置创建文件返回true，如果该文件已经存在，则不创建，返回fales。
 * 		mkdir()创建文件夹。
 * 		mkdirs()创建多级文件夹。
 * 2.删除
 * 		boolean delete():删除指定文件。
 * 		void deleteOnExit();在退出jvm的时候，删除指定文件。
 * 	3.判断
 * 		boolean canExecute():文件是否可执行？
 * 		boolean exists():文件是否存在
 * 		boolean isAbsolute():文件是否绝对存在？
 * 		boolean isHidden();
 * 	4.获取信息
 * 		String getName()：获取文件名
 * 			   getPath()：
 * 			   getAbsoluePath()：绝对路径
 * 		long   length():文件大小
 * 			   getParent()：获取所属目录
 * 		long   lastModified():获取最后一次修改时间。
 * */
import java.io.*;
/*
 * File.separator
 * 	目录分割符，相当于\\。跨平台的分割符。
 * 	例 "c:\\abc\\a.txt"    ==   "c:"+File.separator+"abc"+File.separator+"a.txt"
 * 
 * 
 * */
public class FileDemo {
	public static void method_5() throws IOException{
		File f = new File("demo5.txt");
		File f2 = new File("Rename.txt");
		//改名
		sop("rename: "+f.renameTo(f2));
	}
	public static void method_4(){
		File f = new File("file6.txt");
		sop(f.getName());
		sop(f.getPath());
		sop(f.getAbsolutePath());
		sop(f.length());
	}
	public static void method_3(){
		File f = new File("file5.txt");
		//在判断文件对象是否是文件或者目录时，必须要先判断该文件是否存在。
		sop("file.txt is File? : "+f.isFile());
		sop("file.txt is Directory? : "+f.isDirectory());		
		sop(f.isAbsolute());
	}
	public static void method_2(){
		File f = new File("file.txt");
		sop("execute: "+f.canExecute());
		sop("exists: "+f.exists());
		File dir = new File("abc\\def");
		sop("dir: "+dir.mkdir());
	}
	public static void method_1() throws IOException{
		File f = new File("file.txt");
		f.deleteOnExit();
		sop("create: "+f.createNewFile());
//		sop("delete :"+f.delete());
	}
	public static void consMethod(){
		//将a.txt封装成file对象
		File f1 = new File("C:\\abc\\a.txt");
		//几种封装方式。
		File f2 = new File("C:\\abc","b.txt");
		
		File d = new File("C:\\abc");
		File f3 = new File(d,"c.txt");
		File f4 = new File("C:"+File.separator+"abc"+File.separator+"a.txt");
		
		sop("f1 "+f1);
		sop("f2 "+f2);
		sop("f3 "+f3);
	}
	public static void main(String[] args) throws IOException {
//		consMethod();
//		method_1();
//		method_2();
//		method_3();
//		method_4();
		method_5();
		

	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
