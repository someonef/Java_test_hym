package day20;
/*
 * Properties文件是一种配置文件.
 * 		（.xml也是配置文件，深入学习后，能用dom4j工具提取配置文件信息）
 * properties是hashtable的子类
 * 也就是说，它具备map集合的特点。而且他里面存储的键值对都是字符串。
 * 是集合中和IO技术相结合的集合容器。
 * 该对象的特点：可以用于键值对形式的配置文件。
 * 
 * 如何将流中的数据存储到集合中？
 * 	1.用一个流和*.txt关联。
 * 	2.读取一行数据，将该行数据用"="进行切割。
 * 	3.等号左边作为键，右边作为值。存入到Properties集合当中
 * 
 * load(InputStream):直接加载流中的数据进集合中
 * list(PrintStram)：将集合中的数据加载进打印流中。
 * store(Stream,"注释")：将集合中的数据加载进流中。
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
