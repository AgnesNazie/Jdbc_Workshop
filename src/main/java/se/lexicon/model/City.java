package se.lexicon.model;

import java.util.Objects;

/**
 * Represents a City entity based on the 'city' table in the 'world' database.
 */
public class City {
    // TODO: Needs completion
    // fields
    private int id;
    private String name;
    private String countryCode;
    private String district;
    private int population;

    //constructor

    public City(int id, String name, String countryCode, String district, int population) {
        this.id = id;
        this.name = name;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
    }
    //constructor

    public City(String name, String countryCode, String district, int population) {
        this.id = id;
        this.name = name;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public City() {
        super();
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        City city = (City) object;
        return id == city.id && population == city.population && Objects.equals(name, city.name) && Objects.equals(countryCode, city.countryCode) && Objects.equals(district, city.district);
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
