package la.laboratoria.fleet_management_api.mappers;

import la.laboratoria.fleet_management_api.dto.TaxiDto;
import la.laboratoria.fleet_management_api.entities.Taxi;

public class TaxiMapper {

    public static TaxiDto mapToTaxisDto(Taxi taxis) {
        return new TaxiDto(taxis.getId(), taxis.getPlate());
    }
}