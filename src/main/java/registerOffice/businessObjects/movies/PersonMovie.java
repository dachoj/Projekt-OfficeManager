package registerOffice.businessObjects.movies;

import javax.persistence.Entity;

@Entity
public class PersonMovie extends Movie{

	//pole statyczne
	
	//pola prywatne
	
	private String mark;
	private String registerNumber;
	
	//pola publiczne
	
	//konstruktory
	public PersonMovie(String mark, String registerNumber)
	{
		this.mark=mark;
		this.registerNumber=registerNumber;
	}
	
	public PersonMovie()
	{
		this("","");
	}
	
	//wlasciwosci
	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getRegisterNumber() {
		return registerNumber;
	}

	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}
	
	//metody
	

	@Override
	public String getMovieDetails() {
		// TODO Auto-generated method stub
		return mark+" "+registerNumber;
	}

	@Override
	public Movie Clone() {
		
		PersonMovie returnValue =new PersonMovie();
		returnValue.setRegisterNumber(this.registerNumber);
		
		return returnValue;
	}
}
