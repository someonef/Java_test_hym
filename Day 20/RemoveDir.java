package day20;

import java.io.File;
import java.io.IOException;

/*
 * 删除一个带内容的目录
 * 删除原理：
 * 在window中，删除目录是从里往外删除的。
 * 既然是从里往外删除，就需要用到递归。
 * 
 * */
public class RemoveDir {

	public static void removeDir(File dir){
		File[] files = dir.listFiles();
		for(File f : files){
			if(!f.isHidden()&&f.isDirectory())
				removeDir(f);
			else
				System.out.println(f.toString()+"::"+f.delete());
		}
		System.out.println(dir+"::"+dir.delete());
		
	}
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\haha");
		if(f.exists())
			removeDir(f);
		else
			System.out.println("文件不存在");
		

	}

}
