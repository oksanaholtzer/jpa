package entity;

@Entity
@Table(name="sacemRegistration")
public class SacemRegistration {
	
	
	@id
	@Column(name = "ID_REG")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String idReg;
	
	@Column(name = "CODE")
	private String code;
	
	@Column(name = "DATE_REG")
	private Date dateReg;
}
