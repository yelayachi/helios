package com.helios.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SourceSiret {
	@Id
	private String idSourceSiret;
	private boolean cloe;
	private boolean vega;
	private boolean inconnu;
	private boolean migre;
	
	public SourceSiret(String idSourceSiret, boolean cloe, boolean vega, boolean inconnu, boolean migre) {
		this.idSourceSiret = idSourceSiret;
		this.cloe = cloe;
		this.vega = vega;
		this.inconnu = inconnu;
		this.migre = migre;
	}

	public SourceSiret(){
		
	}
	
	public boolean isCloe() {
		return cloe;
	}

	public void setCloe(boolean cloe) {
		this.cloe = cloe;
	}

	public boolean isVega() {
		return vega;
	}

	public void setVega(boolean vega) {
		this.vega = vega;
	}

	public boolean isInconnu() {
		return inconnu;
	}

	public void setInconnu(boolean inconnu) {
		this.inconnu = inconnu;
	}

	public boolean isMigre() {
		return migre;
	}

	public void setMigre(boolean migre) {
		this.migre = migre;
	}

	public String getIdSourceSiret() {
		return idSourceSiret;
	}

	public void setIdSourceSiret(String idSourceSiret) {
		this.idSourceSiret = idSourceSiret;
	}
	
	
}
