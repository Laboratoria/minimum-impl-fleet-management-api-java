package la.laboratoria.fleet_management_api.dto;

public class TaxiDto {

    private long id;

    private String plate;

    public TaxiDto(long id, String plate) {
        this.id = id;
        this.plate = plate;
    }

    public long getId() {
        return id;
    }

    public String getPlate() {
        return plate;
    }
}