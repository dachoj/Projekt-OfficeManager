package registerOffice.businessObjects.movies;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import registerOffice.businessObjects.persons.Person;

@Entity
public abstract class Movie implements MovieInterface{

	@Id
	@GeneratedValue
	protected int id;
	@ManyToOne
	protected Person owner;
	
	public void printData()
	{
		System.out.println("Owner: "+owner.getName());
		System.out.println(getMovieDetails());
	}
	
	public abstract String getMovieDetails();
	
	public abstract Movie Clone();
	
	public void setOwner(Person owner)
	{
		this.owner=owner;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Person getOwner() {
		return owner;
	}
	
	
}
