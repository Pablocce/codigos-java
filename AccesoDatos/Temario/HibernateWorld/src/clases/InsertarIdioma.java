package clases;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.*;
import org.hibernate.query.Query;

import org.hibernate.*;
import util.HibernateUtil;

public class InsertarIdioma {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx = null;
		consultaIdiomas();
		try {
			tx = s.beginTransaction();
			Countrylanguage idioma = new Countrylanguage();
			idioma.setIsOfficial('F');
			idioma.setPercentage(BigDecimal.valueOf(0.5));
			CountrylanguageId idiomaId = new CountrylanguageId();
			idiomaId.setCountryCode("AND");
			idiomaId.setLanguage("Aranés");
			idioma.setId(idiomaId);

			try {
				s.save(idioma);
				tx.commit();
			}catch(PersistenceException e) {
				tx.rollback();
				System.out.println("Persistence error: "+ e.getMessage());
				e.printStackTrace();
			}
			
			
			
		}catch(PersistenceException e) {
			tx.rollback();
			System.out.println("Excepción no controlada: "+e.getMessage());
			e.printStackTrace();
		}finally {
			s.disconnect();
			s.close();
		}
		

	}
	
	public static void consultaIdiomas() {
		try(Session s = HibernateUtil.getSessionFactory().openSession()){
			System.out.println("===============================================");
			String consulta = "from Countrylanguage name where country = 'AND'";
			Query<Countrylanguage> q = s.createQuery(consulta);
			List<Countrylanguage> lista = q.list();
			
			for (Countrylanguage idiomas : lista) {
				System.out.printf("lengua: %s %n",idiomas.getId().getLanguage());
			}
		}
	}

}
