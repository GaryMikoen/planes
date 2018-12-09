package nl.capgemini.academy.planes.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Plane {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String airport;
    private Long fuel;

    public Plane() {
        Long fuel = new Long(5);
        this.fuel = fuel;
        this.airport = "London";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public Long getFuel() {
        return fuel;
    }

    public void setFuel(Long fuel) {
        this.fuel = fuel;
    }
}
