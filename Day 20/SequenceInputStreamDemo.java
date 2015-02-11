package day20;
/*
 * SequenceInputStream（并合流）
 * 	该读取流没有对应的输出流。
 * 	构造函数中，可以直接接收两个输入流，并合成一个输入流。
 * 	或者接收一个Enum，获取枚举中所有的输入流对象，并合成一个输入流。
 * 
 * */
import java.io.*;
import java.util.*;

public class SequenceInputStreamDemo {

	public static void main(String[] args) throws IOException {
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

}
