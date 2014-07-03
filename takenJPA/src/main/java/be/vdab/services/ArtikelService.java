package be.vdab.services;

import java.math.BigDecimal;

import be.vdab.dao.ArtikelDAO;
import be.vdab.entities.Artikel;

public class ArtikelService {
	  private final ArtikelDAO artikelDAO = new ArtikelDAO();
	  public Artikel read(long id) {
	    return artikelDAO.read(id);
	  } 
	  public void create(Artikel artikel) { 
	    artikelDAO.beginTransaction();
	    artikelDAO.create(artikel);
	    artikelDAO.commit();
	  }
	  public void delete (long id) {
		  artikelDAO.beginTransaction();
		  artikelDAO.delete(id);
		  artikelDAO.commit();
	  }
	  public Iterable<Artikel> findByNaamContains(String woord) {
		  return artikelDAO.findByNaamContains(woord);
		} 
	  public void prijsverhoging (BigDecimal percentage) {
		  BigDecimal factor = BigDecimal.ONE.add(percentage.divide(new BigDecimal(100)));
		  artikelDAO.beginTransaction();
		  artikelDAO.prijsverhoging(factor);
		  artikelDAO.commit();
	  }
	}
