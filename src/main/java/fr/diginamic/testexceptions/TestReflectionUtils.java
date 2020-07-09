package fr.diginamic.testexceptions;

import sets.Pays;

public class TestReflectionUtils {

	public static void main(String[] args) {
		Pays pays = new Pays("USA", 6378373, 20);
		
		try {
			ReflectionUtils.afficherAttributs(pays);
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
