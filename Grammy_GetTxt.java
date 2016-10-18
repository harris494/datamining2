package regex.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import sun.net.www.content.text.plain;
/**
 * Make txt file into four part
 * YEAR CATAGORY TITLE WINNERS
 * @author Harris
 *
 */
public class Grammy_GetTxt {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("d:/txt/g.txt")));
		List<String> list = new ArrayList<>();
		String temp = null;
		while(null!=(temp=br.readLine())){
			list.add(temp);
		}
		
		
		for(int i = 0;i<150;i++){
			List<String> sl1 = new ArrayList<>();
			List<String> sl2 = new ArrayList<>();
			sl1.add(list.get(4*i+3));
			sl2.add(list.get(4*i+2));
			String str2 = list.get(4*i+1);
			String str3 = list.get(4*i+2);
			String str4 = list.get(4*i+3);
			}
		}
	}
