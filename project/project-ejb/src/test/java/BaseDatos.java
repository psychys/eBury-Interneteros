
import eBury_project.Cliente;
import eBury_project.Cuenta;
import eBury_project.Cuenta_Fintech;
import eBury_project.Divisa;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class BaseDatos {
	public static void inicializaBaseDatos(String nombreUnidadPersistencia) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(nombreUnidadPersistencia);
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();

		Cuenta_Fintech cuentafin1 = new Cuenta_Fintech("activo", 23.3.22, 0.0.0, "Pooled")
		Cuenta_Fintech cuentafin2 = new Cuenta_Fintech("activo", 18.5.21 , 0.0.0, "Pooled");

		Cliente cliente1 = new Cliente(1, 1234567, "cliente", 2.23.21, 0.0.0, "Calle palillo 23",
				"Malaga", 29650, "España", "Activo", cuentafin1);
		Cliente cliente2 = new Cliente(2, 87654321, "cliente", 18.5.20, 0.0.0, "Calle paco 23",
				"Malaga", 29651, "España", "Activo", cuentafin2);

		em.persist(cliente1);
		em.persist(cliente2);



		em.persist(cuenta1);
		em.persist(cuenta2);

		Divisa dolar = new Divisa("USD", "Dolar", "$", 1.07 );
		Divisa yen = new Divisa("JPY" , "Yen", "¥", 0.007);
		Divisa libra = new Divisa("GBP", "Libra Esterlina", "£",1.18 )

		em.persist(dolar);
		em.persist(yen);
		em.persist(libra);


		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
