package be.vdab.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="artikels")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "soort")
public abstract class Artikel implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private long id;
	private String naam;
	private BigDecimal aankoopprijs;
	private BigDecimal verkoopprijs;
	
	protected Artikel() {}
	
	public Artikel(String naam, BigDecimal aankoopprijs, BigDecimal verkoopprijs) {
	  if (! isAankoopprijsVerkoopprijsValid(aankoopprijs, verkoopprijs)) {
	    throw new IllegalArgumentException();
	  }
	  setNaam(naam);
	  setAankoopprijs(aankoopprijs);
	  setVerkoopprijs(verkoopprijs);
	}
	
	
	public long getId() {
		return id;
	}
	public String getNaam() {
		return naam;
	}
	public BigDecimal getAankoopprijs() {
		return aankoopprijs;
	}
	public BigDecimal getVerkoopprijs() {
		return verkoopprijs;
	}
	public static boolean isNaamValid(String naam) {
	  return naam != null && !naam.isEmpty();
	}
	public static boolean isAankoopprijsValid(BigDecimal aankoopprijs) {
	  return aankoopprijs != null && aankoopprijs.compareTo(BigDecimal.ZERO) >= 0;
	}
	public static boolean isVerkoopprijsValid(BigDecimal verkoopprijs){
			return verkoopprijs != null && verkoopprijs.compareTo(BigDecimal.ZERO) >= 0;
	}
	public static boolean isAankoopprijsVerkoopprijsValid(BigDecimal aankoopprijs,
	  BigDecimal verkoopprijs) {
	  return aankoopprijs.compareTo(verkoopprijs) <= 0;
	} 
	public BigDecimal getWinstPercentage() {
		  return verkoopprijs.subtract(aankoopprijs).divide(aankoopprijs)
		    .multiply(new BigDecimal(100));
		} 
	 
	public void setNaam(String naam) {
	  if (!isNaamValid(naam)) {
	    throw new IllegalArgumentException();
	  }
	  this.naam = naam;
	}
	public void setAankoopprijs(BigDecimal aankoopprijs) {
	  if (!isAankoopprijsValid(aankoopprijs)) {
	    throw new IllegalArgumentException();
	  }
	  this.aankoopprijs = aankoopprijs;
	}
	public void setVerkoopprijs(BigDecimal verkoopprijs) {
	  if (!isVerkoopprijsValid(verkoopprijs)) {
	    throw new IllegalArgumentException();
	  }
	  this.verkoopprijs = verkoopprijs;
	}
}
