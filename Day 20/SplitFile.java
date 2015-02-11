package day20;
/*
 * 对文件进行切割
 * */
import java.io.*;
import java.util.*;
public class SplitFile {

	public static void merge() throws IOException{
		Vector<FileInputStream> v = new Vector<FileInputStream>();
		v.add(new FileInputStream("demo.txt"));
		v.add(new FileInputStream("demo2.txt"));
		v.add(new FileInputStream("demo3.txt"));
		Enumeration<FileInputStream> en =v.elements();
		SequenceInputStream sis = new SequenceInputStream(en);
		FileOutputStream fos = new FileOutputStream("Demo5.txt");
		byte[] buf = new byte[1024];
		int len = 0;
		while((len=sis.read(buf))!=-1){
			fos.write(buf, 0, len);
		}
		sis.close();
		fos.close();

	}
	public static void splitFile() throws IOException{
		FileInputStream fis = new FileInputStream("myPic.jpg");
		FileOutputStream fos = null;
		byte[] buf = new byte[1024*1024];
		int len = 0;
		int count =0;
		while((len=fis.read(buf))!=-1){
			fos = new FileOutputStream((count++)+".split");
			fos.write(buf,0,len);
			fos.close();
		}
		fis.close();
	}
	public static void main(String[] args) throws IOException {
		splitFile();

	}

}
