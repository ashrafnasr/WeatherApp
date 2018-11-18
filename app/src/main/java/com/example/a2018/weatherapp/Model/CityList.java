package com.example.a2018.weatherapp.Model;

/**
 * @author 2018
 * @date 2018-11-18
 */
public class CityList {
    private int id;
    private String name, country;
    private Coord coord;

    public CityList() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }
}
