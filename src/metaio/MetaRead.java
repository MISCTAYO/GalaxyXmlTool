package metaio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class MetaRead {
public static String[] gettags(){
	ArrayList<String> mestags= new ArrayList<String>();
	FileInputStream fis;
	try {
		fis = new FileInputStream("./src//metadata/tags.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		 
		String line = null;
		while ((line = br.readLine()) != null) {
			mestags.add(line);
		}
		br.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String array[] = new String[mestags.size()];              
	for(int j =0;j<mestags.size();j++){
	  array[j] = mestags.get(j);
	}
	 
	return array;
	
}
public  String getFile(String fileName) {

	StringBuilder result = new StringBuilder("");

	//Get file from resources folder
	ClassLoader classLoader = getClass().getClassLoader();
	File file = new File(classLoader.getResource(fileName).getFile());

	try (Scanner scanner = new Scanner(file)) {

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			result.append(line).append("\n");
		}

		scanner.close();

	} catch (IOException e) {
		e.printStackTrace();
	}
		
	return result.toString();

 }
public  String readhelptemplate() throws IOException {
    return getFile("ext/helptemplate.txt");
}
public static void main(String[] args) {
	
    
}
}
