package utils;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FileReader {
	private final String fileName;

	public FileReader(String fileName) {
		this.fileName = fileName;
	}

	public ArrayList<String> readFile() {
		ArrayList<String> inputAsArrayList = new ArrayList<String>();
		try {
			FileInputStream fstream = new FileInputStream(fileName);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null) {
				inputAsArrayList.add(strLine);
			}
			br.close();

		} catch (IOException e) {
			System.out.println("Error, while reading from file FamilyMembersList.txt");
			e.printStackTrace();
		}
		return inputAsArrayList;
	}
}
