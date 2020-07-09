package sets;

import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {
		HashSet<Double> hashSet = new HashSet<Double>();
		hashSet.add(1.5);
		hashSet.add(8.25);
		hashSet.add(-7.32);
		hashSet.add(13.3);
		hashSet.add(-12.45);
		hashSet.add(48.5);
		hashSet.add(0.01);
		
		// valeur plus elevée du hashSet
		TestSetDouble.maxSetElement(hashSet);
		TestSetDouble.minSetElementAndRemove(hashSet);
		TestSetDouble.boucleSetAndDisplay(hashSet);
	}
	
	
	
	public static double maxSetElement(HashSet<Double> hashSet) {
		double maxValue = Double.MIN_VALUE;
		
		for(Double element: hashSet) {
			if(element > maxValue) {
				maxValue = element;
			}
		}
		return maxValue;
	}
	
	public static double minSetElementAndRemove(HashSet<Double> hashSet) {
		double minValue = Double.MAX_VALUE;
		
		for(Double element: hashSet) {
			if(element < minValue) {
				minValue = element;
			}
		}
		hashSet.remove(minValue);
		return minValue;
	}
	
	public static void boucleSetAndDisplay(HashSet<Double> hashSet) {
		for(Double element: hashSet) {
			System.out.println("element " + element);
		}
	}

}
