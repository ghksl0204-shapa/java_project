package com.kh.chap04.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap04.model.vo.Sandwich;

public class PropertiesRun {

	public static void main(String[] args) {
		// 파일은 파일인데 확장자가 .properties
		// 변경하지않는 설정정보
		// 해당 프로그램이 기본적으로 가져야할 정보들을 담는 용도로 많이 사용
		
		Properties prop = new Properties();  // 상속의 잘못된 예
		
		// prop.put("sdfsdf", new Sandwich("맛있음", "에그마요"));
		prop.setProperty("맛있음", "에그마요");
		// prop.put
		
		MyProperties mp = new MyProperties();
		mp.put("냠냠", "냠냠아아");
		
//		try {
//			prop.load(new FileInputStream("test.properties"), null);
//		} catch(IOException e) {
//			e.printStackTrace();
//		}
		
		
		
		
		
		
		
	}

}
