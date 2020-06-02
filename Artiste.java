package entity;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="artiste")
@NamedQuery (name="findArtisteByName", query="from Artiset artiste where artiste.lastname=:lname")
public class Artiste {
	
	public Artiste () {
	}
		
		@Id
		@Column(name = "ID_ARTISTE")
		String idArtiste;
		@Column(name = "LAST_NAME")
		String lastName;
		@Column(name = "FIRST_NAME")
		String firstName;
		
		
		
		public Artiste(String idArtiste, String lastName, String firstName) {
			super();
			this.idArtiste = idArtiste;
			this.lastName = lastName;
			this.firstName = firstName;
		}

		/** manager */
	    @ManyToOne
	    @JoinColumn(name = "ARTISTE_ID", nullable = false)
	    private Manager manager;
	    
	    
	    @ManyToMany(mappedBy = "idInstrument")
	    private List<Instrument> instruments=new ArrayList<Instrument> ();
	    
	    //@OneToMany (mappedBy="mediaType.name")
	    private List <Media> media= new ArrayList<Media> ();

}
