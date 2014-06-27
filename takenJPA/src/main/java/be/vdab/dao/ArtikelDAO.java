package be.vdab.dao;

import be.vdab.entities.Artikel;



public class ArtikelDAO extends AbstractDAO {
	  public Artikel read(long id) {
	    return getEntityManager().find(Artikel.class, id);
	  }
	  public void create(Artikel artikel) {
	      getEntityManager().persist(artikel);
	  }
	  public void delete(long id){
		  Artikel artikel = getEntityManager().find(Artikel.class, id);
		  if (artikel != null){
			  getEntityManager().remove(artikel);
		  }
	  }
	}
