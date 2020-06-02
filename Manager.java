package entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="manager")
public class Manager {
	
	public Manager () {
	}
		
		
		
		@javax.persistence.SequenceGenerator(name="ManGen", sequenceName="SEQ1")
		@javax.persistence.GeneratedValue( generator = "ManGen" )
		@Id
		@Column(name = "ID_ARTISTE")
		String idManager;
		@Column(name = "LAST_NAME")
		String lastNameManager;
		@Column(name = "FIRST_NAME")
		String firstNameManager;
		
		
		@OneToMany(mappedBy = "idArtiste")
		public List <Artiste> artistes= new ArrayList<Artiste>();


		public Manager(String idManager, String lastNameManager, String firstNameManager) {
			super();
			this.idManager = idManager;
			this.lastNameManager = lastNameManager;
			this.firstNameManager = firstNameManager;
		}
		
		public void addArtiste (Artiste artiste) {
			if(artistes==null ) {
				artistes=new ArrayList<Artiste>();
			}
			artistes.add(artiste);
		}

}
