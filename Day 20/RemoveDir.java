package day20;

import java.io.File;
import java.io.IOException;

/*
 * ɾ��һ�������ݵ�Ŀ¼
 * ɾ��ԭ��
 * ��window�У�ɾ��Ŀ¼�Ǵ�������ɾ���ġ�
 * ��Ȼ�Ǵ�������ɾ��������Ҫ�õ��ݹ顣
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
			System.out.println("�ļ�������");
		

	}

}
