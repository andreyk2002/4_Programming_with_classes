package by.epam_tc.class_programminng.agregation_decomposition.country.logic;

import by.epam_tc.class_programminng.agregation_decomposition.country.entity.Country;
import by.epam_tc.class_programminng.agregation_decomposition.country.entity.District;

public class CountryLogic {

	private static CountryLogic instance = null;

	private CountryLogic() {

	}

	public static CountryLogic getInstance() {
		if (instance == null) {
			instance = new CountryLogic();
		}
		return instance;
	}

	public String getRegionsList(District d) {
		StringBuilder list = new StringBuilder();
		int size = d.getDistrictRegions().size();
		for (int i = 0; i < size; i++) {
			list.append(d.getDistrictRegions().get(i).getRegName());
			if (i != size - 1) {
				list.append(',');
			}
		}
		return list.toString();
	}

	public String getDistrictsList(Country c) {
		StringBuilder list = new StringBuilder();
		int size = c.getDistricts().size();
		for (int i = 0; i < size; i++) {
			list.append(c.getDistricts().get(i).getName());
			if (i != size - 1) {
				list.append(',');
			}
		}
		return list.toString();
	}

	public static double countDistrictArea(District d) {
		double totalArea = 0;
		for (var el : d.getDistrictRegions()) {
			totalArea += el.getArea();
		}
		return totalArea;
	}

	public static double countCountryArea(Country c) {
		double CountryArea = 0;
		for (var el : c.getDistricts()) {
			CountryArea += el.getDistrictArea();
		}
		return CountryArea;
	}
}
