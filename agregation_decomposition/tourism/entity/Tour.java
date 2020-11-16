package by.epam_tc.class_programminng.agregation_decomposition.tourism.entity;

import java.io.Serializable;

public class Tour implements Serializable{
	
	private static final long serialVersionUID = -7744506024478367337L;
	private int daysCount;
	private double price;
	private Transport transport;
	private TypeOfTour type;
	private MealType mealType;
	private String name;

	public Tour(){
		
	}
	
	public Tour(int daysCount, double price, Transport transport, TypeOfTour type, MealType mealType, String name)
			throws Exception {
		super();
		setDaysCount(daysCount);
		setPrice(price);
		this.transport = transport;
		this.type = type;
		this.mealType = mealType;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDaysCount() {
		return daysCount;
	}

	public void setDaysCount(int daysCount) throws Exception {
		if (daysCount <= 0) {
			throw new Exception("Number of days should be bigger than 0!");
		}
		this.daysCount = daysCount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) throws Exception {

		if (price < 0) {
			throw new Exception("Price for tour can't be 0 or negative!");
		}
		this.price = price;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public TypeOfTour getType() {
		return type;
	}

	public void setType(TypeOfTour type) {
		this.type = type;
	}

	public MealType getMealType() {
		return mealType;
	}

	public void setMealType(MealType mealType) {
		this.mealType = mealType;
	}

	@Override
	public String toString() {
		return "Tour: " + name + ". Info: " + "days - " + daysCount + "," + " price " + price + "$, transport - "
				+ transport.toString() + ", type of tour - " + type.toString() + ", mealType=" + mealType.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + daysCount;
		result = prime * result + ((mealType == null) ? 0 : mealType.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Tour other = (Tour) obj;
		if (daysCount != other.daysCount)
			return false;
		if (mealType != other.mealType)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (transport != other.transport)
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	
	
}
