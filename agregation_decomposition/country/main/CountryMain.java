package by.epam_tc.class_programminng.agregation_decomposition.country.main;

import java.util.ArrayList;

import by.epam_tc.class_programminng.agregation_decomposition.country.entity.City;
import by.epam_tc.class_programminng.agregation_decomposition.country.entity.Country;
import by.epam_tc.class_programminng.agregation_decomposition.country.entity.District;
import by.epam_tc.class_programminng.agregation_decomposition.country.entity.Region;
import by.epam_tc.class_programminng.agregation_decomposition.country.view.CountryView;

public class CountryMain {

	public static void main(String[] args) throws Exception {
		City minsk = new City("Minsk", 1_992_685);
		ArrayList<District> districts;
		districts = new ArrayList<District>();

		District minskaya;
		District brestskaya;
		District gomelskaya;
		District grodnenskaya;
		District vitebskaya;
		District mogilevskaya;

		minskaya = new District("Minskaya oblast", minsk, new ArrayList<Region>());
		minskaya.getDistrictRegions().add(new Region(40_200, minsk, "Minski region"));

		City brest;
		brest = new City("Brest", 350_000);
		brestskaya = new District("Brestskaya oblast", brest, new ArrayList<Region>());
		brestskaya.getDistrictRegions().add(new Region(32_787, brest, "Brestski region"));

		City gomel;
		gomel = new City("Gomel", 535_693);
		gomelskaya = new District("Gomelskaya oblast", gomel, new ArrayList<Region>());
		gomelskaya.getDistrictRegions().add(new Region(40_372, gomel, "Gomelski region"));

		City grodno;
		grodno = new City("Grodno", 373_547);
		grodnenskaya = new District("Grodnenskaya oblast", grodno, new ArrayList<Region>());
		grodnenskaya.getDistrictRegions().add(new Region(25_127, grodno, "Grodnenski region"));

		City vitebsk;
		vitebsk = new City("Vitebsk", 378_459);
		vitebskaya = new District("Vitebskaya oblast", vitebsk, new ArrayList<Region>());
		vitebskaya.getDistrictRegions().add(new Region(40_051, vitebsk, "Vitebski region"));

		City mogilev;
		mogilev = new City("Mogilev", 383_313);
		mogilevskaya = new District("Mogilevskaya oblast", mogilev, new ArrayList<Region>());
		mogilevskaya.getDistrictRegions().add(new Region(29_068, mogilev, "Minski region"));

		Country belarusCenterRegions = new Country(minsk, districts, "Belarus");
		belarusCenterRegions.getDistricts().add(minskaya);
		belarusCenterRegions.getDistricts().add(mogilevskaya);
		belarusCenterRegions.getDistricts().add(grodnenskaya);
		belarusCenterRegions.getDistricts().add(gomelskaya);
		belarusCenterRegions.getDistricts().add(brestskaya);
		belarusCenterRegions.getDistricts().add(vitebskaya);

		CountryView view = CountryView.getInstance();

		view.showCapital(belarusCenterRegions);
		view.showDistrictsAmount(belarusCenterRegions);
		view.showArea(belarusCenterRegions);
		view.showDistrictCenters(belarusCenterRegions);
	}
}
