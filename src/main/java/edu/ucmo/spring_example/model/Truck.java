package edu.ucmo.spring_example.model;

import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "truck")
public class Truck {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column
    private String make;
    @Column
    private String model;
    @Column
    private int year;
    @Column
    private enum type;

    public Truck(String make, String model, int year, int type) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.type = type;
    }

    public Truck() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, make, model, year, type);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
