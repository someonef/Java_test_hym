package day20;
/*
 * 练习
 * 将一个指定目录下的Java文件的绝对路径，存储到一个文本文件中。
 * 建立一个java文件列表文件。
 * 
 * 思路：
 * 	1.对指定的目录进行递归
 * 	2.获取递归过程中所有的Java文件的路径。
 * 	3.将这些路径存储到集合中。
 * 
 * */
import java.io.*;
import java.util.*;

public class JavaFileList {

	public static void writeToFile(List<File> list) throws IOException{
		BufferedWriter bufw = new BufferedWriter(new FileWriter("d:\\myJava.txt"));
		for(File f : list){
			String path = f.getAbsolutePath();
			bufw.newLine();
			bufw.write(path);
		}
		bufw.close();
	}
	public static void fileToList(File dir,List<File> list){
		File[] files = dir.listFiles();
		for(File file : files){
			if(file.isDirectory())
				fileToList(file,list);
			else{
				if(file.getName().endsWith(".java"))
					list.add(file);
			}
				
		}
	}
	public static void main(String[] args) throws IOException {
		File dir = new File("D:\\JavaWorkspace\\CZBK");
		List<File> list = new ArrayList<File>();
		fileToList(dir,list);
		System.out.println(list.size());
		writeToFile(list);
		
	}

}
