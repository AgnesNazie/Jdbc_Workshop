package se.lexicon.Test;

import se.lexicon.Exception.CityNotFoundException;
import se.lexicon.dao.CityDao;
import se.lexicon.dao.CityDaoImpl;
import se.lexicon.model.City;

import java.util.List;
import java.util.Optional;

public class TestCityDAOImpl {
    public static void main(String[] args) {
        CityDao cityDao = new CityDaoImpl();

        // Test: save()
        City city = new City();
        city.setName("Uppsala");
        city.setCountryCode("SWE");
        city.setDistrict("Uppsala county");
        city.setPopulation(177074);
        City savedCity = cityDao.save(city);
        System.out.println("Saved City: " + savedCity);

        // Test: findById()
        Optional<City> foundById = cityDao.findById(savedCity.getId());
        System.out.println("Found by ID: " + foundById);

        // Test: findByCode()
        List<City> citiesByCode = cityDao.findByCode("SWE");
        System.out.println("Cities with countryCode 'SWE':");
        citiesByCode.forEach(System.out::println);

        // Test: findByName()
        List<City> citiesByName = cityDao.findByName("Uppsala");
        System.out.println("Cities named 'Uppsala':");
        citiesByName.forEach(System.out::println);

        // Test: findAll()
        List<City> allCities = cityDao.findAll();
        System.out.println("All Cities in DB:");
        allCities.forEach(System.out::println);

        // Test: update()
        savedCity.setPopulation(350000);
        savedCity.setDistrict("Updated District");
        cityDao.update(savedCity);
        System.out.println("City after update:");
        System.out.println(cityDao.findById(savedCity.getId()));

        // Test: deleteById()
        cityDao.deleteById(savedCity.getId());
        System.out.println("City deleted. Trying to find again:");
        System.out.println(cityDao.findById(savedCity.getId()));

        // Test: delete non-existing city (should throw exception)
        try {
            cityDao.deleteById(savedCity.getId()); // already deleted
        } catch (CityNotFoundException e) {
            System.out.println("Expected exception on delete: " + e.getMessage());
        }
    }
}

