package fr.diginamic.repositories;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import fr.diginamic.fichier.LectureFichier;
import fr.diginamic.recensement.Ville;

public class VilleRepository {
	static LectureFichier lectureFichier;
	
	
	
	public static Ville plusPetiteVille(String codeDepartement) throws IOException {
		List<Ville> listVilles = VilleRepository.creerListeVilles();
		Ville plusGrandeVille = VilleRepository.plusGrandeVille(codeDepartement);
		System.out.println("ville " + plusGrandeVille);
		Integer habitantsParVille = 0;
		Integer habitantsMin = 0;
		Integer index = 0;
		
		for(Ville ville : listVilles) {
			if(ville.getCodeDepartement().equalsIgnoreCase(codeDepartement)) {
				habitantsParVille = Integer.parseInt(ville.getPopulationTotale().replace(" ", ""));
				
//				if(plusGrandeVille > habitantsParVille) {
//					index++;
//					habitantsMin = habitantsParVille;
//				}
			}
			
		}
		return listVilles.get(index);
	}
	private static Ville plusGrandeVille(String codeDepartement) throws IOException {
		List<Ville> listVilles = VilleRepository.creerListeVilles();
		Integer habitantsParVille = 0;
		Integer habitantsMax = 0;
		Integer index = 0;
		
		for(Ville ville : listVilles) {
			if(ville.getCodeDepartement().equalsIgnoreCase(codeDepartement)) {
				habitantsParVille = Integer.parseInt(ville.getPopulationTotale().replace(" ", ""));
				
				if(habitantsParVille > habitantsMax) {
					index++;
					habitantsMax = habitantsParVille;
				}
			}
			
		}
		System.out.println("size " + listVilles.size());
		System.out.println("index " + index);
		return listVilles.get(index);
	}
	
	public static Integer compterPopulationDepartement(String codeDepartement) throws IOException {
		
		List<Ville> listVilles = VilleRepository.creerListeVilles();
		Integer nombreHabitants = 0;
		
		for(Ville ville : listVilles) {
			if(ville.getCodeDepartement().equalsIgnoreCase(codeDepartement)) {
				Integer habitantsParVille = Integer.parseInt(ville.getPopulationTotale().replace(" ", ""));
				nombreHabitants += habitantsParVille;
			}
		}
		
		return nombreHabitants;
	}
	
	public static List<Ville> chercherVille(String villeNom) throws IOException {
		List<Ville> listVilles = VilleRepository.creerListeVilles();
		List<Ville> listVilleParticuliere = new ArrayList<Ville>();
		
		for(Ville ville : listVilles) {
			if(ville.getNomCommune().equalsIgnoreCase(villeNom)) {
				listVilleParticuliere.add(ville);
			}
		}
		
		return listVilleParticuliere;
	}
	
	
	public static List<Ville> creerListeVilles() throws IOException {
		List<String> file = LectureFichier.lireFichier();
		List<Ville> listVilles = new ArrayList<Ville>();
		
		for (String ligne: file) {
			String[] element = ligne.split(";");
			
			for(int i=0; i< element.length; i++) {
				listVilles.add(
					new Ville(
						 element[1],
						 element[6],
						 element[0],
						 element[2],
						 element[5],
						 element[9]
					));
			}
		}
		
		return listVilles;
	}
}
