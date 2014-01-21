package pack;

import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class cool {
	private String[] cds;
	public cool(String scriptPath){
		try {
		BufferedReader b = new BufferedReader(new FileReader(scriptPath));
		String cur;
		ArrayList<String> sts = new ArrayList<String>();
		while ((cur=b.readLine())!=null){
			sts.add(cur);
		}
		cds = sts.toArray(cds);
		} catch (Exception e){
			
		}
	}
}
