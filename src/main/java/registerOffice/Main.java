package registerOffice;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import registerOffice.businessObjects.movies.Movie;
import registerOffice.businessObjects.movies.PersonMovie;
import registerOffice.businessObjects.persons.*;
import registerOffice.management.HibernatePersonManager;
import registerOffice.management.ManagerInterface;
import registerOffice.management.PersonManager;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Person damian = (Person)context.getBean("person");
		
		System.out.println(damian.getId()+damian.getName()+damian.getPesel());
		
		for(Movie m : damian.getMovies())
		{
			System.out.println(m.getMovieDetails());
		}
		
		
		
		
		
		
		
	//	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//Person p = (Person)context.getBean("person");
		//Car car=(Car)context.getBean("carA");
//		System.out.println(p.getId()+p.getName()+p.getPesel());
//		
//		for(Car car : p.getCars())
//			System.out.println(car.getCarDetails());

		
//		SessionFactory factory = new Configuration().configure().buildSessionFactory();
//		Session session = factory.openSession();
		//session.beginTransaction();
//		
//		//
//		Car c = new PersonCar("BMW","GDA12345");
//		Person adam = new Person("Adam","1234");
//		adam.getCars().add(c);
//		c.setOwner(adam);
//		//
//	
//		session.persist(adam);
//		
//		
//		List<Person> persons=session.getNamedQuery("allPersonsByName")
//				.setString("name", "Adam").list();
//		
//		for(Person p : persons)
//			System.out.println(p.getName());
//		session.getTransaction().commit();
//		session.close();
//		
//		ManagerInterface<Person> mgr = new PersonManager();
//		mgr.save(new Person("Adam","1234"));
//		mgr.save(new Person("Michal","1234"));
//		mgr.save(new Person("Paweł","1234"));
//		Person person =new Person("Adam");
//		person.setId(10);
//		mgr.delete(person);
//		//session.getTransaction().commit();
//		for(Person p: mgr.getAll())
//		{
//			System.out.println(p.getName());
//		}
		
//		session.close();
		//System.out.println("Osoba o id 4:"+mgr.get(4).getName());
		
	}

}
