package api;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class test {

public static void main(String[] args) throws IOException  {
// TODO Auto-generated method stub
	File file = new File("D:/txt/e.json");
	String JsonContext = new util().ReadFile("D:\\workspace_python\\music_1.json");
	JSONArray jsonArray = JSONArray.fromObject(JsonContext);
	int size = jsonArray.size();
	System.out.println("Size: " + size);
	BufferedWriter bw = null;
	String t ="";
		for(int  i = 0; i < size; i++){
			bw = new BufferedWriter(new FileWriter(file,true));
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			String temp1 = "{'Time':"+ jsonObject.get("created_at")+",";
			String temp2 = "'Text':" + jsonObject.get("text")+"},";
//			System.out.println(temp1);
			bw.write(temp1);
//			bw.newLine();
			bw.append(temp2);
			bw.newLine();
			bw.flush();
			
			}

		bw.close();

//System.out.println("[" + i + "]Time="+ jsonObject.get("created_at"));
//System.out.println("[" + i + "]text=" + jsonObject.get("text"));
}
}
