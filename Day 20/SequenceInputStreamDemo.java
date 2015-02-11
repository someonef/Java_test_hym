package day20;
/*
 * SequenceInputStream����������
 * 	�ö�ȡ��û�ж�Ӧ���������
 * 	���캯���У�����ֱ�ӽ������������������ϳ�һ����������
 * 	���߽���һ��Enum����ȡö�������е����������󣬲��ϳ�һ����������
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
