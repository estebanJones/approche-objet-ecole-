package sets;

import java.util.HashSet;

public class TestSetPaysObject {

	public static void main(String[] args) {
		
		HashSet<Pays> hashSet = new HashSet<Pays>();
		hashSet.add(new Pays("USA", 6378373, 20));
		hashSet.add(new Pays("France", 42323, 30));
		hashSet.add(new Pays("Allemagne", 5, 7));
		hashSet.add(new Pays("UK", 7, 9));
		hashSet.add(new Pays("Italie", 10, 2));
		hashSet.add(new Pays("Japon", 8, 0));
		hashSet.add(new Pays("Chine", 8, 1));
		hashSet.add(new Pays("Russie", 9, 10));
		hashSet.add(new Pays("Inde", 7, 9));
		
		TestSetPaysObject.plusGrandPIB(hashSet);
		TestSetPaysObject.plusGrandPIBTotal(hashSet);
		TestSetPaysObject.plusPetitPIBTotal(hashSet);
	}
	
	public static String plusGrandPIB(HashSet<Pays> hashSet) {
		double maxValue = Double.MIN_VALUE;
		String paysPlusGrandPib = "";
		for(Pays element: hashSet) {
			if(element.getPibParHabitant() > maxValue) {
				maxValue = element.getPibParHabitant();
				paysPlusGrandPib = element.getNom();
			}
		}
		System.out.println("paysPlusGrandPib " + paysPlusGrandPib + " taille " + maxValue);
		return paysPlusGrandPib;
	}
	
	public static String plusGrandPIBTotal(HashSet<Pays> hashSet) {
		double maxValue = Double.MIN_VALUE;
		String paysPlusGrandPibTotal = "";
		for(Pays element: hashSet) {
			Integer pibTotal = element.getPibParHabitant() * element.getNbHabitants();
			if(pibTotal > maxValue) {
				maxValue = pibTotal;
				paysPlusGrandPibTotal = element.getNom();
			}
		}
		System.out.println("paysPlusGrandPibTotal " + paysPlusGrandPibTotal + " taille " + maxValue);
		return paysPlusGrandPibTotal;
	}
	
	public static String plusPetitPIBTotal(HashSet<Pays> hashSet) {
		double minValue = Double.MAX_VALUE;
		String paysPetitPibTotal = "";
	
		Pays pays = null;
		for(Pays element: hashSet) {
			Integer pibTotal = element.getPibParHabitant() * element.getNbHabitants();
			if(pibTotal < minValue) {
				minValue = pibTotal;
				paysPetitPibTotal = element.getNom();
				pays = element;
			}
		}
		hashSet.remove(pays);
		hashSet.add(new Pays(pays.getNom().toUpperCase().toUpperCase(), pays.getNbHabitants(), pays.getPibParHabitant()));
		for(Pays element: hashSet) {
			System.out.println("element lol " + element.getNom());
		}
		System.out.println("paysPetitPibTotal " + pays.getNom().toUpperCase() + " taille " + minValue);
		return paysPetitPibTotal;
	}
}