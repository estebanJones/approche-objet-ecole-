package sets;

import fr.diginamic.recensement.Ville;
import org.apache.commons.lang3.builder.EqualsBuilder;

public class Pays {
	private String nom;
	private Integer nbHabitants;
	private Integer pibParHabitant;
	
	public Pays(String nom, Integer nbHabitants, Integer pibParHabitant) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibParHabitant = pibParHabitant;
	}


	@Override
	public boolean equals(Object obj) {
		EqualsBuilder equalsBuilder = new EqualsBuilder();
		
		if (!(obj instanceof Ville)) {
			return false;
		}
		Pays other = (Pays) obj; // downcasting: on part de object class Mère à Ville class Fille 
		
		return equalsBuilder.append(this.nom, other.getNom())
					.append(this.nbHabitants, other.getNbHabitants())
					.append(this.pibParHabitant, other.getPibParHabitant())
					.isEquals();
	}



	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(Integer nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public Integer getPibParHabitant() {
		return pibParHabitant;
	}

	public void setPibParHabitant(Integer pibParHabitant) {
		this.pibParHabitant = pibParHabitant;
	}
}
