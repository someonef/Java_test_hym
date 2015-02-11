package day20;
/*
 * File��ĳ���������
 * 	1.����
 * 		boolean createNewFile():��ָ��λ�ô����ļ�����true��������ļ��Ѿ����ڣ��򲻴���������fales��
 * 		mkdir()�����ļ��С�
 * 		mkdirs()�����༶�ļ��С�
 * 2.ɾ��
 * 		boolean delete():ɾ��ָ���ļ���
 * 		void deleteOnExit();���˳�jvm��ʱ��ɾ��ָ���ļ���
 * 	3.�ж�
 * 		boolean canExecute():�ļ��Ƿ��ִ�У�
 * 		boolean exists():�ļ��Ƿ����
 * 		boolean isAbsolute():�ļ��Ƿ���Դ��ڣ�
 * 		boolean isHidden();
 * 	4.��ȡ��Ϣ
 * 		String getName()����ȡ�ļ���
 * 			   getPath()��
 * 			   getAbsoluePath()������·��
 * 		long   length():�ļ���С
 * 			   getParent()����ȡ����Ŀ¼
 * 		long   lastModified():��ȡ���һ���޸�ʱ�䡣
 * */
import java.io.*;
/*
 * File.separator
 * 	Ŀ¼�ָ�����൱��\\����ƽ̨�ķָ����
 * 	�� "c:\\abc\\a.txt"    ==   "c:"+File.separator+"abc"+File.separator+"a.txt"
 * 
 * 
 * */
public class FileDemo {
	public static void method_5() throws IOException{
		File f = new File("demo5.txt");
		File f2 = new File("Rename.txt");
		//����
		sop("rename: "+f.renameTo(f2));
	}
	public static void method_4(){
		File f = new File("file6.txt");
		sop(f.getName());
		sop(f.getPath());
		sop(f.getAbsolutePath());
		sop(f.length());
	}
	public static void method_3(){
		File f = new File("file5.txt");
		//���ж��ļ������Ƿ����ļ�����Ŀ¼ʱ������Ҫ���жϸ��ļ��Ƿ���ڡ�
		sop("file.txt is File? : "+f.isFile());
		sop("file.txt is Directory? : "+f.isDirectory());		
		sop(f.isAbsolute());
	}
	public static void method_2(){
		File f = new File("file.txt");
		sop("execute: "+f.canExecute());
		sop("exists: "+f.exists());
		File dir = new File("abc\\def");
		sop("dir: "+dir.mkdir());
	}
	public static void method_1() throws IOException{
		File f = new File("file.txt");
		f.deleteOnExit();
		sop("create: "+f.createNewFile());
//		sop("delete :"+f.delete());
	}
	public static void consMethod(){
		//��a.txt��װ��file����
		File f1 = new File("C:\\abc\\a.txt");
		//���ַ�װ��ʽ��
		File f2 = new File("C:\\abc","b.txt");
		
		File d = new File("C:\\abc");
		File f3 = new File(d,"c.txt");
		File f4 = new File("C:"+File.separator+"abc"+File.separator+"a.txt");
		
		sop("f1 "+f1);
		sop("f2 "+f2);
		sop("f3 "+f3);
	}
	public static void main(String[] args) throws IOException {
//		consMethod();
//		method_1();
//		method_2();
//		method_3();
//		method_4();
		method_5();
		

	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
