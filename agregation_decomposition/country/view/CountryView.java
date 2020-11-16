package by.epam_tc.class_programminng.agregation_decomposition.country.view;

import by.epam_tc.class_programminng.agregation_decomposition.country.entity.Country;

public class CountryView {

	private static CountryView instance = null;

	private CountryView() {

	}

	public static CountryView getInstance() {
		if (instance == null) {
			instance = new CountryView();
		}
		return instance;
	}

	public void showCapital(Country c) {
		System.out.println("capital: " + c.getCapital());
	}

	public void showDistrictsAmount(Country c) {
		System.out.println("Number of districts - " + c.getDistricts().size());
	}

	public void showArea(Country c) {
		System.out.println("area: " + c.getArea() + " km2");
	}

	public void showDistrictCenters(Country c) {
		System.out.println("District centers:");
		for (var el : c.getDistricts()) {
			System.out.println(el.getDistrictCenter().getName());
		}
	}
}
