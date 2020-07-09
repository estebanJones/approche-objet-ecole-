package fr.diginamic.fichier;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class LectureFichier {
	public static List<String> lireFichier() throws IOException {
		List<String> lignes = new ArrayList<String>();
		try {
			File file = new File("C:/temp/recensement population 2016.csv");
			lignes = FileUtils.readLines(file, "UTF-8");

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return lignes;
	}

}
