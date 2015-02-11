package day20;
/*
 * Properties�ļ���һ�������ļ�.
 * 		��.xmlҲ�������ļ�������ѧϰ������dom4j������ȡ�����ļ���Ϣ��
 * properties��hashtable������
 * Ҳ����˵�����߱�map���ϵ��ص㡣����������洢�ļ�ֵ�Զ����ַ�����
 * �Ǽ����к�IO�������ϵļ���������
 * �ö�����ص㣺�������ڼ�ֵ����ʽ�������ļ���
 * 
 * ��ν����е����ݴ洢�������У�
 * 	1.��һ������*.txt������
 * 	2.��ȡһ�����ݣ�������������"="�����и
 * 	3.�Ⱥ������Ϊ�����ұ���Ϊֵ�����뵽Properties���ϵ���
 * 
 * load(InputStream):ֱ�Ӽ������е����ݽ�������
 * list(PrintStram)���������е����ݼ��ؽ���ӡ���С�
 * store(Stream,"ע��")���������е����ݼ��ؽ����С�
 * */
import java.util.*;
import java.io.*;
public class PropertiesDemo {

	public static void loadDemo() throws IOException{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("info.txt");
		prop.load(fis);
		FileOutputStream fos = new FileOutputStream("info.txt");
		prop.setProperty("wangwu", "38");
		prop.store(fos, "store");
		prop.list(System.out);
		fis.close();
		fos.close();
		
	}
	public static void method_1() throws IOException{
		File f = new File("info.txt");
		if(!f.exists());
			f.createNewFile();
		
		BufferedReader bufr = new BufferedReader(new FileReader("info.txt"));
		String line = null;
		
		Properties prop = new Properties();
		while((line=bufr.readLine())!=null){
			String[] arr = line.split("=");
			prop.setProperty(arr[0], arr[1]);		
		}
		bufr.close();
	}
	public static void setAndGet(){
		Properties prop = new Properties();
		prop.setProperty("zhangsan","15");
		prop.setProperty("lisi","25");
		Set<String> name = prop.stringPropertyNames();
		for(String s : name){
			System.out.println(s+"::"+prop.getProperty(s));
		}
	}
	public static void main(String[] args) throws IOException {
//		method_1();
//		setAndGet();
		loadDemo();

	}

}
