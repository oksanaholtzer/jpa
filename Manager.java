package entity;

import java.util.List;

public class Manager {
	@Entity
	@Table(name="manager")
	public Manager () {
	}
		
		@id
		@Column(name = "ID_MANAGER")
		
		@SequenceGenerator(name="ManGen", sequenceName="SEQ1")
		@GeneratedValue( generator = "ManGen" )
		String idManager;
		@Column(name = "LAST_NAME")
		String lastNameManager;
		@Column(name = "FIRST_NAME")
		String firstNameManager;
		
		
		@OneToMany(mappedBy = "idArtiste")
		public List <Artiste>artistes new ArrayList();

}
