package entity;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Immutable;



public class Artiste {
	@Entity
	@Table(name="artiste")
	public Artiste () {
	}
		
		@id
		@Column(name = "ID_ARTISTE")
		String idArtiste;
		@Column(name = "LAST_NAME")
		String lastName;
		@Column(name = "FIRST_NAME")
		String firstName;
		
		/** manager */
	    @ManyToOne
	    @JoinColumn(name = "ARTISTE_ID", nullable = false)
	    private Manager manager;
	    
	    
	    @ManyToMany(mappedBy = "idInstrument")
	    private List<Instrument> instruments=new ArrayList<Instrument> ();
		
	

}
