package sets;

import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("USA");
		hashSet.add("France");
		hashSet.add("Allemagne");
		hashSet.add("UK");
		hashSet.add("Italie");
		hashSet.add("Japon");
		hashSet.add("Chine");
		hashSet.add("Russie");
		hashSet.add("Inde");
		
		//TestSetString.plusGrandNombreLettre(hashSet);
		//TestSetString.deletePaysGrandNombreLettre(hashSet);
		
		TestSetString.builderTime();
		System.out.println("------------------------------");
		TestSetString.concatPlusTime();
	}
	
	
	public static String plusGrandNombreLettre(HashSet<String> hashSet) {
		double maxValue = Double.MIN_VALUE;
		String paysAvecPlusDeLettre = "";
		for(String element: hashSet) {
			if(element.length() > maxValue) {
				maxValue = element.length();
				paysAvecPlusDeLettre = element;
			}
		}
		System.out.println("pays " + paysAvecPlusDeLettre + " taille " + maxValue);
		return paysAvecPlusDeLettre;
	}
	
	public static void deletePaysGrandNombreLettre(HashSet<String> hashSet) {
		String paysASupprimer = TestSetString.plusGrandNombreLettre(hashSet);
		hashSet.remove(paysASupprimer);
		for(String element: hashSet) {
			System.out.println(element);
		}
	}
	
	public static void concatPlusTime() {
		 long begin = System.currentTimeMillis();    
		 String phrase = "";
		 for (int i = 0; i < 100000; i++) {
			 phrase = phrase + i + " ";
		 }
	     System.out.println("phrase" + phrase);
	     
	     long end = System.currentTimeMillis();    
	     System.out.println( "Duration " + (end - begin) + " ms" );
	}
	
	public static void builderTime() {
		 long begin = System.currentTimeMillis();    
		 StringBuilder phraseBuilder = new StringBuilder();
		 
		 for (int i = 0; i < 100000; i++) {
			 phraseBuilder.append(i);
		 }
		 phraseBuilder = phraseBuilder;
	     System.out.println("builder " + phraseBuilder.toString());
	     
	     long end = System.currentTimeMillis();    
	     System.out.println( "Duration " + (end - begin) + " ms" );
	}
}
