package entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="instrument")
public class Instrument {
	
	public  Instrument () {
	}
	

		@Id
		@Column(name = "ID_INSTRUMENT")
		String idInstrument;
		@Column(name = "NAME")
		String name;
		
		/*@ManyToMany(mappedBy = "idArtiste")
		@JoinTable( name="artiste")
		

	    private List<Artiste> artistes=new ArrayList<Artiste> ();*/

}
