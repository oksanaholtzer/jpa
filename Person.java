package entity;


@Entity
@Table(name="person")
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {
	@id
	@Column(name = "ID_PERSON")
	@GeneratedValue(strategy = GenerationType.AUTO)
	

	String idPerson;
	
	@Column(name = "LASTNAME")
	String lastName;
	
	@Column(name = "FIRSTNAME")
	String firstName;

}
