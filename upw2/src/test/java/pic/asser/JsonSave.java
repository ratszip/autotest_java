package pic.asser;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
public class JsonSave {
	public static void parseJsonFile()   {
		List<String[]> list=new ArrayList<String[]>();
		File jsfile=new File("D:\\apache-jmeter-5.4.1\\projworkspace\\test.json");
		File csvfile=new File("D:\\123.csv");
		String json;
		try {
			json = FileUtils.readFileToString(jsfile,"UTF-8");
			Object document=Configuration.defaultConfiguration().jsonProvider().parse(json);
			int total=JsonPath.read(document, "$.data.total");
			for (int i = 0; i < total; i++) {
				String bookno=JsonPath.read(document, "$.data.list["+i+"].bookNo");
				String categoryName=JsonPath.read(document, "$.data.list["+i+"].categoryName");
				
				String[] a= {bookno,categoryName};
				list.add(a);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for (String[] strings : list) {
			for (String strar : strings) {
				if(strings[strings.length-1]==strar) {
					System.out.print(strar);
					try {
						FileUtils.writeStringToFile(csvfile, strar, "UTF-8",true);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else {
					System.out.print(strar+",");
					try {
						FileUtils.writeStringToFile(csvfile, strar+",", "UTF-8",true);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			System.out.println();
			try {
				FileUtils.writeStringToFile(csvfile, "\n", "UTF-8",true);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void parseJsonFile1()   {
		File jsfile=new File("D:\\apache-jmeter-5.4.1\\projworkspace\\test.json");
		String json;
			try {
				json = FileUtils.readFileToString(jsfile,"UTF-8");
				Object document=Configuration.defaultConfiguration().jsonProvider().parse(json);
				int total=JsonPath.read(document, "$.data.list.length()");
				System.out.println(total);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}	
}
