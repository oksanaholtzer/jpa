package entity;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="instrument")
public class Instrument {

	@id
	@Column(name = "ID_INSTRUMENT")
	String idInstrument;
	@Column(name = "NAME")
	String name;
	
	@ManyToMany(mappedBy = "idArtiste")
	@JoinTable( name="artiste")
	

    private List<Artiste> artistes=new ArrayList<Artiste> ();
}
