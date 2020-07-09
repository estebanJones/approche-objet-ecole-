package fr.diginamic.recensement;

import java.io.IOException;
import java.util.List;

import fr.diginamic.fichier.LectureFichier;
import fr.diginamic.repositories.VilleRepository;

public class Application {
	public static void main(String[] args) throws IOException {
		VilleRepository.chercherVille("Montpellier");
		VilleRepository.compterPopulationDepartement("34");
		VilleRepository.plusPetiteVille("34");
	}
}
