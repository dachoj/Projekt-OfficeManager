package registerOffice.businessObjects.persons;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import registerOffice.businessObjects.movies.*;

@NamedQueries({
		@NamedQuery(
					name="allPersonsById",
					query="from Person p where p.id= :id " ),
		@NamedQuery(
				name="allPersons",
				query="from Person p"
				),
		@NamedQuery(
				name="deleteFromPerson",
				query="delete Person where id=:id"
				)})
		
@Entity
@Table(name="OSOBY")
public class Person {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="imie")
	private String name;
	
	@OneToMany(mappedBy="owner", cascade=javax.persistence.CascadeType.PERSIST)
	private Collection<Movie> movies;
	private String pesel;
	
	public Person(String name, String pesel)
	{
		this.pesel=pesel;
		this.name=name;
		this.movies=new MoviesList(this);
	}
	
	public Person(String name) {
		
		this(name,"");
	}
	
	public Person()
	{
		this("","");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Collection<Movie> getMovies() {
		return movies;
	}
	public void setMovies(Collection<Movie> movies) {
		this.movies = movies;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
