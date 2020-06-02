package entity;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="media")
public class Media {
	
	@EmbeddedId
    private MediaId mediaIdId;
	
	private String release;
	
	 @ManyToOne
     @JoinColumn(name = "ID_ARTISTE")
	private Artiste artiste;

	public Media(String name , MediaType mtype) {
		mediaIdId= new MediaId (name, mtype);
	}

	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

	public Artiste getArtiste() {
		return artiste;
	}

	public void setArtiste(Artiste artiste) {
		this.artiste = artiste;
	}
	
	
	
	
	
	

}
