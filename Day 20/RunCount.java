package day20;
/*
 * 用于记录应用程序运行次数。
 * 如果使用次数已到，那么给出注册提示。
 * 很容易想到的是：计数器。
 * 可是该计数器定义在程序中，随着程序的运行而在内存中存在，并进行自增。
 * 可是随着程序的退出，该计数器也在内存中消失了
 * 下一次启动程序，又重零开始计数。
 * 
 * 为了保存该计数器，所以要建立一个配置文件。
 * 
 * 该配置文件使用键值对的形式，便于阅读数据和操作数据。
 * 键值对数据是map集合
 * 数据是以文件形式存储，使用io技术
 * 那么 map+io--->properties
 * 
 * 配置文件可以实现应用程序数据的共享。
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
				System.out.println("您好，该程序的使用次数已到，拿钱");
				throw new RuntimeException("机器冒烟");
			}
		}
		count++;
		prop.setProperty("time", count+"");
		FileOutputStream fos = new FileOutputStream(file);
		
		prop.store(fos,"注释");
		fos.close();
		fis.close();

	}

}
