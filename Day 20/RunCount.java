package day20;
/*
 * ���ڼ�¼Ӧ�ó������д�����
 * ���ʹ�ô����ѵ�����ô����ע����ʾ��
 * �������뵽���ǣ���������
 * ���Ǹü����������ڳ����У����ų�������ж����ڴ��д��ڣ�������������
 * �������ų�����˳����ü�����Ҳ���ڴ�����ʧ��
 * ��һ���������������㿪ʼ������
 * 
 * Ϊ�˱���ü�����������Ҫ����һ�������ļ���
 * 
 * �������ļ�ʹ�ü�ֵ�Ե���ʽ�������Ķ����ݺͲ������ݡ�
 * ��ֵ��������map����
 * ���������ļ���ʽ�洢��ʹ��io����
 * ��ô map+io--->properties
 * 
 * �����ļ�����ʵ��Ӧ�ó������ݵĹ���
 * */
import java.io.*;
import java.util.*;
public class RunCount {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		File file = new File("count.ini");
		if(!file.exists())
			file.createNewFile();
		FileInputStream fis = new FileInputStream("count.ini");
		prop.load(fis);
		int count = 0;
		String value = prop.getProperty("time");
		if(value!=null){
			count = Integer.parseInt(value);
			if(count>=5){
				System.out.println("���ã��ó����ʹ�ô����ѵ�����Ǯ");
				throw new RuntimeException("����ð��");
			}
		}
		count++;
		prop.setProperty("time", count+"");
		FileOutputStream fos = new FileOutputStream(file);
		
		prop.store(fos,"ע��");
		fos.close();
		fis.close();

	}

}
