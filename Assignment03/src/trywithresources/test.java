package trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		        System.out.println(line);
		    }
		} catch (IOException e) {
		    e.printStackTrace();
		}


	}

}
