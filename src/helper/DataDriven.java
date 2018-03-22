package helper;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.xml.crypto.Data;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

import com.google.common.base.Strings;

public class DataDriven {

	@DataProvider
	public static Iterator<Object[]> dataLogIn() {
		List<Object[]> list = new ArrayList<Object[]>();
		File file = new File("dataLogIn.txt");
		BufferedReader bufferReader;
		try {
			bufferReader = new BufferedReader(new FileReader(file));
			String lineFile = bufferReader.readLine();
			while (lineFile != null) {
				String[] str = lineFile.split(",");
				list.add(new Object[] { str[0], str[1], str[2] });
				lineFile = bufferReader.readLine();
			}
			bufferReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list.iterator();
	}

	@DataProvider
	public static Iterator<Object[]> dataRegister() throws InterruptedException {
		List<Object[]> list = new ArrayList<Object[]>();
		File file = new File("dataRegisterAllField.txt");
		BufferedReader bufferReader;
		try {
			bufferReader = new BufferedReader(new FileReader(file));
			String lineFile = bufferReader.readLine();
			while (lineFile != null) {
				String[] str = lineFile.split(",");
				list.add(new Object[] { str[0], str[1].replaceAll("unique", makeUniqEmail(str[1])), str[2], str[3],
						str[4] });
				lineFile = bufferReader.readLine();
			}
			bufferReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list.iterator();
	}

	private static String makeUniqEmail(String failEmail) throws InterruptedException {
		if (failEmail.equals("unique")) {
			Date date = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
			Random r = new Random();
			String uniqEmail = dateFormat.format(date) + r.nextInt() + "@mail.ru";
//			Thread.sleep(1000);
			return uniqEmail;
		} else
			return failEmail;
	}

	 @DataProvider
	 public static Iterator<Object[]> dataRegisterName() throws InterruptedException {
	 List<Object[]> list=new ArrayList <Object[]>();
	
	 File file = new File("dataRegisterFieldName.txt");
	 BufferedReader bufferReader;
	 try {
	 bufferReader = new BufferedReader(new FileReader(file));
	 String lineFile = bufferReader.readLine();
	 while (lineFile!=null){
	 String[] str = lineFile.split(",");
	 list.add(new Object[] {str[0].replaceAll("nameLong", newLongName()), str[1].replaceAll("unique", makeUniqEmail(str[1])), str[2], str[3], str[4]});
	 lineFile=bufferReader.readLine();
	 }
	
	 bufferReader.close();
	 }catch (IOException e) {
	 e.printStackTrace();
	 }
	 return list.iterator();
	 }
	 

	private static String newLongName() {
		return Strings.repeat("a", 256);
	}

//	public static String makeLongName(String name) {
//		if (name.equals("nameLong")) {
//			name = Strings.repeat("n", 20);
//		}
//		return name;
//	}

}
