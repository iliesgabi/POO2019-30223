package col;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProcesareDateFisier {
	private Scanner scanner;

	private void closeFile() {
		scanner.close();
	}

	private void readFile() {
		while (scanner.hasNext()) {
		}
	}

	private void openFile() {
		try {
			scanner = new Scanner(new File("input.txt"));
		} catch (Exception e) {
		}
	}

}
