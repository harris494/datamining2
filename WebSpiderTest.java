package regex.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 网络爬虫取链接
 * WebSpider from Grammy;
 * Save as Txt in Local
 * @author Harris
 *
 */
public class WebSpiderTest {
	/**
	 * 获得网页内容
	 * @param url
	 * @return
	 */
	public String getUrl(String url,String charset){
		StringBuilder sb = new StringBuilder();
		try {
			URL url1 = new URL(url);
			BufferedReader reader = new BufferedReader(new InputStreamReader(url1.openStream(),Charset.forName(charset)));
			String temp = "";
			while(null!=(temp=reader.readLine())){
				sb.append(temp+"\n");
				
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = null;
		WebSpiderTest wst = new WebSpiderTest();
		for(int i=2010;i<2016;i++){
		StringBuilder sb =new StringBuilder();
		sb.append(wst.getUrl("https://www.grammy.com/nominees/search?artist=&field_nominee_work_value=&year="+i+"&genre=All","UTF-8"));
		//Regular Expression extract main body in Website page 
		Pattern p = Pattern.compile(">(\\s.+?)</td>");
		Matcher m = p.matcher(sb.toString());
		
		while(m.find()){
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:/txt/g.txt",true),"UTF-8") );
//			list.add(m.group(1));
//			bw.write(m.group(1));
			//replace ALL line break
			String str = m.group(1).replaceAll("\\s", "");
			System.out.println(str);
//			for(String temp:list){
//				bw.newLine();
//				bw.flush();
//				System.out.println(temp);
//			}
			
		}
		}
		bw.close();
	}
}
