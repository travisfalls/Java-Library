package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCreation {

	public static void main(String[] args) throws IOException {
		Scanner userInput = new Scanner(System.in);

		File dir = new File("/Users/Travis/Documents/workspace/Java-Library");
		File file = new File(dir, "strings.txt");
		FileWriter outFile = new FileWriter(file);
		String s;

		do {
			System.out.println("> ");
			s = userInput.nextLine();
			outFile.write(s + "\n");
		} while (!"".equals(s));

		
		File inputTxt = new File("input.txt");
		FileInputStream inFile = new FileInputStream(inputTxt);
		try (Scanner fileInput = new Scanner(inFile)){
			while (fileInput.hasNextLine()){
				System.out.println(fileInput.nextLine());
			}
		}
		
		outFile.close();
		userInput.close();

	}

}
