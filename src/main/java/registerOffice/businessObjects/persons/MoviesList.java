package registerOffice.businessObjects.persons;

import java.util.*;

import registerOffice.businessObjects.movies.Movie;

class MoviesList implements Collection<Movie>{

	private List<Movie> movies=new ArrayList<Movie>();
	private Person owner;
	
	public MoviesList(Person owner)
	{
		this.owner=owner;
	}
	
	@Override
	public int size() {
		return movies.size();
	}

	@Override
	public boolean isEmpty() {
		return movies.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return movies.contains(o);
	}

	@Override
	public Iterator<Movie> iterator() {
		// TODO Auto-generated method stub
		return movies.iterator();
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return movies.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return movies.toArray(a);
	}

	@Override
	public boolean add(Movie e) {
		// TODO Auto-generated method stub
		e.setOwner(owner);
		return movies.add(e);
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return movies.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return movies.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends Movie> c) {
		
		for(Movie movie : movies)
		{
			movie.setOwner(owner);
		}
		
		return movies.addAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return movies.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return movies.retainAll(c);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		movies.clear();
	}

	

}
