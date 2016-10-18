package api;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
/**
 * read from local file
 * @author Harris
 *
 */
public class Twitter_util {

public String ReadFile(String Path){
	BufferedReader reader = null;
	String laststr = "";
	try{
		FileInputStream fileInputStream = new FileInputStream(Path);
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
		reader = new BufferedReader(inputStreamReader);
		String tempString = null;
		while((tempString = reader.readLine()) != null){
			laststr += tempString;	
		}
		reader.close();
	}catch(IOException e){
		e.printStackTrace();
	}finally{
		if(reader != null){
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	return laststr;
	}

}
