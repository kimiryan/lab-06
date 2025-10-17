package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable{
    private String city;
    private String province;

    /**
     * This is a constructor for City objects
     * @param city This is a city name to be stored
     * @param province This is a province name to be stored
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * This method is a getter for the city name
     * @return Return the string of the city name
     */
    String getCityName() {
        return this.city;
    }

    /**
     * This method is a getter for the city province
     * @return Return the string of the city province
     */
    String getProvinceName() {
        return this.province;
    }

    /**
     * This method compares cities based on city name field
     * @param o This is an object to be compared
     * @return -1 if this.city is alphabetically lower than o, 1 if this.city is is alphabetically higher than o, 0 if they are equal
     */
    @Override
    public int compareTo(Object o) {
        // have to typecast o, could also just pass in a City object itself into the method
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }

    /**
     * This method overrides equals() to properly compare the equality of two City objects
     * @param o This is an object to be checked for equality
     * @return Return a boolean, true if both the name and province match, false otherwise
     */
    @Override
    // both hashcode and equals were generated with right clicking > Generate
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return Objects.equals(city, city1.city) && Objects.equals(province, city1.province);
    }

    /**
     * This method overrides hashcode() to properly generate hashcode for each City object
     * @return Return the hashcode of the object as an integer
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
