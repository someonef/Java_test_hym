package day20;
/*
 * ��ӡ����
 * �����ṩ�˴�ӡ�ķ��������Խ������������͵����ݶ�ԭ����ӡ��
 * 
 * �ֽڴ�ӡ����
 * 	printStream
 * 		���캯�����Ծ��յĲ�������
 * 		1.file����File
 * 		2.�ַ���·����String
 * 		3.�ֽ��������OutputStream
 * �ַ���ӡ����
 * 	printWriter
 * 		���캯�����Խ��յĲ�������
 * 		1.file����File
 * 		2.�ַ���·����String
 * 		3.�ֽ��������outputStream
 * 		4.�ַ��������Writer
 * 
 * 
 * */
import java.io.*;
public class PrintStreamDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader bufr = 
				new BufferedReader(new InputStreamReader(System.in));
		//true:�ڴ�ӡ��ˢ������
//		PrintWriter out = new PrintWriter(System.out,true);
		PrintWriter out = new PrintWriter(new FileWriter("��ӡ��.txt"),true);
	
		String line = null;
		while((line=bufr.readLine())!=null){
			if("over".equals(line))
				break;
			out.println(line);
//			out.flush();
		}
		out.close();
		bufr.close();
	}

}
