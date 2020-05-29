package trainingJPA;

public class Application {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Books");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		
		entityManager.close();
		entityManagerFactory.close();

	}

}
