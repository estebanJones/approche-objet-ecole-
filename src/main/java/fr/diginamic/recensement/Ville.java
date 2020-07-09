package fr.diginamic.recensement;

import org.apache.commons.lang3.builder.EqualsBuilder;

import sets.Pays;

public class Ville {
	private String nomRegion;
	private String nomCommune;
	private String codeRegion;
	private String codeDepartement;
	private String codeCommune;
	private String populationTotale;
	
	public Ville(String nomRegion, String nomCommune, String codeRegion, String codeDepartement, String codeCommune,
			String populationTotale) {
		this.nomRegion = nomRegion;
		this.nomCommune = nomCommune;
		this.codeRegion = codeRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.populationTotale = populationTotale;
	}
	
	@Override
	public boolean equals(Object obj) {
		EqualsBuilder equalsBuilder = new EqualsBuilder();
		
		if (!(obj instanceof Ville)) {
			return false;
		}
		Ville other = (Ville) obj;
		return equalsBuilder.append(this.nomRegion, other.getNomRegion())
							.append(this.nomCommune, other.getNomCommune())
							.append(this.codeRegion, other.getCodeRegion())
							.append(this.codeDepartement, other.getCodeDepartement())
							.append(this.codeCommune, other.getCodeCommune())
							.append(this.populationTotale, other.getPopulationTotale())
							.isEquals();
	}
	
	public String getNomRegion() {
		return nomRegion;
	}
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}
	public String getNomCommune() {
		return nomCommune;
	}
	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}
	public String getCodeRegion() {
		return codeRegion;
	}
	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}
	public String getCodeDepartement() {
		return codeDepartement;
	}
	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}
	public String getCodeCommune() {
		return codeCommune;
	}
	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}
	public String getPopulationTotale() {
		return populationTotale;
	}
	public void setPopulationTotale(String populationTotale) {
		this.populationTotale = populationTotale;
	}
	
	@Override
	public String toString() {
		return  "nomRegion " + this.nomRegion + 
				" nomCommune " + this.nomCommune +  
				" codeRegion " + this.codeRegion +  
				" codeDepartement " + this.codeDepartement +  
				" codeCommune " + this.codeCommune +  
				" populationTotale " + this.populationTotale;
		
	}
}
