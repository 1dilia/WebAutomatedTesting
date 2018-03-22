package classRetired;

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
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.DataProvider;

import com.google.common.base.Strings;


public class DataDriven2 {
	
	@DataProvider
	public static Iterator<Object[]> dataRegister2() throws InterruptedException {
		List<Object[]> list=new ArrayList <Object[]>();
		File file = new File("dataRegister2.txt");
		BufferedReader bufferReader;	
		try {
			bufferReader = new BufferedReader(new FileReader(file));
			String lineFile = bufferReader.readLine();
			while (lineFile!=null){
				String[] str = lineFile.split(",");
				Date date = new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss") ;
				str[1] = str[1].replaceAll("unique", dateFormat.format(date) + "@mail.ru");
				list.add(new Object[] {str[0], str[1], str[2], str[3], str[4]}); 
				System.out.println(str[0] + str[1] + str[2] + str[3] + str[4]);
				lineFile=bufferReader.readLine();
				Thread.sleep(1000);
				}

			bufferReader.close();
		}catch (IOException e) {
			e.printStackTrace();	
			}
		return list.iterator();
	}
	
	
	
	
	
//	
//	public static StringBuffer sBuffer() {
//		StringBuffer sb = new StringBuffer();
//		sb = makeEmail();
//		
//		
//		String sconst = "unique";
//		StringBuffer sb = new StringBuffer(s);
//		System.out.println("sb" + sb.toString());
//	 if (s.equals(sconst)) {
//	    	sb.replace(0, sb.length(), makeEmail());
//	    }
//	 System.out.println("sb2" + sb.toString());
//	 return sb;
//	}
//	
	
	
//	public static Iterator<Object[]> iteratorEmail() {
//		List<Object[]> iteratorEmail=new ArrayList <Object[]>();
//		iteratorEmail.add(new Object[] {strmakeEmail(),strmakeEmail(),strmakeEmail()});
//	return iteratorEmail.iterator();
//}
	
	
	private static String chackStr(String string) {
		if (string == "unique"){
			string = string.replaceAll("unique", makeEmail());
		}
		return string;
	}





	public static String makeEmail() {
			Date date = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss") ;
			Random r = new Random(10);
//			String email = dateFormat.format(date)+r.nextInt(1) + "@mail.ru";
//			String bufer = a1.replace("unique", dateFormat.format(date) + "@mail.ru");
		return dateFormat.format(date)+r.nextInt(1) + "@mail.ru";
	}
	
	
//	public static Iterator<Object[]> makeEmail() {
//
//			List<Object[]> listEmail=new ArrayList <Object[]>();
//			listEmail.add(new Object[] {unikEmail(),unikEmail(),unikEmail()});
//		return listEmail.iterator();
//	}
//	
//	public static String unikEmail() {
//		Date date = new Date();
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss") ;
//		String unikEm = dateFormat.format(date) + "@mail.ru";
//		return unikEm;
//				}
//	
	




	public static String makeLongName(String name) {
		if (name.equals("nameLong")){
			name = Strings.repeat("n", 20);
		}
		return name;
	}
	

}
