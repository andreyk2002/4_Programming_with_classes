package by.epam_tc.class_programminng.agregation_decomposition.country.entity;

import java.io.Serializable;

public class City implements Serializable {

	private static final long serialVersionUID = 7832846986431386791L;
	private String name;
	private int population;

	public City(String name, int population) throws Exception {
		super();
		this.name = name;
		setPopulation(population);
	}
	
	public City()  {
		this.name = "default name";
		this.population = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) throws Exception {
		if(population < 0) {
			throw new Exception("Population of the city can't be less than 0!");
		}
		this.population = population;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + population;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (population != other.population)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Name - " + name + ", population - " + population;
	}

}
