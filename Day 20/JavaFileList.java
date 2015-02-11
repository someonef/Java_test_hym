package day20;
/*
 * ��ϰ
 * ��һ��ָ��Ŀ¼�µ�Java�ļ��ľ���·�����洢��һ���ı��ļ��С�
 * ����һ��java�ļ��б��ļ���
 * 
 * ˼·��
 * 	1.��ָ����Ŀ¼���еݹ�
 * 	2.��ȡ�ݹ���������е�Java�ļ���·����
 * 	3.����Щ·���洢�������С�
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
