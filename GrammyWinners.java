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
/**
 * Make attribute Winners subdivide
 * @author Administrator
 *
 */
public class GrammyWinners{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("d:/txt/h.txt")));
		List<String> list = new ArrayList<>();
		String temp = null;
		while(null!=(temp=br.readLine())){
			list.add(temp);
		}

		Matcher m = null; 
		Matcher m1 = null; 
		//mark
		int count = 1;
		for(String temp1:list){
//			System.out.println(temp1);
			//Regular Expression separate artist,engineer/mixer,producer in Winners 
			Pattern p = Pattern.compile("(\\w.+)?,artist|(\\w.+)?,(engineer)s{0,1}/(mixer)s{0,1}.|(\\w.+)?,(producer)s{0,1}");
			m = p.matcher(temp1);
			while(m.find()){
				System.out.println(count);
				System.out.println(m.group());
			}
			//Regular Expression separate songwriters
			Pattern p1 = Pattern.compile("(\\w.+)?,songwriters.");
			m1 = p1.matcher(temp1);
			while(m1.find()){
				System.out.println(count);
				System.out.println(m1.group());
			}
			count++;
		}

		}
}

