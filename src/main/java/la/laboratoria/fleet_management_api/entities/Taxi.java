package la.laboratoria.fleet_management_api.entities;

import jakarta.persistence.*;

@Entity(name = "taxis")
public class Taxi {
    @Id
    private Integer id;
    private String plate;

    public Taxi() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String license) {
        this.plate = license;
    }
}
