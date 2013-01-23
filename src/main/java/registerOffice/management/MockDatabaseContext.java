package registerOffice.management;

import java.util.ArrayList;
import java.util.List;

import registerOffice.businessObjects.movies.Movie;
import registerOffice.businessObjects.persons.Person;

public class MockDatabaseContext {

	private static List<Person> persons=new ArrayList<Person>();
	private static List<Movie> movies=new ArrayList<Movie>();
	
	public static List<Person> getPersons() {
		return persons;
	}
	public static List<Movie> getCars() {
		return movies;
	}
	
	
}
